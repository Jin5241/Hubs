package HCA;
import dao.*;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import language.UniVar;
import javax.swing.JLabel;

public class SearchF extends JFrame implements Initializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9010246327262198757L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField textField1;

	private JButton button5;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button1;
	private JLabel label4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchF frame = new SearchF();
					DBConnection.connect();
					boolean a=DBConnection.connect();
					if(a=true){
						System.out.println("connect success");
					}
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
	public SearchF() throws Exception {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 997, 629);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Table.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField1 = new JTextField();
		textField1.setBounds(172, 240, 534, 51);
		textField1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				textField1.setText("");
			}

		});
		contentPane.setLayout(null);

		textField1.setText("Please input");
		contentPane.add(textField1);
		textField1.setColumns(10);

		button1 = new JButton("Search");
		button1.setBounds(744, 244, 142, 43);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultF.invoke();
			}
		});
		contentPane.add(button1);

		button5 = new JButton("Help");
		button5.setBounds(724, 35, 72, 35);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Help.invoke();
			}
		});
		contentPane.add(button5);

		textPane = new JTextPane();
		textPane.setBounds(175, 155, 171, 80);
		textPane.setText("Hubs ");
		textPane.setForeground(SystemColor.textHighlight);
		textPane.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 50));
		contentPane.add(textPane);

		textPane_1 = new JTextPane();
		textPane_1.setBounds(357, 147, 427, 78);
		textPane_1.setText("Cleaning Agents");
		textPane_1.setForeground(SystemColor.textHighlight);
		textPane_1.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 45));
		contentPane.add(textPane_1);

		button2 = new JButton("Kitchen");
		button2.setBounds(343, 320, 89, 27);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultF.invoke();
			}
		});
		contentPane.add(button2);

		button3 = new JButton("Floor");
		button3.setBounds(456, 320, 88, 27);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultF.invoke();
			}
		});
		contentPane.add(button3);

		button4 = new JButton("Clothes");
		button4.setBounds(568, 320, 88, 27);

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultF.invoke();
			}
		});
		contentPane.add(button4);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(831, 35, 109, 35);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) {
					if (comboBox.getSelectedIndex() != -1) {
						switch (comboBox.getSelectedIndex()) {
						case 0:
							UniVar.locale = Locale.ENGLISH;
							break;
						case 1:
							UniVar.locale = Locale.CHINESE;
							break;
						case 2:
							UniVar.locale = Locale.GERMAN;
							break;

						default:
							break;
						}
						for(Initializable i:UniVar.frameList){
							i.initialize();
						}
					}
				}

			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "English", "\u4E2D\u6587", "Deutsch" }));
		contentPane.add(comboBox);
		
		label4 = new JLabel("New label");
		label4.setFont(new Font("»ªÎÄÁ¥Êé", Font.BOLD | Font.ITALIC, 26));
		label4.setBounds(172, 320, 157, 27);
		contentPane.add(label4);
		
		
		
	
		UniVar.locale = Locale.ENGLISH;
		initialize();
		UniVar.frameList.add(this);
	}

	public void initialize() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("language.messages", UniVar.locale);
		button1.setText(resourceBundle.getString("Search"));
		button2.setText(resourceBundle.getString("Kitchen"));
		button3.setText(resourceBundle.getString("Floor"));
		button4.setText(resourceBundle.getString("Clothes"));
		button5.setText(resourceBundle.getString("Help"));
		label4.setText(resourceBundle.getString("Recommend"));
	}
}