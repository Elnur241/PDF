<%--
  Created by IntelliJ IDEA.
  User: guest11
  Date: 17.01.2022
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form action="/addEmploy" >
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="id" class="form-control" name="id" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="name" class="form-control" name="name" aria-describedby="emailHelp">
        <div class="form-text">We'll never share your email with anyone else.</div>
    </div>

    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="name" class="form-control" name="sur_name" aria-describedby="emailHelp">
    <div class="form-text">We'll never share your email with anyone else.</div>
</div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
