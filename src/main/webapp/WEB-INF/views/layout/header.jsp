<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Project_9</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.js"></script>

    <%--    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>--%>
    <%--    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>--%>

</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">Project_9</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">


            <c:choose>
                <c:when test="${empty sessionScope.principal}">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="/loginForm">로그인</a></li>
                        <li class="nav-item"><a class="nav-link" href="/joinForm">회원가입 </a></li>
                    </ul>
                </c:when>
                <c:otherwise>
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="/board/Form">글쓰기</a></li>
                        <li class="nav-item"><a class="nav-link" href="/user/Form">회원정보</a></li>
                        <li class="nav-item"><a class="nav-link" href="/logout">로그아웃</a></li>
                    </ul>
                </c:otherwise>
            </c:choose>


        </div>
    </div>
</nav>
<br/>
</body>
