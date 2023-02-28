<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>

<%@ include file="../layout/header.jsp" %>

<div class="container-fluid mt-3">
    <form action="/auth/loginProc" method="post">
        <div class="mb-3 mt-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" name="username" class="form-control" id="username" placeholder="Enter username" name="username">
        </div>

        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Enter password" name="pswd">
        </div>

        <button id="btn-login" class="btn btn-primary">로그인</button>
        <a href="https://kauth.kakao.com/oauth/authorize?client_id=e2a74f79d2813eab9b23add1bb2f531a&redirect_uri=http://localhost:8080/auth/kakao/callback&response_type=code"><img height="38px" src="/image/kakao_login_button.png"></a>
    </form>

</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>
