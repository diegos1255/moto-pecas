var app = angular.module('app', ['ui.router', 'angularUtils.directives.dirPagination']);

app.config(function($stateProvider, $locationProvider) {

	/*$locationProvider.html5Mode({
		enabled: true,
		requireBase: false
	});*/

	$stateProvider

	.state('init', {
		url: '/',
		templateUrl: 'index.html' 
	})
	.state('home', {
		url: '/home',
		templateUrl: 'pages/home.jsp'
	})
//	.state('login', {
//		url: '/login',
//		templateUrl: 'pages/login.jsp'
//	})
	.state('cliente', {
		url: '/cliente',
		templateUrl: 'pages/cadastroCliente.jsp'
	})
	.state('cadUsuario', {
		url: '/cadUsuario',
		templateUrl: 'pages/cadastrarUsuario.jsp'
	})
	.state('edit', {
		url: '/editUsuario',
		templateUrl: 'pages/editarUsuario.jsp'
	})
	.state('usuarios', {
		url: '/usuarios',
		templateUrl: 'pages/listaUsuarios.jsp'
	})
	.state('nomes', {
		url: '/nomes',
		templateUrl: 'pages/teste.jsp'
	});

});