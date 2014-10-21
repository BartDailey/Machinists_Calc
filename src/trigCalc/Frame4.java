package trigCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;

import java.awt.Component;

import javax.swing.border.LineBorder;

import java.awt.Canvas;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JTextPane;

public class Frame4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldDiameter;
	private JTextField textFieldNoHoles;
	double x = 0;
	double y = 0;
	
	String[] columNames = {"x", "y"};
	Object[][] data = {{new Double(x)},{new Double(y)}};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4();
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
	public Frame4() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1382, 898);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setForeground(new Color(224, 255, 255));
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDiameter = new JLabel("Diameter");
		lblDiameter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDiameter.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiameter.setBounds(10, 34, 95, 26);
		contentPane.add(lblDiameter);
		
		JLabel lblOfHoles = new JLabel("# of Holes");
		lblOfHoles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOfHoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfHoles.setBounds(10, 89, 95, 26);
		contentPane.add(lblOfHoles);
		
		txtFieldDiameter = new JTextField();
		txtFieldDiameter.setBounds(115, 39, 46, 20);
		contentPane.add(txtFieldDiameter);
		txtFieldDiameter.setColumns(10);
		
		textFieldNoHoles = new JTextField();
		textFieldNoHoles.setBounds(115, 94, 46, 20);
		contentPane.add(textFieldNoHoles);
		textFieldNoHoles.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double r = 0;
				double d = 0; 
				double p = 0;
				double x;
				double y;
				DecimalFormat df = new DecimalFormat("###.###");
				try{
					double num1=Double.parseDouble(txtFieldDiameter.getText());
					double num2=Double.parseDouble(textFieldNoHoles.getText());
					double a = num1;
					double b = num2;
					a = 6;
					b = 3.5;
					r = b/2;
					p = 360/a;
					
					double i = 0;
					for(i = 0; i <= num2; i =+ p)
						
				
				System.out.println(p);
				textFieldNoHoles.setText((df.format(p)));
				 
				}
				catch(Exception a){
					JOptionPane.showMessageDialog(null, "Please enter valid number ");
				}
		}
	});

			
		btnCalculate.setBackground(new Color(95, 158, 160));
		btnCalculate.setBounds(47, 156, 89, 23);
		contentPane.add(btnCalculate);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(210, 105, 30));
		separator.setForeground(new Color(34, 139, 34));
		separator.setBounds(22, 190, 335, 6);
		contentPane.add(separator);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(115, 223, 46, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setBounds(204, 223, 46, 14);
		contentPane.add(lblY);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFieldDiameter.setText("");
				textFieldNoHoles.setText("");
			}
		});
		btnClear.setBackground(new Color(95, 158, 160));
		btnClear.setBounds(188, 156, 89, 23);
		contentPane.add(btnClear);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Frame4.class.getResource("/resources/bolcirclelogo.png")));
		label.setBounds(468, 17, 677, 162);
		contentPane.add(label);
		
		JTextPane textPaneResult = new JTextPane();
		textPaneResult.setBackground(new Color(224, 255, 255));
		textPaneResult.setBounds(22, 258, 335, 502);
		contentPane.add(textPaneResult);
	}
}
