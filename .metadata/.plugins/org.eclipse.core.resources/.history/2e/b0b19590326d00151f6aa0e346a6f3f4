
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

	public ChangeKeyboard(JFrame frame) {
		this.frame = frame;
		keys = new TouchKeyboard();

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

	public void setToKeyboard() {
		keys = new TouchKeyboard();
		UpdateKeyboard();
	}
	
	public void setToTouchNumKeyboard() {
		keys = new TouchNumKeyboard();
		UpdateKeyboard();
		
	}
	public void setToCharPad() {
		keys = new TouchCharPad();
		UpdateKeyboard();
	}
	
	public void setToKeyboard2() {
		keys = new TouchKeyboard2();
		UpdateKeyboard();
	}

	public void setToNumPad() {
		keys = new TouchCharPad();
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
