import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {
	public static void main(String[] args) throws SQLException {
		
		//Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123456");
		
		//Create statement/Query
		Statement stmt =con.createStatement();
		
        //String s = "INSERT INTO students VALUES(103,'SANDEEP',23)";
		String s = "UPDATE students SET sname = 'Prashanth' WHERE sid=102";
		
		
		//Execute statement
		stmt.execute(s);
		
		//close connection
		con.close();
		System.out.println("Query executed.....");
	}

}
