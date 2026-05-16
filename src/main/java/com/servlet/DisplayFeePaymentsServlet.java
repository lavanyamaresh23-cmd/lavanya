package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.FeePaymentDAO;
import com.model.FeePayment;

public class DisplayFeePaymentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        FeePaymentDAO dao = new FeePaymentDAO();

        List<FeePayment> list = dao.getAllPayments();

        request.setAttribute("list", list);

        RequestDispatcher rd =
                request.getRequestDispatcher("feepaymentdisplay.jsp");

        rd.forward(request, response);
    }
}