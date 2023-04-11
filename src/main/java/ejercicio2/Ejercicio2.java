/**
 * C4-UD20-MAVEN
 */
package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

/**
 * @author elena-01
 *
 */
public class Ejercicio2 extends JFrame {

	/**
	 * 
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAutoRequestFocus(false);
		setTitle("EJERCICIO2: Basics with event");
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 250, 150));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 410, 100);
		setVisible(true);

		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setBounds(24, 24, 157, 14);
		panel.add(lblNewLabel);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(191, 22, 77, 19);
		panel.add(btn1);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: "+ btn1.getText());
			}
		});
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(296, 22, 77, 19);
		panel.add(btn2);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: "+ btn2.getText());
			}
		});
	}

}
