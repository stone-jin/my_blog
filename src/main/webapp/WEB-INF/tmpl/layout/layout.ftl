<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="//cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
<script>
    var data = {"content": "234"};
    $.ajax({
        type: 'POST',
        url: "/my_blog/xhr/article",
        data: JSON.stringify(data),
        contentType: "application/json",
        dataType : 'json',
        success: function(result){
            console.log(result);
        }
    });
</script>
</body>
</html>