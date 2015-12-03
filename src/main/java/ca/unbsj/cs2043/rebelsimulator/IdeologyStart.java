package ca.unbsj.cs2043.rebelsimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Choice;

public class IdeologyStart extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreset;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdeologyStart frame = new IdeologyStart();
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
	public IdeologyStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPreset = new JTextField();
		txtPreset.setForeground(Color.RED);
		txtPreset.setBackground(Color.BLACK);
		txtPreset.setBounds(142, 5, 109, 20);
		txtPreset.setText("Pre-Made Ideology?");
		contentPane.add(txtPreset);
		txtPreset.setColumns(10);
		
		JButton btnYes = new JButton("Yes");
		
		btnYes.setForeground(Color.RED);
		btnYes.setBackground(Color.DARK_GRAY);
		btnYes.setBounds(56, 48, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBackground(Color.DARK_GRAY);
		btnNo.setForeground(Color.RED);
		btnNo.setBounds(255, 48, 89, 23);
		contentPane.add(btnNo);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(Color.DARK_GRAY);
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(335, 227, 89, 23);
		contentPane.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(235, 95, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIdeologyName = new JLabel("Ideology Name:");
		lblIdeologyName.setForeground(Color.RED);
		lblIdeologyName.setBounds(235, 82, 90, 14);
		contentPane.add(lblIdeologyName);
		
		Choice choice = new Choice();
		choice.setBounds(56, 95, 98, 20);
		contentPane.add(choice);
		choice.addItem("Communist");
		choice.addItem("National Socialist");
		choice.addItem("Social Libertarian");
		choice.addItem("Anarcho-Communist");
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(382, 145, 28, 20);
		contentPane.add(choice_1);
		for (int i=0; i<10; i++)
			choice_1.addItem(""+i);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(382, 119, 28, 20);
		contentPane.add(choice_2);
		for (int i=0; i<10; i++)
			choice_2.addItem(""+i);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(382, 197, 28, 20);
		contentPane.add(choice_3);
		for (int i=0; i<10; i++)
			choice_3.addItem(""+i);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(382, 171, 28, 20);
		contentPane.add(choice_4);
		for (int i=0; i<10; i++)
			choice_4.addItem(""+i);
		
		JLabel lblAuthoritarianizm = new JLabel("authoritarianizm");
		lblAuthoritarianizm.setForeground(Color.RED);
		lblAuthoritarianizm.setBounds(300, 126, 89, 14);
		contentPane.add(lblAuthoritarianizm);
		
		JLabel lblNewLabel = new JLabel("righist-ness");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(321, 151, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("militancy");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(330, 177, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("traditionalizm");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(310, 202, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNo.setVisible(false);
			}
		});
		
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnYes.setVisible(false);
			}
		});
	}
}
