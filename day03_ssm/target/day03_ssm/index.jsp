<%--
  Created by IntelliJ IDEA.
  User: 喵喵喵
  Date: 2019/2/16
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="/account/findAll">查询所有</a><br/>
        <form action="/account/saveAccount" method="post">
            账户姓名:<input type="text" name="name"><br>
            金额:<input type="text" name="money"><br>
            <input type="submit" value="提交">
        </form>
</body>
</html>
