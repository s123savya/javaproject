 package savyaswing;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
public class Sanya extends JPanel {
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	
	public Sanya() {
		setLayout(new FlowLayout());
		l1=new JLabel();
		l1.setText("Hey Guys!");
		l1.setFont(new Font("Times New Roman",Font.ITALIC,15));
		l1.setOpaque(true);
		l1.setBackground(Color.black);
		l1.setForeground(Color.white);
		l1.setToolTipText("This is sanya singh");
		add(l1);
		
		l2=new JLabel();
		Icon i=new ImageIcon(getClass().getResource("/imagesused/bts.jpg"));
		l2.setIcon(i);
		l2.setText("I am ARMY and I got JAMSSSS...");
		l2.setVerticalTextPosition(JLabel.BOTTOM);
		l2.setHorizontalTextPosition(JLabel.CENTER);
		l2.setToolTipText("yoooooo");
		l2.setBorder(BorderFactory.createLineBorder(Color.black,2));
		l2.setOpaque(true);
		l2.setBackground(Color.white);
		add(l2);
		
		l3=new JLabel("Name");
		t1=new JTextField("Sanya",10);
		l3.setDisplayedMnemonic('N');
		l3.setLabelFor(t1);
		add(l3);
		add(t1);
		
		l4=new JLabel("SurName");
		t2=new JTextField("Singh",10);
		l4.setDisplayedMnemonic('S');
		l4.setLabelFor(t2);
		add(l4);
		add(t2);
				
	}
	public static void main(String args[]) {
		JFrame j = new JFrame("Boss Baby!");
		j.setContentPane(new Sanya());
		j.setBounds(20,10,450,300);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
