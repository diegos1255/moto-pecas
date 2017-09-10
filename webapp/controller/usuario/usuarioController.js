app.controller("UsuarioController", function($scope, $http) {

	$scope.container = {};
	$scope.nome = '';
	$scope.msgErro = '';
	$scope.container.titulo = "Nomes cadastrados";
	$scope.path = 'usuario/';
	$scope.container.nome = '';
	$scope.container.login = '';
	$scope.container.senha = '';
	$scope.container.email = '';

	$scope.init = function() {

		$http.get($scope.path + 'init').then(
				function(response) {

					if (response.status == 200) {
						$scope.container.usuario = response.data.usuario;
					}

				}
		);

	}

	$scope.salvar = function() {

		var params = {
				'nome'  : $scope.container.nome,
				'login' : $scope.container.login,
				'senha' : $scope.container.senha,
				'email' : $scope.container.email
		}

		$http.post($scope.path + 'salvar', params).then(
				function (response) {
					if (response.status == 200) {
						$scope.container.msg = $scope.data.msg;
					}
				}
		);

	}

});