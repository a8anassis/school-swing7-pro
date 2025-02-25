package gr.aueb.cf.schoolapp;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import gr.aueb.cf.schoolapp.model.City;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class TeacherView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel kwdikosText;
	private JLabel firstnameText;
	private JLabel lastnameText;
	private JLabel vatText;
	private JLabel fathernameText;
	private JLabel phoneNumText;
	private JLabel emailText;
	private JLabel streetText;
	private JLabel streetNumText;
	private JLabel cityText;
	private JLabel zipcodeText;

	//private List<City> cities = new ArrayList<>();
	
	
	public TeacherView() {
	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 753, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 745, 52);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(TeacherView.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(0, 0, 100, 52);
		header.add(govImage);
		
		JLabel firstLastName = new JLabel("ΑΘΑΝΑΣΙΟΣ ΑΝΔΡΟΥΤΣΟΣ");
		firstLastName.setForeground(Color.WHITE);
		firstLastName.setBounds(562, 11, 173, 30);
		header.add(firstLastName);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(3, 537, 742, 90);
		contentPane.add(footer);
		
		JLabel lbl_manual = new JLabel("Εγχειρίδιο Χρήσης");
		lbl_manual.setForeground(new Color(0, 52, 117));
		lbl_manual.setBounds(123, 37, 151, 29);
		footer.add(lbl_manual);
		
		JLabel lbl_oftenQuestions = new JLabel("Συχνές Ερωτήσεις");
		lbl_oftenQuestions.setForeground(new Color(0, 52, 117));
		lbl_oftenQuestions.setBounds(284, 37, 151, 29);
		footer.add(lbl_oftenQuestions);
		
		JLabel lbl_support = new JLabel("Υποστήριξη Πολιτών");
		lbl_support.setForeground(new Color(0, 52, 117));
		lbl_support.setBounds(445, 37, 151, 29);
		footer.add(lbl_support);
		
		JLabel lblNewLabel = new JLabel("Αίτηση Εκπαιδευτή");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(258, 81, 272, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblKwdikos = new JLabel("Κωδικός Εκπαιδευτή");
		lblKwdikos.setBounds(70, 155, 128, 27);
		contentPane.add(lblKwdikos);
		
		kwdikosText = new JLabel("Κωδικός Εκπαιδευτή");
		kwdikosText.setBounds(277, 155, 128, 27);
		contentPane.add(kwdikosText);
		
		JLabel lblFirstname = new JLabel("Όνομα Εκπαιδευτή");
		lblFirstname.setBounds(70, 180, 128, 27);
		contentPane.add(lblFirstname);
		
		firstnameText = new JLabel("Όνομα Εκπαιδευτή");
		firstnameText.setBounds(277, 180, 128, 27);
		contentPane.add(firstnameText);
		
		JLabel lblLastname = new JLabel("Επώνυμο Εκπαιδευτή");
		lblLastname.setBounds(70, 207, 128, 27);
		contentPane.add(lblLastname);
		
		lastnameText = new JLabel("Επώνυμο Εκπαιδευτή");
		lastnameText.setBounds(277, 207, 128, 27);
		contentPane.add(lastnameText);
		
		JLabel lblVat = new JLabel("ΑΦΜ Εκπαιδευτή");
		lblVat.setBounds(70, 245, 128, 27);
		contentPane.add(lblVat);
		
		vatText = new JLabel("ΑΦΜ Εκπαιδευτή");
		vatText.setBounds(277, 245, 128, 27);
		contentPane.add(vatText);
		
		JLabel lblFathername = new JLabel("Πατρώνυμο Εκπαιδευτή");
		lblFathername.setBounds(70, 265, 128, 27);
		contentPane.add(lblFathername);
		
		JLabel lblPhoneNum = new JLabel("Τηλέφωνο Εκπαιδευτή");
		lblPhoneNum.setBounds(70, 303, 128, 27);
		contentPane.add(lblPhoneNum);
		
		JLabel lblEmail = new JLabel("e-mail Εκπαιδευτή");
		lblEmail.setBounds(70, 330, 128, 27);
		contentPane.add(lblEmail);
		
		JLabel lblStreet = new JLabel("Διεύθυνση Εκπαιδευτή");
		lblStreet.setBounds(70, 354, 128, 27);
		contentPane.add(lblStreet);
		
		fathernameText = new JLabel("Πατρώνυμο Εκπαιδευτή");
		fathernameText.setBounds(277, 265, 128, 27);
		contentPane.add(fathernameText);
		
		phoneNumText = new JLabel("Τηλέφωνο Εκπαιδευτή");
		phoneNumText.setBounds(277, 303, 128, 27);
		contentPane.add(phoneNumText);
		
		emailText = new JLabel("email Εκπαιδευτή");
		emailText.setBounds(277, 330, 128, 27);
		contentPane.add(emailText);
		
		streetText = new JLabel("Διεύθυνση Εκπαιδευτή");
		streetText.setBounds(277, 354, 128, 27);
		contentPane.add(streetText);
		
		JLabel lblStreetNum = new JLabel("Αριθμός Διεύθυνσης");
		lblStreetNum.setBounds(70, 378, 128, 27);
		contentPane.add(lblStreetNum);
		
		streetNumText = new JLabel("Αριθμός Διεύθυνσης");
		streetNumText.setBounds(277, 378, 128, 27);
		contentPane.add(streetNumText);
		
		JLabel lblCity = new JLabel("Πόλη Εκπαιδευτή");
		lblCity.setBounds(70, 428, 128, 27);
		contentPane.add(lblCity);
		
		cityText = new JLabel("Πόλη Εκπαιδευτή");
		cityText.setBounds(277, 428, 128, 27);
		contentPane.add(cityText);
		
		zipcodeText = new JLabel("ΤΚ");
		zipcodeText.setBounds(277, 452, 128, 27);
		contentPane.add(zipcodeText);
		
		JLabel lblZipcode = new JLabel("ΤΚ");
		lblZipcode.setBounds(70, 452, 128, 27);
		contentPane.add(lblZipcode);
		
		JButton btnClose = new JButton("Κλείσιμο");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getViewTeachersPage().setEnabled(true);
				Main.getTeacherView().setVisible(false);
			}
		});
		
		btnClose.setBounds(469, 471, 134, 57);
		contentPane.add(btnClose);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 233, 597, 1);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 291, 597, 1);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 416, 597, 1);
		contentPane.add(separator_1_1);
	}
	
	
}
