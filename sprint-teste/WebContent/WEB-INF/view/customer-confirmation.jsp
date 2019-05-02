<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title> Customer Confirmation</title>
</head>

<body>
<h2>The ${customer.firstName } ${customer.lastName } is confirmed	</h2>
<br><br>
<h2> Free Passes: ${customer.freePasses }</h2>
<br><br>
<h2>Postal Code: ${customer.postalCode }</h2>
<br><br>
<h2>Course Code: ${customer.courseCode}</h2>
</body>



</html>