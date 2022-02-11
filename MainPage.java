import java.util.*;
public class MainPage {
	static void intro() {
		System.out.println("Hello!!");
		System.out.println();
		System.out.println("Fruitables - totally organic!!");
		System.out.println();
		System.out.println("Delivery at your door step!");
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Userend user = new Userend();
		AdminMainPage admin = new AdminMainPage();
	    MainPage.intro();
		System.out.println("Enter 1 to Login and 2 to Signup 3 if you are admin");
		int login=sc.nextInt();
		int x=0, useroradmin;
		useroradmin = sc.nextInt();
		do {
		if(login == 1) {
			user.login(); x=1;
	                   	}
		
		else if (login == 2) {
			user.signup();x=1;
		                      }
		else if(login == 3)
		{
			admin.welcome();
		}
		
		else {	
			System.out.println("You have entered the wrong input!");
			System.out.println("Choose between 1 and 2");
		    }
		
	        }while(x!=1);
	
	}

}
