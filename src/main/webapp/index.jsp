<%--
  Created by IntelliJ IDEA.
  User: dinh
  Date: 15/04/2019
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/Result">
    Calculator
    <br/>
    First Operand
    <br/>
    <input type="number" name="firstoperand">
    <br/>
    Operator
    <br/>
    <select name="operator">
      <option value="+" >+</option>
      <option value="-" >-</option>
      <option value="*" >*</option>
      <option value="/">/</option>
    </select>

    <br/>
    Second Operand
    <br/>
    <input type="number" name="secondoperand">
    <br/>
    <input type="submit" value=" Calculate">
  </form>
  </body>
</html>
