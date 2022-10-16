package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
			// kiem tra so nguyen am hay nguyen duong
		
		int n ;
		System.out.println("n==");
		n = sc.nextInt();
		
		if (n>0)	{
			System.out.println("n la so nguyen duong");
		}else if (n<0)  {
			System.out.println("n la so nguyen am");
		}else	{
			System.out.println("n la so 0 ");
		}
	}

}
