package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/HelloWorldSecond")
public class HelloWorldSecond extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloWorldSecond() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get writer
        PrintWriter out = response.getWriter();

        // HTML response
        out.println("<html><body>");
        out.println("<h2 style='color:blue;'>Hello World!!!</h2>");
        out.println("<p style='color:magenta;'>Server Time: " + new Date() + "</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}