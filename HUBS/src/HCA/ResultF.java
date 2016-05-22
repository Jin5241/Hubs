package HCA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class ResultF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultF frame = new ResultF();
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
	public ResultF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 535);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 26, 551, 32);
		contentPane.add(textField);
		
		JButton button = new JButton("Search");
		button.setBounds(676, 25, 81, 33);
		contentPane.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Relevance", "Rate", "Price:Low to High", "Price:High to Low"}));
		comboBox.setToolTipText("Sort by");
		comboBox.setForeground(UIManager.getColor("Button.foreground"));
		comboBox.setBackground(UIManager.getColor("Button.disabledShadow"));
		comboBox.setBounds(727, 71, 135, 32);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("Sort by");
		label.setToolTipText("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setBackground(Color.WHITE);
		label.setBounds(661, 78, 56, 18);
		contentPane.add(label);
		
		table = new JTable();
		table.setToolTipText("tabel");
		table.setForeground(UIManager.getColor("Button.foreground"));
		table.setBackground(UIManager.getColor("Button.focus"));
		table.setBounds(-55, 408, 413, -305);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(890, 13, 28, 475);
		contentPane.add(scrollBar);
	}
}
