<%-- 
    Document   : successtable
    Created on : Jul 12, 2017, 2:11:59 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
      <h1> <font style="" color="white"> The Values Are.... </h1></font>
       
        <b>Sin Value Is:<s:property value="sin"/><br>
        <b>Cos Value Is:<s:property value="cos"/><br>
        <b>Tan Value Is:<s:property value="tan"/><br>
        <b>Cosec Value Is:<s:property value="cosec"/><br>
        <b>Sec Value Is:<s:property value="sec"/><br>
        <b>Cot Value Is:<s:property value="cot"/>
   
            <left><a href="pythatablelogin.jsp"><br><br><br> <button><b>Try Again</b> </button></a> 
   
         <left><a href="trignometery.html"><button><b> Main Menu </b> </button></a>
      </center> 
   </body>
</html>
