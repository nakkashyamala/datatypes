package keyword;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args, String yes) {
    
		Scanner sc =new Scanner(System.in);
		
		System.out.println("what is your name ?");
		String name = sc.nextLine();
		System.out.println("hello " +name);
        
		System.out.println("what is your age ?");
         int age = sc.nextInt();
         System.out.println("your age is " + age);
        
         System.out.println("what is your salary ?");
         int salary = sc.nextInt();
         System.out.println("my salary is "+salary);
        
		 sc.close();
		

	}

}