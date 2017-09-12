app.controller("UsuarioController", function($scope, $http, $location, $rootScope) {

	$scope.container = {};
	$scope.path = 'usuario/';
	$scope.container.nome = '';
	$scope.container.login = '';
	$scope.container.senha = '';
	$scope.container.email = '';
	$scope.perfis = [
		{descricao: 'Selecione'},
		{descricao: 'Admin'},
		{descricao: 'User'}
		];

	/**
	 * Metodo responsavel por salvar um usuario.
	 */
	$scope.salvar = function() {

		if ($scope.container.nome === '' || $scope.container.login === '' 
			|| $scope.container.senha === '' || $scope.container.email === ''
				|| $scope.container.perfil.descricao === 'Selecione') {
			swal("Oops", "Preencha todos os campos.", "error");
			return;
		}
		
		var params = {
				'nome'   : $scope.container.nome,
				'login'  : $scope.container.login,
				'senha'  : $scope.container.senha,
				'email'  : $scope.container.email,
				'perfil' : $scope.container.perfil.descricao
		}

		$http.post($scope.path + 'salvar', params).then(
				function success (response) {
					if (response.status == 200) {
						limparCampos ();
						swal("Sucesso", response.data.msg, "success");
					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", response.data.erro, "error");

					}

				}

		);

	}
	
	/**
	 * Metodo responsavel por redirecionar um usuario para editar
	 */
	$scope.editar = function (row) {
		
		$rootScope.row = row;
		
		//redireciona para tela de edicao de usuario
		$location.path("/editUsuario");
		
	}
	
	/**
	 * Metodo responsavel por buscar os usuarios
	 */
	$scope.buscaUsuarios = function () {
		
		$http.get($scope.path + 'listaUsuarios').then(
				function success (response) {
					if (response.status == 200) {
						
						$scope.container.usuarios = response.data.usuarios;
						
					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", "Ocorreu um erro ao buscar usuários", "error");

					}

				}

		);
		
	}
	
	/**
	 * Metodo responsavel por limpar todos os campos apos cadastrar um usuario.
	 */
	function limparCampos () {
		$scope.container.nome = null;
		$scope.container.login = null;
		$scope.container.senha = null;
		$scope.container.email = null;
		$scope.container.perfil.descricao = 'Selecione';
	} 
	
	$scope.ordenar = function(keyname){
        $scope.sortKey = keyname;
        $scope.reverse = !$scope.reverse;
    };

});

app.controller("EditarUsuarioController", function($scope, $http, $location, $rootScope) {
	
	$scope.container = {};
	$scope.path = 'usuario/';
	$scope.container.nome = '';
	$scope.container.login = '';
	$scope.container.senha = '';
	$scope.container.email = '';
	$scope.perfis = [
		{descricao: 'Selecione'},
		{descricao: 'Admin'},
		{descricao: 'User'}
		];

	$scope.init = function () {
		
		$scope.row = $rootScope.row;
		$scope.container.nome = $scope.row.nome;
		$scope.container.login = $scope.row.login;
		$scope.container.senha = $scope.row.senha;
		$scope.container.email = $scope.row.email;
		
	}
	
	/**
	 * Metodo responsavel por editar o usuario.
	 */
	$scope.editarUsuario = function () {
		
		if ($scope.container.nome === '' || $scope.container.login === '' 
			|| $scope.container.senha === '' || $scope.container.email === ''
				|| $scope.container.perfil.descricao === 'Selecione') {
			swal("Oops", "Preencha todos os campos.", "error");
			return;
		}
		
		var params = {
				'id'                 : $scope.row.id,
				'nome'               : $scope.container.nome,
				'login'              : $scope.container.login,
				'senha'              : $scope.container.senha,
				'email'              : $scope.container.email,
				'dataCadastro'       : $scope.row.dataCadastro,
				'perfil'             : $scope.container.perfil.descricao
		}
		
		$http.put($scope.path + 'editarUsuario', params).then(
				function success (response) {
					if (response.status == 200) {
						
						swal("Sucesso", response.data.msg, "success");
						
					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", "Ocorreu um erro ao editar usuário", "error");

					}

				}

		);
		
	}
	
});