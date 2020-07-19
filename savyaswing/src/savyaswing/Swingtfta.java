package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swingtfta extends JPanel implements ActionListener {
	JTextField t;
	JTextArea ta;
	
	public Swingtfta() {
		t=new JTextField(20);
		t.addActionListener(this);
		
		ta=new JTextArea(5,25);
		ta.setCaretPosition(t.getDocument().getLength());
		ta.setEditable(false);
		JScrollPane j=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setLayout(new BorderLayout());
		add(t,BorderLayout.NORTH);
		add(j,BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent a) {
			String b=t.getText();
			ta.append(b+"\n");
			t.selectAll();
	}
		
	public static void main(String[] args) {
		JFrame f=new JFrame("Field and Area");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Swingtfta());
		f.pack();
		f.setVisible(true);
	}

}
