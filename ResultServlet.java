package com.HTTP_REQ_RES;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String roll = request.getParameter("rollno");
            String name = request.getParameter("name");

            int s1 = Integer.parseInt(request.getParameter("s1"));
            int s2 = Integer.parseInt(request.getParameter("s2"));
            int s3 = Integer.parseInt(request.getParameter("s3"));
            int s4 = Integer.parseInt(request.getParameter("s4"));
            int s5 = Integer.parseInt(request.getParameter("s5"));

            // Server-side validation
            if (s1 < 0 || s2 < 0 || s3 < 0 || s4 < 0 || s5 < 0) {
                request.setAttribute("message", "Marks cannot be negative");
            } else {

                double avg = (s1 + s2 + s3 + s4 + s5) / 5.0;

                String result = (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40)
                        ? "PASS" : "FAIL";

                request.setAttribute("roll", roll);
                request.setAttribute("name", name);
                request.setAttribute("avg", avg);
                request.setAttribute("result", result);
            }

        } catch (Exception e) {
            request.setAttribute("message", "Invalid input!");
        }

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}