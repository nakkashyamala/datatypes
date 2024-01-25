package arraylist;

public class Arraymultiple4 {

	public static void main(String[] args) {

		int a[][]=new int[2][3];
		a[0][0]=11;
		a[0][1]=10;
		a[1][2]=9;
		a[0][2]=8;
		a[0][2]=7;
		a[1][1]=6;
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
		System.out.print(a[i][j]+" " );
	}
			System.out.println();
	}
}
}
