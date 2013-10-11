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
import java.awt.Color;

@SuppressWarnings("serial")
public class NeuerBenutzer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtBenutzername;
	private JTextField txtPasswort;
	private JTextField txtBenutzer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NeuerBenutzer dialog = new NeuerBenutzer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NeuerBenutzer() {
		setTitle("Benutzer - Anlegen");
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 460, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtPasswort = new JTextField();
			txtPasswort.setBounds(217, 77, 134, 28);
			contentPanel.add(txtPasswort);
			txtPasswort.setColumns(10);
		}
		{
			txtBenutzername = new JTextField();
			txtBenutzername.setBounds(217, 49, 134, 28);
			contentPanel.add(txtBenutzername);
			txtBenutzername.setColumns(10);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(101, 55, 104, 16);
			contentPanel.add(lblBenutzername);
		}
		{
			JLabel lblPasswort = new JLabel("Passwort:");
			lblPasswort.setBounds(101, 83, 61, 16);
			contentPanel.add(lblPasswort);
		}
		{
			JButton okButton = new JButton("Best\u00E4tigen");
			okButton.setBounds(222, 123, 109, 29);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion	
					// †bergabe von "benutzer", "benutzername" und "passwort" an "NeuerBenutzerFrage"
					String benutzer = txtBenutzer.getText();
					String benutzername = txtBenutzername.getText();
					String passwort = txtPasswort.getText();
					
					
					NeuerBenutzerFrage NeuerBenutzerFrage = new NeuerBenutzerFrage();
					NeuerBenutzerFrage.setVisible(true);
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Abbrechen");
			cancelButton.setBounds(343, 123, 111, 29);
			contentPanel.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
		{
			JLabel lblBenutzer = new JLabel("Benutzer:");
			lblBenutzer.setBounds(101, 27, 61, 16);
			contentPanel.add(lblBenutzer);
		}
		{
			txtBenutzer = new JTextField();
			txtBenutzer.setBounds(217, 21, 134, 28);
			contentPanel.add(txtBenutzer);
			txtBenutzer.setColumns(10);
		}
	}

}
