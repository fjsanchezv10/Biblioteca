package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSocio = new JLabel("socio");
		lblSocio.setBounds(50, 138, 69, 20);
		contentPane.add(lblSocio);
		
		textField = new JTextField();
		textField.setBounds(191, 135, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLibr = new JLabel("libr");
		lblLibr.setBounds(39, 235, 126, 20);
		contentPane.add(lblLibr);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 232, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPrestar = new JButton("Prestar");
		btnPrestar.setBounds(432, 293, 115, 29);
		contentPane.add(btnPrestar);
	}
}
