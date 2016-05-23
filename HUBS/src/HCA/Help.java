package HCA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnTheAimOf = new JTextPane();
		txtpnTheAimOf.setText("\tThe aim of our remarkable software is to solve the newcome student\u2019s cleaning tools selecting problem. With four main extraordinaire feature,  this software can manage to the task that student want it to achieve. Beyond that, the friendly UI can also build a harmonious using atmosphere.\r\n\tAs a special cleaning tool searching engine, we have three kinds of searching mode. First is direct search, user can search the tool they want by entering the name approximately. User not have to input the completely correct name, our software will search all the tools that are relative to the search keyword and show it in the form of list. In the list we also include all significant information about tools.\r\n\tThe second fascinating function is indirect search. User can search the tools through multiple choice and tree diagram. This kind of search is to satisfy the people who have no idea about the tools but knows their cleaning purpose or direction.\r\n\tThe last and the stunning searching mode is recommend searching. Our searching system will give user a short questionnaire to locate the targeted tool and give the best selection as the form of a list. This function can really help choister(the people who can hard choose).\r\n\tIncredibly, the remark function, which will be the most interesting part in the version, do help student to make their best choice. Not only include comment writing but also allow user to grade to each tools. The comment and the average level evaluation will be displayed. \r\n\tIn addition to what we have mention, our software support three language. What\u2019s more, we even add \u201CBACK\u201D function and \u201CBACK TO TOP\u201D function in our UI, which will save you precious time in doing stupid searching.\r\n");
		txtpnTheAimOf.setBounds(91, 81, 814, 448);
		contentPane.add(txtpnTheAimOf);
		
		JLabel lblHelp = new JLabel("HELP");
		lblHelp.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		lblHelp.setForeground(Color.BLUE);
		lblHelp.setBounds(447, 31, 119, 40);
		contentPane.add(lblHelp);
	}
}
