package com.example.baitapungdungcalculatorjspjstl;

import java.io.*;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            double result = Calculator.calculator(number1, number2, operator);
            writer.println(number1 +" "+ operator +" "+ number2 +" = "+ result);
        } catch (Exception e){
            writer.println("Error: " + e.getMessage());
        }
        writer.println("</html>");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.jsp");
        requestDispatcher.forward(request,response);
    }
}