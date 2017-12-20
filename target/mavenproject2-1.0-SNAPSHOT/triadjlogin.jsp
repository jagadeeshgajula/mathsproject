<%-- 
    Document   : triadjlogin
    Created on : Jul 12, 2017, 11:55:32 AM
    Author     : Dell
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
        <s:form action="adjvalue">
        <h1><font style="" color="black">FIND ADJACENT VALUE </h1></font>
        <s:textfield class="form-control" label="Enter Hypotenuse Value:" name="hypadj"   required="required"></s:textfield>
        <s:textfield class="form-control" label="Enter Opposite Value:" name="opadj" required="required"></s:textfield>
        <tr>
        <td colspan="2"><br>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <button><a href="functions.html">&nbsp;Back&nbsp;&nbsp;</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

       <font style="" color="#0d6786"><s:submit value="Submit" theme="simple"/></font>
        </td>
      </tr></center>
     </s:form></table>
    </center>
    </body>
     </html>