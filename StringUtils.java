package Lab7;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.lang.Class;

public class StringUtils {

	Scanner sc;
	Dictionary type;

	StringUtils(){
		sc = new Scanner(System.in);

		type = new Hashtable(); 
		type.put("java.lang.Boolean", "bool");
		type.put("java.lang.Byte", "byte");
		type.put("java.lang.Short", "short");
		type.put("java.lang.Character", "char");
		type.put("java.lang.Integer", "int");
		type.put("java.lang.Float", "float");
		type.put("java.lang.Long", "long");
		type.put("java.lang.Double", "double");
		type.put("java.lang.String", "string");
		type.put("java.lang.Void", "void");
	}

	public void p(String st) {
		System.out.println(st);
	}
	
    public <T> String c(T t) {
		Class cls = t.getClass();
		String ret =(String) type.get(cls.getName());
	    return ret;
	    // return cls.getName();
	 }

	public int inpInt() {
		return sc.nextInt();
	}
	
	public String inpLn() {
		return sc.nextLine();
	}
}
