package transform;

import java.util.ArrayList;
import java.util.List;

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
import cassandra.Keyspace;
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


public class Keyspace2Bucket extends Rule<Keyspace, Unit<List<Bucket>>> {
	
	public boolean check(Keyspace b)
	{
		return true;
	}
	
	public Unit<List<Bucket>> build(Keyspace source, Transformer transformer)
	{
		CouchbaseFactoryImpl factory = new CouchbaseFactoryImpl();
		
		List<Bucket> list = new ArrayList<Bucket>();
		
		for (ColumnFamily cf : source.getColumnfamilies())
		{
		
			Bucket bucket = factory.createBucket();
			bucket.setName(source.getName()+"."+cf.getName());
			
			EStringToDocumentImpl ed = (EStringToDocumentImpl) factory.createEStringToDocument();
			ed.setKey(source.getName());
			
			for (Row row : cf.getRows())
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
			list.add(bucket);
			
		}
		
		
		
		
		
		
		
		return Unit.with(list);
	}

	@Override
	public void bind(Unit<List<Bucket>> target, Keyspace source, Transformer transformer) {
		
		
	}
	
	public Unit<List<Bucket>> instantiate(Keyspace source, Transformer transformer) {
		
		
		List<Bucket> list = new ArrayList<Bucket>();
		
	    return Unit.with(list);
	}


	public void setProperties(Unit<List<Bucket>> target, Keyspace source, Transformer transformer) {
		
		
	}
	
	
	public static void main(String[] args)
	{
		Transformer transformer = new SimpleTraceableTransformer();
		transformer.addRuleType(Keyspace2Bucket.class);
		
		CassandraFactory factory = new CassandraFactoryImpl();
		
		Keyspace ks = factory.createKeyspace();
		ks.setName("KSName");
		
		ColumnFamily cf = factory.createColumnFamily();
		cf.setName("ColumnFamily 1");
		
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
		cf.getRows().add(aRow);
		
		
		
		ks.getColumnfamilies().add(cf);
		
		
		Unit<List<Bucket>> ub = transformer.transform(Keyspace2Bucket.class, ks);
		StringBuffer result = new StringBuffer();
		for(int k = 0; k< ub.getA().size(); k++)
		{
		
			Bucket bucket = ub.getA().get(k);
			//System.out.println("Bucket Name: " + bucket.getName());
			//System.out.println("--------------------\n");
			//System.out.print(bucket.toString());
			result.append(bucket.toString());
			for(int i=0; i< bucket.getDocuments().size(); i++)
			{
				Document doc = bucket.getDocuments().get(i).getValue();
				Metadata meta = doc.getMeta();
				//System.out.println("Document Key: " + meta.getId());
				//System.out.println(doc.toString());
				result.append(doc.toString());
				for(int j=0; j<doc.getMap().size(); j++)
				{
					EStringToJSONElementImpl e = (EStringToJSONElementImpl)doc.getMap().get(j);
					//System.out.println("Key: " + e.getKey());
					
					JSONString s = (JSONString)e.getValue();
					//System.out.println("Value: " + s.getValue());
					//System.out.println("--------------------");
//					if(j!=doc.getMap().size()-1){
//					System.out.println(e.toString().substring(0,e.toString().length()-3));
//					}else{
//						System.out.println(e.toString().substring(0,e.toString().length()-1));
//					}
					result.append(e.toString());
				}
				
				System.out.println(jsonform.keyspaceJsonform(result));
				
			}
		}
		
		
		
		
		
	}
	
	
}