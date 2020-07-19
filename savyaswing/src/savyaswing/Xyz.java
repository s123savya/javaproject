package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Xyz extends JPanel {
	JLabel pic;
	JRadioButton b1,b2,b3;
	RadioListener rl=null;
	
	public Xyz() {
	b1=new JRadioButton("X");
	b1.setMnemonic('X');
	b1.setActionCommand("x");
	b1.setSelected(true);
	
	b2=new JRadioButton("Y");
	b2.setMnemonic('Y');
	b2.setActionCommand("y");
	
	b3=new JRadioButton("Z");
	b3.setMnemonic('Z');
	b3.setActionCommand("z");
	
	ButtonGroup g=new ButtonGroup();
	g.add(b1);
	g.add(b2);
	g.add(b3);
	
	rl=new RadioListener();
	b1.addActionListener(rl);
	b2.addActionListener(rl);
	b3.addActionListener(rl);
	
	pic = new JLabel(new ImageIcon(getClass().getResource("/imagesused/x.png")));
	pic.setPreferredSize(new Dimension(180,148));
	JPanel j= new JPanel();
	j.setLayout(new GridLayout(0,1));
	j.add(b1);
	j.add(b2);
	j.add(b3);
	setLayout(new BorderLayout());
	add(j,BorderLayout.WEST);
	add(pic,BorderLayout.CENTER);
	
	}
	
	class RadioListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			pic.setIcon(new ImageIcon(getClass().getResource("/imagesused/"+a.getActionCommand()+".png")));
			
		}
	}
	public static void main(String args[]) {
		JFrame f= new JFrame("XYZ");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new Xyz(),BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

}
