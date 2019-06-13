<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}.
Favourite language is: ${student.favouriteLanguage}.
<br><br>
Operating systems:
<ul>
    <c:forEach items="${student.operatingSystems}" var="temp">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>

</html>