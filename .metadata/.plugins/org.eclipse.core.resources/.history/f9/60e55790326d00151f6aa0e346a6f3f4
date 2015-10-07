import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TouchNumberKeyboard extends Keyboard implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton backspace;

	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;

	private JTextField field;
	private String input;

	public TouchNumberKeyboard(JTextField field, String input) {
		this.field = field;
		this.input = input;
		
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");

		backspace = new JButton("Backspace");

		this.setLayout(new GridBagLayout());
		GridBagConstraints gridC = new GridBagConstraints();
		gridC.fill = GridBagConstraints.BOTH;
		gridC.weightx = 0.5;

		gridC.gridy = 0;
		gridC.gridx = 0;

		this.add(one, gridC);
		gridC.gridx = 1;
		this.add(two, gridC);
		gridC.gridx = 2;
		this.add(three, gridC);
		gridC.gridx = 3;
		this.add(backspace, gridC);

		gridC.gridy = 1;
		gridC.gridx = 0;
		this.add(four, gridC);
		gridC.gridx = 1;
		this.add(five, gridC);
		gridC.gridx = 2;
		this.add(six, gridC);

		gridC.gridy = 2;

		gridC.gridx = 0;
		this.add(seven, gridC);
		gridC.gridx = 1;
		this.add(eight, gridC);
		gridC.gridx = 2;
		this.add(nine, gridC);

		gridC.gridy = 3;
		gridC.gridx = 1;
		this.add(zero, gridC);

		backspace.addActionListener(this);

		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == zero) {
			input += "0";

		} else if (ae.getSource() == one) {
			input += "1";
		} else if (ae.getSource() == two) {
			input += "2";
		} else if (ae.getSource() == three) {
			input += "3";
		} else if (ae.getSource() == four) {
			input += "4";
		} else if (ae.getSource() == five) {
			input += "5";
		} else if (ae.getSource() == six) {
			input += "6";
		} else if (ae.getSource() == seven) {
			input += "7";
		} else if (ae.getSource() == eight) {
			input += "8";
		} else if (ae.getSource() == nine) {
			input += "9";
		} else if (ae.getSource() == backspace) {
			if (input.length() > 0) {
				input = input.substring(0, input.length() - 1);
			}
		}

		field.setText(input);
		System.out.println(input);
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void setTextField(JTextField field) {
		this.field = field;
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Shift Screen");
		TouchNumberKeyboard panel = new TouchNumberKeyboard(null,"");
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();

		// put the frame in the middle of the display
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height
				/ 2 - frame.getSize().height / 2);

		frame.setVisible(true);
	}

}
