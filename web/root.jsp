
<%-- 
    Document   : root
    Created on : Jul 11, 2017, 12:07:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="/struts-tags" %>
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
            <x:form action="root">
            <h1><font style="" color="black">FIND THE SQUARE ROOT </h1>
            <x:textfield class="form-control" label="Enter √x value:" name="rootvalue" required="required"/>
           <tr>
        <td colspan="2"><br>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <button><a href="roots.html">&nbsp;Back&nbsp;&nbsp;</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

       <font style="" color="#0d6786"><x:submit value="Submit" theme="simple"/></font>
        </td>
      </tr></center>
     </x:form></table>
    </center>
    </body>
     </html>