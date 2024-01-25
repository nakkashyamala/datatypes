package inher;
 
    class suryanarayana{
    	void sc() {
    		System.out.println("parant");
    	}
    }
    class garuda{
    	void gd() {
    		System.out.println("child");
    	}
    }


public class singleinher {

	public static void main(String[] args) {
     
		garuda gd1 = new garuda();
		gd1.gd();
	}

}
