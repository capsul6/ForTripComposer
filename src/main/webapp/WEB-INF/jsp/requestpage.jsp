<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestPage</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="../../resources/styles/bootstrap.min.css" />" rel="stylesheet"/>
    <!--page style -->
    <link href="<c:url value="../../resources/styles/requestpage.css" />" rel="stylesheet"/>
</head>
<body>

<form method = "POST" action="/main/request">

    <button type = "submit" class = "btn btn-success" value = "Save">Submit</button>

</form>

</body>
</html>
