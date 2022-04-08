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
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;

public class MenuCompra extends JFrame {

	private JPanel contentPane;
	private final JToolBar toolBar = new JToolBar();
	private JTextField numBastidor;
	private JTextField precio;
	private JTextField matricula;
	private JTextField numAsientos;
	private JTextField color;
	private JTextField añoFabricacion;
	private JTextField marca;
	private JTextField modelo;
	private JTextField numPuertas;
	private JTextField capacidadMaletero;
	private JTextField tipoMercancia;
	private JTextField carga;
	boolean cochesi = true;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCompra frame = new MenuCompra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuCompra() {
		setBackground(new Color(240, 230, 140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		toolBar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		toolBar.setBackground(SystemColor.activeCaption);
		toolBar.setBounds(0, 0, 346, 31);
		contentPane.add(toolBar);
		ButtonGroup grupoDeRadios;
		
		 
		
		JLabel lblNewLabel_2 = new JLabel("");
		toolBar.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		toolBar.add(comboBox);
		
		numBastidor = new JTextField();
		numBastidor.setBounds(133, 102, 86, 20);
		contentPane.add(numBastidor);
		numBastidor.setColumns(10);
		
		precio = new JTextField();
		precio.setBounds(133, 133, 86, 20);
		contentPane.add(precio);
		precio.setColumns(10);
		
		matricula = new JTextField();
		matricula.setBounds(133, 164, 86, 20);
		contentPane.add(matricula);
		matricula.setColumns(10);
		
		numAsientos = new JTextField();
		numAsientos.setBounds(133, 194, 86, 20);
		contentPane.add(numAsientos);
		numAsientos.setColumns(10);
		
		color = new JTextField();
		color.setBounds(133, 225, 86, 20);
		contentPane.add(color);
		color.setColumns(10);
		
		añoFabricacion = new JTextField();
		añoFabricacion.setBounds(133, 256, 86, 20);
		contentPane.add(añoFabricacion);
		añoFabricacion.setColumns(10);
		
		marca = new JTextField();
		marca.setBounds(133, 287, 86, 20);
		contentPane.add(marca);
		marca.setColumns(10);
		
		modelo = new JTextField();
		modelo.setBounds(133, 318, 86, 20);
		contentPane.add(modelo);
		modelo.setColumns(10);
		
		numPuertas = new JTextField();
		numPuertas.setBounds(133, 349, 86, 20);
		contentPane.add(numPuertas);
		numPuertas.setColumns(10);
		
		capacidadMaletero = new JTextField();
		capacidadMaletero.setBounds(133, 380, 86, 20);
		contentPane.add(capacidadMaletero);
		capacidadMaletero.setColumns(10);
		
		tipoMercancia = new JTextField();
		tipoMercancia.setColumns(10);
		tipoMercancia.setBounds(133, 349, 86, 20);
		tipoMercancia.setVisible(false);
		contentPane.add(tipoMercancia);
		
		carga = new JTextField();
		carga.setColumns(10);
		carga.setBounds(133, 380, 86, 20);
		carga.setVisible(false);
		contentPane.add(carga);
		
		
		JLabel lblNewLabel = new JLabel("Num. Bastidor:");
		lblNewLabel.setBounds(10, 105, 87, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 139, 87, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 170, 87, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblNumAsientos = new JLabel("Num. Asientos:");
		lblNumAsientos.setBounds(10, 200, 87, 14);
		contentPane.add(lblNumAsientos);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(10, 231, 87, 14);
		contentPane.add(lblColor);
		
		JLabel lblAoFabricacin = new JLabel("A\u00F1o de fabricaci\u00F3n:");
		lblAoFabricacin.setBounds(10, 262, 113, 14);
		contentPane.add(lblAoFabricacin);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 324, 113, 14);
		contentPane.add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 293, 87, 14);
		contentPane.add(lblMarca);
		
		JLabel lblTipoDeMercancia = new JLabel("Tipo de mercancia:");
		lblTipoDeMercancia.setBounds(10, 355, 113, 14);
		lblTipoDeMercancia.setVisible(false);
		contentPane.add(lblTipoDeMercancia);
		
		JLabel lblMarca_1 = new JLabel("Carga:");
		lblMarca_1.setBounds(10, 386, 113, 14);
		lblMarca_1.setVisible(false);
		contentPane.add(lblMarca_1);
		
		
		JRadioButton radiocoche = new JRadioButton("Coche", true);
		radiocoche.setBounds(262, 197, 70, 23);
		contentPane.add(radiocoche);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(243, 222, 101, 20);
		contentPane.add(separator);
		
	
		JRadioButton radiocamion = new JRadioButton("Cami\u00F3n", false);
		radiocamion.setBounds(262, 227, 76, 23);
		contentPane.add(radiocamion);
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radiocoche);
		grupo1.add(radiocamion);
		
		
		JLabel lblNumPuertas = new JLabel("Num. Puertas:");
		lblNumPuertas.setBounds(10, 355, 113, 14);
		contentPane.add(lblNumPuertas);
		
		JLabel lblCapacidadMaletero = new JLabel("Capacidad maletero:");
		lblCapacidadMaletero.setBounds(10, 386, 124, 14);
		contentPane.add(lblCapacidadMaletero);
		radiocoche.addActionListener(new ActionListener() {
			 
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    		
		    	lblMarca_1.setVisible(false);
		    	lblTipoDeMercancia.setVisible(false);
		    	tipoMercancia.setVisible(false);
		    	carga.setVisible(false);
		    	
		    	lblNumPuertas.setVisible(true);
	        	lblCapacidadMaletero.setVisible(true);
	        	numPuertas.setVisible(true);
	        	capacidadMaletero.setVisible(true);
	        	cochesi = true;
		 
		    }
		});
		radiocamion.addActionListener(new ActionListener() {
			 
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    		
		    	lblNumPuertas.setVisible(false);
	        	lblCapacidadMaletero.setVisible(false);
	        	numPuertas.setVisible(false);
	        	capacidadMaletero.setVisible(false);
	        	
	        	lblMarca_1.setVisible(true);
	        	lblTipoDeMercancia.setVisible(true);
	        	tipoMercancia.setVisible(true);
	        	carga.setVisible(true);
	        	cochesi = false;
		 
		    }
		});
		
