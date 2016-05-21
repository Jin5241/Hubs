package HCA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.net.SocketTimeoutException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.annotation.Resource;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class SearchFr extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFr frame = new SearchFr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public SearchFr() throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 558);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("ToolTip.background"));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		button1 = new JButton("Search");
		sl_contentPane.putConstraint(SpringLayout.WEST, button1, 765, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button1, -248, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button1, -46, SpringLayout.EAST, contentPane);
		contentPane.add(button1);

		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 209, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 117, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -160, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);

		JTextPane txtpnRecommend = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnRecommend, 117, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -34, SpringLayout.NORTH, txtpnRecommend);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnRecommend, 287, SpringLayout.NORTH, contentPane);
		txtpnRecommend.setText("Recommend");
		contentPane.add(txtpnRecommend);

		JTextPane txtpnHubsCleaningAgent = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnHubsCleaningAgent, 113, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnHubsCleaningAgent, 148, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnHubsCleaningAgent, -111, SpringLayout.NORTH,
				txtpnRecommend);
		txtpnHubsCleaningAgent.setForeground(UIManager.getColor("Table.selectionBackground"));
		txtpnHubsCleaningAgent.setFont(new Font("Broadway", Font.BOLD | Font.ITALIC, 50));
		txtpnHubsCleaningAgent.setText("Hubs ");
		contentPane.add(txtpnHubsCleaningAgent);

		JButton btnNewButton = new JButton("Kitchen");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 230, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnRecommend, -35, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -572, SpringLayout.EAST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, txtpnRecommend);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Floor");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, txtpnRecommend);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 24, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 112, SpringLayout.EAST, btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cloth");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, txtpnRecommend);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 24, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_2, -348, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton_2);

		JTextPane textPane = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, textPane, 117, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textPane, -84, SpringLayout.NORTH, txtpnRecommend);
		contentPane.add(textPane);

		JTextPane txtpnCleaningAgents = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnCleaningAgents, 332, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnCleaningAgents, -6, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnHubsCleaningAgent, -13, SpringLayout.WEST,
				txtpnCleaningAgents);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnCleaningAgents, -132, SpringLayout.EAST, contentPane);
		txtpnCleaningAgents.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 45));
		txtpnCleaningAgents.setForeground(UIManager.getColor("Table.selectionBackground"));
		txtpnCleaningAgents.setText("Cleaning Agents");
		contentPane.add(txtpnCleaningAgents);

		JButton btnHelp = new JButton("HELP£¿");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnCleaningAgents, 52, SpringLayout.SOUTH, btnHelp);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnHelp);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) {
					if (comboBox.getSelectedIndex() != -1) {
						switch (comboBox.getSelectedIndex()) {
						case 0:
							initialize(Locale.ENGLISH);
							break;
						case 1:
							initialize(Locale.CHINESE);
							break;
						default:
							break;
						}
					}
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnHelp, -1, SpringLayout.NORTH, comboBox);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnHelp, -35, SpringLayout.WEST, comboBox);
		comboBox.setBackground(UIManager.getColor("TabbedPane.light"));
		sl_contentPane.putConstraint(SpringLayout.NORTH, button1, 153, SpringLayout.SOUTH, comboBox);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, 27, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, -75, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, -176, SpringLayout.EAST, contentPane);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "English", "\u4E2D\u6587" }));
		contentPane.add(comboBox);

		initialize(Locale.ENGLISH);

	}

	private void initialize(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("language.messages", locale);
		button1.setText(resourceBundle.getString("search"));
	}

}
