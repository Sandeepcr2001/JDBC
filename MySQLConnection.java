/*
JDBC Connection
----------------
1) Java(JDK)
2) Eclipse
3) Mysql JDBC Driver

insert, update, delete -->DML Commands
--------------------------------------
1)Create a connection
2)Create statement/Query
3)Execute statement/Query
4)Close connection

select -->DRl(data Retrieval language) DQL
------------------------------------------
1)Create a connection
2)Create statement/Query
3)Execute statement/Query
4)Store the result in result set
5)Close connection


*/


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
