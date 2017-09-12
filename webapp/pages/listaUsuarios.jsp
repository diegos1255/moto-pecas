<div ng-controller="UsuarioController" ng-init="buscaUsuarios()" style="overflow: hidden;">
	<div class="card-header">
		<i class="fa fa-table"></i> Usu�rios cadastrados
	</div>
	<div class="card-body">
	
		<div class="form-group">
	        <label>Filtro</label>
	        <input type="text" ng-model="procurar" class="form-control" placeholder="Digite seu filtro...">
	    </div>
	
		<div class="table-responsive">
			<table class="table table-bordered" width="100%" id="dataTable"
				cellspacing="0">
				<thead>
					<tr>
						<th>C�digo</th>
						<th>Nome</th>
						<th>Login</th>
						<th>E-mail</th>
						<th>Perfil</th>
						<th>Data Cadastro</th>
						<th>Editar</th>
						<th>Excluir</th>
					</tr>
				</thead>
				<tbody dir-paginate="u in container.usuarios | filter:procurar | itemsPerPage:5 ">
					<tr>
						<td>{{u.id}}</td>
						<td>{{u.nome}}</td>
						<td>{{u.login}}</td>
						<td>{{u.email}}</td>
						<td>{{u.perfil}}</td>
						<td>{{u.dataCadastro}}</td>
						<td><center><i class="fa fa-pencil" ng-click="editar(u)" aria-hidden="true"></i></center></td>
						<td><center><i class="fa fa-trash-o" aria-hidden="true"></i></center></td>
					</tr>
				</tbody>
				
			</table>
			
			<dir-pagination-controls class="pagination" max-size="5" boundary-links="true"></dir-pagination-controls>
			
		</div>
	</div>
</div>