<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- <%@ page contentType="text/html;charset=UTF-8" language="java" %> -->
<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <h3><a href="/showForm">Рассчитать уравнения</a></h3>

    <h3>История :</h3>

    <table border="1">

        <th>ID</th>
        <th>Коефициент a</th>
        <th>Коефициент b</th>
        <th>Коефициент c</th>
        <th>x1</th>
        <th>x2</th>

        <c:forEach var="equation" items="${listEquation}" varStatus="status">
            <tr>
                <td>${equation.id}</td>
                <td>${equation.coefA}</td>
                <td>${equation.coefB}</td>
                <td>${equation.coefC}</td>
                <td>${equation.result}</td>
                <td>${equation.result2}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
