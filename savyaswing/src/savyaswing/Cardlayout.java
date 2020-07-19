package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cardlayout extends JPanel implements ActionListener {
	JButton f,n,p,l;
	JPanel center,south;
	CardLayout cl;
	
	public Cardlayout() {
		setLayout(new BorderLayout());
		
		center = new JPanel();
		cl = new CardLayout();
		center.setLayout(cl );
		south = new JPanel();
		south.setLayout(new FlowLayout());
		south.setBackground(Color.darkGray);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		center.add("2-numbers", new Number2());
		center.add("Radius", new Radius());
		center.add("Interest", new Interest());
		center.add("Details", new Details());
		center.add("Calculator", new Calculator());
		center.add("Twolists", new Twolists());
		center.add("Form", new Form());
		
		f = new JButton("First");
		f.addActionListener(this);
		n = new JButton("Next");
		n.addActionListener(this);
		p = new JButton("Previous");
		p.addActionListener(this);
		l = new JButton("Last");
		l.addActionListener(this);

		south.add(f);
		south.add(n);
		south.add(p);
		south.add(l);

	}

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if (str.equals("First")) {
			cl.first(center);
		} else if (str.equals("Next")) {
			cl.next(center);
		} else if (str.equals("Previous")) {
			cl.previous(center);
		} else {
			cl.last(center);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("CardLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Cardlayout());
		frame.setBounds(10, 10, 500, 500);
		frame.setVisible(true);
	}
}

	
	
	