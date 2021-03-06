import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ParkingKiosk {

	public ParkingKiosk() {
		new ParkingKioskFrame();
	}

	public static void main(String arg[]) {
		new ParkingKiosk();

	}

	public class ParkingKioskFrame extends JFrame {

		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;

		public ParkingKioskFrame() {
			
			try{
				UIManager.setLookAndFeel(
						UIManager.getSystemLookAndFeelClassName());
			} 
			catch (Exception e){
			}
			
			this.setTitle("Parking Kiosk");
			ChangeKeyboard keys = new ChangeKeyboard(this);
			TextFieldPanel field = new TextFieldPanel(keys);
			InsuranceInfoPanel insuranceInfo = new InsuranceInfoPanel(keys);
			InputChecks inputChecks = new InputChecks(field, insuranceInfo);
			
			JPanel info = new JPanel(new BorderLayout());

			info.setLayout(new BoxLayout(info, BoxLayout.LINE_AXIS));
			info.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			
			keys.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

			info.add(field);
			info.add(new JSeparator(SwingConstants.VERTICAL));
			info.add(insuranceInfo);
			
			JPanel input = new JPanel(new BorderLayout());
			input.add(keys,BorderLayout.NORTH);
			input.add(new JSeparator(SwingConstants.HORIZONTAL), BorderLayout.CENTER);
			input.add(inputChecks,BorderLayout.SOUTH);
			
			Container contentPane = getContentPane();
			contentPane.add(info, BorderLayout.NORTH);
			contentPane.add(new JSeparator(SwingConstants.HORIZONTAL), BorderLayout.CENTER);
			contentPane.add(input, BorderLayout.SOUTH);
			

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setResizable(false);

			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);

		}

	}

}