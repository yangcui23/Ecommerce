<%--
  Created by IntelliJ IDEA.
  User: yangc
  Date: 2023/8/9
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="BIG5">
    <link rel="stylesheet" type="text/css" href="/css/dashboard.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">


    <title>Home</title>
    <style>
        /* Style for the dropdown menu container */
        .dropdown-wrapper {
            position: relative;
        }

        /* Style for the label */
        .dropdown-label {
            cursor: pointer;
        }

        /* Style for the dropdown content */
        .dropdown-content {
            display: none;
            position: fixed; /* Use fixed position for full-screen */
            top: 10.8%;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: 1;

            padding: 5px;
            background-color: rgba(0, 0, 0, 0.5);
        }
        .dropdown {
            top: 10.8%;
            left: 10%;
            width: 200px;
            height: 500px;
            position: absolute;
            background-color: white;
            z-index: 2;
        }
        /* Show the dropdown content when the label is clicked */
        .dropdown-wrapper.active .dropdown-content {
            display: block;
        }

        /* Style for the transparent grey background */
        .transparent-background {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 500px;
            height: 400px;
            background-color: black; /* Corrected rgba value for transparency */
            z-index: 2;
        }

        /* Show the overlay when the dropdown is active */
        .dropdown-wrapper.active .transparent-background {
            display: block;
        }
        .dropdown-wrapper.active .dropdown{
            display: block;
        }
        .arrow {
            position: absolute;
            top: -10px; /* Adjust this value to position the arrow */
            left: 50%;
            transform: translateX(-50%);
            width: 0;
            height: 0;
            border-left: 10px solid transparent;
            border-right: 10px solid transparent;
            border-bottom: 10px solid white; /* Color of the arrow, matches dropdown content background */
        }
    </style>
</head>

<body >
    <div class="container">
        <div class="nav">


            <div class="menu">
                <a href="/" class="home"> <img src="<c:url value="/images/logo.png"/>" class="logo" alt="bestbuy logo"/></a>



                <div class="dropdown-wrapper">
                    <span class="dropdown-label" onclick="toggleDropdown()"><i class="b bi-list"></i> Categories</span>

                    <div class="dropdown-content" onclick="stopPropagation(event)" id="dropdownContent">
                        <div class="dropdown">
                            <div class="arrow"></div>
                            <c:forEach items="${topCategories}" var="topCategory">
                                <a href="/category/${topCategory.name}">${topCategory.name}</a>
                            </c:forEach>
                        </div>





                    </div>
                </div>

            </div>
            <div>
                <form class="form" >
                    <input name="keyword" class="searchInput" placeholder="What can we help you find today?"/>
                    <button type="submit" class="searchButton"><i class="fi bi-search"></i></button>
                </form>
            </div>
            <div>
                <div id="map"></div>
                <input id="search" type="text" placeholder="Search for a location"/>
            </div>
            <div class="menu">
                <i class="bi bi-cart"></i>
                <p class="menuText">Cart</p>
            </div>
        </div>

        <div class="dropdownDiv">

        </div>
        <div class="contentContainer">
            <div class="topCate">
                <p>Today's top categories</p>

                <div>
                    <c:forEach items="${topCategories}" var="topCategory">

                        <a href="/category/${topCategory.name}">${topCategory.name}</a>

                    </c:forEach>
                </div>


            </div>
            <div class="allCate">

                    <c:forEach items="${categories}" var="category">
                        <div class="categoryItem">

<%--                            <div class="imgDiv">--%>
<%--                                <img src="${category.imagePath}" alt="${category.name} Image" class="cateImage">--%>
<%--                            </div>--%>
                        <a href="/category/${category.name}" class="imgDiv"> <img src="${category.imagePath}" alt="${category.name} Image" class="cateImage"> ${category.name}</a>
                        </div>
                    </c:forEach>


            </div>
        </div>
        <div class="botDiv">
            <div>

            </div>
            <div>

            </div>
        </div>
    </div>


    <script>

        document.addEventListener("click", function(event) {
            var dropdownContent = document.querySelector(".dropdown-content");
            var dropdownLabel = document.querySelector(".dropdown-label");

            if (event.target !== dropdownContent && event.target !== dropdownLabel) {
                dropdownContent.style.display = "none";
            }
        });
        function toggleDropdown() {
            var dropdownContent = document.querySelector(".dropdown-content");
            dropdownContent.style.display = (dropdownContent.style.display === "block") ? "none" : "block";
        }

        function stopPropagation(event) {
            event.stopPropagation();
        }
        function closeDropdown() {
            var dropdownContent = document.getElementById('dropdownContent');
            dropdownContent.style.display = 'none';
        }

        // Event listener to close dropdown when clicking outside or inside
        window.addEventListener('click', function(event) {
            var dropdownContent = document.getElementById('dropdownContent');
            var dropdownLabel = document.querySelector('.dropdown-label');

            if (!dropdownContent.contains(event.target) && !dropdownLabel.contains(event.target)) {
                closeDropdown();
            }
        });

        // Event listener to close dropdown when clicking inside the dropdown
        document.getElementById('dropdownContent').addEventListener('click', function(event) {
            event.stopPropagation();
            closeDropdown();
        });
    </script>
</body>
</html>
