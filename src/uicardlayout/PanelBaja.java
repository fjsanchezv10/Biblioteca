package uicardlayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelBaja extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelBaja() {
		setLayout(null);
		
		JLabel lblPaneolDeBajas = new JLabel("Paneol de bajas");
		lblPaneolDeBajas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaneolDeBajas.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPaneolDeBajas.setBounds(165, 37, 380, 73);
		add(lblPaneolDeBajas);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(65, 185, 69, 20);
		add(lblId);
		
		textField = new JTextField();
		textField.setBounds(162, 185, 146, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnDarDeBaja = new JButton("Dar de baja");
		btnDarDeBaja.setBounds(621, 393, 115, 29);
		add(btnDarDeBaja);

	}

}
