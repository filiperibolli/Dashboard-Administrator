<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="Filipe S Ribolli  - example on https://getbootstrap.com/docs/4.0/examples/">
		<link rel="icon" href="<spring:url value="/resources/icons/abacus.png"/>"/>
		
		<title>Sistema Cesta de Serviços - Menu</title>
		
		<!-- Bootstrap core CSS -->
		<spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
		<link href="${bootstrap}" rel="stylesheet" />
		<!-- Custom styles for this template -->
		<spring:url value="/resources/css/signin.css" var="signin" />
		<link href="${signin}" rel="stylesheet" />
	</head>
	
	<body class="text-center">
		<form class="form-signin">
			<img class="mb-4" src="<spring:url value="/resources/icons/abacus.svg"/>" alt="i con by https://www.flaticon.com/authors/eucalyp on https://www.flaticon.com/" width="150" height="150"/>
			<h1 class="h4 mb-3 font-weight-normal">Sistema cesta de serviços</h1>
			<button class="btn btn-lg btn-success">DashBoard</button>
			<button class="btn btn-lg btn-secondary">LogViewer</button>
			<p class="mt-5 mb-3 text-muted">© Filipe S Ribolli 2015 - 2019</p>
		</form>
	</body
></html>