package savyaswing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Details extends JPanel {
	JLabel l1,l2,l3,l4;
	JTextArea t;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	public Details() {
		setLayout(null);
		
		l1=new JLabel();
		l1.setText("Name");
		t1=new JTextField(10);
		t1.setEditable(true);
		l1.setDisplayedMnemonic('N');
		l1.setLabelFor(t1);
		l1.setBounds(50,50,100,25);
		t1.setBounds(200,50,100,25);
		add(l1);
		add(t1);
		
		l2=new JLabel();
		l2.setText("Address");
		t2=new JTextField(10);
		t2.setEditable(true);
		l2.setDisplayedMnemonic('A');
		l2.setLabelFor(t2);
		l2.setBounds(50,100,100,25);
		t2.setBounds(200,100,100,25);
		add(l2);
		add(t2);
		
		l3=new JLabel();
		l3.setText("Locality");
		t3=new JTextField(10);
		t3.setEditable(true);
		l3.setDisplayedMnemonic('L');
		l3.setLabelFor(t3);
		l3.setBounds(50,150,100,25);
		t3.setBounds(200,150,100,25);
		add(l3);
		add(t3);
		
		l4=new JLabel();
		l4.setText("City");
		t4=new JTextField(10);
		t4.setEditable(true);
		l4.setDisplayedMnemonic('C');
		l4.setLabelFor(t4);
		l4.setBounds(50,200,100,25);
		t4.setBounds(200,200,100,25);
		add(l4);
		add(t4);
		
		b1=new JButton();
		b1.setText("Show Details");
		b1.setBounds(50,250,150,25);
		add(b1);
		
		b2=new JButton();
		b2.setText("Clear Form");
		b2.setBounds(250,250,150,25);
		add(b2);
		
		t=new JTextArea(5,20);
		t.setEditable(false);
		JScrollPane j=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		j.setBounds(50,300,400,190);
		add(j);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				t.setText("Name:"+t1.getText()+"\nAddress:"+t2.getText()+"\nLocality:"+t3.getText()+"\nCity:"+t4.getText()+"");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				t.setText("");
			}
		});
		
	}
	public static void main(String[] args) {

		JFrame f=new JFrame("Details");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Details());
		f.setBounds(10,10,500,600);
		f.setVisible(true);
	}

}
