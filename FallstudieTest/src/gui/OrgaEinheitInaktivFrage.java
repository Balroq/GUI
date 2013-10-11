package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OrgaEinheitInaktivFrage extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OrgaEinheitInaktivFrage dialog = new OrgaEinheitInaktivFrage();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OrgaEinheitInaktivFrage() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblOrgaeinheit = new JLabel("OrgaEinheit");
			lblOrgaeinheit.setBounds(6, 30, 153, 16);
			contentPanel.add(lblOrgaeinheit);
		}
		{
			JTextPane txtpnWollenSieDie = new JTextPane();
			txtpnWollenSieDie.setText("Wollen Sie die folgende Organisationseinheit wirklich deaktivieren?");
			txtpnWollenSieDie.setBounds(6, 6, 438, 227);
			contentPanel.add(txtpnWollenSieDie);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnJa = new JButton("Ja");
				btnJa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//TODO
						ErfolgEingabe erfein = new ErfolgEingabe();
						erfein.setVisible(true);
						dispose();
					}
				});
				buttonPane.add(btnJa);
			}
			{
				JButton okButton = new JButton("Nein");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
