<%@ page import="com.yanov.goit.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <c:if test="${not empty users}">
        <lable>Users</lable>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>
                    <c:out value="${user.username}"/>
                </td>
                <td>
                    <c:out value="${user.email}"/>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</body>
</html>