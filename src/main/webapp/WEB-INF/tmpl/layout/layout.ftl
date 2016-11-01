<#include "/lib/common.ftl">

<#macro Layout style script titleSuffix="" keywords="后台，运维，管理" description="搭建基础后台平台">
<#escape x as x?html>
<#compress>
<!DOCTYPE html>
<html lang="en">
<@Head titleSuffix=titleSuffix keywords=keywords description=description>
    <#if style??>
        <@style></@style>
    </#if>
</@Head>
<body>
    <#nested>

    <#-- 公用js -->
    <@corejs />
    <#if script??>
        <@script></@script>
    </#if>
</body>
</html>
</#compress>
</#escape>
</#macro>