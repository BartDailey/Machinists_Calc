package trigCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

public class TrigFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrigFrame frame = new TrigFrame();
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
	public TrigFrame() {
		setFont(new Font("Cambria Math", Font.ITALIC, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrigFrame.class.getResource("/resources/logoCaliper.png")));
		setTitle("Machinists Calculator");
		setForeground(Color.RED);
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(143, 188, 143)));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 245, 238));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("SansSerif", Font.PLAIN, 11));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(6, 6, 772, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(TrigFrame.class.getResource("/resources/Untitled.png")));
		lblNewLabel.setBounds(16, 6, 724, 151);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TrigFrame.class.getResource("/resources/american_turnmaster_slant_bed_family.png")));
		lblNewLabel_1.setBounds(373, 267, 534, 277);
		panel.add(lblNewLabel_1);
		
		JLabel lblClickButtonsOn = new JLabel("Click buttons on left to open program in new widow.");
		lblClickButtonsOn.setBackground(new Color(47, 79, 79));
		lblClickButtonsOn.setForeground(new Color(139, 0, 0));
		lblClickButtonsOn.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickButtonsOn.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblClickButtonsOn.setBounds(426, 142, 340, 89);
		panel.add(lblClickButtonsOn);
		
		JButton btnNewButton_1 = new JButton("LGA Calculator");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(184, 195, 156, 28);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame6 f6 = new Frame6();
				f6.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(95, 158, 160));
		
		JButton btnDrillPointCalc = new JButton("Drill Point Calc");
		btnDrillPointCalc.setBounds(16, 195, 156, 28);
		panel.add(btnDrillPointCalc);
		btnDrillPointCalc.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDrillPointCalc.setBackground(new Color(95, 158, 160));
		
		JButton btnNewButton_2 = new JButton("Speeds and Feeds");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setBounds(184, 235, 156, 28);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame7 f7 = new Frame7();
				f7.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(95, 158, 160));
		
		JButton btnSurfaceFinishCalc = new JButton("Surface Finish Calc");
		btnSurfaceFinishCalc.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSurfaceFinishCalc.setBounds(16, 235, 156, 28);
		panel.add(btnSurfaceFinishCalc);
		btnSurfaceFinishCalc.setBackground(new Color(95, 158, 160));
		
		JButton btnRunTimeCalculator = new JButton("Run Time Calculator");
		btnRunTimeCalculator.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRunTimeCalculator.setBounds(184, 275, 156, 28);
		panel.add(btnRunTimeCalculator);
		btnRunTimeCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame8 f8 = new Frame8();
				f8.setVisible(true);
			}
		});
		btnRunTimeCalculator.setBackground(new Color(95, 158, 160));
		
		JButton btnWeightCalc = new JButton("Weight Calc");
		btnWeightCalc.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnWeightCalc.setBounds(184, 315, 156, 28);
		panel.add(btnWeightCalc);
		btnWeightCalc.setBackground(new Color(95, 158, 160));
		
		JButton btnBoltCirrcleCalculator = new JButton("Bolt Circle Calculator");
		btnBoltCirrcleCalculator.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBoltCirrcleCalculator.setBounds(184, 355, 156, 28);
		panel.add(btnBoltCirrcleCalculator);
		btnBoltCirrcleCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame4 f4 = new Frame4();
				f4.setVisible(true);
			}
		});
		btnBoltCirrcleCalculator.setBackground(new Color(95, 158, 160));
		
		JButton btnMetricConversion = new JButton("Metric Conversion");
		btnMetricConversion.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnMetricConversion.setBounds(16, 315, 156, 28);
		panel.add(btnMetricConversion);
		btnMetricConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame9 f9 = new Frame9();
				f9.setVisible(true);
			}
		});
		btnMetricConversion.setBackground(new Color(95, 158, 160));
		
		JButton btnNewButton_3 = new JButton("Increment Calculator");
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_3.setBounds(16, 275, 156, 28);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame10 f10 = new Frame10();
				f10.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(new Color(95, 158, 160));
		btnNewButton_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Angle Calculator");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(16, 355, 156, 28);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame5 f5 = new Frame5();
				f5.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(95, 158, 160));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btnDrillPointCalc, btnWeightCalc}));
		btnWeightCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
			}
		});
		btnSurfaceFinishCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3 f3 = new Frame3();
				f3.setVisible(true);
			}
		});
		btnDrillPointCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame1 f1 = new Frame1();
				f1.setVisible(true);
				
			}
		});
	}
}
