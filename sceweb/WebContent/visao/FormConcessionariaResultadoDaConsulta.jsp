<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" language="javascript">
	
	function voltar() {
		history.go(-1)
		
	}
</script>
<title>Concessionaria</title>
</head>
<body>
<jsp:include page="Cabecalho.jsp" />
	<div id="principal">
		<div id="titulo">
			<h3>Concessionaria - Consultar</h3>
		</div>
		<hr>
		<div id="formulario2">

			<form name="formConcessionariaConsultar" action="/sce-web-ref2/ServletControle" method="post">
				<table id="tabcampos">
				
					<tr>
						<td><label> Placa:</label></td>
						<td><input id="campo" size="90" type="text" name="txtPlaca"
							value="<% out.println(request.getAttribute("placa")); %>" disabled="disabled">
						</td>
					</tr>
					<tr>
						<td><label> Marca:</label></td>
						<td><input id="campo" size="15" type="text" name="txtMarca"
							value="<% out.println(request.getAttribute("marca")); %>" disabled="disabled">
						</td>
					</tr>
					<tr>
						<td><label> Modelo do veiculo:</label></td>
						<td><input id="campo" size="50" type="text" name="txtModelo"
							value="<% out.println(request.getAttribute("modelo")); %>"></td>
					</tr>
					<tr>
						<td><label> Ano:</label></td>
						<td><input id="campo" size="50" type="text" name="txtAno"
							value="<% out.println(request.getAttribute("ano")); %>"></td>
					</tr>
					<tr>
						<td><label> Cor:</label></td>
						<td><input id="campo" size="10" type="text" name="txtCor"
							value="<% out.println(request.getAttribute("cor")); %>"></td>
					</tr>
					<tr>
						<td><label> Cambio:</label></td>
						<td><input id="campo" size="50" type="text" name="txtCambio"
							value="<% out.println(request.getAttribute("cambio")); %>"></td>
					</tr>
					<tr>
						<td><label> Quantidade de portas:</label></td>
						<td><input id="campo" size="50" type="text" name="txtPortas"
							value="<% out.println(request.getAttribute("portas")); %>"></td>
					</tr>
					<tr>
						<td><label> Combustivel:</label></td>
						<td><input id="campo" size="30" type="text" name="txtCombustivel"
							value="<% out.println(request.getAttribute("combustivel")); %>"></td>
					</tr>
					<tr>
						<td><label> Descrição do carro:</label></td>
						<td><input id="campo" size="30" type="text" name="txtDescricao"
							value="<% out.println(request.getAttribute("descricao")); %>"></td>
					</tr>
					
					<tr>
						<td colspan=2 id="botoes" align="center">
						
						<input id="botao" type=reset name=btnLimpar onclick=limpar() value=Limpar>
					    <input id="botao" type=button name=btnVoltar onclick=voltar() value=Voltar>
					    </td>
					</tr>
				</table>
				<input type="hidden" name="acao" value="">
				<input type="hidden" name="menu" value="principal">
				
				<%	
				    request.setAttribute("placa", request.getAttribute("placa"));
				    String msg = (String) request.getAttribute("msg"); 
					if(msg == null)
						msg="";
				%>
				<label><%=msg%></label>
			</form>
		</div>
	</div>
	<jsp:include page="Rodape.jsp" />
</body>
</html>