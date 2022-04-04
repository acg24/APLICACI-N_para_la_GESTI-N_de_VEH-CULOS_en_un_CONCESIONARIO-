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

public class PruebaM extends JFrame {

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
					PruebaM frame = new PruebaM();
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
	public PruebaM() {
		setBackground(new Color(240, 230, 140));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("COMPRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PruebaMC frame = new PruebaMC();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(22, 120, 132, 67);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MOSTRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(160, 120, 132, 118);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("VENDER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(160, 249, 132, 116);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("MODIFICAR");
		lblNewLabel.setBounds(57, 271, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VEH\u00CDCULO");
		lblNewLabel_1.setBounds(57, 286, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(22, 198, 132, 167);
		contentPane.add(btnNewButton_2);
		toolBar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		toolBar.setBackground(SystemColor.activeCaption);
		toolBar.setBounds(0, 0, 314, 31);
		contentPane.add(toolBar);
		
		JComboBox comboBox = new JComboBox<String>();
		comboBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		toolBar.add(comboBox);
		 
		
		JLabel lblNewLabel_2 = new JLabel("");
		toolBar.add(lblNewLabel_2);
	}
}
