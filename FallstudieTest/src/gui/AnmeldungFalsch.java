package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AnmeldungFalsch extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AnmeldungFalsch dialog = new AnmeldungFalsch();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AnmeldungFalsch() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JTextPane txtpnDieAnmeldungWar = new JTextPane();
			txtpnDieAnmeldungWar.setBounds(6, 6, 438, 227);
			txtpnDieAnmeldungWar.setText("\n\n    Die Anmeldung war fehlerhaft. Versuchen Sie es erneut\n    oder wenden Sie sich an Ihren Systemadministrator.");
			contentPanel.add(txtpnDieAnmeldungWar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(6, 228, 450, 39);
			contentPanel.add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setBounds(351, 6, 75, 29);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.setLayout(null);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton button = new JButton("?");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AnmeldungFalschHilfe frmAnmeldungFalschHilfe = new AnmeldungFalschHilfe();
		        		frmAnmeldungFalschHilfe.setVisible(true); 
					}
				});
				button.setBounds(6, 6, 29, 29);
				buttonPane.add(button);
			}
		}
	}

}
