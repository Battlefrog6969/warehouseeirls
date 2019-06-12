<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>MASTER STOCK</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<jsp:include page="navigationBar.jsp"/>
<h1> MASTER STOCK RECORD </H1> 
<table border="2">

 <th>binID</th>
    <th>Supplier name</th>
    <th>Product name</th> 
    <th>Quantity </th> 
        <th>Status </th> 


    <c:forEach var="var" items="${list}">
      <tr>
        <td>${var.getBinID()}</td>
        <td>${var.getSuppplierName()}</td> 
        <td>${var.getProductName()}</td>
                <td>${var.getQuantity()}</td> 
       <td>${var.getStatus()}</td> 
     
      </tr>
    </c:forEach>
  </table>
  </form>
   
</body>
</html>
