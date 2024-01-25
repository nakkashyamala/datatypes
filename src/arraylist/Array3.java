package arraylist;

public class Array3 {

	public static void main(String[] args) {

	String a[]= new String[4];
	a[0]="Shyamala";
	a[1]="Suvartha";
	a[2]="Rafi";
	a[3]="Mardal";
	//for(int i=0; i<=1;i++) {
		
	for(int i=3; i>=0; i--) {
	System.out.println(a[i]);
	}
	System.out.println(a.length);
	}
}
