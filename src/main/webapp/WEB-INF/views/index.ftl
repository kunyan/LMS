<#include "/layout/base.ftl"/>
<#macro title>  
	今天天气不错
</#macro>

<#macro main>
	${student["username"]?if_exists}
</#macro>
	${student["email"]?if_exists}
	${student["sysId"]?if_exists}