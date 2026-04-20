<%
String name = (String) session.getAttribute("user");
%>

<html>
<body>

<h2>Session Check</h2>

<%
if (name == null) {
%>
    <h3 style="color:red;">Session Expired!</h3>
<%
} else {
%>
    <h3>Hello <%= name %></h3>
<%
}
%>

</body>
</html>