package savyaswing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Interest extends JPanel {
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	public Interest() {
		setLayout(null);
		
		l1=new JLabel();
		l1.setText("Principal");
		t1=new JTextField(10);
		t1.setEditable(true);
		l1.setDisplayedMnemonic('P');
		l1.setLabelFor(t1);
		l1.setBounds(50,50,100,25);
		t1.setBounds(200,50,100,25);
		add(l1);
		add(t1);
		
		l2=new JLabel();
		l2.setText("Rate");
		t2=new JTextField(10);
		t2.setEditable(true);
		l2.setDisplayedMnemonic('R');
		l2.setLabelFor(t2);
		l2.setBounds(50,100,100,25);
		t2.setBounds(200,100,100,25);
		add(l2);
		add(t2);
		
		l3=new JLabel();
		l3.setText("Time");
		t3=new JTextField(10);
		t3.setEditable(true);
		l3.setDisplayedMnemonic('T');
		l3.setLabelFor(t3);
		l3.setBounds(50,150,100,25);
		t3.setBounds(200,150,100,25);
		add(l3);
		add(t3);
		
		b1=new JButton();
		b1.setText("Simple Interest");
		b1.setBounds(30,200,150,25);
		add(b1);
		
		b2=new JButton();
		b2.setText("Compound Interest");
		b2.setBounds(200,200,150,25);
		add(b2);
		
		l4=new JLabel();
		l4.setText("Interest");
		t4=new JTextField(10);
		t4.setEditable(false);
		l4.setDisplayedMnemonic('I');
		l4.setLabelFor(t4);
		l4.setBounds(50,250,100,25);
		t4.setBounds(200,250,100,25);
		add(l4);
		add(t4);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				float a=Float.parseFloat(t1.getText());
				float b=Float.parseFloat(t2.getText());
				float c=Float.parseFloat(t3.getText());
				float d=(a*b*c)/100;
				t4.setText(d+"");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				float a=Float.parseFloat(t1.getText());
				float b=Float.parseFloat(t2.getText());
				float c=Float.parseFloat(t3.getText());
	    		double d=a*(Math.pow((1+b),c));
	    		t4.setText(d+"");  
			}
		});
	}

	public static void main(String[] args) {
	
		JFrame f=new JFrame("Interest");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Interest());
		f.setBounds(10,10,400,400);
		f.setVisible(true);
	}

}
