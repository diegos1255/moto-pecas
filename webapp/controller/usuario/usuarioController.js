app.controller("UsuarioController", function($scope, $http) {

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


});