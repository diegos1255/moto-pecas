<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="HomeController">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Gerenciar</li>
		<li class="breadcrumb-item active">Cadastrar Clientes</li>
	</ol>
	
	<form name="cadastro" ng-submit="salvar()">
	
		<div class="card-body">
			<div class="form-group">
				<label>Nome</label> <input type="text"
					class="form-control" placeholder="Digite o nome do usuário">
			</div>

			<div class="form-group">
				<label>CPF/CNPJ</label> <input type="text"
					class="form-control" placeholder="Digite o CPF/CNPJ">
			</div>

			<div class="form-group">
				<label>CEP</label> <input type="text"
					class="form-control" placeholder="Digite o CEP">
			</div>

			<div class="form-group">
				<div class="form-row"> 
					<div class="col-md-6">
						<label>Endereço</label> <input type="text"
					class="form-control" placeholder="Digite o Endereço">
					</div>
					<div class="col-md-6">
						<label>Nº</label> <input type="text"
					class="form-control" placeholder="Digite o Nº">
					</div>
				</div>
			</div>

			<div class="form-group">
				<div class="form-row"> 
					<div class="col-md-6">
						<label for="exampleInputPassword1">Telefone</label> <input type="text"
							class="form-control" placeholder="Digite o Telefone">
					</div>
					<div class="col-md-6">
						<label>E-mail</label> <input
							type="password" class="form-control" placeholder="Digite o E-mail">
					</div>
				</div>
			</div>
	
			<button class="btn btn-primary btn-block">Salvar</button>
	
		</div>
	
	</form>

</div>