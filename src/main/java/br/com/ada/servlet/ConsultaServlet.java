package br.com.ada.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/consultaservlet")
public class ConsultaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Object nome = req.getSession().getAttribute("nome");
        PrintWriter out = resp.getWriter();

        if(Objects.nonNull(nome)){
            String nometexto = String.valueOf(nome);
            out.println("<h1>" + nometexto + "</h1>");
        }
        else{
            out.println("<h1>nd</h1>");
        }
    }
}
