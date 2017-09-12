<%@ page contentType="text/html; charset=utf-8"%> 
<div ng-controller="UsuarioController" ng-init="init()">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Gerenciar</li>
		<li class="breadcrumb-item active">Cadastro de Usuários</li>
	</ol>

	<form name="cadastro" ng-submit="salvar()">
	
		<div class="card-body">
			<div class="form-group">
				<label for="exampleInputName">Nome</label> <input type="text"
					class="form-control" ng-model="container.nome" placeholder="Digite o nome do usuário">
			</div>
			<div class="form-group">
				<div class="form-row"> 
					<div class="col-md-6">
						<label for="exampleInputPassword1">Login</label> <input type="text"
							class="form-control" ng-model="container.login" placeholder="Digite o Login">
					</div>
					<div class="col-md-6">
						<label for="exampleConfirmPassword">Senha</label> <input
							type="password" ng-model="container.senha" class="form-control" placeholder="Digite a senha">
					</div>
				</div>
			</div>
	
			<div class="form-group">
				<label for="exampleInputEmail1">E-mail</label> <input type="text"
					class="form-control" ng-model="container.email" placeholder="Digite o e-mail">
			</div>
	
			<div class="form-group">
				<label>Perfil</label>
				<select class="form-control heigthComboUsuario"
	                data-ng-model="container.perfil" ng-init="container.perfil = perfis[0]"
	                ng-options="g.descricao for g in perfis track by g.descricao" >
	        	</select>
			</div>
	
			<button class="btn btn-primary btn-block">Salvar</button>
	
		</div>
	
	</form>

</div>