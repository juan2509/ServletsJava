package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obtener datos enviados por el formulario
        String datoOculto = request.getParameter("oculto");
        String nombre = request.getParameter("nombre");
        String apellidoP = request.getParameter("apellidoP");
        String sexo = request.getParameter("sexo");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String nacionalidad = request.getParameter("nacionalidad");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String ocupacion = request.getParameter("ocupacion");
        String musica = request.getParameter("musica");
        String comentarios = request.getParameter("comentarios");                
        
        // Tipo de respuesta
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        // Formato de respuesta
        PrintWriter out = response.getWriter();        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta del formulario</title>");
        out.print("<head>");
        out.print("<body>");
        out.print("<h2>Respuesta de la petición realizada por el formulario</h2>");
        out.print("<br><br>");
        out.print("<p>Valor oculto: " + datoOculto + "</p>");
        out.print("<p>Nombre: " + nombre  + " " + apellidoP + "</p>");
        out.print("<p>Género: " + sexo + "</p>");
        out.print("<p>Correo: " + correo + "</p>");
        out.print("<p>Teléfono: " + telefono + "</p>");
        out.print("<p>Fecha de nacimiento: " + fechaNacimiento + "</p>");
        out.print("<p>Nacionalidad: " + nacionalidad + "</p>");
        out.print("<p>Tecnologías de interés:</p>");
        for(String tecnologia : tecnologias) {
            out.print("<p>" + tecnologia + "</p>");
        }        
        out.print("<p>Ocupación actual: " + ocupacion + "</p>");
        out.print("<p>Música  preferida: " + musica + "</p>");
        out.print("<p>Comentarios: " + comentarios + "</p>");        
        out.print("</body>");
        out.print("</html>");
    }
}
