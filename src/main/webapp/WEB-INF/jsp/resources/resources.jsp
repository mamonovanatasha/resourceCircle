<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>TestWeb</title>
</head>

<body>
<h1>Resources</h1>

<table class="table table-striped">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    </thead>

    <c:forEach var="resource" items="${resources}">
        <tr>
            <td>${resource.id}</td>
            <td>${resource.name}</td>
            <td>

            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>