package br.sceweb.pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormConcessionaria {
	
	
	
	
	/* campos */
	
	
	
	
		
	@FindBy(how = How.ID, using = "placa")
	private WebElement placa;
	
	@FindBy(how = How.ID, using = "marca")
	private WebElement marca;
	
	@FindBy(how = How.ID, using = "modelo")
	private WebElement modelo;
	
	@FindBy(how = How.ID, using = "ano")
	private WebElement ano;
	
	@FindBy(how = How.ID, using = "cor")
	private WebElement cor;
	
	@FindBy(how = How.ID, using = "cambio")
	private WebElement cambio;
	
	@FindBy(how = How.ID, using = "portas")
	private WebElement portas;
	
	@FindBy(how = How.ID, using = "combustivel")
	private WebElement combustivel;
	
	@FindBy(how = How.ID, using = "descricao")
	private WebElement descricao;
	
	/* Regiao: Botoes */
	
	@FindBy(how = How.ID, using = "incluir")
	private WebElement incluir;
	
	@FindBy(how = How.ID, using = "consultar")
	private WebElement consultar;
	
	@FindBy(how = How.ID, using = "excluir")
	private WebElement excluir;
	
	
	
	
	
	/* getters and setter */
	
	
	
	
	
	public WebElement getPlaca() {
		return placa;
	}

	public void setPlaca(WebElement placa) {
		this.placa = placa;
	}

	public WebElement getMarca() {
		return marca;
	}

	public void setMarca(WebElement marca) {
		this.marca = marca;
	}

	public WebElement getModelo() {
		return modelo;
	}

	public void setModelo(WebElement modelo) {
		this.modelo = modelo;
	}

	public WebElement getAno() {
		return ano;
	}

	public void setAno(WebElement ano) {
		this.ano = ano;
	}

	public WebElement getCor() {
		return cor;
	}

	public void setCor(WebElement cor) {
		this.cor = cor;
	}

	public WebElement getCambio() {
		return cambio;
	}

	public void setCambio(WebElement cambio) {
		this.cambio = cambio;
	}

	public WebElement getPortas() {
		return portas;
	}

	public void setPortas(WebElement portas) {
		this.portas = portas;
	}

	public WebElement getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(WebElement combustivel) {
		this.combustivel = combustivel;
	}

	public WebElement getDescricao() {
		return descricao;
	}

	public void setDescricao(WebElement descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	/* Botões */
	
	
	
	
	
	public void clickOnInluir(){ 
		incluir.click();
	}
	
	public WebElement getIncluir() {
		return incluir;
	}

	public void setIncluir(WebElement incluir) {
		this.incluir = incluir;
	}

	public WebElement getConsultar() {
		return consultar;
	}

	public void setConsultar(WebElement consultar) {
		this.consultar = consultar;
	}

	public WebElement getExcluir() {
		return excluir;
	}

	public void setExcluir(WebElement excluir) {
		this.excluir = excluir;
	}

	public void clickOnConsultar(){
		consultar.click();
	}
	
	public void clickOnExcluir(){ 
		excluir.click();
	}
}