<%-- 
    Document   : lcmsuccess
    Created on : Jul 12, 2017, 9:59:31 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
      <h1> <font style="" color="white"> THE RESULT OF LCM  </h1></font>
      <h3>The (<s:property value="lcmvalue"/>)(<s:property value="lcm1value"/>)LCM value is:<b> <s:property value="res"/></b>
       </h3>
      
           <a href="lcm.jsp"><br><br><button><b>Try Again</b> </button></a>  
           
        <a href="algebra.html"><button><b> Main Menu </b> </button></a>
      </center>
    </body>
</html>
