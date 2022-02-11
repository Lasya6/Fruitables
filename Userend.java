import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Userend {
	static Scanner sc = new Scanner(System.in);
	
    static	String email;
	static String password;
	static int phoneno;
	static String fullname;
	static String address;
	
           static void login()
           {
        	   Store storeobj = new Store();
        	   CheckLogin check =new CheckLogin();
        	   
        	   System.out.println("Enter your Email: ");
        	   email = sc.nextLine();
        	   
        	   System.out.println("Enter your password: ");
        	   password = sc.nextLine();
        	   
        	   boolean flag = check.validate(email, password);
        	   
        	   if(flag == true) {
        	   storeobj.shop();
        	   }
        	   else
        	   {
        		   Userend.signup();
        	   }
           }
           static void signup()
           {
        	   System.out.println("Enter your Fullname: ");
        	   fullname = sc.nextLine();
        	   
        	   System.out.println("Enter your phone no: ");
        	   phoneno = sc.nextInt();
        	   
        	   System.out.println("Enter your Email: ");
        	   email = sc.nextLine();
        	   
        	   System.out.println("Enter your password: ");
        	   password = sc.nextLine();
        	   
        	   System.out.println("Enter your address: ");
        	   address = sc.nextLine();
        	   try{
        	       Class.forName("org.mariadb.jdbc.Driver");
   			       Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Fruitables","root","");
   				   PreparedStatement s1 = con.prepareStatement("insert into userdetails values(?,?,?,?,?)");
   				   
   				   s1.setString(1, fullname);
   				   s1.setInt(2, phoneno);
   				   s1.setString(3, email);
   				   s1.setString(4,  password);
   				   s1.setString(5, address);
   				   s1.executeUpdate();
   				   
   				PreparedStatement s2 = con.prepareStatement("insert into userlogindetails values(?,?)");
   				s2.setString(1, email);
   				s2.setString(2,  password);
        	   }
        	   catch(Exception e)
        	   {
        		   e.printStackTrace();
        	   }
        	   System.out.println("You have successfully created your account! ");
        	   System.out.println();
        	   System.out.println("Shop our fresh organic fruits and vegetables and stay healthy");
        	   System.out.println("Happy Shopping!!");
        	   
        	   Userend.login();
        	   
        	   
           }        
}