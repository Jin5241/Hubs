package HCA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class CAF extends JFrame {

	private JPanel contentPane1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CAF frame = new CAF();
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
	public CAF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 958);
		contentPane1 = new JPanel();
		contentPane1.setBackground(UIManager.getColor("Button.highlight"));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1118, 0, 28, 911);
		contentPane1.add(scrollBar);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\CA\u56FE\u7247\\911oIPjn42L._SX522_.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(654, 97, 478, 477);
		contentPane1.add(label);
		
		JTextPane txtpnTideOriginalScent = new JTextPane();
		txtpnTideOriginalScent.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 28));
		txtpnTideOriginalScent.setForeground(new Color(0, 0, 128));
		txtpnTideOriginalScent.setText("Tide Original Scent HE Turbo Clean Liquid Laundry Detergent, 50 Fl Oz (32 Loads), 2 Count");
		txtpnTideOriginalScent.setBounds(27, 48, 511, 116);
		contentPane1.add(txtpnTideOriginalScent);
		
		JTextPane txtpnAboutTheProduct = new JTextPane();
		txtpnAboutTheProduct.setText("For an amazing clean you know and love, there\u2019s only one original: Tide Original Scent High Efficiency Liquid Laundry Detergent. Its revitalizing scent is infused with aloe and floral notes to help keep your family\u2019s clothes smelling as great as they look. It is formulated with HE Turbo Clean technology for 6x the cleaning power in half the time (1) and is recommended by leading washing machine manufacturers (2). Unlike many HE compatible laundry detergents that can slow machines down with over-sudsing, this turbo-charged formula quickly collapses suds and targets tough stains. These are two bottles 50 oz. (32 loads) each of liquid laundry detergent. Try Tide PODS with 3-in-1 chamber technology that cleans, protects colors and fights stains. (1) 1 dose of Tide HE Turbo Clean in a quick cycle vs. 6 doses of the next leading liquid HE compatible detergent in a normal cycle (2) Based on co-marketing agreements");
		txtpnAboutTheProduct.setForeground(new Color(0, 0, 0));
		txtpnAboutTheProduct.setFont(new Font("Leelawadee UI", Font.PLAIN, 23));
		txtpnAboutTheProduct.setBounds(31, 279, 612, 586);
		contentPane1.add(txtpnAboutTheProduct);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(0, 0, 128));
		textPane.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 33));
		textPane.setText("\u20AC22.5");
		textPane.setBounds(37, 163, 147, 72);
		contentPane1.add(textPane);
	}
}
