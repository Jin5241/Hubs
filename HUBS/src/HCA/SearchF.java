package HCA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.SystemColor;

public class SearchF extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	
	private JButton btnHelp;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
    private JButton button1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchF frame = new SearchF();
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
	public SearchF() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 950, 531);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Table.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent arg0){
				textField1.setText("");
			}
			
		});
		textField1.setText("Please input");
		textField1.setBounds(115, 200, 534, 51);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton button1 = new JButton("Search");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button1.setBounds(687, 204, 109, 43);
		contentPane.add(button1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
			if(arg0.getStateChange()==ItemEvent.SELECTED){
				if(comboBox.getSelectedIndex()!=-1){
					switch (comboBox.getSelectedIndex()) {
					case 0:
						initialize(Locale.ENGLISH);
						
						break;
					case 1:
						initialize(Locale.CHINESE);
						break;
					case 2:
						initialize(Locale.GERMAN);

					default:
						break;
					}
				}
			}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"English", "\u4E2D\u6587", "Deutsch"}));
		comboBox.setBounds(759, 35, 109, 35);
		contentPane.add(comboBox);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(643, 35, 72, 35);
		contentPane.add(btnHelp);
		
		textPane = new JTextPane();
		textPane.setText("Hubs ");
		textPane.setForeground(SystemColor.textHighlight);
		textPane.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 50));
		textPane.setBounds(118, 115, 171, 80);
		contentPane.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setText("Cleaning Agents");
		textPane_1.setForeground(SystemColor.textHighlight);
		textPane_1.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 45));
		textPane_1.setBounds(300, 107, 427, 78);
		contentPane.add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setText("Recommend");
		textPane_2.setBounds(115, 281, 78, 24);
		contentPane.add(textPane_2);
		
		button = new JButton("Kitchen");
		button.setBounds(228, 281, 89, 27);
		contentPane.add(button);
		
		button_1 = new JButton("Floor");
		button_1.setBounds(341, 281, 88, 27);
		contentPane.add(button_1);
		
		button_2 = new JButton("Clothes");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(453, 281, 88, 27);
		contentPane.add(button_2);
		
		initialize(Locale.ENGLISH);
	}
	private void initialize(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("language.messages", locale);
		button1.setText(resourceBundle.getString("search"));
	}

}
