import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

public class MenuModifica extends JFrame {

	private JPanel contentPane;
	private final JToolBar toolBar = new JToolBar();
	private JTextField numBastidor;
	private JTextField precio;
	private JTextField matricula;
	private JTextField numAsientos;
	private JTextField color;
	private JTextField aniofabricacion;
	private JTextField marca;
	private JTextField modelo;
	private JTextField numPuertas;
	private JTextField capacidadMaletero;

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
	public MenuModifica() {
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
		 
		
		JLabel lblNewLabel_2 = new JLabel("");
		toolBar.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		toolBar.add(comboBox);
		
		numBastidor = new JTextField();
		numBastidor.setBounds(179, 88, 86, 20);
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
		
		aniofabricacion = new JTextField();
		aniofabricacion.setBounds(133, 256, 86, 20);
		contentPane.add(aniofabricacion);
		aniofabricacion.setColumns(10);
		
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
		
		JLabel lblNewLabel = new JLabel("Num. Bastidor:");
		lblNewLabel.setBounds(82, 91, 87, 14);
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
		
		JRadioButton radiocoche = new JRadioButton("Coche");
		radiocoche.setBounds(262, 197, 70, 23);
		contentPane.add(radiocoche);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(243, 222, 101, 20);
		contentPane.add(separator);
		
		JRadioButton radiocamion = new JRadioButton("Cami\u00F3n");
		radiocamion.setBounds(262, 227, 76, 23);
		contentPane.add(radiocamion);
		
		JLabel lblNumPuertas = new JLabel("Num. Puertas:");
		lblNumPuertas.setBounds(10, 355, 113, 14);
		contentPane.add(lblNumPuertas);
		
		JLabel lblCapacidadMaletero = new JLabel("Capacidad maletero:");
		lblCapacidadMaletero.setBounds(10, 386, 124, 14);
		contentPane.add(lblCapacidadMaletero);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(60, 445, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(193, 445, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(53, 119, 251, 12);
		contentPane.add(separator_1);
	}
}
