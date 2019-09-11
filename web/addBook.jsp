<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-10
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>图书添加</title>
    <script type="application/javascript" src="js/jquery-3.4.1.js"></script>
    <script>
        $(function () {
            $.ajax({
                "url":"/SelectCategoryServlet",
                "type":"post",
                "dataType":"json",
                "success":function(json){
                    console.log(json);
                    for (var i=0;i<json.length;i++){
                        var categoryName=json[i].categoryName;
                        $("#categoryName").append("<option value='"
                            +categoryName+"'>"+
                            categoryName+"</option>");
                    }
                }
            })
        })
    </script>
</head>
<body>
<center>
    <h1>图书添加</h1>
    <form action="/ToAddBookServlet" method="post">
        <table width="400px" cellspacing="0px" cellpadding="0px" border="1px">
            <tr>
                <td>图书ID</td>
                <td><input type="text" name="id"  placeholder="请输入数字" pattern="\d+" required="required"></td>
            </tr>
            <tr>
                <td>图书名</td>
                <td><input type="text" name="bookName"></td>
            </tr>
            <tr>
                <td>图书分类</td>
                <td>
                    <select name="categoryName" id="categoryName">
                        <!--script>
                            var oButton=document.getElementById("categoryName");
                                oButton.onclick=function () {
                                    //1.创建
                                    var xmlhttp;
                                    if(window.XMLHttpRequest){
                                        xmlhttp=new XMLHttpRequest();
                                    }else{
                                        xmlhttp=new ActiveXObject("Microsoft.XMlHTTP");
                                    }
                                    //2.发送ajax，true代表异步执行，false同步处理
                                    xmlhttp.open("post","/SelectCategoryServlet",true);
                                    xmlhttp.send();
                                    //3.处理服务的响应

                                    xmlhttp.onreadystatechange=function(){
                                        var html="";
                                        if(xmlhttp.readyState==4&&xmlhttp.status==200){
                                            var text=xmlhttp.responseText;
                                            var json=JSON.parse(text);
                                            for (var i=0;i<json.length;i++){
                                                var categoryName=json[i].categoryName;
                                                html=html+"<option value='"+categoryName+"'>"+categoryName+"</option>";
                                            }
                                            document.getElementById("categoryName").innerHTML=html;
                                        }
                                    }
                            }
                        </script-->
                    </select>
                </td>
            </tr>
            <tr>
                <td>价格</td>
                <td><input type="text" name="price" placeholder="请输入价格" ></td>
            </tr>
            <tr>
                <td>描述</td>
                <td><input type="text" name="description" placeholder="请输入描述信息"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center">
                    <input type="submit" value="添加">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
