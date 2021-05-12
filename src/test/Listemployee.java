package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Listemployee extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in get");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in post");
		
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=DEMO;user=akash;password=a.123456");
			Statement lstatement = connection.createStatement();
			ResultSet rs = lstatement.executeQuery("Select * from Employee(nolock)");
			
			EmployeeBean lemployee;
            while(rs.next()) {
				
            	lemployee = new EmployeeBean();
            	lemployee.setFirstName(rs.getString("employeefirstName"));
            	lemployee.setLastName(rs.getString("employeelastName"));
            	lemployee.setAge(rs.getInt("employeeAge"));
            	lemployee.setId(rs.getInt("id"));
            	lemployee.setContactno(rs.getInt("employeeContactNo"));
				
            	employeeList.add(lemployee);	
			}
		}catch () {
		}
	}

}
