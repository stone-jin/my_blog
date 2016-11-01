<#include "/layout/layout.ftl">

<#macro style>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
</#macro>

<#macro script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script>
    $("#addArticleLabel").click(function(){
        $.ajax({
            type: "POST",
            url: '/xhr/addLabel',
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify({"labelName": "test", "author": "stone-jin"}),
            success: function () {
                console.log("hello");
            }
        });
    });
</script>
</#macro>

<@Layout style=style script=script titleSuffix="后台管理平台">
    <div class="container">
        <div class="col-sm-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    添加文章标签
                </div>
                <div class="panel-body">
                    <input type="text" class="form-control" placeholder="请输入文章标签" id="Article">
                    <input type="text" class="form-control" placeholder="请输入作者名字">
                </div>
                <div class="panel-footer">
                    <button class="btn btn-default" id="addArticleLabel">添加文章标签</button>
                </div>
            </div>
        </div>
    </div>
</@Layout>
