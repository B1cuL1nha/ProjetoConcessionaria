<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
            label {
                font: normal 12px courier !important;
            }
</style>
<title>Manter Concessionaria</title>
<link rel="stylesheet" type="text/css" href="/sceweb/CSS/Formato.css">
<script type="text/javascript" language="javascript">
	onload = function() {
		var form = document.getElementById('formCadastro');
		var incluir = document.getElementById('incluir');
		var consultar = document.getElementById('consultar');
		var excluir = document.getElementById('excluir');

		incluir.onclick = function() {
			form.acao.value = 'IncluirConcessionaria';
			form.submit();
		}

		consultar.onclick = function() {
			form.acao.value = 'ConsultarConcessionaria';
			form.submit();
		}

		excluir.onclick = function() {
			history.go(-1)
		}
	}
</script>
</head>
<body>
	<jsp:include page="Cabecalho.jsp" />
	<div id="principal">
		<div id="titulo">
			<h3>Concessionaria</h3>
		</div>
		<hr>
		<div id="formulario2">

			<form id="formCadastro" name="formConcessionariaIncluir" action="/sceweb/ServletControle" method="post">
				<table id="tabcampos">
					<tr>
						<td><label> Placa:</label></td>
						<td><input id="placa" size="70" type="text" name="txtPlaca"
							value=""></td>
					</tr>
					<tr>
						<td><label> Marca:</label></td>
						<td><input id="marca" size="15" type="text" name="txtMarca"
							value=""></td>
					</tr>
					<tr>
						<td><label> Modelo do veiculo:</label></td>
						<td><input id="modelo" size="70" type="text" name="txtModelo"
							value=""></td>
					</tr>
					<tr>
						<td><label> Ano:</label></td>
						<td><input id="ano" size="50" type="text" name="txtAno"
							value=""></td>
					</tr>
					<tr>
						<td><label> Cor:</label></td>
						<td><input id="cor" size="10" type="text" name="txtCor"
							value=""></td>
					</tr>
					<tr>
						<td><label> Cambio:</label></td>
						<td><input id="cambio" size="50" type="text" name="txtCambio"
							value=""></td>
					</tr>
					<tr>
						<td><label> Quantidade de portas:</label></td>
						<td><input id="portas" size="10" type="text" name="txtPortas"
							value=""></td>
					</tr>
					<tr>
						<td><label> Combustivel:</label></td>
						<td><input id="combustivel" size="50" type="text" name="txtCombustivel"
							value=""></td>
					</tr>
					<tr>
						<td><label> Descrição do veiculo:</label></td>
						<td><input id="descricao" size="30" type="text" name="txtDescricao"
							value=""></td>
					</tr>
					
					<tr>
						<td colspan=2 id="botoes" align="center">
						<input id="incluir" type="button" name="btnIncluir" value="Incluir">
						<input id="consultar" type="reset" name="btnConsultar" value="Consultar">
					    <input id="excluir" type="button" name="btnExcluir" value="Excluir">
					    </td>
					</tr>
				</table>
				<input type="hidden" name="acao" value="">
				<input type="hidden" name="menu" value="principal">
				<%	String msg = (String) request.getAttribute("msg"); 
					if(msg == null)
						msg="";
				%>
				<label id="mensagem"><%=msg%></label>
			</form>
		</div>
	</div>
	<jsp:include page="Rodape.jsp" />
</body>
</html>