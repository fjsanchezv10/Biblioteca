package uicardlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParaUI extends UI {

	//SI existe se puede usar, todavia no esta hecho para este ejemplo
	SocioRepository socio;
	public ParaUI() {
		getBtnDarAltaAlta().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(getTxtNombreAlta().getText());
				System.out.println(getTxtDireccionAlta().getText());
				socio.darAlta(getTxtNombreAlta().getText(),getTxtDireccionAlta().getText());
			}
		});
	}
}
