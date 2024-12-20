<?php
session_start();

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $servername = "databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com";
    $username = "crupiermaestro";
    $password = "sasamkdojojfaojjokefju9e";
    $dbname = "olivabet";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Error de conexión: " . $conn->connect_error);
    }

    $nombreusuario = $_POST["nombreUsuario"];
    $contrasena = md5($_POST["contrasena"]);
    $correoelectronico = $_POST["correoelectronico"];

    $sql = "SELECT nombreUsuario, contrasena, correoelectronico FROM usuarios WHERE nombreUsuario = '$nombreusuario' AND contrasena = '$contrasena' AND correoelectronico = '$correoelectronico'";

    
    
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {

        $preparar = mysqli_prepare($conn, $sql);

        if($preparar) {
            echo "Felicidades, has iniciado sesión";

            mysqli_stmt_execute($preparar);
            $resultado_ejecucion = mysqli_stmt_get_result($preparar);
            
            $usuarios = mysqli_fetch_assoc($resultado_ejecucion);
    
            $_SESSION['usuario'] =  $_POST['nombreUsuario'];
            $_SESSION['correo'] =  $_POST['correoelectronico'];
            $_SESSION['puntos'] = $_POST['puntos'];
            
            echo $_SESSION['usuario'];

            echo $_SESSION['correo'];

            echo $_SESSION['puntos'];

           

            header("Location:cuenta.php");
            exit();
    
        } else {
            echo "Error en consulta";
        }

    } else {
        echo "No se recoge info";
        echo "Error al iniciar sesión: Usuario, Contraseña o Correo Electrónico incorrectos";
    }



    mysqli_close($conn);
    
}
?> 