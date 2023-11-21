package exercise2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * @wbp.nonvisual location=172,4
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	/**
	 * @wbp.nonvisual location=202,4
	 */
	//private final JLabel lblConverter = DefaultComponentFactory.getInstance().createLabel("Converter");
	private JPanel contentPane;
	private JButton btnCalculate;
	private JLabel lbResult;
	private JTextArea textFieldInput;
	private JLabel lblNewLabel;
	private String inputFahrenheit = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterGUI frame = new ConverterGUI();
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
	public ConverterGUI() {
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		textFieldInput = new JTextArea();
		contentPane.add(textFieldInput);

		
		
		btnCalculate = new JButton("calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String userInput = textFieldInput.getText();
				double doubleInput = Double.parseDouble(userInput);
				double celsiusDegree = (doubleInput - 32)*(5.0/9);
				lbResult.setText(String.format("%.2f C",celsiusDegree));
				}
				catch(NumberFormatException ex) {
					//gui message(error handling)
					JOptionPane.showMessageDialog(null, "Please insert a number","error",
							JOptionPane.ERROR_MESSAGE); //for icon
				}
			}
		});
		contentPane.add(btnCalculate);

		
		lbResult = new JLabel("");
		contentPane.add(lbResult);
		
	}

	public void actionPerformed(ActionEvent e) {
	}
}
