<?php
session_start();
error_reporting(0);
// llamar ala conexión de base de datos
include 'iniciasesion.php';
if(isset($_POST['entrar'])){
$usuario = $conecta->real_escape_string($_POST['usuario']);
$password = $conecta->real escape_string(md5($_POST['pass']));

$consulta ="Select * from Usuarios where Usuario = '$usuario' and Password = '$password'";
if($resultado = $conecta->query($consulta)){
    while($row = $resultado->fetch_array()){
        $userok = $row ['Usuario'];
        $passwordok = $row ['Password'];
    }
    $resultado->close();
}
$conecta->close();
if(isset($usuario) && isset($password)){
    if($usuario = $userok && $password == $passwordok ) {
    $_SESSION['login'] = TRUE;
    $_SESSION['Usuario'] = $usuario;
    header("location: .index.php");
    }
    else {
    $mensaje.="<div class='alert alert-danger alert-dismissible fade show' role='alert'>
<strong>Error no se encontraron tus datos</strong> Por favor verifica tus datos.
<button type='button' class='close' data-dismiss='alert' aria-label='Close'>
<span aria-hidden='true'>&times;</span>
</button>"
    }
}