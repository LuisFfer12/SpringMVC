<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>


<body>
	<form:form action="processForm" modelAttribute="student">
	
	First name (*): <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error"></form:errors>
	<br><br>
	
	Last name: <form:input path="lastName" />
	<br><br>
	
	Country: <form:select path="country">
				<form:options items= "${student.countryOptions }" />
			</form:select>
	<br><br>
	
	Favorite Languages :
	
	Java<form:radiobutton path="favoriteLanguage" value="Java" />
	C#<form:radiobutton path="favoriteLanguage" value="C#" />
	Prolog<form:radiobutton path="favoriteLanguage" value="Prolog" />
	C<form:radiobutton path="favoriteLanguage" value="C" />
	
	<br><br>
	
	Operating Systems:
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Windows<form:checkbox path="operatingSystems" value="Windows"/>
	Mac<form:checkbox path="operatingSystems" value="Mac"/>
	<br><br>
	<input type="submit" value="Submit" />
	
	
	
	</form:form>

</body>

</html>