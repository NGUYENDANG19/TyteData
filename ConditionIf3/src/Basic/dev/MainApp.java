package Basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kiem tra a,b,c co phai la 3 canh cua mot tam gaic
		
			var	Scanner  = new Scanner(System.in);
			
			
				
				System.out.println("a==");
			var	a = Scanner.nextDouble	();
				
				System.out.println("b==");
			var	b = Scanner.nextDouble	();
				
				System.out.println("c==");
			var	c =Scanner.nextDouble	();
				
				if (a<=0|| b<=0 || c<=0);	{
					System.out.println("a, b , c khong phai la canh cua mot tam giac") ;
				 if ((a+b>c) && (a+c>b) && (b+c>a)) {
					 System.out.println("a,b,c la 3 canh cua mot tam giac");
				 }else {
					System.out.println("a, b , c khong phai la canh cua mot tam giac"); 
				 }
	}

	}

}