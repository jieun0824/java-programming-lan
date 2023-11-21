import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel LeftSide;
	private JPanel RightSide;
	private JPanel namePanel;
	private JLabel nameLabel;
	private JLabel SKKULogo;
	private JLabel SchoolImage;
	private JPanel birthPanel;
	private JLabel birthLabel;
	private JPanel emailPanel;
	private JLabel emailLabel;
	private JPanel degreePanel;
	private JLabel degreeLabel;
	private JPanel univPanel;
	private JLabel univLabel;
	private JPanel gpaPanel;
	private JLabel gpaLabel;
	private JTextField degreeInput;
	private JTextField univInput;
	private JTextField gpaInput;
	private JTextField emailInput;
	private JTextField birthInput;
	private JTextField nameInput;
	private JPanel statementPanel;
	private JLabel statementLabel;
	private JTextField statementInput;
	private JPanel addressPanel;
	private JLabel addressLabel;
	private JTextField addressInput;
	private JButton submitBtn;

	private JPanel phonePanel;
	private JLabel phoneLabel;
	private JTextField phoneInput;
	private JPanel experiencePanel;
	private JLabel experienceLabel;
	private JTextField experienceInput;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
     * Constructor to create the main frame and initialize GUI components.
     */
	public MainGUI() {
		//frame setup code
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {300, 580};
		gbl_contentPane.rowHeights = new int[] {520};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0};
		contentPane.setLayout(gbl_contentPane);
		
		//leftside panel for skku image
		LeftSide = new JPanel();
		GridBagConstraints gbc_LeftSide = new GridBagConstraints();
		gbc_LeftSide.fill = GridBagConstraints.HORIZONTAL;
		gbc_LeftSide.insets = new Insets(0, 0, 0, 5);
		gbc_LeftSide.gridx = 0;
		gbc_LeftSide.gridy = 0;
		contentPane.add(LeftSide, gbc_LeftSide);
		
		//skku image wallpaper
		SchoolImage = new JLabel("");
		LeftSide.add(SchoolImage);
		SchoolImage.setIcon(new ImageIcon(MainGUI.class.getResource("images/skku_wallpaper.png")));
		
		
		//rightside panel for application form
		RightSide = new JPanel();
		RightSide.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_RightSide = new GridBagConstraints();
		gbc_RightSide.fill = GridBagConstraints.BOTH;
		gbc_RightSide.gridx = 1;
		gbc_RightSide.gridy = 0;
		contentPane.add(RightSide, gbc_RightSide);
		GridBagLayout gbl_RightSide = new GridBagLayout();
		gbl_RightSide.columnWidths = new int[] {580, 0};
		gbl_RightSide.rowHeights = new int[] {40, 40, 40, 40, 40, 40, 40, 40, 40, 150, 100};
		gbl_RightSide.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_RightSide.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0};
		RightSide.setLayout(gbl_RightSide);
		
		//skkulogo & form title
		SKKULogo = new JLabel("");
		GridBagConstraints gbc_SKKULogo = new GridBagConstraints();
		gbc_SKKULogo.fill = GridBagConstraints.VERTICAL;
		gbc_SKKULogo.insets = new Insets(0, 0, 5, 0);
		gbc_SKKULogo.gridx = 0;
		gbc_SKKULogo.gridy = 0;
		RightSide.add(SKKULogo, gbc_SKKULogo);
		SKKULogo.setIcon(new ImageIcon(MainGUI.class.getResource("images/title_label.png")));
		
		// namePanel for Applicant Name input
		namePanel = new JPanel();
		namePanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_namePanel = new GridBagConstraints();
		gbc_namePanel.fill = GridBagConstraints.BOTH;
		gbc_namePanel.insets = new Insets(0, 0, 5, 0);
		gbc_namePanel.gridx = 0;
		gbc_namePanel.gridy = 1;
		RightSide.add(namePanel, gbc_namePanel);
		namePanel.setLayout(null);
		
		// nameLabel - Label for Applicant Name
		nameLabel = new JLabel("Applicant Name:");
		nameLabel.setBounds(22, 10, 106, 15);
		namePanel.add(nameLabel);
		
		// nameInput - Input field for Applicant Name
		nameInput = new JTextField();
		nameInput.setColumns(10);
		nameInput.setBounds(254, 10, 314, 21);
		namePanel.add(nameInput);
		
		//birthPanel for birth date input
		birthPanel = new JPanel();
		birthPanel.setLayout(null);
		birthPanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_birthPanel = new GridBagConstraints();
		gbc_birthPanel.fill = GridBagConstraints.BOTH;
		gbc_birthPanel.insets = new Insets(0, 0, 5, 0);
		gbc_birthPanel.gridx = 0;
		gbc_birthPanel.gridy = 2;
		RightSide.add(birthPanel, gbc_birthPanel);
		
		//birthLabel - Label for birth date
		birthLabel = new JLabel("Birth Date:");
		birthLabel.setBounds(22, 10, 106, 15);
		birthPanel.add(birthLabel);
		
		//birthInput - Input field for birth date
		birthInput = new JTextField();
		birthInput.setColumns(10);
		birthInput.setBounds(254, 10, 314, 21);
		birthPanel.add(birthInput);
		
		//emailPanel for email input
		emailPanel = new JPanel();
		emailPanel.setLayout(null);
		emailPanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_emailPanel = new GridBagConstraints();
		gbc_emailPanel.fill = GridBagConstraints.BOTH;
		gbc_emailPanel.insets = new Insets(0, 0, 5, 0);
		gbc_emailPanel.gridx = 0;
		gbc_emailPanel.gridy = 3;
		RightSide.add(emailPanel, gbc_emailPanel);
		
		//emailLabel - Label for email
		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(22, 10, 106, 15);
		emailPanel.add(emailLabel);
		
		//emailInput - input field for email input
		emailInput = new JTextField();
		emailInput.setColumns(10);
		emailInput.setBounds(254, 10, 314, 21);
		emailPanel.add(emailInput);
		
		//degreePanel for degree input
		degreePanel = new JPanel();
		degreePanel.setLayout(null);
		degreePanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_degreePanel = new GridBagConstraints();
		gbc_degreePanel.fill = GridBagConstraints.BOTH;
		gbc_degreePanel.insets = new Insets(0, 0, 5, 0);
		gbc_degreePanel.gridx = 0;
		gbc_degreePanel.gridy = 4;
		RightSide.add(degreePanel, gbc_degreePanel);
		
		//degreeLabel - label for degree input
		degreeLabel = new JLabel("Degree:");
		degreeLabel.setBounds(22, 10, 106, 15);
		degreePanel.add(degreeLabel);
		
		//degreeInput - Input field for degree
		degreeInput = new JTextField();
		degreeInput.setColumns(10);
		degreeInput.setBounds(254, 10, 314, 21);
		degreePanel.add(degreeInput);
		
		//univPanel for attended university for graduated students
		univPanel = new JPanel();
		univPanel.setLayout(null);
		univPanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_univPanel = new GridBagConstraints();
		gbc_univPanel.fill = GridBagConstraints.BOTH;
		gbc_univPanel.insets = new Insets(0, 0, 5, 0);
		gbc_univPanel.gridx = 0;
		gbc_univPanel.gridy = 5;
		RightSide.add(univPanel, gbc_univPanel);
		
		//univLabel - Label for attended university for graduated students
		univLabel = new JLabel("Attended university (for Graduates):");
		univLabel.setBounds(22, 10, 217, 15);
		univPanel.add(univLabel);
		
		//univInput - Input field for attended university
		univInput = new JTextField();
		univInput.setColumns(10);
		univInput.setBounds(254, 10, 314, 21);
		univPanel.add(univInput);
		
		//gpaPanel for gpa input
		gpaPanel = new JPanel();
		gpaPanel.setLayout(null);
		gpaPanel.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_gpaPanel = new GridBagConstraints();
		gbc_gpaPanel.insets = new Insets(0, 0, 5, 0);
		gbc_gpaPanel.fill = GridBagConstraints.BOTH;
		gbc_gpaPanel.gridx = 0;
		gbc_gpaPanel.gridy = 6;
		RightSide.add(gpaPanel, gbc_gpaPanel);
		
		//gpaLabel - Label for gpa for graduates
		gpaLabel = new JLabel("GPA (for Graduates):");
		gpaLabel.setBounds(22, 10, 220, 15);
		gpaPanel.add(gpaLabel);
		
		//gpaInput - Input field for gpa 
		gpaInput = new JTextField();
		gpaInput.setColumns(10);
		gpaInput.setBounds(254, 10, 314, 21);
		gpaPanel.add(gpaInput);
		
		//phonePanel for phone number input
		phonePanel = new JPanel();
		phonePanel.setLayout(null);
		phonePanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_phonePanel = new GridBagConstraints();
		gbc_phonePanel.insets = new Insets(0, 0, 5, 0);
		gbc_phonePanel.fill = GridBagConstraints.BOTH;
		gbc_phonePanel.gridx = 0;
		gbc_phonePanel.gridy = 7;
		RightSide.add(phonePanel, gbc_phonePanel);
		
		//phoneLabel - Label for phone number input
		phoneLabel = new JLabel("phone number:");
		phoneLabel.setBounds(22, 10, 220, 15);
		phonePanel.add(phoneLabel);
		
		//phoneInput - Input field for phone number 
		phoneInput = new JTextField();
		phoneInput.setColumns(10);
		phoneInput.setBounds(254, 10, 314, 21);
		phonePanel.add(phoneInput);
		
		//experience Panel for experience input
		experiencePanel = new JPanel();
		experiencePanel.setLayout(null);
		experiencePanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_experiencePanel = new GridBagConstraints();
		gbc_experiencePanel.insets = new Insets(0, 0, 5, 0);
		gbc_experiencePanel.fill = GridBagConstraints.BOTH;
		gbc_experiencePanel.gridx = 0;
		gbc_experiencePanel.gridy = 8;
		RightSide.add(experiencePanel, gbc_experiencePanel);
		
		//experienceLabel - Label for experience
		experienceLabel = new JLabel("experience:");
		experienceLabel.setBounds(22, 10, 220, 15);
		experiencePanel.add(experienceLabel);
		
		//experienceInput - Input field for experience
		experienceInput = new JTextField();
		experienceInput.setColumns(10);
		experienceInput.setBounds(254, 10, 314, 21);
		experiencePanel.add(experienceInput);
		
		//statementPanel for personal statement input
		statementPanel = new JPanel();
		statementPanel.setLayout(null);
		statementPanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_statementPanel = new GridBagConstraints();
		gbc_statementPanel.insets = new Insets(0, 0, 5, 0);
		gbc_statementPanel.fill = GridBagConstraints.BOTH;
		gbc_statementPanel.gridx = 0;
		gbc_statementPanel.gridy = 9;
		RightSide.add(statementPanel, gbc_statementPanel);
		
		//statementLabel - Label for personal statement
		statementLabel = new JLabel("Personal statement");
		statementLabel.setBounds(222, 10, 118, 15);
		statementPanel.add(statementLabel);
		
		//statementInput - input field for personal statement
		statementInput = new JTextField();
		statementInput.setColumns(10);
		statementInput.setBounds(122, 29, 314, 93);
		statementPanel.add(statementInput);
		
		//addressPanel for home address input
		addressPanel = new JPanel();
		addressPanel.setLayout(null);
		addressPanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_addressPanel = new GridBagConstraints();
		gbc_addressPanel.fill = GridBagConstraints.BOTH;
		gbc_addressPanel.gridx = 0;
		gbc_addressPanel.gridy = 10;
		RightSide.add(addressPanel, gbc_addressPanel);
		
		//addressLabel - Label for home address
		addressLabel = new JLabel("Home Address:");
		addressLabel.setBounds(22, 10, 220, 15);
		addressPanel.add(addressLabel);
		
		//addressInput - input field for home address 
		addressInput = new JTextField();
		addressInput.setColumns(10);
		addressInput.setBounds(254, 10, 314, 21);
		addressPanel.add(addressInput);
		
		//submit button
		submitBtn = new JButton("Submit Application");
		
		//actionListener for the submit button
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//make errorList for storing error messages
				ArrayList<String> errorList = new ArrayList<>();
				try {
					checkName(); //validation checks for input by using methods
				}catch(ErrorException error) { //if an errors occur,catch any custom exceptions (ErrorException) thrown during validation
					errorList.add(error.getError()); //add error message containing the specific error to errorList
				}
				
				try {
					checkBirthDate();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkEmail();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkPhone();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkDegree();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkGraduated();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkGPA();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkPersonalStatement();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkExperience();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				try {
					checkHomeAddress();
				}catch(ErrorException error) {
					errorList.add(error.getError());
				}
				
				if(errorList.size() == 0) { //if there's nothing in errorList(no error)
					clearInput(); //clear all input by using methods
					JOptionPane.showMessageDialog(null, "Successfully Submitted", "Success", JOptionPane.INFORMATION_MESSAGE); //print submitted success message
				}else { //if there's error(s) in errorList
					String errorResult = printErrorList(errorList);
					JOptionPane.showMessageDialog(null, errorResult, "You have following problems:", JOptionPane.ERROR_MESSAGE); //print all error messages by joptionpanel
				}
				
			}
		});

		
		submitBtn.setBackground(new Color(0, 128, 0));
		submitBtn.setBounds(193, 51, 203, 23);
		addressPanel.add(submitBtn);
	}
    /**
     * Custom exception class for handling errors in form validation.
     */
	class ErrorException extends RuntimeException{
		private String errorMessage;
		
		public ErrorException (String errorMessage) { //constructor to set errorMessage
			this.errorMessage = errorMessage;
		}
		
		//getter method
		public String getError() {
			return errorMessage;
		}
		
	}
	
    /**
     * Method to check the validity of the Applicant Name input.
     * Throws an ErrorException if the input is invalid.
     */
	public void checkName() throws ErrorException{
		String name = nameInput.getText(); //storing input text to variable
		if(name.contains(" ") == false) { //if there's no spacing in name input
			throw new ErrorException("You forgot to write your name or surname"); //throws an errorexception
		}else if(name.length() == 0) { //if there's nothing in name input field
			throw new ErrorException("You forgot to fill the name text field, Please fill it");	 //throws an errorexception
		}
	}
	
	public void checkBirthDate() throws ErrorException{
		String birth = birthInput.getText();
		//birth regex for testing 'dd/mm/yyyy' format
		String birthRegex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\\d{4}$"; 
		// Compile the regular expression into a Pattern object
		Pattern birthPattern = Pattern.compile(birthRegex);
		// Create a Matcher object for the input string
		Matcher birthMatcher = birthPattern.matcher(birth);
		// Check if the input matches the specified pattern
		if(birth.length() == 0) {
			// Throw an ErrorException if the input is empty
			throw new ErrorException("You forgot to fill the birth date text field, Please fill it");
		} else if(birthMatcher.matches() == false) {
			 // Throw an ErrorException if the input does not match the expected format
			throw new ErrorException("Birthdate must be in '06/06/1995' format");
		}
		
	}
	
	public void checkEmail() throws ErrorException{
		String email = emailInput.getText();
		// Regular expression for validating email format "example@some.some"
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		// Compile the regular expression into a Pattern object
		Pattern emailPattern = Pattern.compile(emailRegex);
		// Create a Matcher object for the input string
		Matcher emailMatcher = emailPattern.matcher(email);
		// Check if the input matches the specified pattern
		if(email.length() == 0) {
			// Throw an ErrorException if the input is empty
			throw new ErrorException("You forgot to write your name or surname");
		} else if(emailMatcher.matches() == false) {
			// Throw an ErrorException if the input does not match the expected format
			throw new ErrorException("Email must be in example@some.some");
		}
	}
	
	public void checkPhone() throws ErrorException{
		String phone = phoneInput.getText();
		// Regular expression for validating phone number format (e.g., "10 2158-0222")
		String phoneRegex = "^[0-9]{2}\\s[0-9]{4}-[0-9]{4}$";
		Pattern phonePattern = Pattern.compile(phoneRegex);
		Matcher phoneMatcher = phonePattern.matcher(phone);
		if(phone.length() == 0) {
			// Throw an ErrorException if the input is empty
			throw new ErrorException("You forgot to write your phone number");
		} else if(phoneMatcher.matches() == false) {
			 // Throw an ErrorException if the input does not match the expected format
			throw new ErrorException("Proper format for a phone number is '10 2158-0222'");
		}
	}
	
	public void checkDegree() throws ErrorException{
		String degree = degreeInput.getText();
		if(degree.length() == 0) {
			// Throw an ErrorException if the input is empty
			throw new ErrorException("You forgot to write your degree");
		}
	}
	
	public void checkGraduated() throws ErrorException{
		String degreeStatus = degreeInput.getText();
		String attendedUniversity = univInput.getText();
		String GPA = gpaInput.getText();
		if(degreeStatus.equals("phD")) { //if it is graduated student,
			if(attendedUniversity.length()==0||GPA.length()==0) {//check if univ or gpa field is empty
				throw new ErrorException("For graduate, you have to enter previous university and GPA");
			}
		}
	}
	
	public void checkGPA() throws ErrorException {
		String GPA = gpaInput.getText();
		// If GPA is not empty, attempt to parse it as a double
		if(GPA.isEmpty() == false) {
			Double doubleGPA = Double.parseDouble(GPA);	
			// Check if the parsed GPA is within the valid range (0 to 4.5)
			if(doubleGPA<0 || doubleGPA>4.5) {
				throw new ErrorException("GPA must be between 0 and 4.5");
			}
		}
		
	}
	
	public void checkPersonalStatement() throws ErrorException{
		String PersonalStatement = statementInput.getText();
		String statementWords = PersonalStatement.replaceAll("\\s+", ""); //deleting all spaces by replacing spacing to ""
		if(statementWords.length()<100) { //check if statement's length is smaller than 100 after deleting all spaces
			throw new ErrorException("Your Personal Statement must be at least 100 words.");
		}  
	}
	public void checkExperience() throws ErrorException{
		String experience = experienceInput.getText();
		if(experience.length() == 0) { 
			// Throw an ErrorException if the input is empty
			throw new ErrorException("You forgot to write your experience.");
		}
	}
	public void checkHomeAddress() throws ErrorException{
		String homeAddress = addressInput.getText();
		 // Regular expression for validating home address format "number, Street Name, District Name, City Name"
		String homeAddressRegex = "^\\d+,\\s*[^,]+,\\s*[^,]+,\\s*[^,]+$";
		
		// Compile the regular expression into a Pattern object
        Pattern addressPattern = Pattern.compile(homeAddressRegex);
        // Create a Matcher object for the input string
        Matcher adressMatcher = addressPattern.matcher(homeAddress);
        // Check if the input matches the specified pattern
        if (homeAddress.length() == 0) {
        	// Throw an ErrorException if the input is empty
        	throw new ErrorException("You forgot to fill the home address, Please fill it.");
        }else if(adressMatcher.matches() == false) {
        	// Throw an ErrorException if the input does not match the expected format
        	throw new ErrorException("Your address must be in 'number, street, district, city' format.");
        }
		
	}
	
	//declare clearInput, which clear all input field
	public void clearInput() {
		nameInput.setText("");
		birthInput.setText("");
		emailInput.setText("");
		degreeInput.setText("");
		univInput.setText("");
		phoneInput.setText("");
		experienceInput.setText("");
		statementInput.setText("");
		addressInput.setText("");
	}
	
	//declare printErrorList which return errorResult that contains all error messages with numbering
	private static String printErrorList(ArrayList<String> errorList) {
		String errorResult = "";
		for (int i = 0; i < errorList.size(); i++) {
            errorResult+= (i + 1) + ". " + errorList.get(i) + "\n";
        }
		
		return errorResult;
    }

	
}
