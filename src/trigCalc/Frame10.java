package trigCalc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Frame10 extends JFrame {


	private JPanel contentPane;
	private JTextField textFieldInitValue;
	private JTextField textFieldIncValue;
	private JTextField textFieldNumRows;
	private JTextField textFieldAnswer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame10 frame = new Frame10();
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
	public Frame10() {
		setVisible(true);
		setBounds(new Rectangle(0, 0, 1200, 920));
		setTitle("Incremental Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1164, 849);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInitialValue = new JLabel("Initial value");
		lblInitialValue.setHorizontalAlignment(SwingConstants.LEADING);
		lblInitialValue.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInitialValue.setBounds(10, 175, 124, 31);
		contentPane.add(lblInitialValue);

		textFieldInitValue = new JTextField();
		textFieldInitValue.setBounds(169, 182, 86, 20);
		contentPane.add(textFieldInitValue);
		textFieldInitValue.setColumns(10);

		JLabel lblNewLabel = new JLabel("Increment Value");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 253, 124, 25);
		contentPane.add(lblNewLabel);

		textFieldIncValue = new JTextField();
		textFieldIncValue.setBounds(169, 257, 86, 20);
		contentPane.add(textFieldIncValue);
		textFieldIncValue.setColumns(10);

		JButton btnCalculate = new JButton("Calculate +");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double i;
				double answer;
				answer = 0;

				
				DecimalFormat df = new DecimalFormat("###.####");
				try{
					double num1=Double.parseDouble(textFieldInitValue.getText());
					double num2=Double.parseDouble(textFieldIncValue.getText());
					double n=Double.parseDouble(textFieldNumRows.getText());
					//num1 = 3;
					//num2 = .2;
					//n = 5;
					for(i = num1; i <= n; i+= num2){
						answer = i;
						if(i >= n * num2)
							break;
						System.out.println(df.format(answer));
					}
				} catch(Exception a){
					JOptionPane.showMessageDialog(null, "Please enter valid number ");
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalculate.setBounds(10, 446, 116, 23);
		contentPane.add(btnCalculate);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldInitValue.setText("");
				textFieldIncValue.setText("");
				textFieldNumRows.setText("");
				//textFieldanswer.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(10, 517, 104, 23);
		contentPane.add(btnReset);

		JLabel lblNumberOfHoles = new JLabel("Increment Length");
		lblNumberOfHoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumberOfHoles.setBounds(10, 333, 137, 31);
		contentPane.add(lblNumberOfHoles);

		textFieldNumRows = new JTextField();
		textFieldNumRows.setBounds(169, 340, 86, 20);
		contentPane.add(textFieldNumRows);
		textFieldNumRows.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate -");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double i;
				double answer;
				double n1;
				double n2;
				n1 = 0;
				n2 = 0;
				answer = 0;
				DecimalFormat df = new DecimalFormat("###.####");
				
				try {
					double num1=Double.parseDouble(textFieldInitValue.getText());
					double num2=Double.parseDouble(textFieldIncValue.getText());
					double n=Double.parseDouble(textFieldNumRows.getText());
					//double answer=Double.parseDouble(textFieldAnswer.toString());
						for(i = num1 - num2; i >= -20; i -=num2 ){
							answer = i;
							n1 = n  * num2;
							n2 = (num1) - n1;
							if(i <= n2 )
								break;
							System.out.println( df.format(answer));
							
						}
					}
					 catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number ");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(169, 446, 116, 23);
		contentPane.add(btnNewButton);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(386, 107, 539, 20);
		contentPane.add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		



	}
}




