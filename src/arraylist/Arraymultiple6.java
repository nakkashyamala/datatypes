package arraylist;

public class Arraymultiple6 {

	public static void main(String[] args) {

		int a[][]= new int[2][3];
		a[0][0]=20;
		a[0][1]=19;
		a[0][2]=18;
		a[1][0]=17;
		a[1][1]=16;
		a[1][2]=15;
	
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
			System.out.print(a[i][j]+" ");
			}
	System.out.println();
		}	
	}

}
