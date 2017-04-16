<%-- 
    Document   : user
    Created on : Feb 9, 2017, 12:34:45 AM
    Author     : tris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <base href="${pageContext.servletContext.contextPath}/">
        
        <link rel="stylesheet" href="css/table.css">
        
        
    </head>
    <body>
        <br>
        <a href="http://localhost:8084/ASSSOF302/loginController?txtUsername=admin&txtPassword=admin&action=Login">Trang chủ</a>|
        <a href="http://localhost:8084/ASSSOF302/">Đăng Xuất</a>
        <br>
        <div class="container">
        <center>
            <br>
        <h1>Quản lý tài khoản</h1>
        <form:form action="user.htm" modelAttribute="user">
                
            <h4><div>Username</div></h4>
            <form:input path="Username"/>
            <h4><div>Password</div></h4>
            <form:input path="Password"/>
            <h4><div>Full Name</div></h4>
            <form:input path="Fullname"/>
            <br>
            <br>
            <div>
                <button name="btnInsert">Thêm</button>
                
            </div>
            </form:form>   
            
        </center>
            <br>
         <table>
         <thead>
        	<tr>
                    <td>Username</td>
                    <td>Password</td>
                    <td>Fullname</td>
                    <td>Xóa</td>
                </tr>
                </thead>
                <c:forEach var="rows" items="${listUser}">
                    <form action="user/delete.htm">
                    <tbody>
                        <tr>
                            <td>${rows.username}</td>
                            <td>${rows.password}</td>
                            <td>${rows.fullname}</td>
                            
                            
                            <td>
                                <input type="hidden" name="txtUsername" value="${rows.username}"/>
                                <input type="submit" name="action" value="Xóa"/>
                            </td>
                        </tr>
                        </tbody>
                    </form>
                </c:forEach>
            </table>
            <br>
            <center>
             
            
            </center>
    </div>
    </body>
</html>
