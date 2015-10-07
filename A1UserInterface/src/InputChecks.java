import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class InputChecks extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton done;
	private String[] leftOutput;
	private String[] rightOutput;
	private TextFieldPanel left;
	private InsuranceInfoPanel right;
	
	public InputChecks(TextFieldPanel left, InsuranceInfoPanel right){
		this.left = left;
		this.right = right;
		
		done = new JButton("Done");
		this.add(done);
		done.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		leftOutput = left.getFieldInfo();
		rightOutput = right.getFieldInfo();
		checks();
	}
	
	public void checks(){
		String personalInfo = ( "Personal Info: " + System.getProperty("line.separator") );
		String insuranceInfo = ( System.getProperty("line.separator") + "Insurance Info: " + System.getProperty("line.separator") );
		
		for(int i = 0; i < leftOutput.length; i++){
			//System.out.println(leftOutput[i]);
			personalInfo = personalInfo.concat(" | " + leftOutput[i].toString());
		}
		for(int e = 0; e < rightOutput.length; e++){
			//System.out.println(rightOutput[e]);	
			insuranceInfo = insuranceInfo.concat(" | " + rightOutput[e].toString());
		}
		printToPermit(personalInfo, insuranceInfo);
	}
	
	public void printToPermit(String personal, String insurance){
		
		try {

			String output =  personal + "\n" + insurance;
			System.out.println(output);
			File file = new File("parkingPermit.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(output);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]){
		JFrame frame = new JFrame("TouchKeyboard");
		InputChecks panel = new InputChecks(null,null);
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
