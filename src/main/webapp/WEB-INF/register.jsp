<%--
  Created by IntelliJ IDEA.
  User: yangc
  Date: 2023/8/12
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ page import="java.util.Collections"%>
<html>
<head>
    <meta charset="BIG5">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <title>Login</title>
</head>
<body>
<div class="container">
    <div class="nav">


        <div class="menu">
            <a href="/" class="home"> <img src="<c:url value="/images/logo.png"/>" class="logo" alt="bestbuy logo"/></a>


        </div>

        <div class="menu">
            <a href="/" class="goBack">Return to previous page</a>
        </div>
    </div>
    <div class="contentContainer">
        <div class="registerForm">
            <h1>
                Sign In to Best Buy
            </h1>
            <form:form action="/login" modelAttribute="newLogin" method="post">
                <div class="form-outline mb-4">





                    <form:errors path="email" style="color:red;"/>

                    <form:input path="email" type="email"
                                class="form-control form-control-lg"
                                placeholder="Enter a valid email address" />
                    <form:label path="email">Email address</form:label>

                </div>


                <div class="form-outline mb-3">
                    <form:errors path="password"  style="color:red;"/>
                    <form:input path="password" type="password"
                                class="form-control form-control-lg"
                                placeholder="Enter password" />
                    <form:label path="password">Password</form:label>
                </div>





                <div class="text-center text-lg-start mt-4 pt-2">
                    <input type="submit" class="btn btn-primary btn-lg"
                           style="padding-left: 2.5rem; padding-right: 2.5rem;"
                           value="Login">
                    <p class="small fw-bold mt-2 pt-1 mb-0">
                        Don't have an account? <a href="/register" class="link-danger">Register</a>
                    </p>
                </div>

            </form:form>

        </div>
    </div>
    <div class="bottomDes">
        <div>
            <P>© 2023 Best Buy. All rights reserved. BEST BUY, the BEST BUY logo, the Tag Design, MY BEST BUY, and BESTBUY.COM are trademarks of Best Buy and its affiliated companies.</P>
            <p> My goal is to create a distinctive and innovative solution that showcases modern e-commerce practices without infringing upon existing trademarks or copyrights.</p>
        </div>
        <div class="links">
            <p>Made by Yang Cui @Circa 2023</p>
            <a href="https://github.com/yangcui23"><i class="bi bi-github"></i> My Github</a>
            <a href="/"><i class="bi bi-linkedin"></i>My LinkedIn</a>
        </div>

    </div>
</div>
</body>
</html>
