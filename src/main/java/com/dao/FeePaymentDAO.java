
package com.dao;

import java.sql.*;
import java.util.*;
import com.model.FeePayment;

public class FeePaymentDAO {

    String jdbcURL = "jdbc:mysql://localhost:3306/college";
    String jdbcUsername = "root";
    String jdbcPassword = "root";

    Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // Add Payment
    public void addPayment(FeePayment fp) {

        try {

            Connection con = getConnection();

            String query = "INSERT INTO FeePayments(StudentID, StudentName, PaymentDate, Amount, Status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, fp.getStudentID());
            ps.setString(2, fp.getStudentName());
            ps.setString(3, fp.getPaymentDate());
            ps.setDouble(4, fp.getAmount());
            ps.setString(5, fp.getStatus());

            ps.executeUpdate();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Display All Payments
    public List<FeePayment> getAllPayments() {

        List<FeePayment> list = new ArrayList<>();

        try {

            Connection con = getConnection();

            String query = "SELECT * FROM FeePayments";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                FeePayment fp = new FeePayment();

                fp.setPaymentID(rs.getInt("PaymentID"));
                fp.setStudentID(rs.getInt("StudentID"));
                fp.setStudentName(rs.getString("StudentName"));
                fp.setPaymentDate(rs.getString("PaymentDate"));
                fp.setAmount(rs.getDouble("Amount"));
                fp.setStatus(rs.getString("Status"));

                list.add(fp);
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Delete Payment
    public void deletePayment(int id) {

        try {

            Connection con = getConnection();

            String query = "DELETE FROM FeePayments WHERE PaymentID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Update Payment
    public void updatePayment(FeePayment fp) {

        try {

            Connection con = getConnection();

            String query = "UPDATE FeePayments SET StudentID=?, StudentName=?, PaymentDate=?, Amount=?, Status=? WHERE PaymentID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, fp.getStudentID());
            ps.setString(2, fp.getStudentName());
            ps.setString(3, fp.getPaymentDate());
            ps.setDouble(4, fp.getAmount());
            ps.setString(5, fp.getStatus());
            ps.setInt(6, fp.getPaymentID());

            ps.executeUpdate();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Overdue Payments Report
    public List<FeePayment> getOverduePayments() {

        List<FeePayment> list = new ArrayList<>();

        try {

            Connection con = getConnection();

            String query = "SELECT * FROM FeePayments WHERE Status='Overdue'";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                FeePayment fp = new FeePayment();

                fp.setPaymentID(rs.getInt("PaymentID"));
                fp.setStudentID(rs.getInt("StudentID"));
                fp.setStudentName(rs.getString("StudentName"));
                fp.setPaymentDate(rs.getString("PaymentDate"));
                fp.setAmount(rs.getDouble("Amount"));
                fp.setStatus(rs.getString("Status"));

                list.add(fp);
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}