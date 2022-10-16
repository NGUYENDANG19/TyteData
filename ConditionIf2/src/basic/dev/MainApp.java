package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// thang co 30 ngay : 4,6,9,11
				// thang co 31 ngay : 1,3,5,7,8,10,12
				// thang 2 co 29 ngay : nam nhuan
				// thang 2 co 28 ngay ; nam khong nhuan
				
				Scanner sc = new Scanner(System.in);
				
				int thang;
				int nam;
				
				System.out.println("thang==");
				thang = sc.nextInt();
				
				System.out.println("nam==");
				nam = sc.nextInt();
				
				switch (thang) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					System.out.println("thang co 31 ngay");
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						System.out.println("thang co 30 ngay");
						break;
					case 2 :
						if((nam%4==0 && nam%100 !=0) || (nam%400==0))	{
							System.out.println("thang co 29 ngay");
							
						}else	{
							System.out.println("thang co 28 ngay");
						}
						break;
					default:
						System.out.println("sai du lieu");
						break;
						
	}

	}
}