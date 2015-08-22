import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import database.*;
import models.*;
import java.util.ArrayList;

public class SearchController extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
    String query = request.getParameter("q");

    Database db = new Database();

    ArrayList<Location> locations = db.searchLocationsByName(query);
    
    db.close();

    request.setAttribute("locations", locations);
    request.setAttribute("title", "Resultados de la busqueda");
    RequestDispatcher rd = request.getRequestDispatcher("list_view.jsp");

    rd.forward(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    doGet(request, response);
    
  }
}