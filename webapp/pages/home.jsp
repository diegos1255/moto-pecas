<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="HomeController">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Home</li>
	</ol>
	
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-primary o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-comments"></i>
					</div>
					<div class="mr-5">Teste</div>
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Teste</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-warning o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-list"></i>
					</div>
					<div class="mr-5">Teste</div>
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Teste</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-success o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-shopping-cart"></i>
					</div>
					<div class="mr-5">Compras</div>
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Cadastro de compras</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-danger o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-support"></i>
					</div>
					<div class="mr-5">Teste</div>
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Teste</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
	</div>
	
	<div class="jumbotron">
	  <h1>Olá, Diego</h1>
	  <p>Seja bem vindo ao moto peças vitória régia.</p>
	  <p><a class="btn btn-primary btn-lg" href="#" role="button">Meus dados</a></p>
	</div>

	<div class="card-footer small text-muted bootomHome">Último login <span class="label label-info">14/09/2017, ás 13:45.</span></div>

	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-bell-o"></i> Ùltimos pedidos
		</div>
		<div class="list-group list-group-flush small">
			<a href="#" class="list-group-item list-group-item-action">
				<div class="media">
					<img class="d-flex mr-3 rounded-circle"
						src="http://placehold.it/45x45" alt="">
					<div class="media-body">
						<strong>Pedido 1</strong> feito pelo cliente <strong>Diego</strong>.
						<div class="text-muted smaller">Hora/Data pedido 13:00
							horas, 12/09/2017.</div>
					</div>
				</div>
			</a> <a href="#" class="list-group-item list-group-item-action"> Ver
				todos pedidos... </a>
		</div>
		<div class="card-footer small text-muted">Ùltima atualização
			13:00 horas.</div>
	</div>

</div>