package trigCalc;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnum1;
	private JTextField textFieldanswer;
	private JTextField textFieldnum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BDailey\\Dropbox\\Photos\\simplelogo.jpg"));
		setTitle("Drill Point Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setName("Frame1");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setVerifyInputWhenFocusTarget(false);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.setForeground(SystemColor.activeCaption);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(10, 6, 764, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(95, 158, 160));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ans;
				double answ;
				double answer;
				double answe;
				DecimalFormat df = new DecimalFormat("##0.00000");
				try{
					double num1=Double.parseDouble(textFieldnum1.getText());
					double num2=Double.parseDouble(textFieldnum2.getText());
					
					ans = num1/2;
					answ = Math.tan(Math.toRadians(180 - num2)/2);
					answer = ans * answ;
					
					textFieldanswer.setText((df.format(answer)));
					
					}catch(Exception a){
					JOptionPane.showMessageDialog(null, "Please enter valid number ");
				}
				
			}
		});
		btnNewButton.setBounds(37, 346, 111, 33);
		panel.add(btnNewButton);
		
		
		
		JLabel lblDrillDiameter = new JLabel("Drill diameter");
		lblDrillDiameter.setBackground(Color.RED);
		lblDrillDiameter.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrillDiameter.setBounds(10, 218, 129, 26);
		lblDrillDiameter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblDrillDiameter);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBorder(null);
		textFieldnum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnum1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldnum1.setBounds(180, 218, 74, 26);
		panel.add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		JLabel lblDrillTipIncluded = new JLabel("Drill tip included angle");
		lblDrillTipIncluded.setVerifyInputWhenFocusTarget(false);
		lblDrillTipIncluded.setBackground(SystemColor.info);
		lblDrillTipIncluded.setBounds(10, 276, 176, 26);
		lblDrillTipIncluded.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblDrillTipIncluded);
		
		textFieldanswer = new JTextField();
		textFieldanswer.setBackground(new Color(255, 0, 0));
		textFieldanswer.setBorder(null);
		textFieldanswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldanswer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldanswer.setBounds(180, 432, 74, 26);
		panel.add(textFieldanswer);
		textFieldanswer.setColumns(10);
		
		JLabel lblAnswer = new JLabel("The final answer");
		lblAnswer.setForeground(new Color(0, 0, 0));
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnswer.setBounds(10, 431, 111, 26);
		panel.add(lblAnswer);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBorder(null);
		textFieldnum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnum2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldnum2.setBounds(180, 276, 74, 26);
		panel.add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldnum1.setText("");
				textFieldnum2.setText("");
				textFieldanswer.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBackground(new Color(95, 158, 160));
		btnClear.setBounds(202, 346, 87, 33);
		panel.add(btnClear);
		
		JLabel lblDrillImage = new JLabel("");
		lblDrillImage.setBorder(null);
		lblDrillImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrillImage.setBounds(346, 218, 500, 303);
		lblDrillImage.setIcon(new ImageIcon(Frame1.class.getResource("/resources/Bosch Drill Bit Cobalt Drill Bits, CO2131, CO2132, CO2133, CO2134,_ (EN) r20849v33.png")));
		panel.add(lblDrillImage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frame1.class.getResource("/resources/drillpointlogo2.png")));
		lblNewLabel.setBounds(10, 6, 744, 186);
		panel.add(lblNewLabel);
		
		
		
		
		
		
		
	
		}
	}

