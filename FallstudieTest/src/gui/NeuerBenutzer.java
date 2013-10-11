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
	private JTextField textField;
	private JTextField textField_1;

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
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 460, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField_1 = new JTextField();
			textField_1.setBounds(217, 71, 134, 28);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField = new JTextField();
			textField.setBounds(217, 37, 134, 28);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(101, 43, 104, 16);
			contentPanel.add(lblBenutzername);
		}
		{
			JLabel lblPasswort = new JLabel("Passwort:");
			lblPasswort.setBounds(101, 77, 61, 16);
			contentPanel.add(lblPasswort);
		}
		{
			JButton okButton = new JButton("Best\u00E4tigen");
			okButton.setBounds(222, 123, 109, 29);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion
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
	}

}
