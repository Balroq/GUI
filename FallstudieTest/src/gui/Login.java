package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
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


@SuppressWarnings("serial")
public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtBenutzername;
	private JPasswordField pwdPasswort;

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
		setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtBenutzername = new JTextField();
			txtBenutzername.setToolTipText("Geben Sie Ihren Benutzernamen ein.");
			txtBenutzername.setText("Benutzername");
			txtBenutzername.setBounds(76, 88, 134, 28);
			contentPanel.add(txtBenutzername);
			txtBenutzername.setColumns(10);
		}
		{
			JButton button = new JButton("?");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoginHilfe frmLoginHilfe = new LoginHilfe();
					frmLoginHilfe.setVisible(true);
				}
			});
			button.setBounds(6, 204, 29, 29);
			contentPanel.add(button);
		}
		{
			JButton btnPasswortVergessen = new JButton("Passwort vergessen?");
			btnPasswortVergessen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PasswortVergessen frmPasswortVergessen = new PasswortVergessen();
					frmPasswortVergessen.setVisible(true);
				}
			});
			btnPasswortVergessen.setBounds(284, 204, 160, 29);
			contentPanel.add(btnPasswortVergessen);
		}
		
		JLabel lblBild = new JLabel("Bild");
		lblBild.setBounds(284, 27, 61, 16);
		contentPanel.add(lblBild);
		{
			pwdPasswort = new JPasswordField();
			pwdPasswort.setText("Passwort");
			pwdPasswort.setBounds(76, 128, 134, 28);
			contentPanel.add(pwdPasswort);
		}
		{
			ImageIcon icon = new ImageIcon( "/Users/Janis/Documents/workspace2/FallstudieTest/src/gui/images/LogoFinal.bmp" );
			JLabel Bild = new JLabel( icon );
			JPanel feld = new JPanel();
			feld.add(Bild);
			feld.setBounds(30, 30, 110, 110);
			JPanel jContentPane = new JPanel();
			jContentPane.add(feld);
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Anmelden");
				okButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						System.out.println("Benutzername: " + txtBenutzername.getText());
						System.out.println("Passwort: " + pwdPasswort.getText());
						String a = txtBenutzername.getText();
						String b = pwdPasswort.getText();
						
						if(a.equals("admin"))
						{			
							if(b.equals("admin"))
							{
							System.out.println("geschafft");
							Hauptmenue frmHauptmenue = new Hauptmenue();
							frmHauptmenue.frame.setVisible(true);					
			        		dispose();
							}
							else
							{
								AnmeldungFalsch frmAnmeldungFalsch = new AnmeldungFalsch();
								frmAnmeldungFalsch.setVisible(true);
							}
						}
						else
						{
							AnmeldungFalsch frmAnmeldungFalsch = new AnmeldungFalsch();
							frmAnmeldungFalsch.setVisible(true);			
						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Abbrechen");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AnwendungAbbruch frmAnwendungAbbruch = new AnwendungAbbruch();
						frmAnwendungAbbruch.setVisible(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			txtBenutzername.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent evt) {
		
					if(pwdPasswort.getText().equals("txtBenutzername")){
						txtBenutzername.setText("txtBenutzername");
					}
					else
					{
						txtBenutzername.setText("");
						// ((javax.swing.JTextField) evt.getComponent()).setText("");
					}
			        }
			});
		}
	}
}
