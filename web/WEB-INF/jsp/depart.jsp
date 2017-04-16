<%-- 
    Document   : departs
    Created on : Feb 8, 2017, 12:27:14 AM
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
        <a href="http://localhost:8084/ASSSOF302/loginController?txtUsername=teo&txtPassword=123&action=Login">Trang chủ</a>|
        <a href="http://localhost:8084/ASSSOF302/">Đăng Xuất</a>
        <br>
    <center>
        <h1>Quản lý phòng ban</h1>
        <form:form action="depart.htm" modelAttribute="depart">
            <div>Mã phòng ban</div>
            <form:input path="Id"/>
            <div>Tên phòng ban</div>
            <form:input path="Name"/>
            <br>
            <br>
            <div>
                <button name="btnInsert">Thêm</button>
                <button name="btnUpdate">Cập nhật</button>
            </div>
        </form:form>
            <br>
            <table >
                <thead>
                <tr>
                    <td>Mã Phòng Ban</td>
                    <td>Tên Phòng Ban</td>
                    <td>Sửa</td>
                    <td>Xóa</td>
                </tr>
                </thead>
                <c:forEach var="rows" items="${listDepart}">
                    <form action="depart/delete.htm">
                        <tr>
                            <td>${rows.id}</td>
                            <td>${rows.name}</td>
                            <c:url var="del" value="depart/edit.htm">
                                <c:param name="txtMaPB" value="${rows.id}"/>
                                <c:param name="txtTenPB" value="${rows.name}"/>
                            </c:url>
                            <td><a href="${del}">Sửa</a></td>
                            <td>
                                <input type="hidden" name="txtMaPB" value="${rows.id}"/>
                                <input type="submit" name="action" value="Xóa" />
                            </td>
                        </tr>
                    </form>
                </c:forEach>
            </table>
    
           
            </center>
    </body>
</html>
