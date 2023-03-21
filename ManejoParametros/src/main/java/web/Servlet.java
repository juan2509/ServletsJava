package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Recuperacion de parametros enviados por el formulario
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        // Definción de tipo de respuesta
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        // Respuesta de la peticion en formato html
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta del formulario</title>");
        out.print("<head>");
        out.print("<body>");
        out.print("<h2>Respuesta de la petición realizada por el formulario</h2>");
        out.print("<p>Usurio: " + user + "</p>");
        out.print("<p>Contraseña: " + pass + "</p>");
        out.print("</body>");
        out.print("</html>");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = request.getParameter("user");
        int edad = Integer.parseInt(request.getParameter("edad"));
        
        // Definción de tipo de respuesta
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        // Respuesta de la peticion en formato html
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta de la peticion</title>");
        out.print("<head>");
        out.print("<body>");
        out.print("<h2>Respuesta de la petición realizada por una URL</h2>");
        out.print("<p>Usurio: " + usuario + "</p>");
        out.print("<p>Edad: " + edad + "</p>");
        out.print("<br>");
        out.print("</body>");
        out.print("</html>");
    }
}
