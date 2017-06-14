package br.sceweb.pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormConcessionaria { // $codepro.audit.disable
	
	/* Regiao: Campos */
		
	@FindBy(how = How.ID, using = "placa") // $codepro.audit.disable
	private WebElement placa;
	
	@FindBy(how = How.ID, using = "marca") // $codepro.audit.disable
	private WebElement marca;
	
	@FindBy(how = How.ID, using = "modelo") // $codepro.audit.disable
	private WebElement modelo;
	
	@FindBy(how = How.ID, using = "ano") // $codepro.audit.disable
	private WebElement ano;
	
	@FindBy(how = How.ID, using = "cor") // $codepro.audit.disable
	private WebElement cor;
	
	@FindBy(how = How.ID, using = "cambio") // $codepro.audit.disable
	private WebElement cambio;
	
	@FindBy(how = How.ID, using = "portas") // $codepro.audit.disable
	private WebElement portas;
	
	@FindBy(how = How.ID, using = "combustivel") // $codepro.audit.disable
	private WebElement combustivel;
	
	@FindBy(how = How.ID, using = "descricao") // $codepro.audit.disable
	private WebElement descricao;
	
	/* Regiao: Botoes */
	
	@FindBy(how = How.ID, using = "incluir") // $codepro.audit.disable
	private WebElement incluir;
	
	@FindBy(how = How.ID, using = "consultar") // $codepro.audit.disable
	private WebElement consultar;
	
	@FindBy(how = How.ID, using = "excluir") // $codepro.audit.disable
	private WebElement excluir;
	
	/* Regiao: getters and setter */
	
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
	
	/* Regiao: Acoes de botoes */
	
	public void clickOnInluir(){ // $codepro.audit.disable
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

	public void clickOnConsultar(){ // $codepro.audit.disable
		consultar.click();
	}
	
	public void clickOnExcluir(){ // $codepro.audit.disable
		excluir.click();
	}
}