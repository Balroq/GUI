package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Point;


@SuppressWarnings("serial")
public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtBenutzername;
	private JPasswordField pwdPasswort;
	private int zaehler = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setResizable(false);
		setTitle("Login - Elastico");
		setBackground(Color.WHITE);
		setBounds(100, 100, 450, 240);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtBenutzername = new JTextField();
			txtBenutzername.setToolTipText("Geben Sie Ihren Benutzernamen ein.");
			txtBenutzername.setBounds(169, 36, 134, 28);
			contentPanel.add(txtBenutzername);
			txtBenutzername.setColumns(10);
		}
		{
			JButton btnPasswortVergessen = new JButton("Passwort vergessen?");
			btnPasswortVergessen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PasswortVergessen frmPasswortVergessen = new PasswortVergessen();
					frmPasswortVergessen.setVisible(true);
				}
			});
			btnPasswortVergessen.setBounds(6, 180, 160, 29);
			contentPanel.add(btnPasswortVergessen);
		}
		{
			pwdPasswort = new JPasswordField();
			pwdPasswort.setBounds(169, 66, 134, 28);
			contentPanel.add(pwdPasswort);
		}
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(66, 42, 103, 16);
			contentPanel.add(lblBenutzername);
		}
		{
			JLabel lblPasswort = new JLabel("Passwort:");
			lblPasswort.setBounds(66, 72, 61, 16);
			contentPanel.add(lblPasswort);
		}	
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/gui/images/LogoFinal.png")));
			lblNewLabel.setBounds(317, 15, 121, 153);
			contentPanel.add(lblNewLabel);
		}
		{
			JButton button = new JButton("?");
			button.setBounds(363, 180, 75, 29);
			contentPanel.add(button);
			JButton anmeldenButton = new JButton("Anmelden");
			anmeldenButton.setBackground(Color.WHITE);
			anmeldenButton.setBounds(66, 119, 107, 29);
			contentPanel.add(anmeldenButton);
			anmeldenButton.addActionListener(new ActionListener() {
				
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion	
					// Methodenname - �bergabewerte - R�ckgabewete
					// login - String benutzer, String passwort - boolean
					
					String a = txtBenutzername.getText();
					String b = pwdPasswort.getText();	
					if(a.equals("admin"))
					{			
						if(b.equals("admin"))
						{
							Hauptseite frmElasticoElektronische = new Hauptseite();
							frmElasticoElektronische.frmElasticoElektronische.setVisible(true);					
			        		dispose();
						}
						else
						{
							zaehler++;
							AnmeldungFalsch frmAnmeldungFalsch = new AnmeldungFalsch();
							frmAnmeldungFalsch.setVisible(true);
							
							if(zaehler == 3)
							{
								//TODO Aktion
								//TODO Exception Abfrage durch R�ckgabewert der DB
								// Methodenname - �bergabewerte - R�ckgabewert
								// passwortSperren - String benutzername - void
								PasswortGesperrt PasswortGesperrt = new PasswortGesperrt();
								PasswortGesperrt.setVisible(true);
							}
						}
					}
					else
					{
						zaehler++;
						AnmeldungFalsch frmAnmeldungFalsch = new AnmeldungFalsch();
						frmAnmeldungFalsch.setVisible(true);
						
						if(zaehler == 3)
						{
							//TODO Aktion
							//TODO Exception Abfrage durch R�ckgabewert der DB
							// Methodenname - �bergabewerte - R�ckgabewert
							// passwortSperren - String benutzername - void
							PasswortGesperrt PasswortGesperrt = new PasswortGesperrt();
							PasswortGesperrt.setVisible(true);
						}
					}
					
				}
			});
			anmeldenButton.setActionCommand("Anmelden");
			getRootPane().setDefaultButton(anmeldenButton);
			{
				JButton cancelButton = new JButton("Abbrechen");
				cancelButton.setBounds(169, 119, 111, 29);
				contentPanel.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AnwendungAbbruch frmAnwendungAbbruch = new AnwendungAbbruch();
						frmAnwendungAbbruch.setVisible(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
			}
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoginHilfe frmLoginHilfe = new LoginHilfe();
					frmLoginHilfe.setVisible(true);
				}
			});
		}
	}
}
