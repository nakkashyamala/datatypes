package variables;

public class Localvariable {
     static  int sv = 20;
      int iv =15;
	
	
	public static void main(String[] args) {

		
		Localvariable obj= new Localvariable();
		
		int lv = 10;
		System.out.println("local variable "+ lv);
		System.out.println("static variable "+ sv);
		System.out.println("instance variable "+obj.iv);
	}

}
