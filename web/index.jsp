<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
<h2> ứng dụng tính tiền lãi gửi ngân hàng</h2>
<form method="post" action="/interes">
  <label>Money: </label><br/>
  <input type="text" name="money" placeholder="My money"/><br/><br/>
  <label>Month: </label><br/>
  <input type="text" name="month" placeholder="Month" /><br/><br/>
  <label>Interest Rate: </label><br/>
  <input type="text" name="interest" placeholder="Interest Rate" /><br/><br/>
  <input type = "submit" id = "submit" value = "Interest Rate"/>
</form>
</body>
</html>
