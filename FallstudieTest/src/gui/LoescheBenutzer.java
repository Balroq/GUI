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
public class LoescheBenutzer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoescheBenutzer dialog = new LoescheBenutzer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoescheBenutzer() {
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 460, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(197, 40, 134, 28);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(61, 46, 122, 16);
			contentPanel.add(lblBenutzername);
		}
		{
			JButton okButton = new JButton("L\u00F6schen!");
			okButton.setBounds(231, 123, 100, 29);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoescheBenutzerFrage LoescheBenutzerFrage = new LoescheBenutzerFrage();
					LoescheBenutzerFrage.setVisible(true);
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
