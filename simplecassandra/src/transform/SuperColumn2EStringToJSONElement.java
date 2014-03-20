package transform;

import java.util.ArrayList;
import java.util.List;

import uk.ac.bham.cs.tuple.Unit;
import uk.ac.bham.cs.m2m.sitra.SimpleTraceableTransformer;
import uk.ac.bham.cs.m2m.sitra.Rule;
import uk.ac.bham.sitra.Transformer;
import cassandra.*;
import cassandra.impl.*;
import couchbase.*;
import couchbase.impl.*;

public class SuperColumn2EStringToJSONElement extends Rule<SuperColumn, Unit<List<EStringToJSONElementImpl>>> {
	
	public boolean check(SuperColumn b)
	{
		return true;
	}
	
	public Unit<List<EStringToJSONElementImpl>> build(SuperColumn source, Transformer transformer)
	{
		
		CouchbaseFactoryImpl factory = new CouchbaseFactoryImpl();
		List<EStringToJSONElementImpl> list = new ArrayList<EStringToJSONElementImpl>();
		
		for(Column col : source.getColumns())
		{
			DataType d = col.getValue();
			String s = ((AsciiType)d).getValue();
			
			EStringToJSONElementImpl elem = (EStringToJSONElementImpl) factory.createEStringToJSONElement();		
			
			//set key
			elem.setKey(source.getKey()+"."+col.getKey());
			
			//test string
			JSONString val = factory.createJSONString();
			val.setValue(s);
			
			elem.setValue(val);
			list.add(elem);
			
		}
		
		
		
		
		
		
		return Unit.with(list);
	}
	
	
	public Unit<List<EStringToJSONElementImpl>> instantiate(SuperColumn source, Transformer transformer) {
		List<EStringToJSONElementImpl> list = new ArrayList<EStringToJSONElementImpl>();
	    return Unit.with(list);
	}
	
	@Override
	public void bind(Unit<List<EStringToJSONElementImpl>> target, SuperColumn source,
			Transformer transformer) {
		
		
	}

	public void setProperties(Unit<EStringToJSONElementImpl> target, SuperColumn source,
			Transformer transformer) {
	}
	
	
	
	public static void main(String[] args)
	{
		Transformer transformer = new SimpleTraceableTransformer();
		transformer.addRuleType(SuperColumn2EStringToJSONElement.class);
		
		CassandraFactory factory = new CassandraFactoryImpl();
		
		SuperColumn sc = factory.createSuperColumn();
		sc.setKey("SCKey");
		
		
		Column column = factory.createColumn();
		column.setKey("ColumnKey1");
		
		AsciiType string = factory.createAsciiType();
		string.setValue("This is value1");
	
		column.setValue(string);
		
		sc.getColumns().add(column);
		
		
		Column column2 = factory.createColumn();
		column2.setKey("ColumnKey2");
		AsciiType string2 = factory.createAsciiType();
		string2.setValue("This is value2");
	
		column2.setValue(string2);
		
		sc.getColumns().add(column2);
		
		
		//System.out.println(((AsciiType)column.getValue()).getValue());
		
		Unit<List<EStringToJSONElementImpl>> ub = transformer.transform(SuperColumn2EStringToJSONElement.class, sc);
		StringBuffer result = new StringBuffer();
		for(int i=0; i<ub.getA().size(); i++)
		{
			
			JSONString s = (JSONString)ub.getA().get(i).getValue();
			//System.out.println(ub.getA().get(i).getKey());
			//System.out.println(s.getValue());
			EStringToJSONElementImpl e = ub.getA().get(i);
			result.append(e.toString());
			
			
			
		}
		
		//EStringToJSONElementImpl e = ub.getA();
		System.out.println(jsonform.scolJsonform(result));
		
		
		
	}

	
	
}