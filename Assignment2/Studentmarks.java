package Assignment2;
import java.util.Scanner;
public class Studentmarks {
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a grade ");
		String  s= sc.next();
		switch(s) {
		case("a"):
			System.out.println("excellent");
		break;
		case("b"):
			System.out.println("good");
		break;
		case("c"):
			System.out.println("medium");
		break;
		case("d"):
			System.out.println("fail");
		break;
		
		}
		
		
		
	}
}