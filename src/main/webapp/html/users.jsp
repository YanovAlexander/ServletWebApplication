<%@ page import="com.yanov.goit.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head><title>Users</title></head>
<body>
    <table>
        <thead>
            <tr>
                <td style="text-align: center">username</td>
                <td style="text-align: center">email</td>
            </tr>
        </thead>
        <tbody>
                <% for (User user: (List<User>) request.getAttribute("users")) {%>
            <tr>
                <td><%=user.getUsername()%></td>
                <td><%=user.getEmail()%></td>
            </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>