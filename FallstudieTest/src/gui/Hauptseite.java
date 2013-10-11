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
import java.awt.Toolkit;


//TODO Alle Knoepfe eingebunden? Fehlt etwas? Vier-Augen-Prinzip
public class Hauptseite {

	public JFrame frmElasticoElektronische;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptseite window = new Hauptseite();
					window.frmElasticoElektronische.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hauptseite() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElasticoElektronische = new JFrame();
		frmElasticoElektronische.setResizable(false);
		frmElasticoElektronische.setTitle("Elastico - Elektronische Arbeitsschritt / Information / Control / Observation");
		frmElasticoElektronische.setBackground(Color.WHITE);
		frmElasticoElektronische.getContentPane().setBackground(Color.WHITE);
		frmElasticoElektronische.setIconImage(Toolkit.getDefaultToolkit().getImage(Hauptseite.class.getResource("/gui/images/LogoFinal.png")));
		frmElasticoElektronische.setBounds(100, 100, 801, 400);
		frmElasticoElektronische.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElasticoElektronische.getContentPane().setLayout(null);
 
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
        tabpane.setForeground(Color.BLACK);
        tabpane.setBackground(Color.WHITE);
        tabpane.setBounds(23, 6, 754, 325);
 
        // Hier werden die JPanels als Registerkarten hinzugefügt
        tabpane.addTab("Menü", panelMenu);
        panelMenu.setLayout(null);
        
        tabpane.addTab("Startseite", panelMenu);
        tabpane.addTab("Stricheln", panelMenu);
        
      //TODO Stricheln Oberflaeche einbinden
        JLabel lblTodo = new JLabel("TODO");
        lblTodo.setBounds(71, 26, 61, 16);
        panelMenu.add(lblTodo);
        tabpane.addTab("Statistik", panelStatistik);
        panelStatistik.setLayout(null);
        
      //TODO Statistik Oberflaeche einbinden
        JLabel lblTodo_1 = new JLabel("TODO");
        lblTodo_1.setBounds(64, 70, 61, 16);
        panelStatistik.add(lblTodo_1);
        tabpane.addTab("Administration", panelAdministration);
        panelAdministration.setLayout(null);
        
        JLabel lblBenutzerverwaltung = new JLabel("Benutzerverwaltung:");
        lblBenutzerverwaltung.setBounds(6, 6, 127, 16);
        panelAdministration.add(lblBenutzerverwaltung);
        
        JLabel lblOrganisationseinheitenverwaltung = new JLabel("Organisationseinheitenverwaltung:");
        lblOrganisationseinheitenverwaltung.setBounds(6, 97, 252, 16);
        panelAdministration.add(lblOrganisationseinheitenverwaltung);
        
        JLabel lblSystemverwaltung = new JLabel("Systemverwaltung:");
        lblSystemverwaltung.setBounds(6, 183, 175, 16);
        panelAdministration.add(lblSystemverwaltung);
        
        JButton btnNeuerBenutzer = new JButton("Neuer Benutzer");
        btnNeuerBenutzer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		NeuerBenutzer NeuerBenutzer = new NeuerBenutzer();
        		NeuerBenutzer.setVisible(true); 
        	}
        });
        btnNeuerBenutzer.setBounds(6, 34, 144, 40);
        panelAdministration.add(btnNeuerBenutzer);
        
        JButton btnBenutzerBearbeiten = new JButton("Benutzer bearbeiten");
        btnBenutzerBearbeiten.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BearbeitungBenutzer BearbeitungBenutzer = new BearbeitungBenutzer();
        		BearbeitungBenutzer.setVisible(true);
        	}
        });
        btnBenutzerBearbeiten.setBounds(162, 34, 153, 40);
        panelAdministration.add(btnBenutzerBearbeiten);
        
        JButton btnBenutzerLschen = new JButton("Benutzer l\u00F6schen");
        btnBenutzerLschen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LoescheBenutzer LoescheBenutzer = new LoescheBenutzer();
        		LoescheBenutzer.setVisible(true);
        	}
        });
        btnBenutzerLschen.setBounds(327, 34, 144, 40);
        panelAdministration.add(btnBenutzerLschen);
        
        JButton btnNeueOrganisationseinheit = new JButton("Neue Organisationseinheit");
        btnNeueOrganisationseinheit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		NeueOrgaEinheit  NeueOrgaEinheit = new NeueOrgaEinheit();
        		NeueOrgaEinheit.setVisible(true);
        	}
        });
        btnNeueOrganisationseinheit.setBounds(6, 125, 309, 40);
        panelAdministration.add(btnNeueOrganisationseinheit);
        
        JButton btnOrgaeinheitInaktivSetzen = new JButton("Inaktiv setzen");
        btnOrgaeinheitInaktivSetzen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		OrgaEinheitInaktiv OrgaEinheitInaktiv = new OrgaEinheitInaktiv();
        		OrgaEinheitInaktiv.setVisible(true);
        		}
        });
        btnOrgaeinheitInaktivSetzen.setBounds(327, 125, 144, 40);
        panelAdministration.add(btnOrgaeinheitInaktivSetzen);
        
        JButton button = new JButton("?");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Administrationshilfe Administrationshilfe = new Administrationshilfe();
        		Administrationshilfe.setVisible(true);
        		}
        });
        button.setBounds(698, 244, 29, 29);
        panelAdministration.add(button);
        
        JButton btnKonfigurieren = new JButton("Konfigurieren");
        btnKonfigurieren.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SystemKonfiguration SystemKonfiguration = new SystemKonfiguration();
        		SystemKonfiguration.setVisible(true);
        	}
        });
        btnKonfigurieren.setBounds(6, 211, 154, 40);
        panelAdministration.add(btnKonfigurieren);
 
        // JTabbedPane wird unserem Dialog hinzugefügt
        frmElasticoElektronische.getContentPane().add(tabpane);
        
        JButton btnNewButton_2 = new JButton("Beenden");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     		
        		AnwendungAbbruch frmAnwendungAbbruch = new AnwendungAbbruch();
    			frmAnwendungAbbruch.setVisible(true);    		        		
        	}
        });
        btnNewButton_2.setBounds(660, 332, 117, 29);
        frmElasticoElektronische.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_1 = new JButton("?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HauptseiteHilfe frmHauptmenueHilfe = new HauptseiteHilfe();
        		frmHauptmenueHilfe.setVisible(true);  		
        	}
        });
        btnNewButton_1.setBounds(33, 332, 29, 29);
        frmElasticoElektronische.getContentPane().add(btnNewButton_1);
        
        
      //TODO Aktion einbinden, sodass der hinter dem benutzernamen stehende Name mit Vor- und Nachname angezeigt wird.
        JLabel lblEingeloggtAlsJanis = new JLabel("Eingeloggt als: Janis H\u00F6pken");
        lblEingeloggtAlsJanis.setBounds(74, 337, 180, 16);
        frmElasticoElektronische.getContentPane().add(lblEingeloggtAlsJanis);
        
        
	}
}
