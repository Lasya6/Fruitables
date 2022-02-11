import java.util.*;

public class AdminMainPage {
	static Scanner sc = new Scanner(System.in);

	static void welcome()
	{
		System.out.println("Hello! Admin");
		AdminMainPage.adminchoice();
	}
	
	
    static void adminchoice()
    {
    	int x=0;
    	
    	System.out.println("Enter f for operations on fruits and v for operations on vegetables");
    	char ch = sc.next().charAt(0);
    	String forv="";
    	
    do {
    	if(ch=='f')
    	{	 
    		forv = "fruits";
    		AdminMainPage.operations(forv);
    		x=1;
    	}
    	else if(ch=='v')
    	{
    		forv = "vegetables";
    		AdminMainPage.operations(forv);
    		x=1;
    	}
    	else 
    	{
    		System.out.println("You have entered the wrong character! ");
    		System.out.println("Enter f for operations on fruits and v for operations on vegetables");
    		System.out.println("Enter the charcter again: ");
    		ch = sc.next().charAt(0);
    	}
           }while(x!=1);
    }
    
    
    static void operations(String forv) {
     		
    	System.out.println("Enter 1 to store 2 to insert and 3 to modify the fruits or vegetables");
    	int operation;
    	operation = sc.nextInt();
    	int x=0;
    	do
    	{
    		if(operation == 1)
    		{
    			//db logic
    		//	insert st based on rowcount insert new one
    			x=1;
    		}
    		else if(operation == 2)
    		{
    			//delete
    			x=1;
    			
    		}
    		else if(operation == 3)
    		{
    			//update based on the info available with you
    			x=1;
    		}
    		else
    		{
    			System.out.println("Enter your choice again");
    	        operation = sc.nextInt();
    		}
    	}while(x!=1);
    
    }

}
