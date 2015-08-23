import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import database.*;
import models.*;
import java.util.ArrayList;

public class SelectController extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
  
    Database db = new Database();

    ArrayList<String> districts = db.getDistricts();
    
    db.close();

    request.setAttribute("districts", districts);
    RequestDispatcher rd = request.getRequestDispatcher("select_view.jsp");

    rd.forward(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    doGet(request, response);
    
  }
}