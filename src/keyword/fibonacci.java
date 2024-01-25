package keyword;

import java.util.Scanner;

public class fibonacci {

	public static  void main(String[] args) {

		int k,a=2,b=4;
		
		Scanner sc =new Scanner(System.in);
		k=0;
		System.out.println("enter any number");
		int n =sc.nextInt();
		System.out.print("2 4");
		while(k<=50) {
			k=a+b;
			if(k>=n)
				break;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
	}

	
}

