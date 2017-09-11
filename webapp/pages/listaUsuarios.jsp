<div ng-controller="UsuarioController" ng-init="buscaUsuarios()">
	<div class="card-header">
		<i class="fa fa-table"></i> Usuários cadastrados
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<table class="table table-bordered" width="100%" id="dataTable"
				cellspacing="0">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Login</th>
						<th>E-mail</th>
						<th>Perfil</th>
						<th>Data Cadastro</th>
					</tr>
				</thead>
				<tbody ng-repeat="u in container.usuarios">
					<tr>
						<td>{{u.nome}}</td>
						<td>{{u.login}}</td>
						<td>{{u.email}}</td>
						<td>{{u.perfil}}</td>
						<td>11/09/2017</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>