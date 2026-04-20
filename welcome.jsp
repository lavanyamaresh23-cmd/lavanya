<%
String name = request.getParameter("uname");

// store in session
session.setAttribute("user", name);

// set expiry = 1 minute
session.setMaxInactiveInterval(60);
%>

<html>
<body>

<h2>Hello <%= name %></h2>
<p>Session started successfully</p>
<p>Session expires in 1 minute</p>

<a href="second.jsp">Check Session</a>

</body>
</html>