import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotAnimales extends JFrame implements ActionListener{

    private String[][] emojis;
    private JPanel panelEmojis,panelSur;
    private JLabel lblPuntos,emojiLabel;
    static JButton btnJugar;
	JButton btnVolver;
    public SlotAnimales() {
        setTitle("Slot Animales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); 
        setVisible(true);
        setLocationRelativeTo(null);//para poner centrada la ventana

        emojis = new String[][]{
        	{"🐮", "🐃", "🦢", "🐶", "🐺"},
            {"🐻", "🐴", "🐘", "🐯", "🐌"} 
        };
        
       
      
        lblPuntos = new JLabel (String.valueOf(InicioOlivaBet.puntuacion));        
        panelEmojis = new JPanel(new GridLayout(8, 7));
        
        
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
        int totalOca = 0,totalVaca = 0,totalBufalo = 0, totalPerro = 0,totalOso = 0, totalElefante = 0,totalCaballo = 0,totalCaracol=0,totalTigre=0,totalZorro=0; 
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int aleatorioFila = (int) (Math.random() * emojis.length);
                int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
                emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30)); 
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
                
      
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐌")) {
                    totalCaracol++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐺")) {
                    totalZorro++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐘")) {
                    totalElefante++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐴")) {
                    totalCaballo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐶")) {
                    totalPerro++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐃")) {
                    totalBufalo++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐻")) {
                    totalOso++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐯")) {
                    totalTigre++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🐮")) {
                    totalVaca++;
                }
                if (emojis[aleatorioFila][aleatorioColumna].equals("🦢")) {
                    totalOca++;
                }
                
            }
        }

        if (totalOca == 5) {
            sumarPuntos(50);
        }
        if (totalOca == 6) {
            sumarPuntos(100);
        }
        if (totalOca == 7) {
            sumarPuntos(150);
        }
        if (totalOca >= 8) {
            sumarPuntos(200);
        }
        
        
        
        if (totalCaracol == 5) {
            sumarPuntos(5);
        }
        if (totalCaracol == 6) {
            sumarPuntos(10);
        }
        if (totalCaracol == 7) {
            sumarPuntos(15);
        }
        if (totalCaracol >= 8) {
            sumarPuntos(20);
        }
        
        
        if (totalZorro == 5) {
            sumarPuntos(10);
        }
        if (totalZorro == 6) {
            sumarPuntos(20);
        }
        if (totalZorro == 7) {
            sumarPuntos(30);
        }
        if (totalZorro >= 8) {
            sumarPuntos(40);
        }
        
        
        
        if (totalElefante == 5) {
            sumarPuntos(15);
        }
        if (totalElefante == 6) {
            sumarPuntos(30);
        }
        if (totalElefante == 7) {
            sumarPuntos(45);
        }
        if (totalElefante >= 8) {
            sumarPuntos(60);
        }
        
        if (totalCaballo == 5) {
            sumarPuntos(20);
        }
        if (totalCaballo == 6) {
            sumarPuntos(40);
        }
        if (totalCaballo == 7) {
            sumarPuntos(60);
        }
        if (totalCaballo >= 8) {
            sumarPuntos(80);
        }
        
        if (totalPerro == 5) {
            sumarPuntos(25);
        }
        if (totalPerro == 6) {
            sumarPuntos(50);
        }
        if (totalPerro == 7) {
            sumarPuntos(75);
        }
        if (totalPerro >= 8) {
            sumarPuntos(100);
        }
        
        if (totalBufalo == 5) {
            sumarPuntos(30);
        }
        if (totalBufalo == 6) {
            sumarPuntos(60);
        }
        if (totalBufalo == 7) {
            sumarPuntos(90);
        }
        if (totalBufalo >= 8) {
            sumarPuntos(120);
        }
        
        
        if (totalOso == 5) {
            sumarPuntos(35);
        }
        if (totalOso == 6) {
            sumarPuntos(70);
        }
        if (totalOso == 7) {
            sumarPuntos(105);
        }
        if (totalOso >= 8) {
            sumarPuntos(140);
        }
        
        if (totalTigre == 5) {
            sumarPuntos(40);
        }
        if (totalTigre == 6) {
            sumarPuntos(80);
        }
        if (totalTigre == 7) {
            sumarPuntos(120);
        }
        if (totalTigre >= 8) {
            sumarPuntos(160);
        }
        
        
        if (totalVaca == 5) {
            sumarPuntos(45);
        }
        if (totalVaca == 6) {
            sumarPuntos(90);
        }
        if (totalVaca == 7) {
            sumarPuntos(135);
        }
        if (totalVaca >= 8) {
            sumarPuntos(180);
        }
        
        
   
        if(InicioOlivaBet.puntuacion <350)
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
        new SlotAnimales();
        
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnJugar) {
		  cargarSlot();
          restarPuntos(350); 
		}
		if(e.getSource() == btnVolver)
			new InicioOlivaBet();
			InicioOlivaBet.puntuacion = Integer.parseInt(lblPuntos.getText());
	}
    
}