var app = angular.module('app', ['ui.router', 'ui.bootstrap']);

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
		templateUrl: 'pages/cliente.jsp'
	})
	.state('nomes', {
		url: '/nomes',
		templateUrl: 'pages/teste.jsp'
	});

});