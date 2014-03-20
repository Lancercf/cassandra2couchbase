package transform;

import uk.ac.bham.sitra.*;
import uk.ac.bham.cs.m2m.sitra.SimpleTraceableTransformer;
import cassandra.*;
import cassandra.impl.*;

public class Test {
	
	private static void testCassandra()
	{
		CassandraPackageImpl.init();
		CassandraFactory factory = CassandraFactory.eINSTANCE;
		
		
		Column col = factory.createColumn();

		IntegerType t = factory.createIntegerType();
		t.setValue(100);
		
		col.setValue(t);
		
		int x = ((IntegerType)col.getValue()).getValue();
		System.out.println(x);
		
		
		AsciiType s = factory.createAsciiType();
		s.setValue("This is my string");
		
		Column col2 = factory.createColumn();
		col2.setKey("12345");
		col2.setValue(s);
		
		String key = col2.getKey();
		String s2 = ((AsciiType)col2.getValue()).getValue();
		System.out.println("key: " + key + " value: " +s2);
	}
	
	public static void main(String[] args)
	{
		testCassandra();
	}
}
