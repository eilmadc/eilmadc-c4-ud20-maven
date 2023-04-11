/**
 * C4-UD20-MAVEN
 */
package ejercicio5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author elena-01
 *
 */
public class Ejercicio5 extends JFrame implements MouseListener{
	private JPanel contentPane;
	private JTextArea tf1;
	private JTextArea textField;

	/**
	 * 
	 */
	public Ejercicio5() {
		setTitle("EJERCICIO 5: MouseEvents");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 280);
		getContentPane().setLayout(null);

		JButton btn1 = new JButton("Limpiar");
		btn1.setBounds(221, 0, 89, 23);
		getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf1.setText("");
			}
		});

		tf1 = new JTextArea();
		tf1.setBounds(0, 28, 525, 213);
		getContentPane().add(tf1);
		tf1.setColumns(10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		tf1.addMouseListener(this);
		addMouseListener(this);

	}

	public void mousePressed(MouseEvent e) {
		saySomething("Mouse pressed; # of clicks: " + e.getClickCount(), e);
	}

	public void mouseReleased(MouseEvent e) {
		saySomething("Mouse released; # of clicks: " + e.getClickCount(), e);
	}

	public void mouseEntered(MouseEvent e) {
		saySomething("Mouse entered", e);
	}

	public void mouseExited(MouseEvent e) {
		saySomething("Mouse exited", e);
	}

	public void mouseClicked(MouseEvent e) {
		saySomething("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
	}

	void saySomething(String eventDescription, MouseEvent e) {
		tf1.append(eventDescription + " detected on " + e.getComponent().getClass().getName() + "."+"\n" );
	}
}
