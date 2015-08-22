import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import database.*;
import models.*;
import java.util.ArrayList;

public class ListController extends HttpServlet 
{
  
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Database db = new Database();

    ArrayList<Location> locations = db.listLocations();
    
    db.close();

    request.setAttribute("locations", locations);
    RequestDispatcher rd = request.getRequestDispatcher("listview.jsp");

    rd.forward(request, response);
  }









  // public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
  //   Database db = new Database();

  //   ArrayList<Employee> list = db.listEmployees();

  //   db.close();

  //   request.setAttribute("employees", list);
  //   request.setAttribute("optlist", opt);

  //   RequestDispatcher rd = request.getRequestDispatcher("employees.jsp");

  //   rd.forward(request, response);

  // }


  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    doGet(request, response);
    
  }
}