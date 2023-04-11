/**
 * C4-UD20-MAVEN
 */
package ejercicio7;

/**
 * @author elena-01
 *
 */

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * @author elena-01
 *
 */
public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField tf1;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public Ejercicio7() {
		setTitle("EJERCICIO 7: Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("Cantidad a convertir");
		lbl1.setBounds(31, 29, 154, 14);
		contentPane.add(lbl1);

		tf1 = new JTextField();
		tf1.setBounds(137, 26, 96, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);

		btnNewButton = new JButton("Euros a ptas");
		btnNewButton.setBounds(142, 69, 111, 30);
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + tf1.getText() + "!", "Bienvenida",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(btnNewButton);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(259, 29, 111, 14);
		contentPane.add(lblResultado);

		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCambiar.setFont(new Font("Candara", Font.BOLD, 15));
		btnCambiar.setBounds(295, 69, 111, 30);
		contentPane.add(btnCambiar);

		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(SystemColor.inactiveCaption));
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(330, 29, 76, 20);
		contentPane.add(textPane);
	}
}
