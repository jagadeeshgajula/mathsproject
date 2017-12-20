<%-- 
    Document   : degtorad
    Created on : Jul 11, 2017, 12:11:26 PM
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
                background: #E8CBC0;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #636FA4, #E8CBC0);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #636FA4, #E8CBC0); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                margin-top: 25%;
                
            }
            
        </style>
    <sb:head/>
    <body>
        <div class="body">
        <div class="container">
        <div class="form-group">
        <center>
        <table>
        <s:form action="radvalue" >
        <h1><font style="" color="black"> DEGREE TO RADIAN CONVERSION </h1></font>
        <s:textfield class="form-control" label="Enter Degree Value" name="Degree" required="required"></s:textfield>
        <tr>
        <td colspan="2"><br>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <button><a href="conversions.html">&nbsp;Back&nbsp;&nbsp;</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

       <font style="" color="#0d6786"><s:submit value="Submit" theme="simple"/></font>
        </td>
      </tr></center>
     </s:form></table>
    </center>
    </body>
     </html>
