<#include "/lib/const.ftl">

<#-- head -->
<#macro Head titleSuffix="" keywords="" description="">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>${titleSuffix}</title>
    <meta name="keywords" content="${keywords?html}">
    <meta name="description" content="${description?html}">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <#nested>
</head>
</#macro>

<#macro corecss>
<link rel="stylesheet" href="/style/css/index.css">
</#macro>

<#macro corejs>

</#macro>