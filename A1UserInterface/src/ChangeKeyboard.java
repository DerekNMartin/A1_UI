
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeKeyboard extends JPanel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	JFrame frame;
	Keyboard keys;
	boolean charOrKey = true;

	public ChangeKeyboard(JFrame frame) {
		this.frame = frame;
		keys = new TouchNumberKeyboard(null,"");

		this.add(keys);
	}

	public static void main(String[] args) {
		// new ChangeKeyboard();
	}
	
	private void UpdateKeyboard(){
		this.removeAll();
		this.add(keys);
		this.repaint();
		revalidate();
		frame.pack();
	}
	
	public void setEmailKeyboard(JTextField field, String input) {
		keys = new TouchEmailKeyboard(field,input);
		UpdateKeyboard();
	}

	public void setABCKeyboard(JTextField field, String input) {
		keys = new TouchABCKeyboard(field,input);
		UpdateKeyboard();
	}
	
	public void setNumberKeyboard(JTextField field, String input) {
		keys = new TouchNumberKeyboard(field,input);
		UpdateKeyboard();	
	}
	
	public void setAlphaNumericKeyboard(JTextField field, String input) {
		keys = new TouchAlphaNumericKeyboard(field,input);
		UpdateKeyboard();
	}

	public String getInput() {
		// TODO Auto-generated method stub
		return keys.getInput();
	}

	public void setInput(String input) {
		// TODO Auto-generated method stub
		keys.setInput(input);
	}

	public void setTextField(JTextField field) {
		// TODO Auto-generated method stub
		keys.setTextField(field);
	}
}
