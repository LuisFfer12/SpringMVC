<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Add Form</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css " />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css " />
	</head>
	<body>
	<div id="wraper">
		<div id="header">
			<h2>Form ADD</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
		<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>First Name</label>
						<td><form:input path="firstName" /> </td>
					</tr>
					<tr>
						<td><label>Last Name</label>
						<td><form:input path="lastName"/></td>					
					</tr>
					<tr>
						<td><label>Email</label>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>	
	</body>

</html>