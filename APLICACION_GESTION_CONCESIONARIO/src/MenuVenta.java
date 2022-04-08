import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MenuVenta extends JFrame {

	private JPanel contentPane;
	private final JToolBar toolBar = new JToolBar();
	private JTextField numBastidor;
	boolean cochesi =true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public MenuVenta () throws SQLException {
		setBackground(new Color(240, 230, 140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(168, 305, 13, 23);
		contentPane.add(separator);
		toolBar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		toolBar.setBackground(SystemColor.activeCaption);
		toolBar.setBounds(0, 0, 346, 31);
		contentPane.add(toolBar);
		
		JComboBox comboBox = new JComboBox<String>();
		comboBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		toolBar.add(comboBox);
		 
		
		JLabel lblNewLabel_2 = new JLabel("");
		toolBar.add(lblNewLabel_2);
		
		numBastidor = new JTextField();
		numBastidor.setBounds(182, 347, 154, 33);
		contentPane.add(numBastidor);
		numBastidor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inserte el numero de bastidor");
		lblNewLabel.setBounds(10, 347, 326, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("del vehiculo deseado:");
		lblNewLabel_1.setBounds(10, 366, 326, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("VENDER");
		btnNewButton.setBounds(55, 411, 229, 48);
		contentPane.add(btnNewButton);
		
		JRadioButton radiocoche = new JRadioButton("COCHE");
		radiocoche.setBounds(90, 305, 72, 23);
		contentPane.add(radiocoche);
		
		JRadioButton rdbtnCamion = new JRadioButton("CAMI\u00D3N");
		rdbtnCamion.setBounds(187, 305, 109, 23);
		contentPane.add(rdbtnCamion);
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radiocoche);
		grupo1.add(rdbtnCamion);
		
		radiocoche.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
	        	cochesi = true;
		    }
		});
		rdbtnCamion.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
	        	cochesi = false;
		    }
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conexion;
				String NumBastidor = numBastidor.getText();
				try {
					conexion = DriverManager.getConnection("jdbc:mysql://localhost/concesionariovehiculos", "root", "root");
					if(cochesi == true) {
						
						String query = "DELETE FROM coches WHERE coches.numBastidor like '"+NumBastidor+"' ";
						Statement stmt =conexion.createStatement();
						
						stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "EL COCHE SE HA VENDIDO CORRECTAMENTE");
					}else {
						
						String query = "DELETE FROM camion WHERE coches.numBastidor like '\"+NumBastidor+\"' ";
						Statement stmt =conexion.createStatement();
						stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "EL CAMIÓN SE HA VENDIDO CORRECTAMENTE");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
			}
		});
		
				
	}
}
