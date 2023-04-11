/**
 * C4-UD20-MAVEN
 */
package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingConstants;

/**
 * @author elena-01
 *
 */
public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField tf1;

	/**
	 * 
	 */
	public Ejercicio4() {
		setTitle("EJERCICIO 4: Events");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		/**
		 * Boton Bienvenida
		 */
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("Eventos:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1.setAutoscrolls(true);
		lbl1.setBounds(17, 11, 99, 14);
		contentPane.add(lbl1);

		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.TRAILING);
		tf1.setLocation(126, 11);
		tf1.setSize(389, 219);
		tf1.setAutoscrolls(true);
		contentPane.add(tf1);

		this.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				tf1.setText("\n windowOpened\n"+ tf1.getText() );
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n windowClosed\n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowIconified(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n windowIconified\n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowDeiconified(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n windowDeiconified\n");
			}
		});		
		this.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n  windowActivated \n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowDeactivated(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n  windowDeactivated \n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowStateChanged(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n  windowStateChanged \n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowGainedFocus(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n  windowGainedFocus \n");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowLostFocus(WindowEvent e) {
				tf1.setText(tf1.getText() + "\n windowLostFocus \n");
			}
		});
		
	}
}
