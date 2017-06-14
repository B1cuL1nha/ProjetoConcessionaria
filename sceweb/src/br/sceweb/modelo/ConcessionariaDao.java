package br.sceweb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.sceweb.servico.FabricaDeConexoes;

public class ConcessionariaDao {

	public int adiciona(Concessionaria concessionaria) {
		PreparedStatement ps;
		int codigoRetorno = 0;

		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = (PreparedStatement) conn.prepareStatement(
					"insert into concessionaria (placa, marca, modelo, ano, cor, cambio, portas, combustivel, descricao) values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, concessionaria.getPlaca());
			ps.setString(2, concessionaria.getMarca());
			ps.setString(3, concessionaria.getModelo());
			ps.setString(4, concessionaria.getAno());
			ps.setString(5, concessionaria.getCor());
			ps.setString(6, concessionaria.getCambio());
			ps.setString(7, concessionaria.getPortas());
			ps.setString(8, concessionaria.getCombustivel());
			ps.setString(9, concessionaria.getDescricao());

			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return codigoRetorno;
	}

	public int exclui(String placa) {
		PreparedStatement ps;
		int codigoretorno = 0;

		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement("delete from concessionaria where placa = ?");
			ps.setString(1, placa);

			codigoretorno = ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return codigoretorno;
	}

	public Concessionaria consultaConcessionaria(String placa){
		PreparedStatement ps;
		Concessionaria concessionaria = new Concessionaria();
		
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement("select * from concessionaria where placa = ?");
			ps.setString(1, placa);
			ResultSet rs = ps.executeQuery();
			rs.first();
			concessionaria.setPlaca(rs.getString(1));
			concessionaria.setMarca(rs.getString(2));
			concessionaria.setModelo(rs.getString(3));
			concessionaria.setAno(rs.getString(4));
			concessionaria.setCor(rs.getString(5));
			concessionaria.setCambio(rs.getString(6));
			concessionaria.setPortas(rs.getString(7));
			concessionaria.setCombustivel(rs.getString(8));
			concessionaria.setDescricao(rs.getString(9));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return concessionaria;
	}
	
}
