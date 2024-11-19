package Assignment2;

public class Printreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int i=98775;
		while(i>0) {
		 int rem=i%10;
		 rev=rev*10+rem;
		 i=i/10;
		}
		 System.out.println(rev);
		
		


	}

}
