<%@ page import="java.util.*,com.model.FeePayment" %>

<html>
<head>
<title>Report Result</title>
</head>

<body>

<h2>Overdue Payments Report</h2>

<table border="1">

<tr>
<th>Payment ID</th>
<th>Student ID</th>
<th>Student Name</th>
<th>Amount</th>
<th>Status</th>
</tr>

<%
List<FeePayment> list =
(List<FeePayment>)request.getAttribute("reportList");

if(list != null) {

for(FeePayment fp : list) {
%>

<tr>

<td><%= fp.getPaymentID() %></td>
<td><%= fp.getStudentID() %></td>
<td><%= fp.getStudentName() %></td>
<td><%= fp.getAmount() %></td>
<td><%= fp.getStatus() %></td>

</tr>

<%
}
}
%>

</table>

</body>
</html>