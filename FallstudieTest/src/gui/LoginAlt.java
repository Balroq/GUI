package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class LoginAlt {

	private JFrame frmLogin;
	private final JButton Bestätigen = new JButton("Best\u00E4tigen");
	private JTextField txtBenutzername;
	private JTextField txtPasswort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAlt window = new LoginAlt();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginAlt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setBackground(Color.WHITE);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 469, 307);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton Abbrechen = new JButton("Abbrechen");
		Abbrechen.setBounds(233, 195, 117, 29);
		Abbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AnwendungAbbruch frmAnwendungAbbruch = new AnwendungAbbruch();
			frmAnwendungAbbruch.setVisible(true);
			}
		});
		frmLogin.getContentPane().setLayout(null);
		Bestätigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((txtBenutzername.getText() == "admin") && (txtPasswort.getText() == "admin"))
				{
					
				}
			}
		});
		Bestätigen.setBounds(81, 195, 117, 29);
		frmLogin.getContentPane().add(Bestätigen);
		frmLogin.getContentPane().add(Abbrechen);
		
		txtBenutzername = new JTextField();
		txtBenutzername.setText("Benutzername");
		txtBenutzername.setToolTipText("Benutzername");
		txtBenutzername.setBounds(148, 97, 143, 29);
		frmLogin.getContentPane().add(txtBenutzername);
		txtBenutzername.setColumns(10);
		
		txtPasswort = new JTextField();
		txtPasswort.setText("Passwort");
		txtPasswort.setBounds(148, 138, 143, 28);
		frmLogin.getContentPane().add(txtPasswort);
		txtPasswort.setColumns(10);
		
		JLabel lblPasswortVergessen = new JLabel("Passwort vergessen?");
		lblPasswortVergessen.setBounds(81, 242, 136, 16);
		frmLogin.getContentPane().add(lblPasswortVergessen);
		
		JButton button = new JButton("?");
		button.setBounds(17, 240, 29, 23);
		frmLogin.getContentPane().add(button);
	}
}
