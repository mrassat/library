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

      DataSource ds = (DataSource) ec.lookup("jdbc/library");
      this.conn = ds.getConnection();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public ArrayList<Location> listLocations () {
    String query = "Select * from locations";

    ArrayList<Location> locations = new ArrayList<Location>();

    try {
      Statement stmt = this.conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
        Location loc = new Location(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("entity"),
            rs.getString("timetable"),
            rs.getString("transport"),
            rs.getString("description"),
            rs.getString("accessibility"),
            rs.getString("url"),
            rs.getString("street"),
            rs.getString("streettype"),
            rs.getString("number"),
            rs.getString("postalcode"),
            rs.getString("neighborhood"),
            rs.getString("district"),
            rs.getString("latitude"),
            rs.getString("longitude"),
            rs.getString("phone"),
            rs.getString("email")
          );

        locations.add(loc);
      } 
    }
    catch (SQLException sqle) {
        sqle.printStackTrace();
    }

    return locations;

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