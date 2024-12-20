import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotJoyas extends JFrame implements ActionListener{

    private String[][] emojis;
    private JPanel panelEmojis,panelSur;
    private JLabel lblPuntos;
    JLabel emojiLabel;
    static JButton btnJugar;
	JButton btnVolver;

    public SlotJoyas() {
        setTitle("Slot Joyas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 400); 
        setVisible(true);


        emojis = new String[][]{
        	{"💎", "💍", "📿", "👑", "📯"},
            {"💵", "💰", "🪙", "K", "10"} 
        };
        
       
      
       
        lblPuntos = new JLabel (String.valueOf(InicioOlivaBet.puntuacion));        
        panelEmojis = new JPanel(new GridLayout(4, 9));
        
        
        add(panelEmojis, BorderLayout.CENTER);
        
        
        lblPuntos.setFont(new Font("Verdana",Font.BOLD,22));
        lblPuntos.setForeground(new Color (94, 16, 23));
        add(lblPuntos,BorderLayout.NORTH);
        panelSur = new JPanel(new GridLayout(2, 1));
        add(panelSur, BorderLayout.SOUTH);
        
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(this); 
        
        btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(this); 
        
        panelSur.add(btnJugar);
        panelSur.add(btnVolver);
     
        setVisible(true);
    }


    private void cargarSlot() {
        panelEmojis.removeAll(); 
        int totalBillete= 0,totalBolsa = 0,totalMoneda = 0, totalAnillo = 0,totalDiamante = 0, totalColgante = 0,totalK = 0,totalDiez=0,totalTrompeta=0,totalCorona=0; 
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                int aleatorioFila = (int) (Math.random() * emojis.length);
                int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
                emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30)); 
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
                
      
                if (emojis[aleatorioFila][aleatorioColumna].equals("🪙")) {
                    totalMoneda++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("K")) {
                    totalK++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("10")) {
                    totalDiez++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("💵")) {
                    totalBillete++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("💰")) {
                    totalBolsa++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("📯")) {
                    totalTrompeta++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("👑")) {
                    totalCorona++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("📿")) {
                    totalColgante++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("💍")) {
                    totalAnillo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("💎")) {
                    totalDiamante++;
                }
                
            }
        }

        if(totalDiez == 6) {
        	sumarPuntos(5);
        }
        if(totalDiez == 7) {
        	sumarPuntos(10);
        }
        if(totalDiez == 8) {
        	sumarPuntos(25);
        }
        if(totalDiez >= 9) {
        	sumarPuntos(50);
        }


        if(totalK == 6) {
        	sumarPuntos(10);
        }
        if(totalK == 7) {
        	sumarPuntos(20);
        }
        if(totalK == 8) {
        	sumarPuntos(50);
        }
        if(totalK >= 9) {
        	sumarPuntos(100);
        }
        
        
        
        if(totalTrompeta == 6) {
        	sumarPuntos(15);
        }
        if(totalTrompeta == 7) {
        	sumarPuntos(30);
        }
        if(totalTrompeta == 8) {
        	sumarPuntos(75);
        }
        if(totalTrompeta >= 9) {
        	sumarPuntos(150);
        }
        
        
        
        if(totalBillete == 6) {
        	sumarPuntos(20);
        }
        if(totalBillete == 7) {
        	sumarPuntos(40);
        }
        if(totalBillete == 8) {
        	sumarPuntos(100);
        }
        if(totalBillete >= 9) {
        	sumarPuntos(200);
        }
        
        
        
        
        if(totalBolsa == 6) {
        	sumarPuntos(25);
        }
        if(totalBolsa == 7) {
        	sumarPuntos(50);
        }
        if(totalBolsa == 8) {
        	sumarPuntos(125);
        }
        if(totalBolsa >= 9) {
        	sumarPuntos(250);
        }
        
        
        if(totalMoneda == 6) {
        	sumarPuntos(30);
        }
        if(totalMoneda == 7) {
        	sumarPuntos(60);
        }
        if(totalMoneda == 8) {
        	sumarPuntos(150);
        }
        if(totalMoneda >= 9) {
        	sumarPuntos(300);
        }
        
        
        
        
        if(totalColgante == 6) {
        	sumarPuntos(35);
        }
        if(totalColgante == 7) {
        	sumarPuntos(70);
        }
        if(totalColgante == 8) {
        	sumarPuntos(175);
        }
        if(totalColgante >= 9) {
        	sumarPuntos(350);
        }
        
        
        if(totalAnillo == 6) {
        	sumarPuntos(45);
        }
        if(totalAnillo == 7) {
        	sumarPuntos(80);
        }
        if(totalAnillo == 8) {
        	sumarPuntos(200);
        }
        if(totalAnillo >= 9) {
        	sumarPuntos(400);
        }
        
      
        
        if(totalDiamante == 6) {
        	sumarPuntos(45);
        }
        if(totalDiamante == 7) {
        	sumarPuntos(90);
        }
        if(totalDiamante == 8) {
        	sumarPuntos(225);
        }
        if(totalDiamante >= 9) {
        	sumarPuntos(450);
        }
        
        
        if(totalCorona == 6) {
        	sumarPuntos(50);
        }
        if(totalCorona == 7) {
        	sumarPuntos(100);
        }
        if(totalCorona == 8) {
        	sumarPuntos(250);
        }
        if(totalCorona >= 9) {
        	sumarPuntos(500);
        }
        
    	if(InicioOlivaBet.puntuacion <105)
        	btnJugar.setEnabled(false);
        
        panelEmojis.revalidate();
        panelEmojis.repaint();
    }

    private void restarPuntos(int puntos) {
        int puntosActuales = Integer.parseInt(lblPuntos.getText());
        int nuevosPuntos = puntosActuales - puntos;
        lblPuntos.setText(String.valueOf(nuevosPuntos));
    }
    
    private void sumarPuntos(int puntos) {
        int puntosActuales = Integer.parseInt(lblPuntos.getText());
        int nuevosPuntos = puntosActuales + puntos;
        lblPuntos.setText(String.valueOf(nuevosPuntos));
    }

    public static void main(String[] args) {
        new SlotJoyas();
    	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnJugar) {
			  cargarSlot();
	          restarPuntos(105); 
			}
			if(e.getSource() == btnVolver)
			
				new InicioOlivaBet();
			InicioOlivaBet.puntuacion = Integer.parseInt(lblPuntos.getText());
		
			
		
	}	
    
}
