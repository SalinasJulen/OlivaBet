import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotFrutas extends JFrame implements ActionListener {

	private String[][] emojis;
	private JPanel panelEmojis, panelSur;
	private JLabel lblPuntos, emojiLabel;
	static JButton btnJugar;
	JButton btnVolver;

	public SlotFrutas() {
		setTitle("Slot Frutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		setLocationRelativeTo(null);// para poner centrada la ventana

		emojis = new String[][] { { "🍓", "🍈", "🍉", "🍇", "🍒" }, { "🍊", "🥝", "🍌", "🥥", "🍍" } };

		lblPuntos = new JLabel(String.valueOf(InicioOlivaBet.puntuacion));
		panelEmojis = new JPanel(new GridLayout(8, 7));
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
		int totalFresas = 0, totalPomelo = 0, totalUva = 0, totalPina = 0, totalNaranja = 0, totalLimon = 0,
				totalCoco = 0, totalBanana = 0, totalSandia = 0, totalCereza = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				int aleatorioFila = (int) (Math.random() * emojis.length);
				int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
				emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
				emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
				emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				panelEmojis.add(emojiLabel);

				if (emojis[aleatorioFila][aleatorioColumna].equals("🍓")) {
					totalFresas++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍈")) {
					totalPomelo++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍉")) {
					totalSandia++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍇")) {
					totalUva++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍍")) {
					totalPina++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍒")) {
					totalCereza++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍊")) {
					totalLimon++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🥝")) {
					totalNaranja++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🍌")) {
					totalBanana++;
				}
				if (emojis[aleatorioFila][aleatorioColumna].equals("🥥")) {
					totalCoco++;
				}

			}
		}

		if (totalFresas == 5) {
			sumarPuntos(50);

		}
		if (totalFresas == 6) {
			sumarPuntos(100);
		}
		if (totalFresas == 7) {
			sumarPuntos(150);
		}
		if (totalFresas >= 8) {
			sumarPuntos(200);
		}

		if (totalPomelo == 5) {
			sumarPuntos(5);
		}
		if (totalPomelo == 6) {
			sumarPuntos(10);
		}
		if (totalPomelo == 7) {
			sumarPuntos(15);
		}
		if (totalPomelo >= 8) {
			sumarPuntos(20);
		}

		if (totalLimon == 5) {
			sumarPuntos(10);
		}
		if (totalLimon == 6) {
			sumarPuntos(20);
		}
		if (totalLimon == 7) {
			sumarPuntos(30);
		}
		if (totalLimon >= 8) {
			sumarPuntos(40);
		}

		if (totalNaranja == 5) {
			sumarPuntos(15);
		}
		if (totalNaranja == 6) {
			sumarPuntos(30);
		}
		if (totalNaranja == 7) {
			sumarPuntos(45);
		}
		if (totalNaranja >= 8) {
			sumarPuntos(60);
		}

		if (totalPina == 5) {
			sumarPuntos(20);
		}
		if (totalPina == 6) {
			sumarPuntos(40);
		}
		if (totalPina == 7) {
			sumarPuntos(60);
		}
		if (totalPina >= 8) {
			sumarPuntos(80);
		}

		if (totalBanana == 5) {
			sumarPuntos(25);
		}
		if (totalBanana == 6) {
			sumarPuntos(50);
		}
		if (totalBanana == 7) {
			sumarPuntos(75);
		}
		if (totalBanana >= 8) {
			sumarPuntos(100);
		}

		if (totalSandia == 5) {
			sumarPuntos(30);
		}
		if (totalSandia == 6) {
			sumarPuntos(60);
		}
		if (totalSandia == 7) {
			sumarPuntos(90);
		}
		if (totalSandia >= 8) {
			sumarPuntos(120);
		}

		if (totalCoco == 5) {
			sumarPuntos(35);
		}
		if (totalCoco == 6) {
			sumarPuntos(70);
		}
		if (totalCoco == 7) {
			sumarPuntos(105);
		}
		if (totalCoco >= 8) {
			sumarPuntos(140);
		}

		if (totalUva == 5) {
			sumarPuntos(40);
		}
		if (totalUva == 6) {
			sumarPuntos(80);
		}
		if (totalUva == 7) {
			sumarPuntos(120);
		}
		if (totalUva >= 8) {
			sumarPuntos(160);
		}

		if (totalCereza == 5) {
			sumarPuntos(45);
		}
		if (totalCereza == 6) {
			sumarPuntos(90);
		}
		if (totalCereza == 7) {
			sumarPuntos(135);
		}
		if (totalCereza >= 8) {
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
		new SlotFrutas();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnJugar) {
			cargarSlot();
			restarPuntos(350);
		}
		if (e.getSource() == btnVolver)
			new InicioOlivaBet();
			InicioOlivaBet.puntuacion = Integer.parseInt(lblPuntos.getText());

	}

}
