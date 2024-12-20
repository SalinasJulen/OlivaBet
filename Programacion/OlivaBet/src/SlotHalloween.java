import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotHalloween extends JFrame implements ActionListener{

    private String[][] emojis;
    private JPanel panelEmojis,panelSur;
    private JLabel lblPuntos;
    JLabel emojiLabel;
    static JButton btnJugar;
	JButton btnVolver;
    
    public SlotHalloween() {
        setTitle("Slot Haloween");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800); 
        setVisible(true);
        setLocationRelativeTo(null);//para poner centrada la ventana

        emojis = new String[][]{
        	{"🧟‍♂️", "🧙", "🧙‍♀️", "🎃", "👻"},
            {"💀", "🦇", "🧛", "🤡", "🔪"} 
        };
        
       
        lblPuntos = new JLabel (String.valueOf(InicioOlivaBet.puntuacion));        
        panelEmojis = new JPanel(new GridLayout(10, 9));
        panelSur = new JPanel(new GridLayout(2, 1));
        
        add(panelEmojis, BorderLayout.CENTER);
        lblPuntos.setFont(new Font("Verdana", Font.BOLD, 22));
        lblPuntos.setForeground(new Color(94, 16, 23));
        add(lblPuntos, BorderLayout.NORTH);
        
        btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(this); 
        	 
    
      
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(this);        
       
    
        add(panelSur, BorderLayout.SOUTH);
        panelSur.add(btnJugar);
        panelSur.add(btnVolver);
        setVisible(true);
    }

    private void cargarSlot() {
        panelEmojis.removeAll(); 
        int totalBruja = 0,totalBrujo = 0,totalCalabaza = 0, totalMurcielago = 0,totalVampiro = 0, totalZombi = 0,totalPayaso = 0,totalCalavera=0,totalFantasma=0,totalCuchillo=0; 
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int aleatorioFila = (int) (Math.random() * emojis.length);
                int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
                emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30)); 
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
                
      
                if (emojis[aleatorioFila][aleatorioColumna].equals("💀")) {
                    totalCalavera++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🎃")) {
                    totalCalabaza++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("👻")) {
                    totalFantasma++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🔪")) {
                    totalCuchillo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🧟‍♂️")) {
                    totalZombi++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🧙")) {
                    totalBrujo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🧙‍♀️")) {
                    totalBruja++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🤡")) {
                    totalPayaso++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🧛")) {
                    totalVampiro++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🦇")) {
                	totalMurcielago++;
                }
                
            }
        }

        if (totalCalavera == 8) {
            sumarPuntos(5);
        }
        if (totalCalavera == 9) {
            sumarPuntos(10);
        }
        if (totalCalavera == 10) {
            sumarPuntos(20);
        }
        if (totalCalavera == 11) {
            sumarPuntos(40);
        }
        if (totalCalavera >= 12) {
            sumarPuntos(70);
        }
        
        if (totalCuchillo == 8) {
            sumarPuntos(10);
        }
        if (totalCuchillo == 9) {
            sumarPuntos(20);
        }
        if (totalCuchillo == 10) {
            sumarPuntos(40);
        }
        if (totalCuchillo == 11) {
            sumarPuntos(80);
        }
        if (totalCuchillo >= 12) {
            sumarPuntos(140);
        }
   
        
        if (totalMurcielago == 8) {
            sumarPuntos(15);
        }
        if (totalMurcielago == 9) {
            sumarPuntos(30);
        }
        if (totalMurcielago == 10) {
            sumarPuntos(60);
        }
        if (totalMurcielago == 11) {
            sumarPuntos(120);
        }
        if (totalMurcielago >= 12) {
            sumarPuntos(210);
        }
        
        
        if (totalVampiro == 8) {
            sumarPuntos(20);
        }
        if (totalVampiro == 9) {
            sumarPuntos(40);
        }
        if (totalVampiro == 10) {
            sumarPuntos(80);
        }
        if (totalVampiro == 11) {
            sumarPuntos(160);
        }
        if (totalVampiro >= 12) {
            sumarPuntos(280);
        }
        
        
        if (totalFantasma== 8) {
            sumarPuntos(25);
        }
        if (totalFantasma == 9) {
            sumarPuntos(50);
        }
        if (totalFantasma == 10) {
            sumarPuntos(100);
        }
        if (totalFantasma == 11) {
            sumarPuntos(200);
        }
        if (totalFantasma >= 12) {
            sumarPuntos(235);
        }
        
        
        if (totalZombi== 8) {
            sumarPuntos(30);
        }
        if (totalZombi == 9) {
            sumarPuntos(60);
        }
        if (totalZombi == 10) {
            sumarPuntos(120);
        }
        if (totalZombi == 11) {
            sumarPuntos(240);
        }
        if (totalZombi >= 12) {
            sumarPuntos(420);
        }
        
        
        if (totalBrujo== 8) {
            sumarPuntos(35);
        }
        if (totalBrujo == 9) {
            sumarPuntos(70);
        }
        if (totalBrujo == 10) {
            sumarPuntos(140);
        }
        if (totalBrujo == 11) {
            sumarPuntos(280);
        }
        if (totalBrujo >= 12) {
            sumarPuntos(490);
        }
        
        
        
        if (totalBruja== 8) {
            sumarPuntos(40);
        }
        if (totalBruja == 9) {
            sumarPuntos(80);
        }
        if (totalBruja == 10) {
            sumarPuntos(160);
        }
        if (totalBruja == 11) {
            sumarPuntos(320);
        }
        if (totalBruja >= 12) {
            sumarPuntos(560);
        }
        
        
        
        if (totalCalabaza== 8) {
            sumarPuntos(45);
        }
        if (totalCalabaza == 9) {
            sumarPuntos(90);
        }
        if (totalCalabaza == 10) {
            sumarPuntos(180);
        }
        if (totalCalabaza == 11) {
            sumarPuntos(360);
        }
        if (totalCalabaza >= 12) {
            sumarPuntos(630);
        }
        
        
        
        if (totalPayaso== 8) {
            sumarPuntos(50);
        }
        if (totalPayaso == 9) {
            sumarPuntos(100);
        }
        if (totalPayaso == 10) {
            sumarPuntos(200);
        }
        if (totalPayaso == 11) {
            sumarPuntos(400);
        }
        if (totalPayaso >= 12) {
            sumarPuntos(700);
        }
        if(InicioOlivaBet.puntuacion <850)
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
        new SlotHalloween();
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnJugar) {
		  cargarSlot();
          restarPuntos(850); 
		}
		if(e.getSource() == btnVolver)
			new InicioOlivaBet();
		InicioOlivaBet.puntuacion = Integer.parseInt(lblPuntos.getText());
			
	
	
	}
    		
    
}
