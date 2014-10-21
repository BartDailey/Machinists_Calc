package trigCalc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class Frame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDesiredFinish;
	private JTextField textFieldToolRadius;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setType(Type.UTILITY);
		setTitle("Surface Finish Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("answer here");
		panel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(6, 6, 768, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DecimalFormat df = new DecimalFormat("###.0000");
				
			try{
				double num1=Double.parseDouble(textFieldDesiredFinish.getText());
				double num2=Double.parseDouble(textFieldToolRadius.getText());
					
				double ans = num2 * 24;
				double ans2 = ans * num1;
				double ans3 = Math.sqrt(ans2);
				double finalAnswer = ans3/1000;
				
				textFieldAnswer.setText((df.format(finalAnswer)));
						
				}catch(Exception a){
					JOptionPane.showMessageDialog(null, "Please enter valid number ");
										
			

				}
			}
		}
				
			);
		
		btnCalculate.setBackground(new Color(95, 158, 160));
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculate.setBounds(10, 381, 110, 23);
		panel.add(btnCalculate);
		
		textFieldDesiredFinish = new JTextField();
		textFieldDesiredFinish.setBorder(null);
		textFieldDesiredFinish.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDesiredFinish.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldDesiredFinish.setBounds(148, 272, 86, 20);
		panel.add(textFieldDesiredFinish);
		textFieldDesiredFinish.setColumns(10);
		
		JLabel lblDesiredFinish = new JLabel("Desired Finish");
		lblDesiredFinish.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesiredFinish.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesiredFinish.setBounds(10, 271, 110, 23);
		panel.add(lblDesiredFinish);
		
		JLabel lblToolRadius = new JLabel("Tool Radius");
		lblToolRadius.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToolRadius.setBounds(10, 321, 110, 23);
		panel.add(lblToolRadius);
		
		textFieldToolRadius = new JTextField();
		textFieldToolRadius.setBorder(null);
		textFieldToolRadius.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldToolRadius.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldToolRadius.setBounds(148, 324, 86, 20);
		panel.add(textFieldToolRadius);
		textFieldToolRadius.setColumns(10);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBackground(new Color(255, 0, 0));
		textFieldAnswer.setBorder(null);
		textFieldAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnswer.setBounds(148, 425, 86, 20);
		panel.add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Clear fields
				textFieldDesiredFinish.setText("");
				textFieldToolRadius.setText("");
				textFieldAnswer.setText("");
			}
		});
		btnReset.setBackground(new Color(95, 158, 160));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(145, 381, 89, 23);
		panel.add(btnReset);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnswer.setBounds(10, 422, 128, 23);
		panel.add(lblAnswer);
		
		JLabel lblInchPerRevolution = new JLabel("( in inches per revolution)");
		lblInchPerRevolution.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblInchPerRevolution.setForeground(new Color(255, 0, 0));
		lblInchPerRevolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblInchPerRevolution.setBounds(244, 430, 175, 14);
		panel.add(lblInchPerRevolution);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frame3.class.getResource("/resources/finishcalclogo.png")));
		lblNewLabel.setBounds(56, 25, 633, 193);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Frame3.class.getResource("/resources/Type130_detail.jpg")));
		lblNewLabel_1.setBounds(441, 229, 270, 185);
		panel.add(lblNewLabel_1);
	}
}
