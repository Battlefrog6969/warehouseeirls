<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Login </title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
  
   <form:form method="POST"
          action="/placelogin" modelAttribute="loginmodel">
             <table>
                <tr>
                    <td><form:label path="userid">User Id</form:label></td>
                    <td><form:input path="userid"/></td>
                </tr>
                <tr>
                    <td><form:label path="pass">password</form:label></td>
                    <td><form:input path="pass"/></td>
                </tr>
        
                <</tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

      
</body>
</html>