/**
 * 
 */
package ejercicio3;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * @author elena-01
 *
 */
public class Ejercicio3 extends JFrame {
	
	int countBtn1=0;
	int countBtn2=0;
	/**
	 * 
	 */
	public Ejercicio3() {
		setTitle("EJERCICIO3: Click Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(100, 100, 402, 232);
		
		JLabel lbl1 = new JLabel("Boton1:");
		lbl1.setBounds(42, 60, 148, 20);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl1);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(39, 115, 151, 20);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countBtn1++;
				lbl1.setText(btn1.getText()+": "+ countBtn1 +" veces");
			}
		});
		
		JLabel lbl2 = new JLabel("Boton 2:");
		lbl2.setBounds(221, 60,155, 20);
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl2);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(221, 114, 134, 23);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countBtn2++;
				lbl2.setText(btn2.getText()+": "+ countBtn2 +" veces");
			}
		});
		getContentPane().add(btn2);
	}

}
