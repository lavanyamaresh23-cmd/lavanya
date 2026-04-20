<!DOCTYPE html>
<html>
<body>

<h2>Result</h2>

<p><%= request.getAttribute("message") %></p>

<%
if (request.getAttribute("username") != null) {
%>
    Username: <%= request.getAttribute("username") %><br>
    Email: <%= request.getAttribute("email") %><br>
    Designation: <%= request.getAttribute("designation") %><br>
<%
}
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>