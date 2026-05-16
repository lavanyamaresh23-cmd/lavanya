package com.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.FeePaymentDAO;
import com.model.FeePayment;

public class AddFeePaymentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        FeePayment fp = new FeePayment();

        fp.setStudentID(Integer.parseInt(request.getParameter("studentID")));
        fp.setStudentName(request.getParameter("studentName"));
        fp.setPaymentDate(request.getParameter("paymentDate"));
        fp.setAmount(Double.parseDouble(request.getParameter("amount")));
        fp.setStatus(request.getParameter("status"));

        FeePaymentDAO dao = new FeePaymentDAO();

        dao.addPayment(fp);

        response.sendRedirect("DisplayFeePaymentsServlet");
    }
}