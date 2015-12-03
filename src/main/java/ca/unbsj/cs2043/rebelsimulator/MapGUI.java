package ca.unbsj.cs2043.rebelsimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MapGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSomethingWasClicked;

	/**
	 * Launch the application.
	 */
	//variables
	Organization o;
	CountryList c;
	String orgName;
	MapGUI m= this;
	
	//set up and begin
	public void init(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapGUI frame = new MapGUI();
					//dealing with things here
					Start1.init(m);
					////////////////////////////////////////////////////////
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
	public MapGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 655, 1359, -656);
		contentPane.add(layeredPane);
		
		
		JLabel lblMapBackground;
				try{ 
					URL url= new URL("http://i1075.photobucket.com/albums/w440/luinloth/2073Proj/Modified/World%20Map%20Ouline.png");
					ImageIcon map= new ImageIcon(url);
					lblMapBackground=new JLabel(map);
					lblMapBackground.setBackground(Color.WHITE);
					lblMapBackground.setForeground(Color.BLACK);
					}
				catch (MalformedURLException e){lblMapBackground= new JLabel("error-check your internet connection");}
		lblMapBackground.setBounds(-120, 0, 1479, 661);
		contentPane.add(lblMapBackground);
		
		/////////////////////////////Country Buttons///////////////////////////////////////

		//North America
		JButton btnNA1 = new JButton();
		btnNA1.setBounds(170, 176, 126, 75);
		contentPane.add(btnNA1);
		btnNA1.setOpaque(false);
		btnNA1.setContentAreaFilled(false);
		btnNA1.setBorderPainted(false);
		
		JButton btnNA2 = new JButton();
		btnNA2.setBounds(284, 183, 39, 50);
		contentPane.add(btnNA2);
		btnNA2.setOpaque(false);
		btnNA2.setContentAreaFilled(false);
		btnNA2.setBorderPainted(false);

		JButton btnNA3 = new JButton();
		btnNA3.setBounds(180, 79, 212, 122);
		contentPane.add(btnNA3);
		btnNA3.setOpaque(false);
		btnNA3.setContentAreaFilled(false);
		btnNA3.setBorderPainted(false);
		
		JButton btnNA4 = new JButton();
		btnNA4.setBounds(103, 91, 89, 67);
		contentPane.add(btnNA4);
		btnNA4.setOpaque(false);
		btnNA4.setContentAreaFilled(false);
		btnNA4.setBorderPainted(false);
		
		JButton btnNA5 = new JButton();
		btnNA5.setBounds(353, 58, 151, 78);
		contentPane.add(btnNA5);
		btnNA5.setOpaque(false);
		btnNA5.setContentAreaFilled(false);
		btnNA5.setBorderPainted(false);
		
		//Central Africa 
		JButton btnCAfrica1 = new JButton();
		btnCAfrica1.setBounds(684, 329, 12, 23);
		contentPane.add(btnCAfrica1);
		btnCAfrica1.setOpaque(false);
		btnCAfrica1.setContentAreaFilled(false);
		btnCAfrica1.setBorderPainted(false);
				
		JButton btnCAfrica2 = new JButton();
		btnCAfrica2.setBounds(672, 352, 12, 18);
		contentPane.add(btnCAfrica2);
		btnCAfrica2.setOpaque(false);
		btnCAfrica2.setContentAreaFilled(false);
		btnCAfrica2.setBorderPainted(false);
				
		JButton btnCAfrica3 = new JButton();
		btnCAfrica3.setBounds(586, 362, 89, 30);
		contentPane.add(btnCAfrica3);
		btnCAfrica3.setOpaque(false);
		btnCAfrica3.setContentAreaFilled(false);
		btnCAfrica3.setBorderPainted(false);
		
		JButton btnCAfrica4 = new JButton();
		btnCAfrica4.setBounds(572, 389, 89, 18);
		contentPane.add(btnCAfrica4);
		btnCAfrica4.setOpaque(false);
		btnCAfrica4.setContentAreaFilled(false);
		btnCAfrica4.setBorderPainted(false);
		
		JButton btnCAfrica5 = new JButton();
		btnCAfrica5.setBounds(636, 398, 25, 23);
		contentPane.add(btnCAfrica5);
		btnCAfrica5.setOpaque(false);
		btnCAfrica5.setContentAreaFilled(false);
		btnCAfrica5.setBorderPainted(false);
		
		JButton btnCAfrica6 = new JButton();
		btnCAfrica6.setBounds(596, 396, 25, 23);
		contentPane.add(btnCAfrica6);
		btnCAfrica6.setOpaque(false);
		btnCAfrica6.setContentAreaFilled(false);
		btnCAfrica6.setBorderPainted(false);
		
		JButton btnCAfrica7 = new JButton();
		btnCAfrica7.setBounds(544, 329, 32, 63);
		contentPane.add(btnCAfrica7);
		btnCAfrica7.setOpaque(false);
		btnCAfrica7.setContentAreaFilled(false);
		btnCAfrica7.setBorderPainted(false);
		
		JButton btnCAfrica8= new JButton();
		btnCAfrica8.setBounds(572, 362, 18, 45);
		contentPane.add(btnCAfrica8);
		btnCAfrica8.setOpaque(false);
		btnCAfrica8.setContentAreaFilled(false);
		btnCAfrica8.setBorderPainted(false);
		
		//CentralAmerica
		JButton btnCAmerica1 = new JButton();
		btnCAmerica1.setBounds(265, 277, 58, 30);
		contentPane.add(btnCAmerica1);
		btnCAmerica1.setOpaque(false);
		btnCAmerica1.setContentAreaFilled(false);
		btnCAmerica1.setBorderPainted(false);
		
		JButton btnCAmerica2 = new JButton();
		btnCAmerica2.setBounds(320, 300, 25, 63);
		contentPane.add(btnCAmerica2);
		btnCAmerica2.setOpaque(false);
		btnCAmerica2.setContentAreaFilled(false);
		btnCAmerica2.setBorderPainted(false);
		
		JButton btnCAmerica3 = new JButton();
		btnCAmerica3.setBounds(342, 347, 25, 23);
		contentPane.add(btnCAmerica3);
		btnCAmerica3.setOpaque(false);
		btnCAmerica3.setContentAreaFilled(false);
		btnCAmerica3.setBorderPainted(false);					
		
		JButton btnCAmerica4 = new JButton();
		btnCAmerica4.setBounds(265, 329, 58, 41);
		contentPane.add(btnCAmerica4);
		btnCAmerica4.setOpaque(false);
		btnCAmerica4.setContentAreaFilled(false);
		btnCAmerica4.setBorderPainted(false);	
		
		JButton btnCAmerica5 = new JButton();
		btnCAmerica5.setBounds(265, 362, 45, 23);
		contentPane.add(btnCAmerica5);
		btnCAmerica5.setOpaque(false);
		btnCAmerica5.setContentAreaFilled(false);
		btnCAmerica5.setBorderPainted(false);	
		
		JButton btnCAmerica6 = new JButton();
		btnCAmerica6.setBounds(265, 369, 17, 23);
		contentPane.add(btnCAmerica6);
		btnCAmerica6.setOpaque(false);
		btnCAmerica6.setContentAreaFilled(false);
		btnCAmerica6.setBorderPainted(false);	
		
		JButton btnCAmerica7 = new JButton();
		btnCAmerica7.setBounds(254, 313, 12, 30);
		contentPane.add(btnCAmerica7);
		btnCAmerica7.setOpaque(false);
		btnCAmerica7.setContentAreaFilled(false);
		btnCAmerica7.setBorderPainted(false);				
		
		JButton btnCAmerica8 = new JButton();
		btnCAmerica8.setBounds(237, 285, 18, 40);
		contentPane.add(btnCAmerica8);
		btnCAmerica8.setOpaque(false);
		btnCAmerica8.setContentAreaFilled(false);
		btnCAmerica8.setBorderPainted(false);
		
		JButton btnCAmerica9 = new JButton();
		btnCAmerica9.setBounds(205, 300, 39, 18);
		contentPane.add(btnCAmerica9);
		btnCAmerica9.setOpaque(false);
		btnCAmerica9.setContentAreaFilled(false);
		btnCAmerica9.setBorderPainted(false);	
		
		JButton btnCAmerica10 = new JButton();
		btnCAmerica10.setBounds(180, 259, 47, 45);
		contentPane.add(btnCAmerica10);
		btnCAmerica10.setOpaque(false);
		btnCAmerica10.setContentAreaFilled(false);
		btnCAmerica10.setBorderPainted(false);	
		
		JButton btnCAmerica11 = new JButton("");
		btnCAmerica11.setBounds(170, 246, 39, 23);
		contentPane.add(btnCAmerica11);
		btnCAmerica11.setOpaque(false);
		btnCAmerica11.setContentAreaFilled(false);
		btnCAmerica11.setBorderPainted(false);
		
		//China(and friends)
		JButton btnChina1 = new JButton();
		btnChina1.setBounds(766, 300, 25, 39);
		contentPane.add(btnChina1);
		btnChina1.setOpaque(false);
		btnChina1.setContentAreaFilled(false);
		btnChina1.setBorderPainted(false);
		
		JButton btnChina2 = new JButton();
		btnChina2.setBounds(759, 229, 47, 78);
		contentPane.add(btnChina2);
		btnChina2.setOpaque(false);
		btnChina2.setContentAreaFilled(false);
		btnChina2.setBorderPainted(false);
		
		JButton btnChina3 = new JButton();
		btnChina3.setBounds(759, 206, 130, 53);
		contentPane.add(btnChina3);
		btnChina3.setOpaque(false);
		btnChina3.setContentAreaFilled(false);
		btnChina3.setBorderPainted(false);
		
		JButton btnChina4 = new JButton();
		btnChina4.setBounds(840, 229, 66, 53);
		contentPane.add(btnChina4);
		btnChina4.setOpaque(false);
		btnChina4.setContentAreaFilled(false);
		btnChina4.setBorderPainted(false);
		
		JButton btnChina5 = new JButton();
		btnChina5.setBounds(773, 176, 82, 30);
		contentPane.add(btnChina5);
		btnChina5.setOpaque(false);
		btnChina5.setContentAreaFilled(false);
		btnChina5.setBorderPainted(false);
		
		JButton btnChina6 = new JButton();
		btnChina6.setBounds(848, 177, 25, 18);
		contentPane.add(btnChina6);
		btnChina6.setOpaque(false);
		btnChina6.setContentAreaFilled(false);
		btnChina6.setBorderPainted(false);
		
		JButton btnChina7 = new JButton();
		btnChina7.setBounds(751, 259, 18, 30);
		contentPane.add(btnChina7);
		btnChina7.setOpaque(false);
		btnChina7.setContentAreaFilled(false);
		btnChina7.setBorderPainted(false);

		//EU
		JButton btnEU1 = new JButton();
		btnEU1.setBounds(540, 91, 71, 135);
		contentPane.add(btnEU1);
		btnEU1.setOpaque(false);
		btnEU1.setContentAreaFilled(false);
		btnEU1.setBorderPainted(false);
		
		JButton btnEU2 = new JButton();
		btnEU2.setBounds(504, 135, 43, 96);
		contentPane.add(btnEU2);
		btnEU2.setOpaque(false);
		btnEU2.setContentAreaFilled(false);
		btnEU2.setBorderPainted(false);
		
		JButton btnEU3 = new JButton();
		btnEU3.setBounds(607, 193, 45, 18);
		contentPane.add(btnEU3);
		btnEU3.setOpaque(false);
		btnEU3.setContentAreaFilled(false);
		btnEU3.setBorderPainted(false);
		
		JButton btnEU4 = new JButton();
		btnEU4.setBounds(607, 172, 39, 23);
		contentPane.add(btnEU4);
		btnEU4.setOpaque(false);
		btnEU4.setContentAreaFilled(false);
		btnEU4.setBorderPainted(false);
		
		JButton btnEU5 = new JButton();
		btnEU5.setBounds(596, 147, 25, 30);
		contentPane.add(btnEU5);
		btnEU5.setOpaque(false);
		btnEU5.setContentAreaFilled(false);
		btnEU5.setBorderPainted(false);
		
		JButton btnEU6 = new JButton();
		btnEU6.setBounds(621, 161, 12, 23);
		contentPane.add(btnEU6);
		btnEU6.setOpaque(false);
		btnEU6.setContentAreaFilled(false);
		btnEU6.setBorderPainted(false);

		//Madagascar
		JButton btnMadagascar = new JButton();
		btnMadagascar.setBounds(664, 430, 25, 53);
		contentPane.add(btnMadagascar);
		btnMadagascar.setOpaque(false);
		btnMadagascar.setContentAreaFilled(false);
		btnMadagascar.setBorderPainted(false);
		
		//Middle East
		JButton btnME1 = new JButton();
		btnME1.setBounds(660, 229, 94, 47);
		contentPane.add(btnME1);
		btnME1.setOpaque(false);
		btnME1.setContentAreaFilled(false);
		btnME1.setBorderPainted(false);
		
		JButton btnME2 = new JButton();
		btnME2.setBounds(664, 277, 58, 30);
		contentPane.add(btnME2);
		btnME2.setOpaque(false);
		btnME2.setContentAreaFilled(false);
		btnME2.setBorderPainted(false);
		
		JButton btnME3 = new JButton();
		btnME3.setBounds(664, 300, 32, 23);
		contentPane.add(btnME3);
		btnME3.setOpaque(false);
		btnME3.setContentAreaFilled(false);
		btnME3.setBorderPainted(false);
		
		JButton btnME4 = new JButton();
		btnME4.setBounds(650, 206, 25, 70);
		contentPane.add(btnME4);
		btnME4.setOpaque(false);
		btnME4.setContentAreaFilled(false);
		btnME4.setBorderPainted(false);
		
		JButton btnME5 = new JButton();
		btnME5.setBounds(658, 277, 58, 23);
		contentPane.add(btnME5);
		btnME5.setOpaque(false);
		btnME5.setContentAreaFilled(false);
		btnME5.setBorderPainted(false);
		
		JButton btnME6 = new JButton();
		btnME6.setBounds(697, 206, 52, 27);
		contentPane.add(btnME6);
		btnME6.setOpaque(false);
		btnME6.setContentAreaFilled(false);
		btnME6.setBorderPainted(false);
		
		JButton btnME7 = new JButton();
		btnME7.setBounds(739, 228, 25, 30);
		contentPane.add(btnME7);
		btnME7.setOpaque(false);
		btnME7.setContentAreaFilled(false);
		btnME7.setBorderPainted(false);
		
		JButton btnME8 = new JButton();
		btnME8.setBounds(640, 229, 12, 40);
		contentPane.add(btnME8);
		btnME8.setOpaque(false);
		btnME8.setContentAreaFilled(false);
		btnME8.setBorderPainted(false);
		
		JButton btnME9 = new JButton();
		btnME9.setBounds(617, 206, 39, 23);
		contentPane.add(btnME9);
		btnME9.setOpaque(false);
		btnME9.setContentAreaFilled(false);
		btnME9.setBorderPainted(false);
		
		//North Africa
		JButton btnNAf1 = new JButton();
		btnNAf1.setBounds(514, 229, 50, 90);
		contentPane.add(btnNAf1);
		btnNAf1.setOpaque(false);
		btnNAf1.setContentAreaFilled(false);
		btnNAf1.setBorderPainted(false);
		
		JButton btnNAf2 = new JButton();
		btnNAf2.setBounds(504, 229, 14, 23);
		contentPane.add(btnNAf2);
		btnNAf2.setOpaque(false);
		btnNAf2.setContentAreaFilled(false);
		btnNAf2.setBorderPainted(false);
		
		JButton btnNAf3 = new JButton();
		btnNAf3.setBounds(479, 246, 39, 113);
		contentPane.add(btnNAf3);
		btnNAf3.setOpaque(false);
		btnNAf3.setContentAreaFilled(false);
		btnNAf3.setBorderPainted(false);
		
		JButton btnNAf4 = new JButton();
		btnNAf4.setBounds(504, 313, 39, 45);
		contentPane.add(btnNAf4);
		btnNAf4.setOpaque(false);
		btnNAf4.setContentAreaFilled(false);
		btnNAf4.setBorderPainted(false);
		
		JButton btnNAf5 = new JButton();
		btnNAf5.setBounds(550, 246, 89, 72);
		contentPane.add(btnNAf5);
		btnNAf5.setOpaque(false);
		btnNAf5.setContentAreaFilled(false);
		btnNAf5.setBorderPainted(false);
		
		JButton btnNAf6 = new JButton();
		btnNAf6.setBounds(572, 313, 18, 30);
		contentPane.add(btnNAf6);
		btnNAf6.setOpaque(false);
		btnNAf6.setContentAreaFilled(false);
		btnNAf6.setBorderPainted(false);
		
		JButton btnNAf7 = new JButton();
		btnNAf7.setBounds(586, 313, 25, 23);
		contentPane.add(btnNAf7);
		btnNAf7.setOpaque(false);
		btnNAf7.setContentAreaFilled(false);
		btnNAf7.setBorderPainted(false);
		
		JButton btnNAf8 = new JButton();
		btnNAf8.setBounds(636, 295, 18, 23);
		contentPane.add(btnNAf8);
		btnNAf8.setOpaque(false);
		btnNAf8.setContentAreaFilled(false);
		btnNAf8.setBorderPainted(false);
		
		JButton btnNAf9 = new JButton();
		btnNAf9.setBounds(621, 284, 25, 30);
		contentPane.add(btnNAf9);
		btnNAf9.setOpaque(false);
		btnNAf9.setContentAreaFilled(false);
		btnNAf9.setBorderPainted(false);
		
		JButton btnNAf10 = new JButton();
		btnNAf10.setBounds(607, 311, 54, 30);
		contentPane.add(btnNAf10);
		btnNAf10.setOpaque(false);
		btnNAf10.setContentAreaFilled(false);
		btnNAf10.setBorderPainted(false);
		
		JButton btnNAf11 = new JButton();
		btnNAf11.setBounds(617, 329, 56, 30);
		contentPane.add(btnNAf11);
		btnNAf11.setOpaque(false);
		btnNAf11.setContentAreaFilled(false);
		btnNAf11.setBorderPainted(false);
		
		JButton btnNAf12 = new JButton();
		btnNAf12.setBounds(664, 342, 20, 10);
		contentPane.add(btnNAf12);
		btnNAf12.setOpaque(false);
		btnNAf12.setContentAreaFilled(false);
		btnNAf12.setBorderPainted(false);
		
		//Oceania
		JButton btnOceania1 = new JButton();
		btnOceania1.setBounds(930, 425, 77, 113);
		contentPane.add(btnOceania1);
		btnOceania1.setOpaque(false);
		btnOceania1.setContentAreaFilled(false);
		btnOceania1.setBorderPainted(false);
		
		JButton btnOceania2 = new JButton();
		btnOceania2.setBounds(874, 440, 58, 84);
		contentPane.add(btnOceania2);
		btnOceania2.setOpaque(false);
		btnOceania2.setContentAreaFilled(false);
		btnOceania2.setBorderPainted(false);
		
		JButton btnOceania3 = new JButton();
		btnOceania3.setBounds(952, 536, 25, 23);
		contentPane.add(btnOceania3);
		btnOceania3.setOpaque(false);
		btnOceania3.setContentAreaFilled(false);
		btnOceania3.setBorderPainted(false);
		
		JButton btnOceania4 = new JButton();
		btnOceania4.setBounds(1009, 523, 66, 50);
		contentPane.add(btnOceania4);
		btnOceania4.setOpaque(false);
		btnOceania4.setContentAreaFilled(false);
		btnOceania4.setBorderPainted(false);
		
		JButton btnOceania5 = new JButton();
		btnOceania5.setBounds(940, 369, 101, 67);
		contentPane.add(btnOceania5);
		btnOceania5.setOpaque(false);
		btnOceania5.setContentAreaFilled(false);
		btnOceania5.setBorderPainted(false);
		
		JButton btnOceania6 = new JButton();
		btnOceania6.setBounds(1040, 430, 94, 40);
		contentPane.add(btnOceania6);
		btnOceania6.setOpaque(false);
		btnOceania6.setContentAreaFilled(false);
		btnOceania6.setBorderPainted(false);	
		
		JButton btnRussia1 = new JButton();
		btnRussia1.setBounds(865, 93, 126, 67);
		contentPane.add(btnRussia1);
		btnRussia1.setOpaque(false);
		btnRussia1.setContentAreaFilled(false);
		btnRussia1.setBorderPainted(false);	
		
		JButton btnRussia2 = new JButton();
		btnRussia2.setBounds(889, 154, 32, 23);
		contentPane.add(btnRussia2);
		btnRussia2.setOpaque(false);
		btnRussia2.setContentAreaFilled(false);
		btnRussia2.setBorderPainted(false);	
		
		JButton btnRussia3 = new JButton();
		btnRussia3.setBounds(914, 161, 12, 41);
		contentPane.add(btnRussia3);
		btnRussia3.setOpaque(false);
		btnRussia3.setContentAreaFilled(false);
		btnRussia3.setBorderPainted(false);	
		
		JButton btnRussia4 = new JButton();
		btnRussia4.setBounds(875, 155, 18, 10);
		contentPane.add(btnRussia4);
		btnRussia4.setOpaque(false);
		btnRussia4.setContentAreaFilled(false);
		btnRussia4.setBorderPainted(false);	
		
		JButton btnRussia5 = new JButton();
		btnRussia5.setBounds(784, 91, 82, 78);
		contentPane.add(btnRussia5);
		btnRussia5.setOpaque(false);
		btnRussia5.setContentAreaFilled(false);
		btnRussia5.setBorderPainted(false);	
		
		JButton btnRussia6 = new JButton();
		btnRussia6.setBounds(766, 135, 18, 50);
		contentPane.add(btnRussia6);
		btnRussia6.setOpaque(false);
		btnRussia6.setContentAreaFilled(false);
		btnRussia6.setBorderPainted(false);	
		
		JButton btnRussia7 = new JButton();
		btnRussia7.setBounds(720, 135, 49, 66);
		contentPane.add(btnRussia7);
		btnRussia7.setOpaque(false);
		btnRussia7.setContentAreaFilled(false);
		btnRussia7.setBorderPainted(false);	
		
		JButton btnRussia8 = new JButton();
		btnRussia8.setBounds(697, 88, 94, 50);
		contentPane.add(btnRussia8);
		btnRussia8.setOpaque(false);
		btnRussia8.setContentAreaFilled(false);
		btnRussia8.setBorderPainted(false);	
		
		JButton btnRussia9 = new JButton();
		btnRussia9.setBounds(720, 73, 66, 23);
		contentPane.add(btnRussia9);
		btnRussia9.setOpaque(false);
		btnRussia9.setContentAreaFilled(false);
		btnRussia9.setBorderPainted(false);	
		
		JButton btnRussia10 = new JButton();
		btnRussia10.setBounds(697, 135, 25, 53);
		contentPane.add(btnRussia10);
		btnRussia10.setOpaque(false);
		btnRussia10.setContentAreaFilled(false);
		btnRussia10.setBorderPainted(false);	
		
		JButton btnRussia11 = new JButton();
		btnRussia11.setBounds(625, 102, 71, 67);
		contentPane.add(btnRussia11);
		btnRussia11.setOpaque(false);
		btnRussia11.setContentAreaFilled(false);
		btnRussia11.setBorderPainted(false);	
		
		JButton btnRussia12 = new JButton();
		btnRussia12.setBounds(613, 102, 20, 50);
		contentPane.add(btnRussia12);
		btnRussia12.setOpaque(false);
		btnRussia12.setContentAreaFilled(false);
		btnRussia12.setBorderPainted(false);	
		
		JButton btnRussia13 = new JButton();
		btnRussia13.setBounds(643, 161, 25, 40);
		contentPane.add(btnRussia13);
		btnRussia13.setOpaque(false);
		btnRussia13.setContentAreaFilled(false);
		btnRussia13.setBorderPainted(false);	

		//South East Asia
		JButton btnSEAsia1 = new JButton();
		btnSEAsia1.setBounds(835, 289, 45, 122);
		contentPane.add(btnSEAsia1);
		btnSEAsia1.setOpaque(false);
		btnSEAsia1.setContentAreaFilled(false);
		btnSEAsia1.setBorderPainted(false);	
		
		JButton btnSEAsia2 = new JButton();
		btnSEAsia2.setBounds(816, 259, 25, 53);
		contentPane.add(btnSEAsia2);
		btnSEAsia2.setOpaque(false);
		btnSEAsia2.setContentAreaFilled(false);
		btnSEAsia2.setBorderPainted(false);	
		
		JButton btnSEAsia3 = new JButton();
		btnSEAsia3.setBounds(808, 259, 18, 23);
		contentPane.add(btnSEAsia3);
		btnSEAsia3.setOpaque(false);
		btnSEAsia3.setContentAreaFilled(false);
		btnSEAsia3.setBorderPainted(false);	
		
		JButton btnSEAsia4 = new JButton();
		btnSEAsia4.setBounds(874, 352, 66, 69);
		contentPane.add(btnSEAsia4);
		btnSEAsia4.setOpaque(false);
		btnSEAsia4.setContentAreaFilled(false);
		btnSEAsia4.setBorderPainted(false);	
		
		JButton btnSEAsia5 = new JButton();
		btnSEAsia5.setBounds(900, 300, 40, 52);
		contentPane.add(btnSEAsia5);
		btnSEAsia5.setOpaque(false);
		btnSEAsia5.setContentAreaFilled(false);
		btnSEAsia5.setBorderPainted(false);	
		
		JButton btnSEAsia6 = new JButton();
		btnSEAsia6.setBounds(909, 271, 12, 18);
		contentPane.add(btnSEAsia6);
		btnSEAsia6.setOpaque(false);
		btnSEAsia6.setContentAreaFilled(false);
		btnSEAsia6.setBorderPainted(false);	
		
		JButton btnSEAsia7 = new JButton();
		btnSEAsia7.setBounds(905, 210, 18, 23);
		contentPane.add(btnSEAsia7);
		btnSEAsia7.setOpaque(false);
		btnSEAsia7.setContentAreaFilled(false);
		btnSEAsia7.setBorderPainted(false);	
		
		JButton btnSEAsia8 = new JButton();
		btnSEAsia8.setBounds(929, 222, 18, 29);
		contentPane.add(btnSEAsia8);
		btnSEAsia8.setOpaque(false);
		btnSEAsia8.setContentAreaFilled(false);
		btnSEAsia8.setBorderPainted(false);	
		
		JButton btnSEAsia9 = new JButton();
		btnSEAsia9.setBounds(940, 183, 18, 50);
		contentPane.add(btnSEAsia9);
		btnSEAsia9.setOpaque(false);
		btnSEAsia9.setContentAreaFilled(false);
		btnSEAsia9.setBorderPainted(false);	
		
		JButton btnSEAsia10 = new JButton();
		btnSEAsia10.setBounds(935, 172, 12, 23);
		contentPane.add(btnSEAsia10);
		btnSEAsia10.setOpaque(false);
		btnSEAsia10.setContentAreaFilled(false);
		btnSEAsia10.setBorderPainted(false);	

		//South Africa
		JButton btnSA1 = new JButton();
		btnSA1.setBounds(621, 413, 18, 70);
		contentPane.add(btnSA1);
		btnSA1.setOpaque(false);
		btnSA1.setContentAreaFilled(false);
		btnSA1.setBorderPainted(false);
		
		JButton btnSA2 = new JButton();
		btnSA2.setBounds(572, 403, 18, 23);
		contentPane.add(btnSA2);
		btnSA2.setOpaque(false);
		btnSA2.setContentAreaFilled(false);
		btnSA2.setBorderPainted(false);
		
		JButton btnSA3 = new JButton();
		btnSA3.setBounds(596, 403, 5, 33);
		contentPane.add(btnSA3);
		btnSA3.setOpaque(false);
		btnSA3.setContentAreaFilled(false);
		btnSA3.setBorderPainted(false);
		
		JButton btnSA4 = new JButton();
		btnSA4.setBounds(572, 413, 25, 23);
		contentPane.add(btnSA4);
		btnSA4.setOpaque(false);
		btnSA4.setContentAreaFilled(false);
		btnSA4.setBorderPainted(false);
		
		JButton btnSA5 = new JButton();
		btnSA5.setBounds(569, 423, 52, 60);
		contentPane.add(btnSA5);
		btnSA5.setOpaque(false);
		btnSA5.setContentAreaFilled(false);
		btnSA5.setBorderPainted(false);
		
		JButton btnSA6 = new JButton();
		btnSA6.setBounds(579, 480, 54, 41);
		contentPane.add(btnSA6);
		btnSA6.setOpaque(false);
		btnSA6.setContentAreaFilled(false);
		btnSA6.setBorderPainted(false);
		
		JButton btnSA7 = new JButton();
		btnSA7.setBounds(636, 421, 25, 41);
		contentPane.add(btnSA7);
		btnSA7.setOpaque(false);
		btnSA7.setContentAreaFilled(false);
		btnSA7.setBorderPainted(false);
		
		JButton btnSA8 = new JButton();
		btnSA8.setBounds(640, 460, 12, 23);
		contentPane.add(btnSA8);
		btnSA8.setOpaque(false);
		btnSA8.setContentAreaFilled(false);
		btnSA8.setBorderPainted(false);
		
		//South America
		JButton btnSAm1 = new JButton();
		btnSAm1.setBounds(312, 369, 66, 23);
		contentPane.add(btnSAm1);
		btnSAm1.setOpaque(false);
		btnSAm1.setContentAreaFilled(false);
		btnSAm1.setBorderPainted(false);
		
		JButton btnSAm2 = new JButton();
		btnSAm2.setBounds(330, 362, 8, 23);
		contentPane.add(btnSAm2);
		btnSAm2.setOpaque(false);
		btnSAm2.setContentAreaFilled(false);
		btnSAm2.setBorderPainted(false);
		
		JButton btnSAm3 = new JButton();
		btnSAm3.setBounds(275, 389, 144, 67);
		contentPane.add(btnSAm3);
		btnSAm3.setOpaque(false);
		btnSAm3.setContentAreaFilled(false);
		btnSAm3.setBorderPainted(false);
		
		JButton btnSAm4 = new JButton();
		btnSAm4.setBounds(303, 453, 89, 154);
		contentPane.add(btnSAm4);
		btnSAm4.setOpaque(false);
		btnSAm4.setContentAreaFilled(false);
		btnSAm4.setBorderPainted(false);
		
		JButton btnSAm5 = new JButton();
		btnSAm5.setBounds(330, 440, 89, 30);
		contentPane.add(btnSAm5);
		btnSAm5.setOpaque(false);
		btnSAm5.setContentAreaFilled(false);
		btnSAm5.setBorderPainted(false);

		
		//Test stuff/////////////////////////////////////////////////////////////////
		txtSomethingWasClicked = new JTextField();
		txtSomethingWasClicked.setText("SOMETHING WAS CLICKED!!!!");
		txtSomethingWasClicked.setBounds(320, 218, 174, 20);
		contentPane.add(txtSomethingWasClicked);
		txtSomethingWasClicked.setColumns(10);
		txtSomethingWasClicked.setOpaque(false);
		
		/////////////////////////////////////////////////////////////////////////////

		
		//quick menu bar
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(1270, 190, 82, 135);
		contentPane.add(btnEnter);
		btnEnter.setBackground(new Color(238, 36, 36));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(1270, 325, 82, 146);
		contentPane.add(btnExit);
		btnExit.setBackground(new Color(238, 36, 36));
		
		try{
			URL u= new URL("http://i1075.photobucket.com/albums/w440/luinloth/2073Proj/RealPics/Action%20Bar.png");
			ImageIcon img= new ImageIcon(u);
			JLabel lblQuickMenu = new JLabel(img);
			lblQuickMenu.setBounds(1270, 193, 82, 277);
			contentPane.add(lblQuickMenu);
			
			btnEnter.setOpaque(false);
			btnEnter.setContentAreaFilled(false);
			btnEnter.setBorderPainted(false);
			btnEnter.setText("");
			btnEnter.setToolTipText("Enter");
			
			btnExit.setOpaque(false);
			btnExit.setContentAreaFilled(false);
			btnExit.setBorderPainted(false);
			btnExit.setText("");
			btnExit.setToolTipText("Exit");
		}
		catch(MalformedURLException e){
			System.out.println("url probs-menu bar: "+ e);
		}
		
		//options box
		JButton btnTech = new JButton("TECH");
		btnTech.setBounds(0, 259, 89, 66);
		contentPane.add(btnTech);
		btnTech.setBackground(new Color(238, 36, 36));
		btnTech.setBorderPainted(false);
		
		JButton btnPolicy = new JButton("POLICY");
		btnPolicy.setBounds(0, 362, 89, 67);
		contentPane.add(btnPolicy);
		btnPolicy.setBackground(new Color(238, 36, 36));
		btnPolicy.setBorderPainted(false);
	
		try{
			URL u= new URL("http://i1075.photobucket.com/albums/w440/luinloth/2073Proj/RealPics/Pop%20Up%20Menu%20Base.png");
			ImageIcon img= new ImageIcon(u);
			JLabel lblOptions = new JLabel(img);
			lblOptions.setBounds(0, 169, 89, 358);
			contentPane.add(lblOptions);}
		
		catch(MalformedURLException e){
			System.out.println("URL probs- options");
		}
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		//button action events
		btnNA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAClicked();
			}
		});
		btnNA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NAClicked();
			}
		});	
		btnNA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NAClicked();
			}
		});	
		btnNA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NAClicked();
			}
		});	
		btnNA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NAClicked();
			}
		});	
		////////////////////////////////////////////////////
		btnCAfrica1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CAfricaClicked();
			}
		});
		btnCAfrica2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CAfricaClicked();
			}
		});
		btnCAfrica3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		btnCAfrica4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		btnCAfrica5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		btnCAfrica6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		btnCAfrica7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		btnCAfrica8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAfricaClicked();
			}
		});
		/////////////////////////////////////////////////////
		btnCAmerica1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
		btnCAmerica11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				CAmericaClicked();
			}
		});
        //////////////////////////////////////////////////
		btnChina1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});
		btnChina2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});
		btnChina3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});		
		btnChina4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});		
		btnChina5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});		
		btnChina6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});		
		btnChina7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ChinaClicked();
			}
		});
		///////////////////////////////////////////////
		btnEU1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		btnEU2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		btnEU3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		btnEU4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		btnEU5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		btnEU6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				EUClicked();
			}
		});
		
		btnMadagascar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MadaClicked();
			}
		});
		///////////////////////////////////////////////
		btnME1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		btnME9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MEClicked();
			}
		});
		////////////////////////////////////////////////
		btnNAf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		btnNAf12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NAfClicked();
			}
		});
		////////////////////////////////////////////////////
		btnOceania1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		btnOceania2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		btnOceania3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		btnOceania4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		btnOceania5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		btnOceania6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				OceaniaClicked();
			}
		});
		///////////////////////////////////////////////////
		btnRussia1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		btnRussia13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				RussiaClicked();
			}
		});
		///////////////////////////////////////////////////
		btnSEAsia1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		btnSEAsia10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SEAsiaClicked();
			}
		});
		///////////////////////////////////////////////
		btnSA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		btnSA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAfricaClicked();
			}
		});
		////////////////////////////////////////////////
		btnSAm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAmericaClicked();
			}
		});
		btnSAm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAmericaClicked();
			}
		});
		btnSAm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAmericaClicked();
			}
		});
		btnSAm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAmericaClicked();
			}
		});
		btnSAm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SAmericaClicked();
			}
		});
		
		/////////////////////////////////////////////////
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//do stuff here
				txtSomethingWasClicked.setForeground(Color.GREEN);
			}
		});	
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});	
		
	}
	
	////////////////////////click methods///////////////////////////////////////////
	public void CAfricaClicked(){
		txtSomethingWasClicked.setForeground(Color.GRAY);
	}
	
	public void CAmericaClicked(){
		txtSomethingWasClicked.setForeground(Color.ORANGE);
	}
	
	public void ChinaClicked(){
		txtSomethingWasClicked.setForeground(Color.PINK);
	}
	
	public void EUClicked(){
		txtSomethingWasClicked.setForeground(Color.MAGENTA);
	}
	
	public void MadaClicked(){
		txtSomethingWasClicked.setForeground(Color.RED);
	}
	
	public void MEClicked(){
		txtSomethingWasClicked.setForeground(Color.LIGHT_GRAY);
	}
	
	public void NAClicked(){
		txtSomethingWasClicked.setForeground(Color.WHITE);
	}
	
	public void NAfClicked(){
		txtSomethingWasClicked.setForeground(Color.YELLOW);
	}
	
	public void OceaniaClicked(){
		txtSomethingWasClicked.setForeground(Color.CYAN);
	}
	
	public void RussiaClicked(){
		txtSomethingWasClicked.setForeground(Color.BLACK);
	}
	
	public void SEAsiaClicked(){
		txtSomethingWasClicked.setForeground(Color.GREEN);
	}
	
	public void SAfricaClicked(){
		txtSomethingWasClicked.setForeground(Color.DARK_GRAY);
	}
	
	public void SAmericaClicked(){
	txtSomethingWasClicked.setForeground(Color.ORANGE);
	}
}