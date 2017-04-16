<%-- 
    Document   : record
    Created on : Feb 27, 2017, 3:37:21 PM
    Author     : tris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
       
      
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/table.css">
    </head>
    <body>
        
    <center>
        <h1>Đánh Giá</h1>
        <form:form action="record.htm" modelAttribute="record"> 
            
            <div>Mã Nhân Viên</div>
            <form:input path="StaffId"/>
            <div>Xét</div>
            <form:select path="Type">
                <form:option value="Khen Thuong">Khen Thưởng</form:option>
                <form:option value="Ky Luat">Kỷ Luật</form:option>
            </form:select>
           
                <div>Lý do</div>
                <form:input path="Reason" />
                <div>Ngày</div> 
                <form:input path="Date"/>
                
            <div>
                <button name="btnInsert">Thêm</button>
                
            </div>    
                
        </form:form>
                <table>
                    <thead>
                        <tr>
                            <td>Mã Id</td>
                            <td>Xét</td>
                           
                            
                            <td>Lý do</td>
                            <td>Ngày </td>
                            <td>Mã Nhân Viên</td>
                            
                           
                        </tr>
                    </thead>
                    <c:forEach var="rows" items="${listRecord}">
                    <form action="record/delete.htm">
                        <tr>
                            <td>${rows.id}</td>
                            <td>${rows.type}</td>
                            <td>${rows.reason}</td>
                            <td>${rows.date}</td>
                            <td>${rows.staffId}</td>
                            
                            <c:url var="del" value="record/edit.htm">
                                <c:param name="txtMaId" value="${rows.id}"/>
                                
                                <c:param name="txtType" value="${rows.type}"/>
                                <c:param name="txtReason" value="${rows.reason}"/>
                                <c:param name="txtDate" value="${rows.date}"/>
                                <c:param name="txtStaffId" value="${rows.staffId}"/>
                                
                            </c:url>
                            
                            
                        </tr>
                    </form>
                </c:forEach>
                </table>
    </center>
        
    </body>
</html>
