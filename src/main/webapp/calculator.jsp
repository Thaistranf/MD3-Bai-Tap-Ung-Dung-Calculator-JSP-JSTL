<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 9/29/2023
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form method="post" action="/calculator">
        <fieldset>
            <legend>Calculator</legend>
            <table>
                <tr>
                    <td>First operand:</td>
                    <td>
                        <label>
                            <input name="number1" type="number">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>Operator:</td>
                    <td>
                        <label>
                            <select name="operator">
                                <option value="+">Addition</option>
                                <option value="-">Subtraction</option>
                                <option value="*">Multiplication</option>
                                <option value="/">Division</option>
                            </select>
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>Second operand:</td>
                    <td>
                        <label>
                            <input name="number2" type="text">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Calculate">
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
