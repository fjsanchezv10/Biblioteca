package uicardlayout;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UI extends JFrame {

	private JPanel contentPane;
	private PanelAlta pnlAlta;
	private PanelBaja pnlBaja;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 609);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmUno = new JMenuItem("altas");
		
		menuBar.add(mntmUno);
		
		JMenuItem mntmDos = new JMenuItem("bajas");
		
		menuBar.add(mntmDos);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmCargar = new JMenuItem("cargar");
		mnArchivo.add(mntmCargar);
		
		JMenuItem mntmGuardar = new JMenuItem("guardar");
		mnArchivo.add(mntmGuardar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		// primer paso: crear los paneles
		pnlAlta=new PanelAlta();
		
		pnlBaja=new PanelBaja();
		//segundo paso: insertar los paneles en el panel principal
		String nombreAlta = "alta";
		contentPane.add(pnlAlta,nombreAlta);
		String nombreBaja = "baja";
		contentPane.add(pnlBaja, nombreBaja);
		//tercer paso: activar la navegacion
		CardLayout layout = (CardLayout) contentPane.getLayout();
		mntmUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(contentPane, nombreAlta);
			}
		});
		mntmDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(contentPane, nombreBaja);
			}
		});
	}

	public JTextField getTxtNombreAlta() {
		return pnlAlta.getTxtNombreAlta();
	}

	public JTextField getTxtDireccionAlta() {
		return pnlAlta.getTxtDireccionAlta();
	}

	public JButton getBtnDarAltaAlta() {
		return pnlAlta.getBtnDarAltaAlta();
	}
}
