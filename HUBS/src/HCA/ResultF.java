package HCA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import language.UniVar;

public class ResultF extends JFrame implements Initializable {

	private static final long serialVersionUID = -6413652538654277922L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JButton button;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void invoke() {
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultF.invoke();
			}
		});
		button.setBounds(676, 25, 81, 33);
		contentPane.add(button);

		comboBox = new JComboBox<String>();
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
		initialize();
		UniVar.frameList.add(this);
	}

	public void initialize() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("language.messages", UniVar.locale);
		button.setText(resourceBundle.getString("Search"));
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		model.addElement(resourceBundle.getString("Relevance"));
		model.addElement(resourceBundle.getString("Rate"));
		model.addElement(resourceBundle.getString("PriceLowToHigh"));
		model.addElement(resourceBundle.getString("PriceHighToLow"));
		comboBox.setModel(model);
	}
}
