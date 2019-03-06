<#assign base=request.contextPath />
<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <base id="base" href="${base}">
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <link href="${base}/static/bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="${base}/static/bootstrap/css/User/user.css" rel="stylesheet"/>
    <script src="${base}/static/bootstrap/js/jquery-3.2.1.min.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap.js"></script>
    <title>freemark</title>
</head>
<body>

<div class="container">
    <h1 class="text-center">observer</h1>
    <form>
        <div>
            <input class="btn-lg center-block" placeholder="用户名" type="text"/></br>
            <input  class="btn-lg center-block" placeholder="密码" type="password"/></br>
        </div>
        <div >
            <button class="btn btn-primary btn-lg btn-block" type="submit">登录</button></br>
            <button class="btn btn-default btn-lg btn-block" type="submit">注册</button></br>
            <button class="btn btn-default btn-lg btn-block" type="submit">忘记密码</button>
        </div>
    </form>
</div>
</body>
</html>