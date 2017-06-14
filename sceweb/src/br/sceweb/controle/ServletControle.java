package br.sceweb.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.sceweb.modelo.Concessionaria;
import br.sceweb.modelo.ConcessionariaDao;

public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger(ServletControle.class);
	String mensagem = "";
	ConcessionariaDao ConcessionariaDAO;
	String placaParaExclusao = "";

	public ServletControle() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("erro", null);
		executaComando(request, response);
	}

	/**
	 * Metodo para executar.
	 */
	protected void executaComando(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametro = request.getParameter("acao");
		logger.info("acao do servletcontrole = " + parametro);
		String url = "";
		String resultado = "";
		request.setAttribute("erro", null);
		if (parametro.equals("IncluirConcessionaria")) {
			url = "/visao/FormConcessionaria.jsp";
			try {
				resultado = cadastrarConcessionaria(request.getParameter("txtPlaca"), request.getParameter("txtMarca"),
						request.getParameter("txtModelo"), request.getParameter("txtAno"),
						request.getParameter("txtCor"), request.getParameter("txtCambio"),
						request.getParameter("txtPortas"), request.getParameter("txtCombustivel"),
						request.getParameter("txtDescricao"));
				logger.info("resultado do cadastra = " + resultado);
				request.setAttribute("msg", resultado);
				request.getRequestDispatcher(url).forward(request, response);
			} catch (Exception e) {
				request.setAttribute("msg", resultado);
				request.getRequestDispatcher(url).forward(request, response);
				logger.info("erro  = " + e.getMessage());

			}
		}
		if (parametro.equals("ConsultarConcessionaria")) {
			url = "/visao/FormConcessionaria.jsp";
			Concessionaria concessionaria = new Concessionaria();
			String placa = request.getParameter("txtPlaca");
			logger.info("consulta concessionaria  = " + placa);
			try {
				if (!placa.isEmpty()) {
					concessionaria = consulta(placa);
					if (concessionaria != null) {
						logger.info("consulta concessionaria marca do carro  = " + concessionaria.getMarca());
						request.setAttribute("modelo", concessionaria.getModelo());
						request.setAttribute("ano", concessionaria.getAno());
						request.setAttribute("cor", concessionaria.getCor());
						request.setAttribute("placa", concessionaria.getPlaca());
						request.setAttribute("cambio", concessionaria.getCambio());
						request.setAttribute("portas", concessionaria.getPortas());
						request.setAttribute("combustivel", concessionaria.getCombustivel());
						request.setAttribute("descricao", concessionaria.getDescricao());
						request.setAttribute("msg", "");
						url = "/visao/FormConcessionariaResultadoDaConsulta.jsp";
					} else {
						request.setAttribute("msg", "placa invalido");
					}
				} else {
					request.setAttribute("msg", "placa invalido");
				}
			} catch (Exception e) {
				logger.info(e.getMessage() + e.getCause());
			}
			request.getRequestDispatcher(url).forward(request, response);

		}

	}

	/**
	 * Metodo cadastrar.
	 */
	public String cadastrarConcessionaria(String placa, String marca, String modelo, String ano,
			String cor, String cambio, String portas, String combustivel, String descricao) {
		String msg = "";
		Concessionaria concessionaria = new Concessionaria();
		ConcessionariaDao concessionariaDAO = new ConcessionariaDao();
		try {
			concessionaria.setPlaca(placa);
			concessionaria.setMarca(marca);
			concessionaria.setModelo(modelo);
			concessionaria.setAno(ano);
			concessionaria.setCor(cor);
			concessionaria.setCambio(cambio);
			concessionaria.setPortas(portas);
			concessionaria.setCombustivel(combustivel);
			concessionaria.setDescricao(descricao);
			concessionariaDAO.adiciona(concessionaria);
			msg = "cadastro realizado com sucesso";

		} catch (Exception e) {
			msg = e.getMessage();
		}

		return msg;
	}

	/**
	 * Consultar.
	 */
	public Concessionaria consulta(String placa) {
		logger.info("consulta concessionaria 2 = " + placa);
		ConcessionariaDao concessionariaDAO = new ConcessionariaDao();
		return concessionariaDAO.consultaConcessionaria(placa);
	}

	/**
	 * Inclusão
	 */
	public int excluirEmpresa(String placa) {
		int numAfetadas = 0;
		ConcessionariaDao concessionariaDAO = new ConcessionariaDao();
		try {
			numAfetadas = concessionariaDAO.exclui(placa);
		} catch (Exception e) {
			throw new RuntimeException("Placa inválido");
		}

		return numAfetadas;
	}
}