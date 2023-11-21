package midterm;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class TransportGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel Window;
	private JLabel TripLabel;
	
	
	private JPanel MethodOption;
	private JButton TrainOptionButton;
    private JButton BusOptionButton;
    private JButton TaxiOptionButton;
    private JTextArea NoticeText;
    private JPanel NumButtons;
    private JButton Num1Button;
    private JButton Num2Button;
    private JButton Num3Button;
    private JButton Num4Button;
    private JButton Num5Button;
    private JButton Num6Button;
    private JButton Num7Button;
    private JButton Num8Button;
    private JButton Num9Button;
    private JLabel emptyLabel;
    private JButton Num0Button;
    private JPanel CommandButtons;
    private JPanel SelectButtons;
    private JButton CancelButton;
    private JButton YesButton;
    private JButton ClearButton;
    private JButton NoButton;
    private JButton EnterButton;

	
	private ArrayList <PublicTransport> publicTransport = new ArrayList<>();
	
	//variables
	int step = 0; //for storing step of question
	int method = 0; // for storing transport method
	String userInput = ""; // for storing user's input string
	double baseFare = 0; //storing basefare
    double totalFare = 0; //storing totalfare
    //question strings
    String startText = "Choose transfort (from left menu): ";
    String choiceText = "You choose ";
    String baseFareText = "Enter base fare: ";
    String farePerStationText = "Enter fare per station(for extra stations): ";
    String nstationText = "Enter number of stations: ";
    String iteratingText = "Add more Transport(from right menu)?";
    String farePerKmText = "Enter fare per km: ";
    String distanceText = "Enter distance (in km): ";
    //storing result text for print total fare
    String resultText = "";
    //make new object for each constructor
    Taxi newTaxi = new Taxi("KAKOTAXI", 0, 0, 0, 0);
    Train newTrain = new Train("KORAIL", 0, 0, 0, 0);
    Bus newBus = new Bus("KORBUS", 0, 0, 0, 0);
  


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransportGUI frame = new TransportGUI();
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
	public TransportGUI() {
		//setting for frame
		setTitle("TRIP PLANNER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 150, 500, 700);
		Window = new JPanel();
		Window.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(Window);
		Window.setLayout(null);
		
		//make swing components
		TripLabel = new JLabel("");
        Window.setLayout(null);
        TripLabel.setHorizontalAlignment(0);
        TripLabel.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/planner_logo.png")));
        TripLabel.setBackground(Color.RED);
        TripLabel.setBounds(25, 10, 406, 92);
        Window.add(TripLabel);
		
        
		MethodOption = new JPanel();
		MethodOption.setBackground(SystemColor.window);
		MethodOption.setBounds(35, 163, 85, 140);
		Window.add(MethodOption);
		MethodOption.setLayout(new GridLayout(0, 1, 0, 0));
		
		TrainOptionButton = new JButton("TRAIN");
		TrainOptionButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/train.png")));
		MethodOption.add(TrainOptionButton);
		
		BusOptionButton = new JButton("BUS");
		BusOptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BusOptionButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/bus.png")));
		MethodOption.add(BusOptionButton);
		
		TaxiOptionButton = new JButton("TAXI");
		TaxiOptionButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/taxi.png")));
		TaxiOptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MethodOption.add(TaxiOptionButton);
		
		//textarea for printing text
		NoticeText = new JTextArea();
		NoticeText.setText("Choose transport (from left menu):");
		NoticeText.setBounds(120, 112, 247, 190);
		Window.add(NoticeText);
		
		//create 10 Buttons for input 
		NumButtons = new JPanel();
		NumButtons.setBounds(120, 307, 247, 288);
		Window.add(NumButtons);
		NumButtons.setLayout(new GridLayout(4, 3, 0, 0));
				
		Num1Button = new JButton("");
		Num1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Num1Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/1.png")));
		NumButtons.add(Num1Button);
				
		Num2Button = new JButton("");
		Num2Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/2.png")));
		NumButtons.add(Num2Button);
				
		Num3Button = new JButton("");
		Num3Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/3.png")));
		NumButtons.add(Num3Button);
				
		Num4Button = new JButton("");
		Num4Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/4.png")));
		NumButtons.add(Num4Button);
		
		Num5Button = new JButton("");
		Num5Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/5.png")));
		NumButtons.add(Num5Button);
		
		Num6Button = new JButton("");
		Num6Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/6.png")));
		NumButtons.add(Num6Button);
		
		Num7Button = new JButton("");
		Num7Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/7.png")));
		NumButtons.add(Num7Button);
		
		Num8Button = new JButton("");
		Num8Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/8.png")));
		NumButtons.add(Num8Button);
		
		Num9Button = new JButton("");
		Num9Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/9.png")));
		NumButtons.add(Num9Button);
		
		//emptylabel
		emptyLabel = new JLabel("");
		NumButtons.add(emptyLabel);
		
		Num0Button = new JButton("");
		Num0Button.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/0.png")));
		NumButtons.add(Num0Button);
		
		//label 'trip planner'
		TripLabel = DefaultComponentFactory.getInstance().createLabel("TRIP PLANNER");
		TripLabel.setBounds(190, 100, 103, 15);
		Window.add(TripLabel);
		
		//create button for cancel/clear/enter
		CommandButtons = new JPanel();
		CommandButtons.setBounds(371, 310, 103, 245);
	    Window.add(this.CommandButtons);
	    CommandButtons.setLayout(new GridLayout(0, 1, 0, 0));
	    
	    CancelButton = new JButton("cancel");
	    CancelButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/cancel.png")));
	    CommandButtons.add(this.CancelButton);
	    
	    ClearButton = new JButton("clear");
	    ClearButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/clear.png")));
	    CommandButtons.add(this.ClearButton);
	    EnterButton = new JButton("enter");
	    EnterButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/enter.png")));
	    CommandButtons.add(this.EnterButton);
	    
	    //create button for select yes or no
	    SelectButtons = new JPanel();
	    SelectButtons.setBounds(371, 167, 103, 98);
	    Window.add(this.SelectButtons);
	    SelectButtons.setLayout(new GridLayout(0, 1, 0, 0));
	    YesButton = new JButton("Yes");
	    YesButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/enterSmall.png")));
	    SelectButtons.add(this.YesButton);
	    NoButton = new JButton("No");
	    NoButton.setIcon(new ImageIcon(TransportGUI.class.getResource("/assets/cancelSmall.png")));
	   SelectButtons.add(this.NoButton);
	   
	   //add eventlistener
	   
	   TaxiOptionButton.addActionListener(this);
       BusOptionButton.addActionListener(this);
       TrainOptionButton.addActionListener(this);
       Num0Button.addActionListener(this);
       Num1Button.addActionListener(this);
       Num2Button.addActionListener(this);
       Num3Button.addActionListener(this);
       Num4Button.addActionListener(this);
       Num5Button.addActionListener(this);
       Num6Button.addActionListener(this);
       Num7Button.addActionListener(this);
       Num8Button.addActionListener(this);
       Num9Button.addActionListener(this);
       CancelButton.addActionListener(this);
       ClearButton.addActionListener(this);
       EnterButton.addActionListener(this);
       YesButton.addActionListener(this);
       NoButton.addActionListener(this);
		
		
		
		
	}
	//actionlistener for each button
	 @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == EnterButton) { //if user click enter button
	            if (method == 0) {
	                userInput = "";
	                NoticeText.setText(startText); //print start text for starting
	            }
	            else if (method == 2 && step == 0) { //if user click bus
	                NoticeText.setText(farePerStationText);
	                newBus.setBaseFare(Double.parseDouble(userInput)); //set basefare when user click enter
	                userInput = "";
	                step = 1; //move to next step
	            }
	            else if (method == 3 && step == 0) { //if user click train
	                NoticeText.setText(farePerStationText);
	                newTrain.setBaseFare(Double.parseDouble(userInput));
	                userInput = "";
	                step = 1;
	            }
	            else if (method == 1 && step == 0) { //if user click taxi
	                NoticeText.setText(farePerKmText);
	                newTaxi.setBaseFare(Double.parseDouble(userInput));
	                userInput = "";
	                step = 3;
	            }
	            else if (step == 1) { //click enter after input fareperstation
	                NoticeText.setText(nstationText);
	                if (method == 2) { //if bus
	                    newBus.setFarePerStation(Double.parseDouble(userInput));
	                }
	                else if (method == 3) { //if train
	                    newTrain.setFarePerStation(Double.parseDouble(userInput));
	                }
	                userInput = "";
	                step = 2;
	            }
	            else if (step == 3) { //click enter after fareperkm(taxi)
	                NoticeText.setText(distanceText);
	                newTaxi.setFarePerKm(Double.parseDouble(userInput));
	                userInput = "";
	                step = 4;
	            }
	            else if (step == 2) { //click enter after enter nstation
	                NoticeText.setText(iteratingText);
	                if (method == 2) { //if bus
	                    newBus.setNStation(Integer.parseInt(userInput)); //set nstation
	                    newBus.calculatePayment(); //calculate payment
	                    totalFare = newBus.getTotalFare(); //store the totalfare
	                    Bus addingBus = newBus; 
	                    publicTransport.add(addingBus); //add the object to arraylist, publicTransport
	                    newBus = new Bus("KORBUS", 0.0, 0.0, 0.0, 0); //initializing for next step
	                }
	                else if (method == 3) { //if train
	                    newTrain.setNStation(Integer.parseInt(userInput));
	                    newTrain.calculatePayment();
	                    totalFare = newTrain.getTotalFare();
	                    final Train addingTrain = newTrain;
	                    publicTransport.add(addingTrain);
	                    newTrain = new Train("KORAIL", 0.0, 0.0, 0.0, 0);//initializing for next step
	                }
	                userInput = "";
	                step = 5;
	            }
	            else if (step == 4) { //click enter after input distance
	                NoticeText.setText(iteratingText);
	                newTaxi.setDistance(Double.parseDouble(userInput));//set distance
	                newTaxi.calculatePayment();//calculate paymemt
	                totalFare = newTaxi.getTotalFare(); //store the totalfare
	                Taxi addingTaxi = newTaxi; 
	                publicTransport.add(addingTaxi); //add the object to arraylist, publicTransport
	                newTaxi = new Taxi("KAKOTAXI", 0.0, 0.0, 0.0, 0.0);//initializing for next step
	                userInput = "";
	                step = 5;
	            }
	        }
	        else if (e.getSource() == Num0Button) { //if each number
	            userInput = userInput+"0";  //store the value in user input
	            if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput); //print and guide the step
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num1Button) {
	            userInput = userInput+"1";
	            if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num2Button) {
	        	userInput = userInput+"2";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num3Button) {
	        	userInput = userInput+"3";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num4Button) {
	        	userInput = userInput+"4";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num5Button) {
	        	userInput = userInput+"5";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num6Button) {
	        	userInput = userInput+"6";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num7Button) {
	        	userInput = userInput+"7";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num8Button) {
	        	userInput = userInput+"8";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == Num9Button) {
	        	userInput = userInput+"9";
	        	if (method == 1 && step == 0) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	            }
	            else if (method == 2 && step == 0) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (method == 3 && step == 0) {
	                NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	            }
	            else if (step == 1) {
	                NoticeText.setText(farePerStationText+userInput);
	            }
	            else if (step == 3) {
	                NoticeText.setText(farePerKmText+userInput);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText+userInput);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText+userInput);
	            }
	        }
	        else if (e.getSource() == TaxiOptionButton) { //if user select taxioption
	            method = 1;
	            step = 0; //initializing step
	            userInput = "";
	            NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput);
	        }
	        else if (e.getSource() == BusOptionButton) {//if user select busoption
	            method = 2;
	            step = 0;
	            userInput = "";
	            NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	        }
	        else if (e.getSource() == TrainOptionButton) { //if user select trainoption
	            method = 3;
	            step = 0;
	            userInput = "";
	            NoticeText.setText(choiceText+"TRAIN\n"+baseFareText+userInput);
	        }
	        else if (e.getSource() == CancelButton) { //if user select canceloption
	            method = 0;
	            publicTransport.clear(); //clear all list
	            NoticeText.setText(startText);
	        }
	        else if (e.getSource() == ClearButton) { //if user select clearbutton
	            userInput = ""; //clear the input
	            if (step == 0 && method == 1) {
	                NoticeText.setText(choiceText+"TAXI\n"+baseFareText+userInput); //print the question with initialized userinput
	            }
	            else if (step == 0 && method == 2) {
	                NoticeText.setText(choiceText+"BUS\n"+baseFareText+userInput);
	            }
	            else if (step == 0 && method == 3) {
	                NoticeText.setText(choiceText+"TRAIN"+baseFareText+userInput);
	            }
	            else if (step == 3 && method == 1) {
	                NoticeText.setText(farePerKmText);
	            }
	            else if (step == 1 && (method == 2 | method == 3)) {
	                NoticeText.setText(farePerStationText);
	            }
	            else if (step == 2) {
	                NoticeText.setText(nstationText);
	            }
	            else if (step == 4) {
	                NoticeText.setText(distanceText);
	            }
	        }
	        else if (e.getSource() == YesButton) {//if user select yesbutton
	            method = 0; //initialize method and step for get new transport information
	            step = 0;
	            userInput = "";
	            NoticeText.setText(startText);
	        }
	        else if (e.getSource() == NoButton) {//if user select nobutton -> ready for printing total trip fare
	            int count = 0; //count for printing index of elements in arraylist
	            double totalTripFare = 0.0;
	            for (PublicTransport transport : publicTransport) { //iterating for print elements in arraylist, publicTransport
	                String model = transport.getModel();
	                double totalFare = transport.getTotalFare();
	                ++count;
	                totalTripFare += totalFare; //add totalfare to tatal trip fare
	                resultText = resultText+ "Transport"+count+":"+model+"\nFare:"+totalFare+"\n";
	            }
	            resultText = resultText+"\n=======================\nTotal Trip Fare:"+totalTripFare;
	            NoticeText.setText(resultText); //print result text
	            resultText = "";
	        }
	    }
}
