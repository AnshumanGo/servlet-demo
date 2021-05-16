<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet - Dispatcher</title>
</head>
<body>
<h1><%= "User Login" %>
</h1>
<br/>
<form action="welcome" method="post">
    Name     :<input type="text" name="userName"/><br/>
    Password :<input type="password" name="userPassword"/><br/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>