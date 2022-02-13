import java.io.*;
import java.sql.*;
import java.util.*;

public class Store {
	static void shop()
	{
		try {
		int x=1,quantity,d=1;
		double price,r1;
		
		Class.forName("org.mariadb.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Fruitables","root","");
	    
	    Cart cart = new Cart();
	    Scanner sc = new Scanner(System.in);
	    
	    ArrayList<Double> flist = new ArrayList<>();
	    ArrayList<Double> vlist = new ArrayList<>();
	    
	    Statement s1 = con.createStatement();
	    System.out.println("The fruits available are: ");
	    ResultSet rs = s1.executeQuery("select * from fruits");
	    System.out.println("Serailno		Name		Price/kg" );
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"		"+rs.getString(2)+"		"+rs.getDouble(3));
	    	
	    }
	    		
	    Statement s2 = con.createStatement();
	    System.out.println("The vegetables available are: ");
	    ResultSet rs2 = s2.executeQuery("select * from vegetables");
	    System.out.println("Serailno		Name		Price/kg" );
	    while(rs2.next())
	    {
	    	System.out.println(rs2.getInt(1)+"		"+rs2.getString(2)+"		"+rs2.getDouble(3));
	    	
	    }
	 
	    System.out.println("Enter the serial numbers and quantity of fruits you wish to buy, enter 0 to close");
	    
	    while(d!=0)
	    {
	    	price = 0;
	    	r1 = 0;
	    	
	    	System.out.println("Enter the serial no: ");
	    	x = sc.nextInt();
	    	System.out.println("Enter the quantity: ");
	    	quantity = sc.nextInt();
	    	
	    	Statement s3 = con.createStatement();
	    	ResultSet rs3 = s3.executeQuery("select * from fruits");
	    	while(rs3.next())
	    	{
	    		if(rs3.getInt(1) == x)
	    		{
	    			price = rs3.getInt(3);
	    			r1 = price*quantity; flist.add(r1);
	    			break;
	    		}
	    	}
	    	System.out.println("Enter 0 to not continue again in fruits");
	    	d=sc.nextInt();
	    	
	    }
	    
	    System.out.println("Enter the serial numbers of vegetables you wish to buy, enter 0 to close");
	    
	    x=1;d=1;
	    while(d!=0) {
	    	price = 0;
	    	r1 = 0;
	    	
	    	System.out.println("Enter the serial no: ");
	    	x = sc.nextInt();
	    	System.out.println("Enter the quantity: ");
	    	quantity = sc.nextInt();
	    	
	    	Statement s3 = con.createStatement();
	    	ResultSet rs3 = s3.executeQuery("select * from vegetables");
	    	while(rs3.next())
	    	{
	    		if(rs3.getInt(1) == x)
	    		{
	    			price = rs3.getInt(3);
	    			r1 = price*quantity; vlist.add(r1);
	    			break;
	    		}
	    	}
	    	System.out.println("Enter 0 to not continue again in vegetables");
	    	d=sc.nextInt();
	    }
	  //  System.out.println(flist);
	   // System.out.println(vlist);
	    cart.aggregate(flist, vlist);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
