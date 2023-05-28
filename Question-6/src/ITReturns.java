import java.io.File; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
public class ITReturns extends HttpServlet { 
    private static final long serialVersionUID = 1L; 
        
    public ITReturns() { 
        super(); 
    } 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException { 
        String name=request.getParameter("name"); 
        String gender=request.getParameter("gender"); 
        String salary=request.getParameter("salary"); 
        String tax=request.getParameter("tax"); 
        PrintWriter out=response.getWriter(); 
        File file = new File("/home/mahen/1.txt"); 
        file.createNewFile(); 
        FileOutputStream fout = new FileOutputStream(file); 
        out.println(""+name+gender+salary+tax); 
        fout.write(("hello"+name+gender+salary+tax).getBytes()); 
        fout.close(); 
         
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException { 
        } 
 
} 