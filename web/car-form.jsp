<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Car Shop Management</title>
</head>
<body>
    <center>
        <h1>Car Shop Inventory</h1>
        <h2>
            <a href="new">Add New Car</a>
            &nbsp;&nbsp;&nbsp;
            <a href="list">List All Cars</a>
        </h2>
    </center>

    <div align="center">
        <c:if test="${car != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${car == null}">
            <form action="insert" method="post">
        </c:if>

        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${car != null}">Edit Car Details</c:if>
                    <c:if test="${car == null}">Add New Car</c:if>
                </h2>
            </caption>
            
            <c:if test="${car != null}">
                <input type="hidden" name="carId" value="<c:out value='${car.carId}' />" />
            </c:if>
            
            <tr>
                <th>Brand: </th>
                <td>
                    <input type="text" name="brand" size="45"
                           value="<c:out value='${car.brand}' />" required />
                </td>
            </tr>
            <tr>
                <th>Model: </th>
                <td>
                    <input type="text" name="model" size="45"
                           value="<c:out value='${car.model}' />" required />
                </td>
            </tr>
            <tr>
                <th>Cylinders: </th>
                <td>
                    <input type="number" name="cylinder" size="45"
                           value="<c:out value='${car.cylinder}' />" required />
                </td>
            </tr>
            <tr>
                <th>Price: </th>
                <td>
                    <input type="number" step="0.01" name="price" size="45"
                           value="<c:out value='${car.price}' />" required />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>