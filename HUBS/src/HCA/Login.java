package HCA;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import BL.CAget;
import BL.TagGet;
import dao.DBConnection;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar processBar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login(DBConnection.connect());
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login(boolean isConnected) {
		setTitle("HUBS CA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 746, 468);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		processBar = new JProgressBar();
		processBar.setBounds(0, 394, 728, 27);
		processBar.setStringPainted(true);
		processBar.setBackground(Color.LIGHT_GRAY);

		contentPane.setLayout(null);
		contentPane.add(processBar);

		lblNewLabel = new JLabel("BakgroundPicture");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\29274\\Pictures\\pic.JPG"));
		lblNewLabel.setBounds(0, 0, 728, 397);
		contentPane.add(lblNewLabel);

		if (isConnected) {
			initialize();
		}
	}

	private void initialize() {
		TagGet.storeAllTags();
		CAget.storeAllCA();
	}

}