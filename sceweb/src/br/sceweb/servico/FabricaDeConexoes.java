package br.sceweb.servico;

import java.sql.DriverManager;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class FabricaDeConexoes { // $codepro.audit.disable
	private static final Logger logger = Logger.getLogger(FabricaDeConexoes.class); // $codepro.audit.disable

	public Connection getConnection() { // $codepro.audit.disable
		String url = "jdbc:mysql://localhost/sceweb";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			/* Alterar usuario e senha conforme necessidade. */
			return (Connection) DriverManager.getConnection(url, "root", "1234");
		} catch (CommunicationsException e) {
			logger.info("Execucao de comunicacao com o DB causa: " + e.getMessage());
			throw new RuntimeException(e);
		} catch (Exception e) {
			logger.info("Execucao geral causa: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}
}