//		----------------------------------------------------------------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
//		---------------------------------------COMPRA DE VEHICULO-------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
		JButton comprabutton = new JButton("COMPRAR");
		comprabutton.setBounds(47, 445, 116, 23);
		contentPane.add(comprabutton);
		comprabutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/concesionariovehiculos", "root", "root"); 
					
					String NumBastidor = numBastidor.getText();
					double Precio = Double.parseDouble(precio.getText());
					int NumAsientos = Integer.parseInt(numAsientos.getText());
					String Matricula = matricula.getText();
					String Color = color.getText();
					int AñoFabricacion = Integer.parseInt(añoFabricacion.getText());
				    String Marca = marca.getText();
					String Modelo = modelo.getText();
										
					
			    
					if(cochesi == true) {
						int NumPuertas = Integer.parseInt(numPuertas.getText());
						double CapacidadMaletero = Double.parseDouble(capacidadMaletero.getText());
						String query = "INSERT INTO coches (numBastidor,matricula,serie,color,numAsientos,precio,numPuertas,capacidadMaletero) values "
								+ "('"+NumBastidor+"','"+Matricula+"','1','"+Color+"','"+NumAsientos+"','"+Precio+"','"+NumPuertas+"','"+CapacidadMaletero+"')";
						Statement stmt =conexion.createStatement();
						
						stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "EL COCHE SE HA COMPREADO CORRECTAMENTE");
					}else {
						String TipoMercancia = tipoMercancia.getText();
						double Carga = Double.parseDouble(carga.getText());

						String query = "INSERT INTO camion (numBastidor,matricula,serie,color,numAsientos,precio,tipoMercancia,carga) values "
								+ "('"+NumBastidor+"','"+Matricula+"','"+NumAsientos+"','"+Color+"','"+NumAsientos+"','"+Precio+"','"+TipoMercancia+"','"+Carga+"')";
						Statement stmt =conexion.createStatement();
						
						stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "EL CAMION SE HA VENDIDO CORRECTAMENTE");
					}

										
				} catch(Exception a) {
					a.printStackTrace();
				}
				
			}
			
		});
//		----------------------------------------------------------------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
//		------------------------------------------LIMPIAR PAGINA--------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
//		----------------------------------------------------------------------------------------------------------
		JButton resetbutton = new JButton("RESET");
		resetbutton.setBounds(193, 445, 116, 23);
		contentPane.add(resetbutton);
		
		
		
		
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					numBastidor.setText("");
					precio.setText("");
					numAsientos.setText("");					
					matricula.setText("");
					color.setText("");
					numPuertas.setText("");
					capacidadMaletero.setText("");
					añoFabricacion.setText("");
					marca.setText("");
					modelo.setText("");
				
				}catch(Exception a) {
							a.printStackTrace();
						}
					
			}
			
		});
		
	}	        
}
