<?php
      include("olivainicioSesion.php");
if(isset($_SESSION['usuario']))
  echo $_SESSION['usuario'];
else
 echo 'no iniciada la sesión';
?>

<!DOCTYPE html>
<html>
  
<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/Oliva_Bet.png" type="image/x-icon">
  <title> Nosotros Oliva Bet</title>

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700&display=swap" rel="stylesheet">
  <!--owl slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />
  <!-- nice select -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css" integrity="sha256-mLBIhmBvigTFWPSCtvdu6a76T+3Xyt+K571hupeFLg4=" crossorigin="anonymous" />
  <!-- font awesome style -->
  <link href="css/font-awesome.min.css" rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
</head>

<body class="sub_page">
<section class="modal" id="mostrar" style="display: none;">
    <div class="modal-container">
        <img class="modal-img" src="images/Oliva_Bet.png" >
        <h2 id="eliminar" class="title">¡¡Bienvenido a Oliva Bet!! </h2>
        <p id="eliminar_dos" class="paragraph">Inicia sesión en Oliva Bet y accede a tu cuenta.<br> Si no tienes cuenta regístrate</p>
        <div id="eliminar_tres" class="btns">
            <a href="registrarse.php" target="_blank" class="open-guide">Regístrate</a>
            <a href="iniciarsesion.php" target="_blank" class="open-guide">Iniciar Sesión</a>
        </div>
        
        <a href="index.php" class="close">&times;</a>
    </div>
  </section>
  <div class="hero_area">
    <div class="hero_bg_box">
      <img src="images/hero-bg.jpg" alt="">
    </div>
    <!-- header section strats -->
    <header class="header_section">
      <div class="header_top">
        <div class="container-fluid header_top_container">

          <div class="contact_nav">
            <a href="">
            </a>
            <a href="">
             <h1>Oliva Bet</h1>
             
            </a>
            <a href="">
            </a>
          </div>
        </div>
      </div>
      <div class="header_bottom">
        <div class="container-fluid">
          <nav class="navbar navbar-expand-lg custom_nav-container ">
            

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class=""> </span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav  ">
              <li class="nav-item active ">
                  <a class="nav-link" href="index.php">Inicio </a>
                </li>
                <li class="nav-item active">
                  <a class="nav-link" href="about.php"> Nosotros </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="service.php">Tragaperras</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" onclick="mostrarAaaaa()">Cuenta</a>
                    <i class="fa fa-user" aria-hidden="true"></i>
                  </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="cuenta.php">Mi perfil</a>
                </li>
                <li class="nav-item active">
                  <a class="nav-link" href="paginaRanking.php"> Ranking </a>
                </li>
                <form class="form-inline justify-content-center">
                  <button class="btn  my-2 my-sm-0 nav_search-btn" type="submit">
                    
                  </button>
                </form>
              </ul>
            </div>
          </nav>
        </div>
      </div>
    </header>
    <!-- end header section -->
  </div>


  <!-- about section -->

  <section class="about_section layout_padding">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-5 offset-md-1">
          <div class="detail-box pr-md-2">
            <div class="heading_container">
              <h2 class="">
                Nuestra historia
              </h2>
            </div>
            <p class="detail_p_mt">
              Hemos tenido una idea de crear un casino web de forma gratuita, ya que este tipo de servicio es de pago. Por otro lado, hemos querido implementar rankings para que haya más competencia.
              <br><br>Somos un grupo de estudiantes con grandes ambiciones de crear cosas innovadoras y hemos llegado a la conclusión de que podemos ayudar a la gente y que la perspectiva de las máquinas tragaperras cambien.
              <br><br>Hemos decidido hacer este proyecto debido al gasto en este tipo de juegos, hemos tomado conciencia del daño que hacen estos juegos y por la diversión de los usuarios.
            </p>
            
          </div>
        </div>
        <div class="col-md-6 px-0">
          <div class="img-box ">
            <img src="./tra1.jpeg" class="box_img">
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- about section ends -->

  <!-- info section -->
  <section class="info_section ">
    <div class="container">
      <div class="info_top">
        <div class="row">
          <div class="col-md-3 ">
            <a class="navbar-brand" href="index.php">
              Oliva Bet
            </a>
          </div>
          <div class="col-md-5 ">
            <div class="info_contact">
              <a href="">
               
              
                <i class="fa fa-phone" aria-hidden="true"></i>
                <span>
                  +982387365
                </span>
              </a>
            </div>
          </div>
          <div class="col-md-4 ">
            <div class="social_box">
              <a href="https://www.facebook.com/?locale=es_ES" target="_blank">
                <i class="fa fa-facebook" aria-hidden="true"></i>
              </a>
              <a href="https://twitter.com/?lang=es" target="_blank">
                <i class="fa fa-twitter" aria-hidden="true"></i>
              </a>
              <a href="https://es.linkedin.com/" target="_blank">
                <i class="fa fa-linkedin" aria-hidden="true"></i>
              </a>
              <a href="https://www.instagram.com/" target="_blank">
                <i class="fa fa-instagram" aria-hidden="true"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
      
  </section>
  <!-- end info_section -->

  <!-- footer section -->
  <footer class="footer_section">
    <div class="container">
      <p>
        &copy; <span id="displayYear"></span> Derechos Reservados
        
      </p>
    </div>
  </footer>
  <!-- footer section -->

  <!-- jQery -->
  <script src="js/jquery-3.4.1.min.js"></script>
  <!-- popper js -->
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <!-- bootstrap js -->
  <script src="js/bootstrap.js"></script>
  <!-- owl slider -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
  <!-- nice select -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js" integrity="sha256-Zr3vByTlMGQhvMfgkQ5BtWRSKBGa2QlspKYJnkjZTmo=" crossorigin="anonymous"></script>
  <!-- custom js -->
  <script src="js/custom.js"></script>
  <!-- Google Map -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap"></script>
  <!-- End Google Map -->

  <script>

    function mostrarAaaaa() {
      document.getElementById("mostrar").style.display = "block";
    }
  
    function mostrarFormulario() {
      document.getElementById("fomulario_boton").style.display = "block";
      document.getElementById("eliminar").style.display = "none";
      document.getElementById("eliminar_dos").style.display = "none";
      document.getElementById("eliminar_tres").style.display = "none";
    }
   
      
    </script>


</body>

</html>