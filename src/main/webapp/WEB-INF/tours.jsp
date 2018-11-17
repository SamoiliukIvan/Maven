<%-- 
    Document   : tours
    Created on : 16.11.2018, 19:59:17
    Author     : ISamoiliuk
--%>
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix = "sec"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<t:template>
        <table>
            <thead>
                <tr>
                <tr>Id</tr> 
                <tr>Name</tr>
                <tr>Short description Ru</tr>
                <tr>Date of Start</tr>
                <tr>Hotel</tr>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${tours}" var="tour">
                    <tr>
                        <td>${tour.id}</td>
                        <td>${tour.name}</td>
                        <td>${tour.shortDescriptionRu}</td>
                        <td>${tour.dateOfStart}</td>
                        <td>${tour.hotel.id}</td>
                        <td>${tour.hotel.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</t:template>
