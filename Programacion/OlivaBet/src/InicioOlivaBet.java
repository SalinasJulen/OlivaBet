import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InicioOlivaBet extends JFrame implements ActionListener {
	

	JButton btnFrutas,btnAnimales;
	static JButton btnJoyas;
	static JButton btnHalloween;
	static JButton btnNavidad;
	static JButton btnReset;
	JButton btnCobrar;
	JButton btnRanking;
	JButton btnReiniciar;
	JLabel lbltitulo,lblimgfrutas,lblimganimales,lblimgjoyas,lblimghalloween,lblimgnavidad;
	static JLabel lblPuntos;

	ImageIcon imgfrutas,imganimales,imgjoyas,imghalloween,imgnavidad;
	
	static public int puntuacion = 5000; 
	
	public InicioOlivaBet(){
	      setTitle("Inicio Oliva Bet");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setSize(1000, 800); 
	      setLayout(null);
	      setVisible(true);
	

	      
	      
	      btnFrutas = new JButton ("Juega Frutas");
	      btnFrutas.addActionListener(this);
	      btnAnimales = new JButton ("Juega Animales");
	      btnAnimales.addActionListener(this);
	      btnJoyas = new JButton ("Juega Joyas");
	      btnJoyas.addActionListener(this);
	      btnHalloween = new JButton ("Juega Halloween");
	      btnHalloween.addActionListener(this);
	      btnNavidad = new JButton ("Juega Navidad");
	      btnNavidad.addActionListener(this);
	      
	      
	      btnCobrar = new JButton ("Cobrar");
	      btnCobrar.addActionListener(this);
	      btnRanking = new JButton ("Ver ranking");
	      btnRanking.addActionListener(this);
	      btnReiniciar = new JButton ("Reiniciar");
	      btnReiniciar.addActionListener(this);
	      
	      
	      
	       lbltitulo = new JLabel ("Elige Máquina");
	       imgfrutas = new ImageIcon("frutas.png");
	       lblimgfrutas = new JLabel(imgfrutas);
	       
	       imganimales = new ImageIcon("animales.png");
	       lblimganimales = new JLabel(imganimales);
	       
	       imgjoyas = new ImageIcon("joyas.png");
	       lblimgjoyas = new JLabel(imgjoyas);
	       
	       imghalloween = new ImageIcon("halloween.png");
	       lblimghalloween = new JLabel(imghalloween);
	       
	       imgnavidad = new ImageIcon("navidad.png");
	       lblimgnavidad = new JLabel(imgnavidad);
	     
	       lblPuntos = new JLabel (String.valueOf(puntuacion));
	    
	       add(lblPuntos);
	       
	       
	       
	       lblPuntos.setSize(200,50);
	       lblPuntos.setLocation(120,50);
	       
	       lblPuntos.setFont(new Font("Verdana", Font.BOLD, 22));
	       lblPuntos.setForeground(new Color(94, 16, 23));
	       
	       
	       add(btnFrutas);
	       btnFrutas.setSize(200,100);
	       btnFrutas.setLocation(70,180);
	       
	       add(btnAnimales);
	       btnAnimales.setSize(200,100);
	       btnAnimales.setLocation(370,180);
	       
	       add(btnJoyas);
	       btnJoyas.setSize(200,100);
	       btnJoyas.setLocation(670,180);
	       
	       add(btnHalloween);
	       btnHalloween.setSize(200,100);
	       btnHalloween.setLocation(70,500);
	       
	       
	       add(btnNavidad);
	       btnNavidad.setSize(200,100);
	       btnNavidad.setLocation(670,500);
	       
	       
	       add(btnReiniciar);
	       btnReiniciar.setSize(200,100);
	       btnReiniciar.setLocation(670,50);
	       
	       add(btnCobrar);
	       btnCobrar.setSize(300,100);
	       btnCobrar.setLocation(100,630);
	       
	       add(btnRanking);
	       btnRanking.setSize(300,100);
	       btnRanking.setLocation(500,630);
	       
	       lbltitulo.setFont(new Font("Arial", Font.BOLD, 25));
	       lbltitulo.setForeground(new Color (3, 169, 252));
	       
	       add(lbltitulo);
	       
	       lbltitulo.setSize(200,200);
	       lbltitulo.setLocation(400,1);
	       
	       add(lblimgfrutas);
	       
	       lblimgfrutas.setSize(100,190);
	       lblimgfrutas.setLocation(110,290);
	       
	       
	       add(lblimganimales);
	       lblimganimales.setSize(100,150);
	       lblimganimales.setLocation(410,290);
	       
	       add(lblimgjoyas);
	       lblimgjoyas.setSize(200,200);
	       lblimgjoyas.setLocation(670,270);
	       
	       add(lblimghalloween);
	       lblimghalloween.setSize(150,150);
	       lblimghalloween.setLocation(310,470);
	       
	       add(lblimgnavidad);
	       
	       lblimgnavidad.setSize(150,150);
	       lblimgnavidad.setLocation(490,470);
	       
	       
	 
	      
	      
	      
	  	 decorarBoton(btnFrutas);
	  	 decorarBoton(btnAnimales);
	  	 decorarBoton(btnJoyas);
	  	 decorarBoton(btnHalloween);
	  	 decorarBoton(btnNavidad);
	 	
	  	decorarBoton2(btnCobrar);
	  	decorarBoton2(btnRanking);
	  	decorarBoton2(btnReiniciar);
	  	
		if(puntuacion<8000)
			btnJoyas.setEnabled(false);
		if(puntuacion<15000) {
			btnHalloween.setEnabled(false);
			btnNavidad.setEnabled(false);
		}
			if(InicioOlivaBet.puntuacion <350)
	        	btnFrutas.setEnabled(false);
			if(InicioOlivaBet.puntuacion <350)
	        	btnAnimales.setEnabled(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
			
	  
	     
		if(e.getSource()==btnFrutas) {
			new SlotFrutas();
			setVisible(false);
		}
		if(e.getSource()==btnAnimales) {
			new SlotAnimales();
			setVisible(false);
		}
		if(e.getSource()==btnJoyas) {
			new SlotJoyas();
			setVisible(false);
		}
		if(e.getSource()==btnHalloween) {
			new SlotHalloween();
			setVisible(false);
		}
	
		if(e.getSource()==btnNavidad) {
			new SlotNavidad();
			setVisible(false);		}
		
		
		if(e.getSource()==btnRanking) {
			verRanking();		
			}
		if(e.getSource()==btnCobrar) {
			Cobro();
		}
		if(e.getSource()==btnReiniciar) {
			puntuacion = 5000;
			lblPuntos.setText(String.valueOf(puntuacion));
		}
	}

	public static void main(String[] args) {
		
	
		
		new InicioOlivaBet();
		puntuacion = Integer.parseInt(lblPuntos.getText());
		lblPuntos.setText(String.valueOf(puntuacion));
	}
	
	 private void decorarBoton(JButton boton) {
		 boton.setBackground(new Color(62, 95, 231)); 
		 boton.setForeground(Color.WHITE); 
		 boton.setFocusPainted(false); // Desactivamos el pintado de enfoque al hacer clic
		 boton.setFont(new Font("Arial", Font.BOLD, 14)); 

	    }
	 
	 private void decorarBoton2(JButton boton) {
		 boton.setBackground(new Color(231, 159, 62)); 
		 boton.setForeground(Color.WHITE); 
		 boton.setFocusPainted(false); // Desactivamos el pintado de enfoque al hacer clic
		 boton.setFont(new Font("Arial", Font.BOLD, 14)); 
		 
		
	       
	    }
	 protected void verRanking() {
		    try {
		        Connection conn = DriverManager.getConnection("jdbc:mysql://databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com:3306/olivabet", "crupiermaestro", "sasamkdojojfaojjokefju9e");
		        Statement stmt = conn.createStatement();
		        String sql = "SELECT nombreUsuario, puntos FROM usuarios ORDER BY puntos DESC LIMIT 5";
		        ResultSet rs = stmt.executeQuery(sql);

		        String ranking = "Top 5 Usuarios:\n\n";
		        
		        int posicion = 1;
		        while (rs.next()) {
		            String nombreUsuario = rs.getString("nombreUsuario");
		            int puntos = rs.getInt("puntos");

		            ranking += posicion + ". " + nombreUsuario + ": " + puntos + " puntos\n";
		            posicion++;
		        }

		        JOptionPane.showMessageDialog(this, ranking, "Top 5", JOptionPane.INFORMATION_MESSAGE);

		        rs.close();
		        stmt.close();
		        conn.close();
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(this, "Error al obtener el ranking: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}



	 protected void Cobro() {
		    try {
		      
		        int nuevaPuntuacion = puntuacion;

		        String nombreUsuario = RegistroOlivaBet.txtnombreUsuario.getText();

		        Connection conn = DriverManager.getConnection("jdbc:mysql://databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com:3306/olivabet", "crupiermaestro", "sasamkdojojfaojjokefju9e");

		        String sql = "UPDATE usuarios SET puntos = " + nuevaPuntuacion + " WHERE nombreUsuario = '" + nombreUsuario + "'";
		        
		        Statement stmt = conn.createStatement();

		        int filasActualizadas = stmt.executeUpdate(sql);

		        if (filasActualizadas > 0) {
		            JOptionPane.showMessageDialog(this, "Se han actualizado los puntos del jugador", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(this, "No se han actualizado los puntos del jugador", "Error de actualización", JOptionPane.ERROR_MESSAGE);
		        }

		        stmt.close();
		        conn.close();
		       
		    } catch (Exception e) {
		        System.out.println("Error al actualizar los puntos del jugador: " + e);
		        JOptionPane.showMessageDialog(this, "Error al actualizar los puntos del jugador", "Error de actualización", JOptionPane.ERROR_MESSAGE);
		    }
		}


	 

}
