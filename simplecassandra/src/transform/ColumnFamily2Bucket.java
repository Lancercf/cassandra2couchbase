package transform;

import uk.ac.bham.cs.m2m.sitra.Rule;
import uk.ac.bham.cs.m2m.sitra.SimpleTraceableTransformer;
import uk.ac.bham.cs.tuple.Unit;
import uk.ac.bham.sitra.Transformer;
import cassandra.AsciiType;
import cassandra.BooleanType;
import cassandra.CassandraFactory;
import cassandra.Column;
import cassandra.ColumnFamily;
import cassandra.DataType;
import cassandra.FloatType;
import cassandra.IntegerType;
import cassandra.Row;
import cassandra.SuperColumn;
import cassandra.impl.CassandraFactoryImpl;
import couchbase.Bucket;
import couchbase.Document;
import couchbase.JSONBoolean;
import couchbase.JSONFloat;
import couchbase.JSONInt;
import couchbase.JSONString;
import couchbase.Metadata;
import couchbase.impl.CouchbaseFactoryImpl;
import couchbase.impl.EStringToDocumentImpl;
import couchbase.impl.EStringToJSONElementImpl;


public class ColumnFamily2Bucket extends Rule<ColumnFamily, Unit<Bucket>> {
	
	public boolean check(ColumnFamily b)
	{
		return true;
	}
	
	public Unit<Bucket> build(ColumnFamily source, Transformer transformer)
	{
		CouchbaseFactoryImpl factory = new CouchbaseFactoryImpl();
		
		Bucket bucket = factory.createBucket();
		bucket.setName(source.getName());
		
		
		
		
		
		EStringToDocumentImpl ed = (EStringToDocumentImpl) factory.createEStringToDocument();
		ed.setKey(source.getName());
		
		for (Row row : source.getRows())
		{
			Document document = factory.createDocument();
			
			Metadata meta = factory.createMetadata();
			meta.setType("json");
			meta.setId(row.getKey());
			
			document.setMeta(meta);
			
			for(SuperColumn scol: row.getSupercolumns())
			{
				
				for(Column col : scol.getColumns())
				{
					
					EStringToJSONElementImpl e = (EStringToJSONElementImpl) factory.createEStringToJSONElement();
					e.setKey(scol.getKey()+"."+ col.getKey());
					DataType d = col.getValue();
					//string
					if(d instanceof AsciiType)
					{
						JSONString val = factory.createJSONString();
						val.setValue(((AsciiType) d).getValue());
						
						e.setValue(val);
						
					}
					else if (d instanceof IntegerType)
					{
						JSONInt val = factory.createJSONInt();
						val.setValue(((IntegerType) d).getValue());
						
						e.setValue(val);
					}
					else if (d instanceof FloatType)
					{
						JSONFloat val = factory.createJSONFloat();
						val.setValue(((FloatType) d).getValue());
						
						e.setValue(val);
					}
					else if (d instanceof BooleanType)
					{
						JSONBoolean val = factory.createJSONBoolean();
						val.setValue(((BooleanType) d).isValue());
						
						e.setValue(val);
					}
					
					
					document.getMap().add(e);
					ed.setValue(document);
					
				}
				
			}
			
			for(Column col : row.getColumns())
			{
				EStringToJSONElementImpl e = (EStringToJSONElementImpl) factory.createEStringToJSONElement();
				e.setKey("."+ col.getKey());
				
				DataType d = col.getValue();
				//string
				if(d instanceof AsciiType)
				{
					JSONString val = factory.createJSONString();
					val.setValue(((AsciiType) d).getValue());
					
					e.setValue(val);
				}
				else if (d instanceof IntegerType)
				{
					JSONInt val = factory.createJSONInt();
					val.setValue(((IntegerType) d).getValue());
					
					e.setValue(val);
				}
				else if (d instanceof FloatType)
				{
					JSONFloat val = factory.createJSONFloat();
					val.setValue(((FloatType) d).getValue());
					
					e.setValue(val);
				}
				else if (d instanceof BooleanType)
				{
					JSONBoolean val = factory.createJSONBoolean();
					val.setValue(((BooleanType) d).isValue());
					
					e.setValue(val);
				}
				
				
				document.getMap().add(e);
				ed.setValue(document);
			}
		}
		
		
		bucket.getDocuments().add(ed);
		
		
		
		return Unit.with(bucket);
	}

	@Override
	public void bind(Unit<Bucket> target, ColumnFamily source, Transformer transformer) {
		//EStringToDocumentImpl estring = new EStringToDocumentImpl();
		//estring.setKey(source.getKey());
		
		
	}
	
	public Unit<Bucket> instantiate(ColumnFamily source, Transformer transformer) {
		CouchbaseFactoryImpl factory = new CouchbaseFactoryImpl();
		
	    return Unit.with(factory.createBucket());
	}


	public void setProperties(Unit<Bucket> target, ColumnFamily source, Transformer transformer) {
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		Transformer transformer = new SimpleTraceableTransformer();
		transformer.addRuleType(ColumnFamily2Bucket.class);
		
		//Create a row
		CassandraFactory factory = new CassandraFactoryImpl();
		
		ColumnFamily cf = factory.createColumnFamily();
		cf.setName("ColumnFamily Name");
		
		Row aRow = factory.createRow();
		aRow.setKey("RowKey");
		
		Column col1 = factory.createColumn();
		col1.setKey("KeyColumn");
		AsciiType value = factory.createAsciiType();
		value.setValue("This is value");
		col1.setValue(value);
		
		aRow.getColumns().add(col1);
		
		cf.getRows().add(aRow);
		
		
		SuperColumn sc = factory.createSuperColumn();
		sc.setKey("SuperColumnKey");
		
		Column col2 = factory.createColumn();
		col2.setKey("KeyColumn2");
		AsciiType value2 = factory.createAsciiType();
		value2.setValue("This is value2");
		col2.setValue(value2);
		
		sc.getColumns().add(col2);
		
		Column col3 = factory.createColumn();
		col3.setKey("KeyColumn3");
		AsciiType value3 = factory.createAsciiType();
		value3.setValue("This is value3");
		col3.setValue(value3);
		
		sc.getColumns().add(col3);
		
		aRow.getSupercolumns().add(sc);
		
		
		
		
		
		
		
		Unit<Bucket> ub = transformer.transform(ColumnFamily2Bucket.class, cf);
		Bucket bucket = ub.getA();
		StringBuffer result = new StringBuffer();
		//System.out.println("Bucket Name:" + bucket.getName());
		//System.out.println("--------------------\n");
		//System.out.print(bucket.toString());
		result.append(bucket.toString());
		for(int i=0; i< bucket.getDocuments().size(); i++)
		{
			Document doc = bucket.getDocuments().get(i).getValue();
			Metadata meta = doc.getMeta();
			//System.out.println("Document Key:" + meta.getId());
			//System.out.println(doc.toString());
			result.append(doc.toString());
			for(int j=0; j<doc.getMap().size(); j++)
			{
				EStringToJSONElementImpl e = (EStringToJSONElementImpl)doc.getMap().get(j);
				//System.out.println("Key:" + e.getKey());
				
				JSONString s = (JSONString)e.getValue();
				//System.out.println("Value:" + s.getValue());
				//System.out.println("--------------------");
				
				result.append(e.toString());
				//System.out.println(e.toString());
				
			}
			System.out.println(jsonform.colfamJsonform(result));
			
		}
		
		
		
		
		
		
	}
	
	
}