<#import "/includes/spring.ftl" as spring/>
<html>
<head>
	<title>Home</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>

<script>
$(document).ready(function(){
	
	$("#btn_submit").click(function(){
		$("form").submit();
	});
});
</script>
</head>
<body>
<form action="${basePath}/doTestForm" method="post" commandName="user">
	<table>
		<#import "/spring.ftl" as spring />
<@spring.bind "user" />
<#if spring.status.error>
    <div class="errors">
        There were problems with the data you entered:
        <ul>
            <#list spring.status.errorMessages as error>
                <li>${error?html}</li>
            </#list>
        </ul>
    </div>
</#if>
		<tr><@spring.bind "user"/>
			<td><@spring.message "username"/>:</td>
			<td><input id="username" name="username" type="text" value=""/></td>
			<td><@spring.showErrors "username" />
			<#if spring.status.error>woqu</#if></td>
		</tr>
		<tr>
			<td><@spring.message "password"/>:</td>
			<td><input id="password" name="password" type="password" value=""/></td>
			<td><@spring.showErrors "<br>" /></td>
		<tr>
		</tr>
			<td><a id="btn_submit"href="javascript:void(0);" onclick="return false" class="br8"><@spring.message "login"/></a></td>
		</tr>
	</table>
</form>
</body>
</html>
