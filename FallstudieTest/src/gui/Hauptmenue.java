package gui;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;


public class Hauptmenue {

	public JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptmenue window = new Hauptmenue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hauptmenue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
 
        // Hier erzeugen wir unsere JPanels
        JPanel panelMenu = new JPanel();
        JPanel panelStricheln = new JPanel();
        JPanel panelStatistik = new JPanel();
        JPanel panelAdministration = new JPanel();
 
        // Hier setzen wir die Hintergrundfarben für die JPanels
        panelMenu.setBackground(Color.WHITE);
        panelStricheln.setBackground(Color.WHITE);
        panelStatistik.setBackground(Color.WHITE);
        panelAdministration.setBackground(Color.WHITE);
 
        // Erzeugung eines JTabbedPane-Objektes
        JTabbedPane tabpane = new JTabbedPane(JTabbedPane.TOP);
        tabpane.setBounds(23, 6, 597, 325);
 
        // Hier werden die JPanels als Registerkarten hinzugefügt
        tabpane.addTab("Menü", panelMenu);
        panelMenu.setLayout(null);
        
        tabpane.addTab("Startseite", panelMenu);
        tabpane.addTab("Stricheln", panelMenu);
        tabpane.addTab("Statistik", panelStatistik);
        tabpane.addTab("Administration", panelAdministration);
        panelAdministration.setLayout(null);
        
        JButton btnOrgaeinheitverwaltung = new JButton("Orga-Einheitverwaltung");
        btnOrgaeinheitverwaltung.setBounds(186, 100, 175, 65);
        panelAdministration.add(btnOrgaeinheitverwaltung);
        
        JButton btnStrichanzahlverwaltung = new JButton("Strichanzahlverwaltung");
        btnStrichanzahlverwaltung.setBounds(373, 103, 165, 59);
        panelAdministration.add(btnStrichanzahlverwaltung);
        
        JLabel lblBenutzerverwaltung = new JLabel("Benutzerverwaltung:");
        lblBenutzerverwaltung.setBounds(6, 6, 127, 16);
        panelAdministration.add(lblBenutzerverwaltung);
 
        // JTabbedPane wird unserem Dialog hinzugefügt
        frame.getContentPane().add(tabpane);
        
        JButton btnNewButton_2 = new JButton("Beenden");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     		
        		AnwendungAbbruch frmAnwendungAbbruch = new AnwendungAbbruch();
    			frmAnwendungAbbruch.setVisible(true);    		        		
        	}
        });
        btnNewButton_2.setBounds(503, 332, 117, 29);
        frame.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_1 = new JButton("?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HauptmenueHilfe frmHauptmenueHilfe = new HauptmenueHilfe();
        		frmHauptmenueHilfe.setVisible(true);  		
        	}
        });
        btnNewButton_1.setBounds(33, 332, 29, 29);
        frame.getContentPane().add(btnNewButton_1);
        
        JLabel lblEingeloggtAlsJanis = new JLabel("Eingeloggt als: Janis H\u00F6pken");
        lblEingeloggtAlsJanis.setBounds(74, 337, 180, 16);
        frame.getContentPane().add(lblEingeloggtAlsJanis);
	}
}
