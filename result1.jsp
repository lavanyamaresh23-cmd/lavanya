<!DOCTYPE html>
<html>
<body>

<h2>Student Result</h2>

<%
if (request.getAttribute("message") != null) {
%>
    <p style="color:red;"><%= request.getAttribute("message") %></p>
<%
} else {
%>
    Roll No: <%= request.getAttribute("roll") %><br>
    Name: <%= request.getAttribute("name") %><br>
    Average: <%= request.getAttribute("avg") %><br>
    Result: <%= request.getAttribute("result") %><br>
<%
}
%>

<br>
<a href="index1.jsp">Back</a>

</body>
</html>