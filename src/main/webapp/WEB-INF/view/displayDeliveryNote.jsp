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

    <th>Delivery id</th>
    <th>couriier id</th>
    <th>Delivery date</th>
    <th>Delivery location</th>
    <th>Delivery status</th>
    <th>Delivery type</th>
    <th>order id</th>
    

    <c:forEach var="var" items="${list}">
      <tr>
        <td>${var.getDelivery_id()}</td>
        <td>${var.getCourier_id()}</td> 
        <td>${var.getDelivery_date()}</td>
       <td>${var.getDelivery_location()}</td>
       <td>${var.getDelivery_status()}</td>
       <td>${var.getDelivery_type()}</td>
       <td>${var.getOrder_id()}</td>
     
      </tr>
    </c:forEach>
  </table>
  </form>
   
</body>
</html>
