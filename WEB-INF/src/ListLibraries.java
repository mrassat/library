import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import database.*;
import models.*;
import java.util.ArrayList;

public class ListClients extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    String opt = request.getParameter("optlist");

    Database db = new Database();

    ArrayList<Employee> list = db.listEmployees();

    db.close();

    request.setAttribute("employees", list);
    request.setAttribute("optlist", opt);

    RequestDispatcher rd = request.getRequestDispatcher("employees.jsp");

    rd.forward(request, response);

  }


  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    doGet(request, response);
    
  }
}