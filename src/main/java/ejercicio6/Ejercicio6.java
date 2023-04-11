/**
 * 
 */
package ejercicio6;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * @author elena-01
 *
 */
public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JTextField tf2;
	private JTextField tf1;
	/**
	 * 
	 */
	public Ejercicio6() {
		setTitle("EJERCICIO 5: IMC Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("Altura(metros)");
		lbl1.setBounds(21, 37, 96, 14);
		lbl1.setAutoscrolls(true);
		contentPane.add(lbl1);
		
		tf1 = new JTextField();
		tf1.setBounds(127, 34, 62, 20);
		tf1.setColumns(10);
		contentPane.add(tf1);
		
		JLabel lbl2 = new JLabel("Peso(kg)");
		lbl2.setBounds(214, 37, 66, 14);
		lbl2.setAutoscrolls(true);
		contentPane.add(lbl2);
		
		tf2 = new JTextField();
		tf2.setBounds(290, 34, 62, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("IMC");
		lblNewLabel.setBounds(224, 65, 48, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(290, 61, 62, 22);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.setBounds(71, 61, 118, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(String.valueOf(Double.parseDouble(tf1.getText())/(Double.parseDouble(tf2.getText())*Double.parseDouble(tf2.getText()))));
			}
		});
		contentPane.add(btnNewButton);
		
	
	}
}
