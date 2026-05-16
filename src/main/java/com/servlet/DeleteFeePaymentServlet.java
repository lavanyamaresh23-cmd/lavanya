package com.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.FeePaymentDAO;

public class DeleteFeePaymentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        FeePaymentDAO dao = new FeePaymentDAO();

        dao.deletePayment(id);

        response.sendRedirect("DisplayFeePaymentsServlet");
    }
}