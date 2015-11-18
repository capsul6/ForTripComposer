<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>ResponsePage</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="../../resources/styles/bootstrap.min.css" />" rel="stylesheet"/>
    <!--page style -->
    <link href="<c:url value="../../resources/styles/responsepage.css" />" rel="stylesheet"/>

</head>
<body>



<h1>List of Countries</h1>

<table class="table table-bordered">

    <thead>
    <tr>
        <th>ISOCode</th>
        <th>Country</th>
        <th>City</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${ResponseAttribute.countries}" var="Countries">
    <tr>
        <td><c:out value="${Countries.countryISOCode}"/></td>
        <td><c:out value="${Countries.countryName}"/></td>
        <td><c:out value="${Countries.cities}"/></td>
    </tr>
    </c:forEach>
    </tbody>

    </table>


</body>
</html>

