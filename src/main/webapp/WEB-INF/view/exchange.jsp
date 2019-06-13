<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>Display delivery notes</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<jsp:include page="navigationBar.jsp"/>



<table border="2">

    
    <th>Return id</th>
    <th>Product Name</th>
    <th>Product Quantity</th>
    <th>Return Type </th>
    <th>Description</th>
    <th>Return Location</th>
    <th>Return Date</th>
   
    

    <c:forEach var="var" items="${list}">
      <tr>
        <td>${var.getReturn_id()}</td> 
        <td>${var.getProduct_name()}</td>
       <td>${var.getProduct_quantity()}</td>
       <td>${var.getReturn_type()}</td>
       <td>${var.getDescription()}</td> 
        <td>${var.getReturn_location()}</td> 
        <td>${var.getReturn_date()}</td> 
     				

      </tr>
    </c:forEach>
  </table>
 
   
   	 
<script src="js/bootstrap.min.js"></script> 
</body>
</html>
