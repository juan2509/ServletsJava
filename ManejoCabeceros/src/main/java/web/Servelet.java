package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHeaders")
public class Servelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        String uriPeticion = request.getRequestURI();
        String protocolo = request.getProtocol();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<h3>Informacion relativa al contexto</h3>");
        out.print("Metodo http:" + metodoHttp);
        out.print("<br>");
        out.print("URI solicitada:" + uriPeticion);
        out.print("<br>");
        out.print("Protocolo utilizado:" + protocolo);
        out.print("<br>");
        out.print("<br>");
        //Impresion de todos los cabeceros de la peticion
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements()) {
            String nombreCabecero = cabeceros.nextElement().toString();
            out.print("<b>" + nombreCabecero + "</b>");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        out.print("</body>");
        out.print("</html>");
        out.close();
        
    }
    
}
