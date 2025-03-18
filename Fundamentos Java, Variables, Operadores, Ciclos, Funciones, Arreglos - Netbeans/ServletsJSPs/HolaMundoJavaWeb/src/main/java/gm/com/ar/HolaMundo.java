package gm.com.ar;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HolaMundoServlet") //http:8080/HolaMundoJavaWeb/HolaMundoServlet
public class HolaMundo extends HttpServlet{
    
    /**
     *
     * @param request
     * @param response
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        response.setContentType("text/html;chaeset=UTF-8");
        var salida = response.getWriter();
        salida.print("Hola Mundo desde Servlets");
    }
    
}
