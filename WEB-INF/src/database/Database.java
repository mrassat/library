package database;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import models.*;

public class Database {

  private Connection conn;


  public Database () {
    connect();
  }

  private void connect () {

    try {
      Context ic = new InitialContext();
      Context ec = (Context) ic.lookup("java:comp/env");

      DataSource ds = (DataSource) ec.lookup("jdbc/testdb");
      this.conn = ds.getConnection();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
  }


  public ArrayList<Employee> listEmployees () {
    String query = "Select * from Employees";

    ArrayList<Employee> list = new ArrayList<Employee>();

    try {
      Statement stmt = this.conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
        int id = rs.getInt("id");
        int age = rs.getInt("age");
        String first = rs.getString ("first");
        String last = rs.getString ("last");

        Employee emp = new Employee(id, age, first, last);

        list.add(emp);
        
      }

    }
    catch (SQLException sqle) {
      sqle.printStackTrace();
    }

    return list;
  }



  public void close () {
    try {
      this.conn.close();
    }
    catch(SQLException sqle) {
      sqle.printStackTrace();
    }
  }

}