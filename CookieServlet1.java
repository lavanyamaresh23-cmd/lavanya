package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet1 extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        Cookie[] cookies = request.getCookies();

        String name = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user"))
                    name = c.getValue();

                if (c.getName().equals("count"))
                    count = Integer.parseInt(c.getValue());
            }
        }

        if (userName != null && !userName.isEmpty()) {
            name = userName;
            count = 0;
        }

        if (name != null) {
            count++;

            Cookie userCookie = new Cookie("user", name);
            Cookie countCookie = new Cookie("count", String.valueOf(count));

            userCookie.setMaxAge(30);
            countCookie.setMaxAge(30);

            response.addCookie(userCookie);
            response.addCookie(countCookie);

            out.println("<html><body>");
            out.println("<h2 style='color:blue;'>Welcome back " + name + "!</h2>");
            out.println("<h3>You visited " + count + " times</h3>");

            // Display all cookies
            out.println("<h3>All Cookies:</h3>");
            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("Name: " + c.getName() + 
                                " | Value: " + c.getValue() + "<br>");
                }
            }

            out.println("<p>(Cookies expire in 30 seconds)</p>");
            out.println("<a href='index.html'>Go Back</a>");
            out.println("</body></html>");

        } else {
            response.sendRedirect("index1.html");
        }
    }
}