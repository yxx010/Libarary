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
    <script type="application/javascript">
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
    <form action="/AddBookServlet" method="post">
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
    <script>
        $("input[type=submit]").on("click",function(){
            var id=$("input[name=id]").val();
            var bookName=$("input[name=bookName]").val();
            var categoryName=$("select[name=categoryName]").val();
            var price=$("input[name=price]").val();
            var description=$("input[name=description]").val();
            var priceCheck=/((^[1-9]\d*)|^0)(\.\d{0,2}){0,1}$/;
            if(id==null||id==""){
                alert("图书ID不能为空");
                return false;
            }
            if(bookName==null||bookName==""){
                alert("图书名不能为空");
                return false;
            }
            if(categoryName==null||categoryName==""){
                alert("图书分类不能为空");
                return false;
            }
            if(price==null||price==""){
                alert("图书价格不能为空");
                return false;
            }else if(priceCheck.test(price)==false){
                alert("图书价格不正确");
                return false;
            }
            if(description==null||description==""){
                alert("描述不能为空");
                return false;
            }
        })
    </script>

</center>
</body>
</html>
