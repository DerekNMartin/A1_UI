import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TouchKeyboard extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton q;
	private JButton w;
	private JButton e;
	private JButton r;
	private JButton t;
	private JButton y;
	private JButton u;
	private JButton i;
	private JButton o;
	private JButton p;
	private JButton a;
	private JButton s;
	private JButton d;
	private JButton f;
	private JButton g;
	private JButton h;
	private JButton j;
	private JButton k;
	private JButton l;
	private JButton z;
	private JButton x;
	private JButton c;
	private JButton v;
	private JButton b;
	private JButton n;
	private JButton m;
	private JButton backspace;
	private JButton at;
	private JButton enter;
	private JButton comma;
	private JButton period;
	private JButton question;
	
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

	private String input = "";

	public TouchKeyboard() {
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
		
		q = new JButton("Q");
		w = new JButton("W");
		e = new JButton("E");
		r = new JButton("R");
		t = new JButton("T");
		y = new JButton("Y");
		u = new JButton("U");
		i = new JButton("I");
		o = new JButton("O");
		p = new JButton("P");
		backspace = new JButton("Backspace");

		a = new JButton("A");
		s = new JButton("S");
		d = new JButton("D");
		f = new JButton("F");
		g = new JButton("G");
		h = new JButton("H");
		j = new JButton("J");
		k = new JButton("K");
		l = new JButton("L");
		at = new JButton("\u0040");
		enter = new JButton("Done");

		z = new JButton("Z");
		x = new JButton("X");
		c = new JButton("C");
		v = new JButton("V");
		b = new JButton("B");
		n = new JButton("N");
		m = new JButton("M");
		comma = new JButton(",");
		period = new JButton(".");
		question = new JButton("?");

		this.setLayout(new GridBagLayout());
		GridBagConstraints gridC = new GridBagConstraints();
		gridC.fill = GridBagConstraints.BOTH;
		gridC.weightx = 0.5;
		
		gridC.gridy = 0;
		gridC.gridx = 13;
		this.add(one, gridC);
		gridC.gridx = 14;
		this.add(two, gridC);
		gridC.gridx = 15;
		this.add(three, gridC);
		
		gridC.gridy = 1;
		gridC.gridx = 13;
		this.add(four, gridC);
		gridC.gridx = 14;
		this.add(five, gridC);
		gridC.gridx = 15;
		this.add(six, gridC);
		
		gridC.gridy = 2;
		gridC.gridx = 13;
		this.add(seven, gridC);
		gridC.gridx = 14;
		this.add(eight, gridC);
		gridC.gridx = 15;
		this.add(nine, gridC);
		
		gridC.gridy = 3;
		gridC.gridx = 14;
		this.add(zero, gridC);

		gridC.gridy = 0;
		gridC.gridx = 0;
		this.add(q, gridC);
		gridC.gridx = 1;
		this.add(w, gridC);
		gridC.gridx = 2;
		this.add(e, gridC);
		gridC.gridx = 3;
		this.add(r, gridC);
		gridC.gridx = 4;
		this.add(t, gridC);
		gridC.gridx = 5;
		this.add(y, gridC);
		gridC.gridx = 6;
		this.add(u, gridC);
		gridC.gridx = 7;
		this.add(i, gridC);
		gridC.gridx = 8;
		this.add(o, gridC);
		gridC.gridx = 9;
		this.add(p, gridC);
		
		gridC.gridx = 10;
		gridC.gridwidth = 3;
		this.add(backspace, gridC);

		gridC.gridwidth = 1;
		gridC.gridy = 1;
		gridC.gridx = 0;
		this.add(a, gridC);
		gridC.gridx = 1;
		this.add(s, gridC);
		gridC.gridx = 2;
		this.add(d, gridC);
		gridC.gridx = 3;
		this.add(f, gridC);
		gridC.gridx = 4;
		this.add(g, gridC);
		gridC.gridx = 5;
		this.add(h, gridC);
		gridC.gridx = 6;
		this.add(j, gridC);
		gridC.gridx = 7;
		this.add(k, gridC);
		gridC.gridx = 8;
		this.add(l, gridC);
		gridC.gridx = 9;
		this.add(at, gridC);

		gridC.gridwidth = 1;
		gridC.gridy = 2;
		gridC.gridx = 0;
		this.add(z, gridC);
		gridC.gridx = 1;
		this.add(x, gridC);
		gridC.gridx = 2;
		this.add(c, gridC);
		gridC.gridx = 3;
		this.add(v, gridC);
		gridC.gridx = 4;
		this.add(b, gridC);
		gridC.gridx = 5;
		this.add(n, gridC);
		gridC.gridx = 6;
		this.add(m, gridC);
		gridC.gridx = 7;
		this.add(comma, gridC);
		gridC.gridx = 8;
		this.add(period, gridC);
		gridC.gridx = 9;
		this.add(question, gridC);
		
		gridC.gridx = 3;
		gridC.gridy = 4;
		gridC.gridwidth = 4;
		this.add(enter, gridC);
		
		gridC.gridwidth = 16;
		gridC.gridheight = 5;
		
		zero.addActionListener(this);

		q.addActionListener(this);
		w.addActionListener(this);
		e.addActionListener(this);
		r.addActionListener(this);
		t.addActionListener(this);
		y.addActionListener(this);
		u.addActionListener(this);
		i.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		backspace.addActionListener(this);

		a.addActionListener(this);
		s.addActionListener(this);
		d.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		at.addActionListener(this);
		enter.addActionListener(this);

		z.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		b.addActionListener(this);
		n.addActionListener(this);
		m.addActionListener(this);
		comma.addActionListener(this);
		period.addActionListener(this);
		question.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == q) {
			input += "Q";
		} else if (ae.getSource() == w) {
			input += "W";
		} else if (ae.getSource() == e) {
			input += "E";
		} else if (ae.getSource() == r) {
			input += "R";
		} else if (ae.getSource() == t) {
			input += "T";
		} else if (ae.getSource() == y) {
			input += "Y";
		} else if (ae.getSource() == u) {
			input += "U";
		} else if (ae.getSource() == i) {
			input += "I";
		} else if (ae.getSource() == o) {
			input += "O";
		} else if (ae.getSource() == p) {
			input += "P";
		} else if (ae.getSource() == a) {
			input += "A";
		} else if (ae.getSource() == s) {
			input += "S";
		} else if (ae.getSource() == d) {
			input += "D";
		} else if (ae.getSource() == f) {
			input += "F";
		} else if (ae.getSource() == g) {
			input += "G";
		} else if (ae.getSource() == h) {
			input += "H";
		} else if (ae.getSource() == j) {
			input += "J";
		} else if (ae.getSource() == k) {
			input += "K";
		} else if (ae.getSource() == l) {
			input += "L";
		} else if (ae.getSource() == z) {
			input += "Z";
		} else if (ae.getSource() == x) {
			input += "X";
		} else if (ae.getSource() == c) {
			input += "C";
		} else if (ae.getSource() == v) {
			input += "V";
		} else if (ae.getSource() == b) {
			input += "B";
		} else if (ae.getSource() == n) {
			input += "N";
		} else if (ae.getSource() == m) {
			input += "M";
		} else if (ae.getSource() == backspace) {
			if (input.length() > 0) {
				input = input.substring(0, input.length() - 1);
			}
		} else if (ae.getSource() == at) {
			input += ("\u0040");
		} else if (ae.getSource() == enter) {
			// input += System.getProperty("line.separator");
		} else if (ae.getSource() == comma) {
			input += (",");
		} else if (ae.getSource() == period) {
			input += (".");
		} else if (ae.getSource() == question) {
			input += ("?");
		} else if (ae.getSource() == zero) {
			input += ("0");
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

	public static void main(String[] args) {
		JFrame frame = new JFrame("TouchKeyboard");
		TouchKeyboard panel = new TouchKeyboard();
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