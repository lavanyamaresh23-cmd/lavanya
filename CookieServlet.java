package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

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

        // Read cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user"))
                    name = c.getValue();

                if (c.getName().equals("count"))
                    count = Integer.parseInt(c.getValue());
            }
        }

        // If new user
        if (userName != null && !userName.isEmpty()) {
            name = userName;
            count = 0;
        }

        if (name != null) {
            count++;

            // Create cookies
            Cookie userCookie = new Cookie("user", name);
            Cookie countCookie = new Cookie("count", String.valueOf(count));

            // Expiry (30 seconds demo)
            userCookie.setMaxAge(30);
            countCookie.setMaxAge(30);

            response.addCookie(userCookie);
            response.addCookie(countCookie);

            out.println("<html><body>");
            out.println("<h2 style='color:blue;'>Welcome back " + name + "!</h2>");
            out.println("<h3 style='color:magenta;'>You have visited " + count + " times</h3>");
            out.println("<p>(Cookie expires in 30 seconds)</p>");
            out.println("<a href='CookieServlet'>Refresh</a>");
            out.println("</body></html>");

        } else {
            // First time
            out.println("<html><body>");
            out.println("<h2>Enter your name</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("<input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}