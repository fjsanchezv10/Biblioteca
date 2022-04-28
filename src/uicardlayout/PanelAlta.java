package uicardlayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelAlta extends JPanel {
	private JTextField txtNombreAlta;
	private JTextField txtDireccionAlta;
	private JButton btnDarAltaAlta;



	/**
	 * Create the panel.
	 */
	public PanelAlta() {
		
		JLabel lblPanelDeAltas = new JLabel("Panel de Altas");
		
		JLabel lblNombre = new JLabel("nombre");
		
		txtNombreAlta = new JTextField();
		txtNombreAlta.setColumns(10);
		
		JLabel lblDireccion = new JLabel("direccion");
		
		txtDireccionAlta = new JTextField();
		txtDireccionAlta.setColumns(10);
		
		btnDarAltaAlta = new JButton("Dar de Alta");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(99)
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(txtNombreAlta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(201)
							.addComponent(lblPanelDeAltas, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(82)
							.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(txtDireccionAlta, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(70, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(594, Short.MAX_VALUE)
					.addComponent(btnDarAltaAlta, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(112))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(lblPanelDeAltas)
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNombreAlta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(104)
							.addComponent(txtDireccionAlta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(93)
							.addComponent(lblDireccion)))
					.addGap(76)
					.addComponent(btnDarAltaAlta)
					.addGap(126))
		);
		setLayout(groupLayout);

	}
	public JTextField getTxtNombreAlta() {
		return txtNombreAlta;
	}

	public JTextField getTxtDireccionAlta() {
		return txtDireccionAlta;
	}

	public JButton getBtnDarAltaAlta() {
		return btnDarAltaAlta;
	}
}
