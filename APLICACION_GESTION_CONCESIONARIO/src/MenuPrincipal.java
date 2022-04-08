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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.ComponentOrientation;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private final JToolBar toolBar = new JToolBar();

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
	 */
	public MenuPrincipal() {
		setBackground(new Color(240, 230, 140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("COMPRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCompra frame = new MenuCompra();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(38, 178, 132, 67);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MOSTRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuMostrar frame = new MenuMostrar();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(176, 178, 132, 118);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("VENDER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuVenta frame = null;
				try {
					frame = new MenuVenta();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(176, 307, 132, 116);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("MODIFICAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuModifica frame = new MenuModifica();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(38, 256, 132, 167);
		contentPane.add(btnNewButton_2);
		toolBar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		toolBar.setBackground(SystemColor.activeCaption);
		toolBar.setBounds(0, 0, 346, 31);
		contentPane.add(toolBar);
		 
		
		JLabel lblNewLabel_2 = new JLabel("");
		toolBar.add(lblNewLabel_2);
	}
}
