package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Post method called.");
        System.out.println("Request: " + req);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //Parameters
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        String termsAndConditions = req.getParameter("termsAndConditions");
        if (termsAndConditions != null) {
            if (termsAndConditions.equals("checked")) {
                out.println("<h3>Details: </h3>");
                out.println("<p>Name :" + name + "</p>");
                out.println("<p>Password: " + password + "</p>");
                out.println("<p>Gender: " + gender + "</p>");
                out.println("<p>Email: " + email + "</p>");
                out.println("<p>Course: " + course + "</p>");
            } else {
                out.println("Please accept the terms and conditions first!");
            }
        }
        out.println("Please accept the terms and conditions first!");
    }
}
