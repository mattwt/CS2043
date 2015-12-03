package ca.unbsj.cs2043.rebelsimulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
/*
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
*/
import javax.swing.JTextField;
import javax.swing.JLayeredPane;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	//GET RID OF THIS WHEN WE CAN USE MAIN DRIVER
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//sets up and begins
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(612, 260, 136, 138);
		contentPane.add(btnNewGame);
		
		try{
			URL url= new URL("http://i1075.photobucket.com/albums/w440/luinloth/2073Proj/RealPics/Main%20Menu%2092065.png");
			ImageIcon img= new ImageIcon(url);
			JLabel lblMainBackground = new JLabel(img);
			lblMainBackground.setBounds(0, 0, 1362, 661);
			contentPane.add(lblMainBackground);
			
			btnNewGame.setOpaque(false);
			btnNewGame.setContentAreaFilled(false);
			btnNewGame.setBorderPainted(false);
			btnNewGame.setToolTipText("New Game");
			btnNewGame.setText("");
		}
		
		catch(MalformedURLException e)
		{
		System.out.println("URL probs in main background");
		}
		
		//middle button brings user to main and closes 
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapGUI m= new MapGUI();
				m.init();
				dispose();	
			}
		});
	}
}
