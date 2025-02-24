package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;

public class Dashboard2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public Dashboard2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 746, 56);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(Dashboard2.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, 0, 154, 56);
		header.add(govImage);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 315, 746, 97);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(Color.BLUE);
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBounds(68, 33, 112, 34);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(Color.BLUE);
		lblQuestions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuestions.setBounds(290, 33, 112, 34);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη Πολιτών");
		lblSupport.setForeground(Color.BLUE);
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBounds(512, 33, 112, 34);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 255));
		separator.setBounds(0, 2, 746, 1);
		footer.add(separator);
	}

}
