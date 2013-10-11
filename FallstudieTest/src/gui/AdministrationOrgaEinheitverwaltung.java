package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AdministrationOrgaEinheitverwaltung extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AdministrationOrgaEinheitverwaltung dialog = new AdministrationOrgaEinheitverwaltung();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AdministrationOrgaEinheitverwaltung() {
		//TODO Inhalt und Groesse
		setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Best\u00E4tigen");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion und RŸckmeldung
				}
			});
			okButton.setBounds(224, 243, 104, 29);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Abbrechen");
			cancelButton.setBounds(340, 243, 104, 29);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
	}

}
