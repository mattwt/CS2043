package ca.unbsj.cs2043.rebelsimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnSubmit;
	String orgName=":)";
	/**
	 * Launch the application.
	 */
	 public static void init(MapGUI m) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start1 frame = new Start1(m);
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
	public Start1(MapGUI m) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setBounds(166, 87, 89, 30);
		lblEnterYourName.setForeground(Color.RED);
		contentPane.add(lblEnterYourName);
		
		textField = new JTextField();
		textField.setBounds(154, 116, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.orgName=textField.getText();
				IdeologyStart.init();
				dispose();
			}
		});
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBackground(Color.DARK_GRAY);
		btnSubmit.setBounds(335, 215, 89, 23);
		contentPane.add(btnSubmit);
		
	}

}
