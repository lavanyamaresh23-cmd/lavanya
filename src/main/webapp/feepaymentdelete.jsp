<html>
<head>
<title>Delete Fee Payment</title>

<style>

body{
    background:#ffe6e6;
    font-family:Arial;
}

.container{
    width:400px;
    margin:auto;
    margin-top:100px;
    background:white;
    padding:25px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

h2{
    text-align:center;
    color:#cc0000;
}

input{
    width:100%;
    padding:10px;
    margin-top:10px;
    margin-bottom:15px;
}

input[type=submit]{
    background:#dc3545;
    color:white;
    border:none;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#c82333;
}

</style>
</head>

<body>

<div class="container">

<h2>Delete Fee Payment</h2>

<form action="DeleteFeePaymentServlet" method="get">

Enter Payment ID:
<input type="text" name="id">

<input type="submit" value="Delete Payment">

</form>

</div>

</body>
</html>