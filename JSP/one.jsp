<!DOCTYPE html>
<html>
<head>
    <title>jsp</title>
</head>
<body>
    <form action="Info.jsp" method="post">
        Name: <input type="text" name="name"><br>
        Age: <input type="text" name="age"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>

<!-- Jsp file -->
<body>
    <h1>user Info</h1>
    <p>
        <%= reguest.getParameter("name") %>
        <%= request.getParameter("age")  %>
    </p>
</body>