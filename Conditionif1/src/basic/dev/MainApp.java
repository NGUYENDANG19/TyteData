package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kiem tra so chi het cho 3 hoac chia het cho 5
		
		Scanner sc = new Scanner(System.in);
		
		int x ;
		System.out.println("x==");
		x = sc.nextInt();
		
		if (x%3 == 0 )	{
			System.out.println("x la so chia het cho 3");
			
		}else if(x%5 == 0)	{
			System.out.println("x la so chia het cho 5");
		}else	{
			System.out.println("x la so khong chia het cho 3 va 5");
		
		}
		}
		
	}


