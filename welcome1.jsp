<%
String name = request.getParameter("uname");
int time = Integer.parseInt(request.getParameter("time"));

// store data
session.setAttribute("user", name);

// set custom expiry
session.setMaxInactiveInterval(time);
%>

<html>
<body>

<h2>Hello <%= name %></h2>
<p>Session time set to <%= time %> seconds</p>

<p>Click below or wait to test session expiry</p>

<a href="second1.jsp">Check Session</a>

</body>
</html>