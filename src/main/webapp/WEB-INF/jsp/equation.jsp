<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %> -->
<html>
<head>
  <title>Equation Form</title>
</head>
<body>

<h2>Введите коефициенты</h2>
<form:form method="post" modelAttribute="equation" action="/equationResult">
  <table>
    <tr>
      <td><form:label path="coefA">Коефициент a</form:label></td>
      <td><form:input path="coefA" /></td>
    </tr>
    <tr>
      <td><form:label path="coefB">Коефициент b</form:label></td>
      <td><form:input path="coefB" /></td>
    </tr>
    <tr>
      <td><form:label path="coefC">Коефициент c</form:label></td>
      <td><form:input path="coefC" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Рассчитать"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>