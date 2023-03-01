package br.com.ada.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.com.ada.models.Carro;

import java.io.IOException;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Carro carro = new Carro(req.getParameter("modelo"),req.getParameter("marca"),req.getParameter("placa"), req.getParameter("tipo"));

        if (carro.getModelo().equals("") || carro.getMarca().equals("") || carro.getPlaca().equals("") || carro.getTipo().equals("")) {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3>Dados obrigatórios não preenchidos!</h3>");
        } else {
            req.setAttribute("modelo", carro.getModelo());
            req.setAttribute("marca", carro.getMarca());
            req.setAttribute("placa", carro.getPlaca());
            req.setAttribute("tipo", carro.getTipo());

            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");

            rd.forward(req, resp);
        }

    }
}