package savyaswing;
import java.awt.event.*;
import javax.swing.*;
public class Form extends JPanel {
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2;
	JRadioButton r1,r2;
	JList<String> l;
	JCheckBox c1,c2,c3,c4;
	JComboBox<String> jc;
	JTextArea ta;
	String q,e;
	
	public Form() {
		setLayout(null);
		l1=new JLabel("Name");
		t1=new JTextField(10);
		l1.setLabelFor(t1);
		t1.setEditable(true);
		l1.setBounds(20,10,100,25);
		t1.setBounds(200,10,100,25);
		add(l1);
		add(t1);
				
		l2=new JLabel ("Gender");
		l2.setBounds(20,60,100,25);
		add(l2);
		r1=new JRadioButton();
		r1.setText("Male");
		r1.setActionCommand("Male");
		r2=new JRadioButton();
		r2.setText("Female");
		r2.setActionCommand("Female");
		r1.setBounds(20,100,100,25);
		r2.setBounds(200,100,100,25);
		add(r1);
		add(r2);
		ButtonGroup g=new ButtonGroup();
		g.add(r1);
		g.add(r2);
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				e=a.getActionCommand();
			}
		});
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				e=a.getActionCommand();
			}
		});
				
		l3=new JLabel("Hobbies");
		l3.setBounds(20,135,100,25);
		add(l3);
		c1=new JCheckBox("Reading");
		c1.setActionCommand("Reading");
		c2=new JCheckBox("Music");
		c2.setActionCommand("Music");
		c3=new JCheckBox("Movies");
		c3.setActionCommand("Movies");
		c4=new JCheckBox("Gardening");
		c4.setActionCommand("Gardening");
		c1.setBounds(20,160,100,30);
		c2.setBounds(200,160,100,30);
		c3.setBounds(20,185,100,30);
		c4.setBounds(200,180,100,30);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		ButtonGroup g1=new ButtonGroup();
		g1.add(c1);
		g1.add(c2);
		g1.add(c3);
		g1.add(c4);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				q=a.getActionCommand();
			}
		});
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				q=a.getActionCommand();
			}
		});
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				q=a.getActionCommand();
			}
		});
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				q=a.getActionCommand();
			}
		});
		
		l4=new JLabel("Qualification");
		l4.setBounds(20,230,100,25);
		add(l4);
		String[] ct= {"BE","BTECH","BPHARM","BCOM","BA","LLB","MTECH","MBA","MCOM"};
		jc =new JComboBox<String>(ct);
		jc.setBounds(200,230,100,25);
		add(jc);
		
		l5=new JLabel("Software");
		l5.setBounds(20,280,100,25);
		add(l5);
		String t[]= {"C","C++","Java",".NET","Eclipse","Cmd"};
		l=new JList<String>(t);
		l.setVisibleRowCount(4);
		JScrollPane lsp = new JScrollPane(l);
		lsp.setBounds(200,280,100,60);
		add(lsp);
		b1=new JButton("Show Details");
		b2=new JButton("Clear form");
		b1.setBounds(20,370,130,25);
		b2.setBounds(200,370,130,25);
		add(b1);
		add(b2);
		
		ta=new JTextArea();
		ta.setEditable(false);
		ta.setBounds(20,410,300,150);
		add(ta);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				ta.setText("Name:"+t1.getText()+"\nGender:"+e+
						"\nHobbies:"+q+"\nQualification:"+jc.getSelectedItem()+
						"\nSoftware:"+l.getSelectedValue());
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				ta.setText("");
			}
		});
	}
	public static void main(String args[]) {
		JFrame f=new JFrame("Form");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Form());
		f.setBounds(0,0,360,620);
		f.setVisible(true);
	}

}
