package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class SystemKonfigurationFrage extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SystemKonfigurationFrage dialog = new SystemKonfigurationFrage();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SystemKonfigurationFrage() {
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 460, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JTextPane txtpnWollenSieDie = new JTextPane();
			txtpnWollenSieDie.setBackground(Color.WHITE);
			txtpnWollenSieDie.setText("Wollen Sie die \u00C4nderungen \u00FCbernehmen?");
			txtpnWollenSieDie.setBounds(99, 57, 280, 29);
			contentPanel.add(txtpnWollenSieDie);
		}
		{
			JButton okButton = new JButton("Ja");
			okButton.setBounds(292, 127, 75, 29);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion			
					//TODO Exception Abfrage durch RŸckgabewert der DB
					ErfolgEingabe erfein = new ErfolgEingabe();
					erfein.setVisible(true);
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Nein");
			cancelButton.setBounds(379, 127, 75, 29);
			contentPanel.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
	}

}
