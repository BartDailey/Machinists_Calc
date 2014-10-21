package trigCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLength;
	private JTextField textFieldDiam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BDailey\\Dropbox\\Photos\\simplelogo.jpg"));
		setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		setTitle("Weight Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(6, 6, 768, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		//String[] alloys = new String[]{
				//"Stainless 300 series","Stainless 400 series", "Inconel", "Hasteloy", "Monel", "Nickel", "Brass", "Aluminum", "Cast Iron", "Steel"
		//};
		//JComboBox<String> matlist = new JComboBox<>(alloys);
		//add(matlist);
		//String selectedAlloy = (String)matlist.getSelectedItem();
		//System.out.println("You have picked " + selectedAlloy);
		
		JLabel lblMaterialalloy = new JLabel("Material / Alloy");
		lblMaterialalloy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialalloy.setBounds(9, 220, 121, 14);
		panel.add(lblMaterialalloy);
		
		JComboBox comboBoxAlloy = new JComboBox();
		comboBoxAlloy.setBounds(164, 214, 185, 30);
		panel.add(comboBoxAlloy);
		
		JLabel lblShape = new JLabel("Shape");
		lblShape.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShape.setBounds(9, 268, 46, 14);
		panel.add(lblShape);
		
		JComboBox comboBoxShape = new JComboBox();
		comboBoxShape.setBounds(164, 262, 185, 30);
		panel.add(comboBoxShape);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLength.setBounds(9, 309, 59, 14);
		panel.add(lblLength);
		
		textFieldLength = new JTextField();
		textFieldLength.setBorder(null);
		textFieldLength.setBounds(166, 308, 46, 20);
		panel.add(textFieldLength);
		textFieldLength.setColumns(10);
		
		JComboBox comboBoxInMet = new JComboBox();
		comboBoxInMet.setBounds(303, 308, 46, 20);
		panel.add(comboBoxInMet);
		
		JLabel lblDiameter = new JLabel("Diameter");
		lblDiameter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiameter.setBounds(10, 357, 77, 14);
		panel.add(lblDiameter);
		
		textFieldDiam = new JTextField();
		textFieldDiam.setBorder(null);
		textFieldDiam.setBounds(164, 356, 48, 20);
		panel.add(textFieldDiam);
		textFieldDiam.setColumns(10);
		
		JComboBox comboBoxDia = new JComboBox();
		comboBoxDia.setBounds(303, 356, 46, 20);
		panel.add(comboBoxDia);
		
		
		JLabel lblCalculatedWeightin = new JLabel("Calculated weight (in lbs)");
		lblCalculatedWeightin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCalculatedWeightin.setBounds(10, 466, 187, 23);
		panel.add(lblCalculatedWeightin);
		
		JTextArea textAreaAnswer = new JTextArea();
		textAreaAnswer.setBackground(new Color(169, 169, 169));
		textAreaAnswer.setFont(new Font("Monospaced", Font.BOLD, 14));
		textAreaAnswer.setBounds(240, 466, 109, 22);
		panel.add(textAreaAnswer);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(new Color(95, 158, 160));
		btnCalculate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalculate.setBounds(30, 432, 100, 23);
		panel.add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(95, 158, 160));
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLength.setText("");
				textFieldDiam.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(181, 432, 89, 23);
		panel.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Frame2.class.getResource("/resources/weightcalclogo.png")));
		lblNewLabel.setBounds(73, 0, 641, 191);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Frame2.class.getResource("/resources/ISC-lpfscale-01.gif")));
		lblNewLabel_1.setBounds(401, 202, 379, 324);
		panel.add(lblNewLabel_1);
	}
}
