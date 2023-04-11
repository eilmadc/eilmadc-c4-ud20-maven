/**
 * C4-UD20-MAVEN
 */
package ejercicio1;

/**
 * @author elena-01
 *
 */
	import javax.swing.JOptionPane;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JTextField;
	import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

	public class Ejercicio1 extends JFrame {

		private JPanel contentPane;
		private JLabel lbl1;

		/**
		 * Create the frame.
		 */
		public Ejercicio1() {
			setTitle("EJERCICIO 1: Basics");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 402, 232);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setVisible(true);
			
			
			/**
			 * Boton Bienvenida
			 */
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lbl1 = new JLabel("Usuario");
			lbl1.setAutoscrolls(true);
			lbl1.setBounds(31, 29, 99, 14);
			contentPane.add(lbl1);
		}
}
