package transform;

import uk.ac.bham.cs.tuple.Unit;
import uk.ac.bham.cs.m2m.sitra.SimpleTraceableTransformer;
import uk.ac.bham.cs.m2m.sitra.Rule;
import uk.ac.bham.sitra.Transformer;
import cassandra.*;
import cassandra.impl.*;
import couchbase.*;
import couchbase.impl.*;

public class Column2EStringToJSONElement extends Rule<Column, Unit<EStringToJSONElementImpl>> {
	
	public boolean check(Column b)
	{
		return true;
	}
	
	public Unit<EStringToJSONElementImpl> build(Column source, Transformer transformer)
	{
		
		CouchbaseFactoryImpl factory = new CouchbaseFactoryImpl();
		
		DataType d = source.getValue();
		String s = ((AsciiType)d).getValue();
		
		EStringToJSONElementImpl elem = (EStringToJSONElementImpl) factory.createEStringToJSONElement();		
		
		//set key
		elem.setKey(source.getKey());
		
		//test string
		JSONString val = factory.createJSONString();
		val.setValue(s);
		
		elem.setValue(val);
		
		
		
		return Unit.with(elem);
	}
	
	
	public Unit<EStringToJSONElementImpl> instantiate(Column source, Transformer transformer) {
		
	    return Unit.with(new EStringToJSONElementImpl());
	}
	
	@Override
	public void bind(Unit<EStringToJSONElementImpl> target, Column source,
			Transformer transformer) {
		
		target.getA().setKey(source.getKey());
	}

	public void setProperties(Unit<EStringToJSONElementImpl> target, Column source,
			Transformer transformer) {
	}
	
	
	
	public static void main(String[] args)
	{
		Transformer transformer = new SimpleTraceableTransformer();
		transformer.addRuleType(Column2EStringToJSONElement.class);
		
		CassandraFactory factory = new CassandraFactoryImpl();
		Column column = factory.createColumn();
		column.setKey("ColumnKey");
		
		AsciiType string = factory.createAsciiType();
		string.setValue("This is value");
	
		column.setValue(string);
		
		//System.out.println(((AsciiType)column.getValue()).getValue());
		
		Unit<EStringToJSONElementImpl> ub = transformer.transform(Column2EStringToJSONElement.class, column);
		JSONString s = (JSONString)ub.getA().getValue();
		System.out.println(ub.getA().getKey());
		System.out.println(s.getValue());
		
		
		EStringToJSONElementImpl e = ub.getA();
		System.out.println(jsonform.colJsonform(e.toString()));
		
		
	}

	
	
}