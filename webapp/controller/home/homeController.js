app.controller("HomeController", function($scope, $http) {

	$scope.container = {};
	$scope.status = '';
	$scope.enviaMensagem = false;

	/**
	 * Metodo responsavel por detalhar o servico na pagina inicial
	 */
	$scope.detalhaServico = function () {
		
		$scope.container.pedido = "Diego";
		$scope.status = 'Andamento';
		
		if ($scope.status === 'Andamento') {
			
			$scope.enviaMensagem = true;
			
		}
		
	}

});