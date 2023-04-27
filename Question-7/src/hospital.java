import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hospital")
public class hospital extends HttpServlet {
  private static final long serialVersionUID = 1L;
      public hospital() {
       super();   }
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       int age = Integer.parseInt((request.getParameter("age")));
       String doa = request.getParameter("doa");
       String coa = request.getParameter("coa");
       String doctor = request.getParameter("doctor");
       String treatment = request.getParameter("treatment");
       PrintWriter out = response.getWriter();
       out.print("<html><body><p>" + id + "</p><p>" + name + "</p>");
       out.print("<p>" + age + "</p><p>" + doa + "</p><p>"+ coa + "</p><p>"+ doctor + "</p><p>"+ treatment +"</p></body></html>");
       String insertQuery = String.format(
             "insert into hospital (id, name, age, doa,coa, doctor, treatment) values (%d, '%s', %d, '%s', '%s', '%s', '%s')",
             id, name, age, doa, coa, doctor, treatment);
       String retrieveQuery = String.format("select * from hospital");
       try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "ayush2002");
           Statement s = (Statement) c.createStatement();
           int update = s.executeUpdate(insertQuery);
           System.out.println("Inserted Successfully!!!" + update);
           ResultSet rs = s.executeQuery(retrieveQuery);
          while(rs.next()){
                  System.out.print("ID: " + rs.getInt("id"));
                  System.out.print(", Name: " + rs.getString("name"));
                  System.out.print(", age: " + rs.getInt("age"));
                  System.out.print(", doa: " + rs.getString("doa"));
                  System.out.print(", coa: " + rs.getString("coa"));
                  System.out.print(", doctor: " + rs.getString("doctor"));
                  System.out.print(", treatment: " + rs.getString("treatment")); }
          s.close();
          c.close();
 }catch(Exception err){
          System.out.println("Error while storing in db " + err);
}}}