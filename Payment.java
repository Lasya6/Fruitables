import java.util.*;
public class Payment {
	
	static void proceedtopay(int s)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		MainPage ob = new MainPage();
		
		System.out.println("Enter y to proceed for payment");
		ch = sc.next().charAt(0);
		
		if(ch == 'y') {
		System.out.println("The total is:"+ s);
		System.out.println("The order is booked!!");System.out.println();
		}
		else
		{
			ob.intro();
		}
	}

}
