<%@ page contentType="text/html; charset=utf-8"%>

<!DOCTYPE html>
<html lang="pt-br">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login de Acesso - Moto Peças</title>

	<!-- CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="css/sb-admin.css" rel="stylesheet">

  </head>

  <body class="bg-dark">

    <div class="container" style="padding-top:100px;">

      <div class="card card-login mx-auto mt-5">
        <div class="card-header">
          Login de Acesso
        </div>
        <div class="card-body">
          <form>
            <div class="form-group">
              <label for="login">Login</label>
              <input type="text" class="form-control" id="login" placeholder="Insira seu login">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword1">Senha</label>
              <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Insira sua Senha">
            </div>
            <div class="form-group">
              <div class="form-check">
                <label class="form-check-label">
                  <input type="checkbox" class="form-check-input">
                  Lembrar minha Senha
                </label>
              </div>
            </div>
            <a class="btn btn-primary btn-block" ui-sref="home">Login</a>
          </form>
          <div class="text-center">
            <a class="d-block small" href="forgot-password.html" style="padding-top: 10px;">Esqueceu a senha?</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/angular.js"></script>
	<script src="js/angular-ui-router.min.js"></script>
	<script src="controller/app.js"></script>

  </body>

</html>
