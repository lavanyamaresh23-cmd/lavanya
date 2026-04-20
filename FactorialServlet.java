package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response
            ) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 0)
                throw new IllegalArgumentException("Number cannot be negative");

            if (number > 20)
                throw new IllegalArgumentException("Max value is 20");

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            out.println("<html><body>");
            out.println("<h2>Factorial Result</h2>");
            out.println("Number: " + number + "<br>");
            out.println("Factorial: " + factorial);
            out.println("<br><a href='index.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
        }
    }
}