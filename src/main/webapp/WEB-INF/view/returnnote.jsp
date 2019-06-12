<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>Display Return Notes</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<jsp:include page="navigationBar.jsp"/>

<table border="2">

    <th>Return Note ID</th>
    <th>Customer Name</th>
    <th>Product Name</th>
    <th>Description</th>
    <th>Status</th>
    <th>Telephone</th>
    <th>Date Issued</th>

    
    

    <c:forEach var="var" items="${list}">
      <tr>
        <td>${var.getReturn_noteid()}</td>
        <td>${var.getCustomer_name()}</td> 
        <td>${var.getProduct_name()}</td>
       <td>${var.getDescription()}</td>
       <td>${var.getStatus()}</td>
       <td>${var.getTelephone()}</td>
       <td>${var.getDate()}</td>
      
      
     
      </tr>
    </c:forEach>
  </table>
  </form>
   
</body>
</html>
