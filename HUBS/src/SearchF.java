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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class SearchF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 558);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("ToolTip.background"));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnSearch = new JButton("Search");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSearch, 765, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSearch, -248, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSearch, -46, SpringLayout.EAST, contentPane);
		contentPane.add(btnSearch);
		
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
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnHubsCleaningAgent, -111, SpringLayout.NORTH, txtpnRecommend);
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
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnCleaningAgents, -84, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnHubsCleaningAgent, -13, SpringLayout.WEST, txtpnCleaningAgents);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnCleaningAgents, -132, SpringLayout.EAST, contentPane);
		txtpnCleaningAgents.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 45));
		txtpnCleaningAgents.setForeground(UIManager.getColor("Table.selectionBackground"));
		txtpnCleaningAgents.setText("Cleaning Agents");
		contentPane.add(txtpnCleaningAgents);
		
		JRadioButton rdbtnEn = new JRadioButton("EN");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnCleaningAgents, 52, SpringLayout.SOUTH, rdbtnEn);
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnEn, 26, SpringLayout.NORTH, contentPane);
		contentPane.add(rdbtnEn);
		
		JRadioButton rdbtnCn = new JRadioButton("CN");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSearch, 156, SpringLayout.SOUTH, rdbtnCn);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnEn, -22, SpringLayout.WEST, rdbtnCn);
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnCn, 0, SpringLayout.NORTH, rdbtnEn);
		contentPane.add(rdbtnCn);
		
		JRadioButton rdbtnGe = new JRadioButton("GE");
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnCn, -21, SpringLayout.WEST, rdbtnGe);
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnGe, 26, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnGe, 0, SpringLayout.EAST, btnSearch);
		contentPane.add(rdbtnGe);
		
		JButton btnHelp = new JButton("HELP!");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnHelp, 0, SpringLayout.NORTH, rdbtnEn);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnHelp, -27, SpringLayout.WEST, rdbtnEn);
		contentPane.add(btnHelp);
	}
}
