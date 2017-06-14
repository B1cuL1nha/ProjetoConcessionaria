package br.sceweb.modelo;

import java.util.InputMismatchException;

public class Concessionaria { // $codepro.audit.disable
	private String placa; // $codepro.audit.disable
	private String marca; // $codepro.audit.disable
	private String modelo; // $codepro.audit.disable
	private String ano; // $codepro.audit.disable
	private String cor; // $codepro.audit.disable
	private String cambio; // $codepro.audit.disable
	private String portas; // $codepro.audit.disable
	private String combustivel; // $codepro.audit.disable
	private String descricao; // $codepro.audit.disable
	  
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean isValido(String placa) { // $codepro.audit.disable
		char dig13, dig14;  // $codepro.audit.disable
		int sm, i, r, num, peso; // $codepro.audit.disable
		if (placa.equals("00000000000000") || 
				placa.equals("11111111111111") || 
				placa.equals("22222222222222") || 
				placa.equals("33333333333333") || 
				placa.equals("44444444444444") || 
				placa.equals("55555555555555") ||
				placa.equals("66666666666666") || 
				placa.equals("77777777777777") || 
				placa.equals("88888888888888") || 
				placa.equals("99999999999999") || 
				(placa.length() != 14)) {
			return(false); 
		}
		// "try" - protege o código para eventuais erros de conversao de tipo (int) 
		try { // Calculo do 1o. Digito Verificador 
			sm = 0; 
			peso = 2; 
			for (i=11; i>=0; i--) { 
				// converte o i-ésimo caractere do CNPJ em um número: 
				// por exemplo, transforma o caractere '0' no inteiro 0 
				// (48 eh a posição de '0' na tabela ASCII) 
				num = (int)(placa.charAt(i) - 48); 
				sm = sm + (num * peso); 
				peso = peso + 1; if (peso == 10) 
					peso = 2; 
			} 
			r = sm % 11; 
			if ((r == 0) || (r == 1)) 
				dig13 = '0'; 
			else 
				dig13 = (char)((11-r) + 48);
		
		// Calculo do 2o. Digito Verificador 
		sm = 0; peso = 2; 
		for (i=12; i>=0; i--) { 
			num = (int)(placa.charAt(i)- 48); 
			sm = sm + (num * peso); peso = peso + 1; 
			if (peso == 10) peso = 2; 
			} 
		r = sm % 11; 
		if ((r == 0) || (r == 1)) dig14 = '0';
		else dig14 = (	char)((11-r) + 48); 
		// Verifica se os dígitos calculados conferem com os dígitos informados. 
		if ((dig13 == placa.charAt(12)) && (dig14 == placa.charAt(13))) 
			return(true); else return(false);
		}
		
		catch (InputMismatchException erro) {
			erro.printStackTrace();
	        return(false);
	    }
	}	
}
