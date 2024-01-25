package arraylist;

public class Arraymultiple9 {

	public static void main(String[] args) {

		String a[][]=new String[2][3];
		a[0][0]="Shyamala";
		a[0][1]="Lavanya";
		a[0][2]="Suvartha";
		a[1][0]="Suchiritha";
		a[1][1]="Lucky";
		a[1][2]="Laxmi";
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
		System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
	}
}
