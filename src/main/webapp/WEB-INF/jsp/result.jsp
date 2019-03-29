<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Equation Result</title>
</head>
<body>
<h3><a href="/">Вернуться на главную</a></h3>
<h3><a href="/showForm">Ввести новые данные для уравнения</a></h3>
<h2>Коефициенты и корни уравнения</h2>
<table>
  <tr>
    <td>Коефициент a :</td>
    <td>${coefA}</td>
  </tr>
  <tr>
    <td>Коефициент b :</td>
    <td>${coefB}</td>
  </tr>
  <tr>
    <td>Коефициент с :</td>
    <td>${coefC}</td>
  </tr>
  <tr>
    <td>X1 :</td>
    <td>${result}</td>
  </tr>
  <tr>
    <td>X2 :</td>
    <td>${result2}</td>
  </tr>
</table>
</body>
</html>