<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Customer registration form</title>
	<style>
		.errors {color:red}
	</style>
</head>

<body>
<i>Fill out the form. (*) means required</i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
	
	First name: <form:input path="firstName" />
	<br><br>
	LastName(*): <form:input path="lastName" />
	<form:errors path="lastName" cssClass="errors" />
	<br><br>
	
	Free Passes : <form:input path="freePasses" />
	<form:errors path="freePasses" cssClass="errors" />
	<br><br>
	
	Postal Code: <form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="errors" />	
	<br><br>
	
	CourseCode: <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="errors" />
	
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>

</body>
</html>