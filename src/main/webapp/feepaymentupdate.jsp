<html>
<head>
<title>Update Fee Payment</title>

<style>

body{
    background:#fff3cd;
    font-family:Arial;
}

.container{
    width:450px;
    margin:auto;
    margin-top:50px;
    background:white;
    padding:25px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

h2{
    text-align:center;
    color:#856404;
}

input, select{
    width:100%;
    padding:10px;
    margin-top:8px;
    margin-bottom:15px;
}

input[type=submit]{
    background:#ffc107;
    border:none;
    color:black;
    font-size:16px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#e0a800;
}

</style>
</head>

<body>

<div class="container">

<h2>Update Fee Payment</h2>

<form action="UpdateFeePaymentServlet" method="post">

Payment ID:
<input type="text" name="paymentID">

Student ID:
<input type="text" name="studentID">

Student Name:
<input type="text" name="studentName">

Payment Date:
<input type="date" name="paymentDate">

Amount:
<input type="text" name="amount">

Status:
<select name="status">
<option>Paid</option>
<option>Overdue</option>
</select>

<input type="submit" value="Update Payment">

</form>

</div>

</body>
</html>