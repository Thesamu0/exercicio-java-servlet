package br.com.ada.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp ) throws IOException{
        resp.setContentType("text/html");

        req.getSession().setAttribute("nome","Matheus");

        PrintWriter out = resp.getWriter();
        out.println("<h1> Hey </h1>");
    }
}
