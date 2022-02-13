import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckLogin {
	
	static boolean validate(String email, String password)
	
	{
		try {
		int flag = 0;
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Fruitables","root","");
		Statement s1 = con.createStatement();
		
		ResultSet rs = s1.executeQuery("select * from userdetails");
		while(rs.next()) {
			if(rs.getString(3).equals(email) && rs.getString(4).equals(password)){
				flag = 1;
				break;}
			}
		
		if(flag == 1)
			return true;
		}
		catch(Exception e)
		{
          e.printStackTrace();
		}
		
		return false;
	}

}
