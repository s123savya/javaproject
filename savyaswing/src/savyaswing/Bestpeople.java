package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Bestpeople extends JPanel {
	JLabel pic;
	JRadioButton b1,b2,b3,b4;
	RadioListener rl =null;
	
	public Bestpeople() {
		b1=new JRadioButton("Mumma-Papa");
		b1.setMnemonic('M');
		b1.setActionCommand("mupa");
		b1.setSelected(true);
		
		b2=new JRadioButton("Riya Didi");
		b2.setMnemonic(KeyEvent.VK_R);
		b2.setActionCommand("riya");
		
		b3=new JRadioButton("Sanya");
		b3.setMnemonic(KeyEvent.VK_S);
		b3.setActionCommand("sanya");
		
		b4=new JRadioButton("Savya");
		b4.setMnemonic(KeyEvent.VK_S);
		b4.setActionCommand("savya");
		
		ButtonGroup g=new ButtonGroup();
		g.add(b1);
		g.add(b2);
		g.add(b3);
		g.add(b4);
		
		rl = new RadioListener();
		b1.addActionListener(rl);
		b2.addActionListener(rl);
		b3.addActionListener(rl);
		b4.addActionListener(rl);
		
		pic = new JLabel(new ImageIcon(getClass().getResource("/imagesused/mupa.jpg")));
		pic.setPreferredSize(new Dimension(500,550));
		JPanel j = new JPanel();
		j.setLayout(new GridLayout(0,1));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		setLayout(new BorderLayout());
		add(j,BorderLayout.WEST);
		add(pic,BorderLayout.CENTER);
				
	}

	class RadioListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			
			pic.setIcon(new ImageIcon(getClass().getResource("/imagesused/"+a.getActionCommand()+".jpg")));
		}	
		

	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Best People");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new Bestpeople(),BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

}
