package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Number2 extends JPanel {
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	
	public Number2() {
		setLayout(null);
		l1=new JLabel("Number 1");
		t1=new JTextField(10);
		t1.setEditable(true);
		l1.setFont(new Font("Times New Roman",Font.BOLD,15));
		l1.setDisplayedMnemonic('N');
		l1.setLabelFor(t1);
		l1.setBounds(50,50,100,25);
		t1.setBounds(200,50,100,25);
		add(l1);
		add(t1);
		
		
		l2=new JLabel("Number 2");
		t2=new JTextField(10);
		t2.setEditable(true);
		l2.setFont(new Font("Times New Roman",Font.BOLD,15));
		l2.setDisplayedMnemonic('N');
		l2.setLabelFor(t2);
		l2.setBounds(50,100,100,25);
		t2.setBounds(200,100,100,25);
		add(l2);
		add(t2);
		
		b1=new JButton();
		b1.setText("+");
		b1.setBounds(50,150,45,30);
		add(b1);
		
		b2=new JButton();
		b2.setText("-");
		b2.setBounds(100,150,45,30);
		add(b2);
		
		b3=new JButton();
		b3.setText("*");
		b3.setBounds(150,150,45,30);
		add(b3);
		
		b4=new JButton();
		b4.setText("/");
		b4.setBounds(200,150,45,30);
		add(b4);
		
		l3=new JLabel("Result");
		t3=new JTextField(10);
		t3.setEditable(false);
		l3.setFont(new Font("Times New Roman",Font.BOLD,15));
		l3.setDisplayedMnemonic('R');
		l3.setLabelFor(t3);
		l3.setBounds(50,200,100,25);
		t3.setBounds(200,200,100,25);
		add(l3);
        add(t3);		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText((a+b)+"");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText((a-b)+"");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText((a*b)+"");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				double a=Double.parseDouble(t1.getText());
				double b=Double.parseDouble(t2.getText());
				t3.setText((a/b)+"");
			}
		});
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Two numbers");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Number2());
		f.setBounds(10,10,400,300);
		f.setVisible(true);
		
	}

}
