import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldPanel extends JPanel implements FocusListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField studentNumber;
	private JTextField pin;
	private JTextField email;
	private JTextField expiry;
	
	private JLabel studentNumberLabel = new JLabel("Student Number:");
	private JLabel pinLabel = new JLabel("PIN:");
	private JLabel expiryLabel = new JLabel("Expiry Date:");
	private JLabel emailLabel = new JLabel("* Email Address:");

	private ChangeKeyboard keys;
	
	String[] months = new String[] { "January", 
			"February", 
			"March", 
			"April", 
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"};

	JComboBox<String> monthList = new JComboBox<>(months);
	
	String[] years = new String[] {"2015",
			"2016",
			"2017",
			"2018",
			"2019",
			"2020"};
	JComboBox<String> yearList = new JComboBox<>(years);
	

	public TextFieldPanel(ChangeKeyboard keys) {
		studentNumber = new JTextField(20);
		pin = new JTextField(20);
		email = new JTextField(20);
		expiry = new JTextField(20);
		


		studentNumber.addFocusListener(this);
		pin.addFocusListener(this);
		email.addFocusListener(this);
		expiry.addFocusListener(this);
		
		monthList.addActionListener(this);
		yearList.addActionListener(this);

		this.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.insets = new Insets(10, 10, 10, 10);

		gc.gridx = 0;
		gc.gridy = 0;
		this.add(studentNumberLabel, gc);
		gc.gridx = 1;
		this.add(studentNumber, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		this.add(pinLabel, gc);
		gc.gridx = 1;
		this.add(pin, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		this.add(expiryLabel, gc);
		gc.gridwidth = 2;
		gc.gridx = 1;
		this.add(monthList, gc);
		gc.gridx = 2;
		this.add(yearList, gc);
		gc.gridx = 0;
		gc.gridy = 5;
		
		this.add(emailLabel, gc);
		gc.gridx = 1;
		gc.gridy = 5;
		this.add(email, gc);

		this.keys = keys;

	}

	@Override
	public void focusGained(FocusEvent fe) {
		// TODO Auto-generated method stub
		if (fe.getSource() == studentNumber) {
			keys.setNumberKeyboard(studentNumber, studentNumber.getText());
		} else if (fe.getSource() == pin) {
			keys.setNumberKeyboard(pin, pin.getText());
		} else if (fe.getSource() == email) {
			keys.setEmailKeyboard(email, email.getText());
		} 
	}

	@Override
	public void focusLost(FocusEvent fe) {
		// TODO Auto-generated method stub

	}
	
	public String[] getFieldInfo(){
		String[] output = {studentNumber.getText(), pin.getText(), (String) monthList.getSelectedItem(), (String) yearList.getSelectedItem(), email.getText()};
		return output;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("TextFieldPanel");
		TextFieldPanel panel = new TextFieldPanel(new ChangeKeyboard(frame));
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();

		// put the frame in the middle of the display
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height
				/ 2 - frame.getSize().height / 2);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == monthList){
			System.out.println("Month: " + monthList.getSelectedItem().toString() );
		} else if(e.getSource() == yearList){
			System.out.println("Year: " + yearList.getSelectedItem().toString() );
		}

	}
}
