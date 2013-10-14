<%@page language="java"contentType="text/html;charset=utf-8"%>  
<html>  
    <head>  
        <title>Login.jsp</title>  
    </head>  
    <body style="text-align: center">  
        <form action="UServlet"method="post">  
            <table>  
                <tr>  
                    <h5>提示：</h5>  
                </tr>  
                <tr>  
                    <h5>如果有已注册请直接登录</h5>  
                </tr>  
                <tr>  
                    <h5>如果没有注册请直接注册</h5>  
                </tr>  
                <tr>  
                    <td>用户名</td>  
                        <td><input type="text"name="username"/></td>  
  
                </tr>  
                <tr>  
                    <td>密&nbsp;&nbsp;码:</td>  
                    <td><input type="password"name="password"></td>  
                </tr>  
                <tr>  
                    <td>&nbsp;</td>  
                    <td>  
                        <input type="submit"name="login"value="登陆"/>
                    </td>  
                </tr>  
            </table>  
  
        </form>  
          
    </body>  
</html>  