<#import "/includes/spring.ftl" as spring/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh-CN" lang="zh-CN">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="content-language" content="zh-cn" />
<meta http-equiv="imagetoolbar" content="false" />
<meta name="MSSmartTagsPreventParsing" content="true" />
<meta name="viewport" content="width=1024; maximum-scale=1.2;" />
<title><@title/></title>
<link rel="stylesheet" href="${basePath}/<@spring.theme "cssreset"/>" type="text/css" media="screen, projection"/></head>
<body>
	<div id="header">
	<#if header?exists>  
	     <@header/>  
	</#if>
	</div>
	<div id="main">
	<#if main?exists>  
	     <@main/>  
	</#if>
	</div>
	<div id="footer">
	<#if footer?exists>  
	     <@footer/>  
	</#if>
	</div>
</body>
</html>

