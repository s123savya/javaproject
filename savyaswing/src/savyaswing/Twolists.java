package savyaswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.Position;
public class Twolists extends JPanel {
	DefaultListModel<String> d1,d2,d3,d4;
	JList<String> jl1,jl2;
	List  ll1,ll2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JLabel l1,l2;
	int size1=0,size2=0;
		
	public Twolists() {
		setLayout(null);
		d1=new DefaultListModel<String>();
		jl1 = new JList<String> (d1);
		jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jl1.setVisibleRowCount(7);
		JScrollPane sp1=new JScrollPane(jl1);
		sp1.setBounds(50,50,100,130);
		add(sp1);
		
		t1=new JTextField(10);
		t1.setEditable(true);
		t1.setBounds(50,200,100,30);
		add(t1);
		
		b1=new JButton("Add");
		b1.setBounds(50,250,100,30);
		add(b1);
		b2=new JButton("Remove");
		b2.setBounds(50,300,100,30);
		add(b2);
		
		l1=new JLabel("Size:");
		l1.setBounds(50,350,100,30);
		
		add(l1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s1=t1.getText();
				d1.addElement(s1);
				size1=size1+1;
				t1.setText(" ");
				l1.setText("Size:"+size1);	
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s1=t1.getText();
				d1.removeElement(s1);
				size1=size1-1;
				t1.setText(" ");
				l1.setText("Size:"+size1);
				
			}
		});
		
		
		d2=new DefaultListModel<String>();
		jl2 = new JList<String>(d2);
		jl2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jl2.setVisibleRowCount(7);
		JScrollPane sp2=new JScrollPane(jl2);
		sp2.setBounds(300,50,100,130);
		add(sp2);
		
		t2=new JTextField(10);
		t2.setEditable(true);
		t2.setBounds(300,200,100,30);
		add(t2);
		
		b3=new JButton("Add");
		b3.setBounds(300,250,100,30);
		add(b3);
		b4=new JButton("Remove");
		b4.setBounds(300,300,100,30);
		add(b4);
		
		l2=new JLabel("Size:");
		l2.setBounds(300,350,100,30);
		add(l2);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s2=t2.getText();
				d2.addElement(s2);
				size2=size2+1;
				t2.setText(" ");
				l2.setText("Size:"+size2);		
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s2=t2.getText();
				d2.removeElement(s2);
				size2=size2-1;
				t2.setText(" ");
				l2.setText("Size:"+size2);
				
			}
		});
		b5=new JButton(">");
		b5.setBounds(187,55,80,25);
		add(b5);
		b6=new JButton(">>>");
		b6.setBounds(187,85,80,25);
		add(b6);
		b7=new JButton("<");
		b7.setBounds(187,115,80,25);
		add(b7);
		b8=new JButton("<<<");
		b8.setBounds(187,145,80,25);
		add(b8);
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s2=jl1.getSelectedValue();
				d2.addElement(s2);
				d1.removeElement(s2);
				size2=size2+1;
				size1=size1-1;
				l1.setText("Size:"+size1);
				l2.setText("Size:"+size2);
				
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
			    jl1.setSelectionInterval(0, size1-1);
				for (String x:jl1.getSelectedValuesList()) {
					d2.addElement(x);
				}
				d1.removeAllElements();
				l1.setText("Size:0");
				l2.setText("Size:"+(size2+size1));	
				size1=0;
			}
		});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String s2=jl2.getSelectedValue();
				d1.addElement(s2);
				d2.removeElement(s2);
				size2=size2-1;
				size1=size1+1;
				l1.setText("Size:"+size1);
				l2.setText("Size:"+size2);
					
			}
		});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				jl2.setSelectionInterval(0 , size2-1);
				for (String x:jl2.getSelectedValuesList()) {
					d1.addElement(x);
				}
				d2.removeAllElements();
				l2.setText("Size:0");
				l1.setText("Size:"+(size2+size1));	
				size2=0;
			}
		});
	}
	public static void main(String[] args) {
		JFrame f=new JFrame("Twolists");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Twolists());
		f.setBounds(10,10,500,500);
		f.setVisible(true);
		
	}

}
