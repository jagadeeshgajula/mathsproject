<%-- 
    Document   : successdegtorad
    Created on : Jul 11, 2017, 12:49:34 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
        <title>JSP Page</title>
        <style>
            body{
                background: #5D4157;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #A8CABA, #5D4157);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #A8CABA, #5D4157); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                margin-top: 25%;
                
            }
        </style>    
    </head>
      <body class="body">
      <center>
<h1> <font style="" color="white"> THE RESULT OF RADIAN </h1></font>
    <h1>The Radian Value Is:<s:property value="result"></s:property></h1>
     <br>
         <a href="degtorad.jsp"><br><button><b>Try Again</b> </button></a>  
             
     <a href="conversions.html"><button><b> Main Menu </b> </button></a>
    
         </center>
</body>
</html>
