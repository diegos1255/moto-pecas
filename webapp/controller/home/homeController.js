app.controller("HomeController", function($scope, $http) {

	$scope.container = {};
	$scope.status = '';
	$scope.enviaMensagem = false;

	/**
	 * Metodo responsavel por detalhar o servico na pagina inicial
	 */
	$scope.detalhaServico = function () {
		
		$scope.container.pedido = "Diego";
		$scope.status = 'Pendente';
		
		if ($scope.status === 'Pendente') {
			
			$scope.enviaMensagem = true;
			
		}
		
	}

});