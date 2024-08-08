<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Premises Management</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<style>
    .table {
        font-size: 13px;
    }

    a:hover {
        text-decoration: none;
        color: #fff;
    }

    .img-style {
        border-radius: 10px;
        width: 80px;
    }

    .middle {
        /* Any additional styling can go here */
    }
</style>
<body>

<div class="container mt-4">
    <h1>Premises Management</h1>
    <a class="btn btn-primary" href="<%=request.getContextPath()%>/addOffice">ADD OFFICE</a>
    <form action="<%=request.getContextPath()%>/SearchFloor" method="post">
        <input type="number" placeholder="so phong" name="tang"><br>
        <label for="loaiVanPhong">Loại Văn Phòng</label>
        <select class="form-control" id="loaiVanPhong" name="loaiVanPhong" required>
            <option value="Tron goi">Trọn gói</option>
            <option value="Chia se">Chia sẻ</option>
        </select><br>
        <label for="loaiVanPhong">Chon Theo ngay</label>
        <label for="ngayBatDau">Ngày Bắt Đầu</label>
        <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau" required>
        <label for="ngayKetThuc">Ngày Kết Thúc</label>
        <input type="date" class="form-control" id="ngayKetThuc" name="ngayKetThuc" required>
        <input type="submit" value="tim kiem">
    </form>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>#</th>
            <th>Premises Code</th>
            <th>Status</th>
            <th>Area (m²)</th>
            <th>Floor</th>
            <th>Type</th>
            <th>Price</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:set var="count" value="0" scope="page"/>
        <c:forEach var="office" items="${listOffice}">
            <c:set var="count" value="${count + 1}" scope="page"/>
            <tr class="middle">
                <td><c:out value="${count}"/></td>
                <td><c:out value="${office.ma}"/></td>
                <td><c:out value="${office.dienTich}"/></td>
                <td><c:out value="${office.trangThai}"/></td>
                <td><c:out value="${office.tang}"/></td>
                <td><c:out value="${office.loaiVanPhong}"/></td>
                <td><c:out value="${office.giaChoThue}"/></td>
                <td><c:out value="${office.ngayBatDau}"/></td>
                <td><c:out value="${office.ngayKetThuc}"/></td>

                <td>
                    <a href="${pageContext.request.contextPath}/delete-premises-form?id=${office.ma}"
                       class="btn btn-danger btn-sm">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>