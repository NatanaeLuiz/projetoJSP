package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarProdutoController
 */
@WebServlet("/CadastrarProdutoController")
public class CadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarProdutoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("ENTROU NA REQUISIÇÃO!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");


		String nome = request.getParameter("nome");
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		Double preco = Double.parseDouble(request.getParameter("preco"));
		Boolean ativo = false;
		if (request.getParameter("ativo") != null && request.getParameter("ativo").equals("on"))
			ativo = true;
		
		System.out.println(nome);
		System.out.println(quantidade);
		System.out.println(preco);
		System.out.println(ativo);
		
	}

}
