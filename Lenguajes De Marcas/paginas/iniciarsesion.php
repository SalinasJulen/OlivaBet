<?php
      include("olivainicioSesion.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="./css/estilo.css">
    <title>Iniciar Sesion</title>
</head>
<body>
    
    <div class="modal-container">
    <a href="./index.php">
    <img class="modal-img" src="./images/Oliva_Bet.png" width="200">
    </a>
    </div>

    <form name="Iniciarsesion" method="POST" action="./olivainicioSesion.php">
  
  
        <div class="form-row">
            <h2>Inicia Sesion</h2>
          <input type="hidden" name="db" value ="olivabet">
          <input type="hidden" name="table" value ="usuarios">
          <input type="hidden" name="idUsuario">
          <div class="form-group col">
            <input type="text" class="form-control" id="nombreUsuario" name ="nombreUsuario" placeholder="Nombre de Usuario" required />
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-lg-6">
            <input type="password" class="form-control" name ="contrasena" placeholder="Contraseña" required/>
          </div>
          <div class="form-group col-lg-6">
            <input type="text" class="form-control" name="correoelectronico" placeholder="Correo Electrónico" />
            <input type="hidden" name="id_Usuario">
          </div>
        </div>
     
        <div class="boton_enviar">
          <button class="parpadea">
            Enviar
          </button>
        </div>
        <p class="link"><a href="registrarse.php">¿Aun no tienes cuenta?</a></p>
      </form>



</body>
</html>