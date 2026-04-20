package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create or get session
        HttpSession session = request.getSession(true);

        // Set session expiry to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        // Get session details
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Visit count logic
        Integer count = (Integer) session.getAttribute("count");
        if (count == null)
            count = 1;
        else
            count++;

        session.setAttribute("count", count);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p>Session ID: " + sessionId + "</p>");
        out.println("<p>Session Creation Time: " + creationTime + "</p>");
        out.println("<p>Last Access Time: " + lastAccessTime + "</p>");
        out.println("<p>Visit Count: " + count + "</p>");
        out.println("<p style='color:red;'>Session expires in 1 minute</p>");
        out.println("<a href='SessionTracker'>Refresh</a>");
        out.println("</body></html>");
    }
}