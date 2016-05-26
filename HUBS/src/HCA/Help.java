package HCA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import language.UniVar;

public class Help extends JFrame implements Initializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3576579071121107438L;
	private JPanel contentPane;
	private JLabel Label2;
	private JTextArea textField1;
	private JTextArea textArea1;
	private JLabel label3;

	/**
	 * Launch the application.
	 */

	public static void invoke(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 640);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 Label2 = new JLabel("New label");
		Label2.setFont(new Font("»ªÎÄÁ¥Êé", Font.BOLD | Font.ITALIC, 35));
		Label2.setBounds(386, 28, 197, 40);
		contentPane.add(Label2);
		
		textField1 = new JTextArea();
		textField1.setLineWrap(true); 
		textField1.setText("a\r\nb\r\n");
		textField1.setEditable(false);

		textField1.setBounds(77, 83, 800, 401);
		contentPane.add(textField1);
		textField1.setColumns(100);
	
		


		UniVar.locale = Locale.ENGLISH;
		initialize();
		UniVar.frameList.add(this);
	}
	public void initialize() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("language.messages", UniVar.locale);
		
		Label2.setText(resourceBundle.getString("Help"));
		textField1.setText(resourceBundle.getString("ahelp"));
	
	}
}
