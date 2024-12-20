import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegistroOlivaBet extends JFrame implements ActionListener {
	JButton btnRegistrase,btnsesion;
	JLabel lblnombreUsuario,lblcontrasena,lblcorreo,lbltitulo;
	JTextField txtcontrasena,txtcorreo;
	public static JTextField txtnombreUsuario;
	JPanel panel,panel2;

	
	RegistroOlivaBet(){
		  setTitle("Registro Oliva Bet");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setSize(800, 300); 
	      setLayout(null);
	      setVisible(true);

	      setLayout(new BorderLayout());
	      
	      btnRegistrase = new JButton ("Registrarse");
	      btnRegistrase.addActionListener(this);

	      btnsesion = new JButton ("Iniciar Sesión");
	      btnsesion.addActionListener(this);
	      
	      txtnombreUsuario = new JTextField();
	      txtcontrasena = new JTextField();
	      txtcorreo = new JTextField();
	      
	      lblnombreUsuario = new JLabel ("Nombre de Usuario:");
	      lblcontrasena = new JLabel ("Contraseña:");
	      lblcorreo = new JLabel ("Correo Electrónico:");
	      lbltitulo = new JLabel ("Registro",SwingConstants.CENTER);
	      
	      panel = new JPanel(new GridLayout(3, 3));
	      panel2 = new JPanel(new GridLayout(1, 2));
	      
	      add(lbltitulo,BorderLayout.NORTH);
	      add(panel,BorderLayout.CENTER);

	      
	      panel.add(lblnombreUsuario);
	      panel.add(txtnombreUsuario);
	      panel.add(lblcontrasena);
	      panel.add(txtcontrasena);
	      panel.add(lblcorreo);
	      panel.add(txtcorreo);
	      
	      add(panel2,BorderLayout.SOUTH);
	      panel2.add(btnsesion);
	      panel2.add(btnRegistrase);
	 
	      lbltitulo.setFont(new Font("Arial", Font.BOLD, 25));
	      lbltitulo.setForeground(new Color (3, 169, 252));
	      
	      
	       
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnRegistrase){
		insertarDatos();
	}
	if(e.getSource()==btnsesion){
		inicioSesion();
	}
		
		
	}

	public static void main(String[] args) {
	InicioOlivaBet inicio = new InicioOlivaBet();
	inicio.setVisible(false);
	new RegistroOlivaBet();
	
		
	}
	
    public void insertarDatos() {
        String nombreUsuario = txtnombreUsuario.getText();
        String contrasena = txtcontrasena.getText();
        String correoElectronico = txtcorreo.getText();
       int puntosIniciales = 5000;
        String encriptado = encriptacion(contrasena);
        try {
        	long time = System.currentTimeMillis();
        	java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
        	System.out.println("Time in milliseconds :" + timestamp);
        
        	
        	 InetAddress my_localhost = InetAddress.getLocalHost();
             System.out.println("The IP Address of client is : " + (my_localhost.getHostAddress()).trim());
             String my_system_address = "";
             
		     Connection conn = DriverManager.getConnection("jdbc:mysql://databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com:3306/olivabet", "crupiermaestro", "sasamkdojojfaojjokefju9e");

            String sql = "INSERT INTO usuarios (nombreUsuario, contrasena, correoelectronico,puntos,fecha_Alta,IP_Registro) VALUES ('"+ nombreUsuario+"','"+encriptado+"','"+ correoElectronico+"','"+puntosIniciales+"','"+timestamp+"','"+(my_localhost.getHostAddress()).trim()+"')";
            PreparedStatement stmt = conn.prepareStatement(sql);
            System.out.println(sql);
            
         
           stmt.executeUpdate(sql);
          
           
           stmt.close();//cerrar el statement

           conn.close();//cerrar la conexión con la base de datos
           
           
			JOptionPane.showMessageDialog(this, "Felicidades, te has registrado","Registro",JOptionPane.INFORMATION_MESSAGE);

            new InicioOlivaBet();
        } catch (Exception e) {
            System.out.println("Error al insertar datos: " + e);
           
        }
    }
    
    
    public boolean inicioSesion() {
        String nombreUsuarioInicio = txtnombreUsuario.getText();
        String contrasenaInicio = txtcontrasena.getText();
        String correoElectronicoInicio = txtcorreo.getText();
        boolean funciona = false;
        String encriptadoInicio = encriptacion(contrasenaInicio);
        
        try {
        
   
	        Connection conn = DriverManager.getConnection("jdbc:mysql://databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com:3306/olivabet", "crupiermaestro", "sasamkdojojfaojjokefju9e");

            String iniciosesion = "SELECT nombreUsuario,contrasena,correoelectronico FROM usuarios WHERE nombreUsuario ='"+nombreUsuarioInicio+"'AND contrasena ='"+encriptadoInicio+"'AND correoelectronico ='"+correoElectronicoInicio+"'";
            PreparedStatement stmt = conn.prepareStatement(iniciosesion);
            System.out.println(iniciosesion);
           
          
           ResultSet inicioSesion = stmt.executeQuery();
           if(inicioSesion.next()) {
        	   funciona = true;
        	   
				JOptionPane.showMessageDialog(this, "Felicidades, has iniciado sesión","Inicio de sesión",JOptionPane.INFORMATION_MESSAGE);
				
				
	            String obtenerPuntuacion = "SELECT puntos FROM usuarios WHERE nombreUsuario ='"+nombreUsuarioInicio+"'AND contrasena ='"+encriptadoInicio+"'AND correoelectronico ='"+correoElectronicoInicio+"'";
	            PreparedStatement stmt2 = conn.prepareStatement(obtenerPuntuacion);
	            ResultSet obtenerPuntos = stmt2.executeQuery();
	          
	            
	            
	            if (obtenerPuntos.next()) {
	            InicioOlivaBet.puntuacion = obtenerPuntos.getInt(1);
	            System.out.println( InicioOlivaBet.puntuacion);
	            InicioOlivaBet.lblPuntos.setText(String.valueOf(InicioOlivaBet.puntuacion));
	            
	            }
	            else
	            	System.out.println("Error");
	        

	            
	            
        	   new InicioOlivaBet();
           } else {
				JOptionPane.showMessageDialog(this, "Tienes que introducir datos correspondientes","Error al inciar sesión",JOptionPane.ERROR_MESSAGE);
           }
          
           stmt.close();//cerrar el statement

           conn.close();//cerrar la conexión con la base de datos
           
           
            
            
          
            
        } catch (Exception e) {
            System.out.println("Error al iniciar sesión: " + e);
        }
		return funciona;
    }
    
    
    
    
    
    
    public static String encriptacion(String contrasena) {

		String contrasenaEncriptada = "";

		try   

	        {  

	            /* Instancia MessageDigest para MD5 */  

	            MessageDigest m = MessageDigest.getInstance("MD5");  

	              

	            /* Añadir bytes de texto de la contraseña para digerir con MD5. */  

	            m.update(contrasena.getBytes());  

	              

	            /* Convertir el valor hash a bytes */   

	            byte[] bytes = m.digest();  

	              

	            /* El array de bytes tiene bytes en forma decimal. Conversion a formato hexadecimal. */  

	            StringBuilder s = new StringBuilder();  

	            for(int i=0; i< bytes.length ;i++)  

	            {  

	                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  

	            }  

	              

	            /* Completar contraseña hash en formato hexadecimal  */  

	            contrasenaEncriptada = s.toString();  

	        }   

	        catch (NoSuchAlgorithmException e)   

	        {  

	            e.printStackTrace(); 

	        }

		return contrasenaEncriptada;  

	}
}
