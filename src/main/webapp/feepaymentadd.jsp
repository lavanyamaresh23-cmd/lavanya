<html>
<head>
<title>Add Fee Payment</title>

<style>

body{
    background:#e6f2ff;
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
    color:#003366;
}

input, select{
    width:100%;
    padding:10px;
    margin-top:8px;
    margin-bottom:15px;
}

input[type=submit]{
    background:#28a745;
    color:white;
    border:none;
    font-size:16px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#218838;
}

</style>
</head>

<body>

<div class="container">

<h2>Add Fee Payment</h2>

<form action="AddFeePaymentServlet" method="post">

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

<input type="submit" value="Add Payment">

</form>

</div>

</body>
</html>