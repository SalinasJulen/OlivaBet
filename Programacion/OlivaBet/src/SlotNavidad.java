import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotNavidad extends JFrame implements ActionListener{

    private String[][] emojis;
    private JPanel panelEmojis,panelSur;
    private JLabel lblPuntos;
    JLabel emojiLabel;
    static JButton btnJugar;
	JButton btnVolver;
    public SlotNavidad() {
        setTitle("Slot Haloween");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800); 
        setVisible(true);
        setLocationRelativeTo(null);//para poner centrada la ventana

        emojis = new String[][]{
        	{"🎅", "🎁", "🔔", "🎄", "🌟"},
            {"☃️", "🧦", "🕯️", "🛷", "🦌"} 
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
        int totalRegalo = 0,totalCampana = 0,totalEstrella = 0, totalPino = 0,totalSanta = 0, totalReno = 0,totalTrineo = 0,totalMuneco=0,totalCalcetines=0,totalVela=0; 
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int aleatorioFila = (int) (Math.random() * emojis.length);
                int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
                emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30)); 
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
                
      
                if (emojis[aleatorioFila][aleatorioColumna].equals("🕯️")) {
                    totalVela++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🎅")) {
                    totalSanta++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("☃️")) {
                    totalMuneco++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🧦")) {
                    totalCalcetines++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🛷")) {
                    totalTrineo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🦌")) {
                    totalReno++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🎄")) {
                    totalPino++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🌟")) {
                    totalEstrella++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🔔")) {
                    totalCampana++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🎁")) {
                	totalRegalo++;
                }
                
            }
        }

        if (totalCalcetines  == 8) {
            sumarPuntos(5);
        }
        if (totalCalcetines == 9) {
            sumarPuntos(10);
        }
        if (totalCalcetines == 10) {
            sumarPuntos(20);
        }
        if (totalCalcetines == 11) {
            sumarPuntos(40);
        }
        if (totalCalcetines >= 12) {
            sumarPuntos(70);
        }
        
        if (totalVela == 8) {
            sumarPuntos(10);
        }
        if (totalVela == 9) {
            sumarPuntos(20);
        }
        if (totalVela == 10) {
            sumarPuntos(40);
        }
        if (totalVela == 11) {
            sumarPuntos(80);
        }
        if (totalVela >= 12) {
            sumarPuntos(140);
        }
   
        
        if (totalPino == 8) {
            sumarPuntos(15);
        }
        if (totalPino == 9) {
            sumarPuntos(30);
        }
        if (totalPino == 10) {
            sumarPuntos(60);
        }
        if (totalPino == 11) {
            sumarPuntos(120);
        }
        if (totalPino >= 12) {
            sumarPuntos(210);
        }
        
        
        if (totalCampana == 8) {
            sumarPuntos(20);
        }
        if (totalCampana == 9) {
            sumarPuntos(40);
        }
        if (totalCampana == 10) {
            sumarPuntos(80);
        }
        if (totalCampana == 11) {
            sumarPuntos(160);
        }
        if (totalCampana >= 12) {
            sumarPuntos(280);
        }
        
        
        if (totalRegalo== 8) {
            sumarPuntos(25);
        }
        if (totalRegalo == 9) {
            sumarPuntos(50);
        }
        if (totalRegalo == 10) {
            sumarPuntos(100);
        }
        if (totalRegalo == 11) {
            sumarPuntos(200);
        }
        if (totalRegalo >= 12) {
            sumarPuntos(235);
        }
        
        
        if (totalMuneco== 8) {
            sumarPuntos(30);
        }
        if (totalMuneco == 9) {
            sumarPuntos(60);
        }
        if (totalMuneco == 10) {
            sumarPuntos(120);
        }
        if (totalMuneco == 11) {
            sumarPuntos(240);
        }
        if (totalMuneco >= 12) {
            sumarPuntos(420);
        }
        
        
        if (totalEstrella== 8) {
            sumarPuntos(35);
        }
        if (totalEstrella == 9) {
            sumarPuntos(70);
        }
        if (totalEstrella == 10) {
            sumarPuntos(140);
        }
        if (totalEstrella == 11) {
            sumarPuntos(280);
        }
        if (totalEstrella >= 12) {
            sumarPuntos(490);
        }
        
        
        
        if (totalTrineo== 8) {
            sumarPuntos(40);
        }
        if (totalTrineo == 9) {
            sumarPuntos(80);
        }
        if (totalTrineo == 10) {
            sumarPuntos(160);
        }
        if (totalTrineo == 11) {
            sumarPuntos(320);
        }
        if (totalTrineo >= 12) {
            sumarPuntos(560);
        }
        
        
        
        if (totalReno== 8) {
            sumarPuntos(45);
        }
        if (totalReno == 9) {
            sumarPuntos(90);
        }
        if (totalReno == 10) {
            sumarPuntos(180);
        }
        if (totalReno == 11) {
            sumarPuntos(360);
        }
        if (totalReno >= 12) {
            sumarPuntos(630);
        }
        
        
        
        if (totalSanta== 8) {
            sumarPuntos(50);
        }
        if (totalSanta == 9) {
            sumarPuntos(100);
        }
        if (totalSanta == 10) {
            sumarPuntos(200);
        }
        if (totalSanta == 11) {
            sumarPuntos(400);
        }
        if (totalSanta >= 12) {
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
        new SlotNavidad();
      
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
