<%-- 
    Document   : staff
    Created on : Feb 8, 2017, 12:28:21 AM
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
        
        <div class="container">
            
            <center>  
                <br>
                <br>
        <h1>Quản lý nhân viên</h1>
        <form:form action="staff.htm" modelAttribute="staff">
            <div>Mã nhân viên</div>
            <form:input path="Id" />
            <div>Hình ảnh</div>
            <form:input path="Photo"/>
            <div>Họ và tên</div>
            <form:input path="Name"/>
            <div>Giới tính</div>
            <form:select path="Gender">
                <form:option value="Nam">Nam</form:option>
                <form:option value="Nu">Nữ</form:option>
            </form:select>
            <div>Ngày sinh</div>
            <form:input path="Birthday"/>
            
            <div>Email</div>
            <form:input path="Email"/>
            <div>Số điện thoại</div>
            <form:input path="Phone"/>
            <div>Lương</div>
            <form:input path="Salary"/>
            <div>Ghi chú</div>
            <form:input path="Notes"/>
            <div>Phòng ban</div>
            <form:input path="DepartId"/>
            <div>
                <button name="btnInsert">Thêm</button>
                <button name="btnUpdate">Cập nhật</button>
            </div>
        </form:form>
            </center>
            <br>
            <table>
                <thead>
                <tr>
                    <td>Mã Nhân Viên</td>
                    
                    <td>Tên</td>
                    <td>Giới Tính</td>
                    <td>Ngày Sinh</td>
                    <td>Hình Ảnh</td>
                    <td>Email</td>
                    <td>SĐT</td>
                    <td>Lương</td>
                    <td>Ghi Chú</td>
                    <td>Phòng Ban</td>
                    <td>Sửa</td>
                    <td>Xóa</td>
                </tr>
                </thead>
                <c:forEach var="rows" items="${listStaff}">
                    <form action="staff/delete.htm">
                        <tr>
                            <td>${rows.id}</td>
                            <td>${rows.name}</td>
                            <td>${rows.gender}</td>
                            <td>${rows.birthday}</td>
                            <td>${rows.photo}</td>
                            <td>${rows.email}</td>
                            <td>${rows.phone}</td>
                            <td>${rows.salary}</td>
                            <td>${rows.notes}</td>
                            <td>${rows.departId}</td>
                            <c:url var="del" value="staff/edit.htm">
                                <c:param name="txtMaNV" value="${rows.id}"/>
                                
                                <c:param name="txtName" value="${rows.name}"/>
                                <c:param name="txtGender" value="${rows.gender}"/>
                                <c:param name="txtBirthday" value="${rows.birthday}"/>
                                <c:param name="txtPhoto" value="${rows.photo}"/>
                                <c:param name="txtEmail" value="${rows.email}"/>
                                <c:param name="txtPhone" value="${rows.phone}"/>
                                <c:param name="txtSalary" value="${rows.salary}"/>
                                <c:param name="txtNotes" value="${rows.notes}"/>
                                <c:param name="txtDepartId" value="${rows.departId}"/>
                            </c:url>
                            <td><a href="${del}">Sửa</a></td>
                            <td>
                                <input type="hidden" name="txtMaNV" value="${rows.id}"/>
                                <input type="submit" name="action" value="Xóa"
                            </td>
                        </tr>
                    </form>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
