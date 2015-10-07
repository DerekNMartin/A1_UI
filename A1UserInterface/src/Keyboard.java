import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class Keyboard extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public abstract String getInput();
	public abstract void setInput(String input);
	public abstract void setTextField(JTextField field);
}
