<%@ page import="java.util.*,com.model.FeePayment" %>

<html>
<head>
<title>Display Payments</title>

<style>

body{
    background:#f8f9fa;
    font-family:Arial;
}

h2{
    text-align:center;
    color:#003366;
}

table{
    width:90%;
    margin:auto;
    border-collapse:collapse;
    background:white;
}

th{
    background:#007bff;
    color:white;
    padding:12px;
}

td{
    padding:10px;
    text-align:center;
}

tr:nth-child(even){
    background:#f2f2f2;
}

</style>
</head>

<body>

<h2>All Fee Payments</h2>

<table border="1">

<tr>
<th>Payment ID</th>
<th>Student ID</th>
<th>Student Name</th>
<th>Payment Date</th>
<th>Amount</th>
<th>Status</th>
</tr>

<%
List<FeePayment> list =
(List<FeePayment>)request.getAttribute("list");

if(list != null){

for(FeePayment fp : list){
%>

<tr>

<td><%= fp.getPaymentID() %></td>
<td><%= fp.getStudentID() %></td>
<td><%= fp.getStudentName() %></td>
<td><%= fp.getPaymentDate() %></td>
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