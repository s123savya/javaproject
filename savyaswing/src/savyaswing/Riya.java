package savyaswing;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
public class Riya extends JPanel {
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	
	public Riya() {
		setLayout(new FlowLayout());
		l1 = new JLabel();
		l1.setText("Beheno aur unke Bhaiyon!");
		l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,15));
		l1.setOpaque(true);
		l1.setBackground(Color.blue);
		l1.setForeground(Color.white);
		add(l1);
		
		l2 = new JLabel();
		Icon i=new ImageIcon(getClass().getResource("/imagesused/badibobbo.jpg"));
		l2.setIcon(i);
		l2.setText("Yaad aane lgi piya ki....ye photo h RIYA ki");
		l2.setVerticalTextPosition(JLabel.BOTTOM);
		l2.setHorizontalTextPosition(JLabel.CENTER);
		l2.setBorder(BorderFactory.createLineBorder(Color.black));
		l2.setOpaque(true);
		l2.setBackground(Color.white);
		add(l2);
		
		l3=new JLabel("Name");
		t1 = new JTextField("Riya",10);
		l3.setDisplayedMnemonic('N');
		l3.setLabelFor(t1);
		add(l3);
		add(t1);
		
		l4=new JLabel("Surname");
		t2 = new JTextField("Chauhan",10);
		l4.setDisplayedMnemonic('S');
		l4.setLabelFor(t2);
		add(l4);
		add(t2);
			
	}
	public static void main(String args[]) {
		JFrame j= new JFrame("Badi Bobbo");
		j.setContentPane(new Riya());
		j.setBounds(20,10,500,300);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
