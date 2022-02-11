import java.io.*;
import java.sql.*;
import java.util.*;

public class Store {
	static void shop()
	{
		try {
			int choice,x;
		Class.forName("org.mariadb.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Fruitables","root","");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Choose 1 to shop fruits and 2 to shop vegetables");
	    choice = sc.nextInt();
	    do {
	    	if(choice == 1)
	    	{
	    		x=1;int serial;
	    		String str;
	    		
	    		ArrayList
	    		Statement s1 = con.createStatement();
	    		ResultSet rs = s1.executeQuery("select * from fruits");
	    		System.out.println("Serailno    Name     Price/kg" );
	    		while(rs.next())
	    		{
	    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
	    		}
	    		do
	    		{
	    			System.out.println("Enter the index: ");
	    			serial = sc.nextInt();
	    			
	    			System.out.println("Enter yes to shop again else enter no");
	    			str=sc.nextLine();
	    		}while(str.equalsIgnoreCase("Yes"));
	    	}
	    	else if(choice ==2)
	    	{
	    		x=1;
	    		Statement s1 = con.createStatement();
	    		ResultSet rs = s1.executeQuery("select * from vegetables");
	    		System.out.println("Serailno    Name     Price/kg" );
	    		while(rs.next())
	    		{
	    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Enter your choice again");
	    		choice = sc.nextInt();
	    		x=0;
	    	}
	       }while(x!=1);
	    
	    
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
