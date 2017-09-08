app.controller("UsuarioController", function($scope, $http) {

	$scope.container = {};
	$scope.nome = '';
	$scope.msgErro = '';
	$scope.container.titulo = "Nomes cadastrados";
	$scope.path = 'usuario/';

	$scope.init = function() {

		$http.get($scope.path + 'init').then(
				function(response) {
					
					if (response.status == 200) {
						$scope.container.usuario = response.data.usuario;
					}
					
				}
		);

	}

});