package transform;

public class jsonform {

	public static String colJsonform(String string){
		String result=string.substring(0,string.length()-1);
		return result;
	}
	
	public static String colfamJsonform(StringBuffer result2){
		String result=result2.substring(0,result2.length()-1)+"}}";
		return result;
	}
	
	public static String keyspaceJsonform(StringBuffer result2){
		String result=result2.substring(0,result2.length()-1)+"}}";
		return result;
	}
	
	public static String scolJsonform(StringBuffer result2){
		String result="{"+result2.substring(0,result2.length()-1)+"}";
		return result;
	}
	
	public static String rowJsonform(StringBuffer result2){
		String result=result2.substring(0,result2.length()-1);
		return result;
	}
}
