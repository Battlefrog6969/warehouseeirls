<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>BILL OF MATERIALS</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<jsp:include page="navigationBar.jsp"/>

<table border="2">

    <th>ID</th>
    <th>Created Date</th>
    <th>Order Date </th>
    <th>Status </th>
    <th>Updated Date</th> 
    

    <c:forEach var="var" items="${list}">
      <tr>
        <td>${var.getBomid()}</td>
        <td>${var.getCreatedDate()}</td> 
        <td>${var.getOrderItemid()}</td>
       <td>${var.getStatus()}</td>
       <td>${var.getUpdatedDate()}</td> 
     
      </tr>
    </c:forEach>
  </table>
  </form>
   
</body>
</html>
