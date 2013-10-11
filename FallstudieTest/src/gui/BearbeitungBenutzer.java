package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BearbeitungBenutzer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BearbeitungBenutzer dialog = new BearbeitungBenutzer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BearbeitungBenutzer() {
		setResizable(false);
		setBounds(100, 100, 460, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(222, 60, 134, 28);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNeuesPasswort = new JLabel("Neues Passwort:");
			lblNeuesPasswort.setBounds(103, 66, 118, 16);
			contentPanel.add(lblNeuesPasswort);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(103, 41, 107, 16);
			contentPanel.add(lblBenutzername);
		}
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 35, 134, 28);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		{
			JButton okButton = new JButton("Best\u00E4tigen");
			okButton.setBounds(103, 101, 109, 29);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BearbeitungBenutzerFrage BearbeitungBenutzerFrage = new BearbeitungBenutzerFrage();
					BearbeitungBenutzerFrage.setVisible(true);
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Abbrechen");
			cancelButton.setBounds(245, 101, 111, 29);
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
