import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
			this.setTitle("Parking Kiosk");
			TouchKeyboard keys = new TouchKeyboard();
			TextFieldPanel field = new TextFieldPanel(keys);

			JPanel jpanel = new JPanel();

			this.setContentPane(jpanel);
			jpanel.setLayout(new GridLayout(2, 0));

			jpanel.add(field);
			jpanel.add(keys);

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);

		}

	}

}