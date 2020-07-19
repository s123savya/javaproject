package savyaproject;
import savyaswing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
public class Virtualdesktop extends JFrame implements ActionListener {
	JDesktopPane dp;
	JToolBar tb;
	JPopupMenu pm;
	JMenuBar mb;
	JLabel l;
	UIManager.LookAndFeelInfo laf[];
	
	public Virtualdesktop() {
		setLayout(new BorderLayout());
		dp =new JDesktopPane() {
		ImageIcon i;
		Image img;
		{	i=new ImageIcon(getClass().getResource("/imagesused/scenary.jpg"));
			img=i.getImage();
		}
			
		@Override
		protected void paintComponent(Graphics g) {//to display image in background
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	};
	laf=UIManager.getInstalledLookAndFeels();
	l=new JLabel("Project by Savya Singh");
	dp.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
	l.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
	l.setFont(new Font("Time New Roman", Font.BOLD, 16));
	
	createTB();
	createMB();
	createPPM();
	
	getContentPane().add(dp, BorderLayout.CENTER);
	getContentPane().add(l, BorderLayout.SOUTH);
	
	setTitle("Java Project Design");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	ImageIcon icon1 = new ImageIcon(getClass().getResource("/imagesused/aparichit.jpg"));
	setIconImage(icon1.getImage());
	setVisible(true);
	}
	
	public void createTB() {
		tb= new JToolBar();
		
		JButton b1=new JButton(" N ");
		b1.setActionCommand("Number2");
		b1.setToolTipText("Number2");
		b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b1.addActionListener(this);
		tb.add(b1);
		
		JButton b2=new JButton(" R ");
		b2.setActionCommand("Radius");
		b2.setToolTipText("Radius");
		b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b2.addActionListener(this);
		tb.add(b2);
		
		JButton b3=new JButton(" I ");
		b3.setActionCommand("Interest");
		b3.setToolTipText("Interest");
		b3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b3.addActionListener(this);
		tb.add(b3);
		
		JButton b4=new JButton(" D ");
		b4.setActionCommand("Details");
		b4.setToolTipText("Details");
		b4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b4.addActionListener(this);
		tb.add(b4);
		
		JButton b5=new JButton(" C ");
		b5.setActionCommand("Calculator");
		b5.setToolTipText("Calculator");
		b5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b5.addActionListener(this);
		tb.add(b5);
		
		JButton b6=new JButton(" T ");
		b6.setActionCommand("Twolists");
		b6.setToolTipText("Twolists");
		b6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b6.addActionListener(this);
		tb.add(b6);
		
		JButton b7=new JButton(" F ");
		b7.setActionCommand("Form");
		b7.setToolTipText("Form");
		b7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b7.addActionListener(this);
		tb.add(b7);
		
		tb.addSeparator();
		
		JButton b8=new JButton(" M ");
		b8.setActionCommand("Metal");
		b8.setToolTipText("Metal");
		b8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b8.addActionListener(this);
		tb.add(b8);
		
		JButton b9=new JButton(" Mt ");
		b9.setActionCommand("Motif");
		b9.setToolTipText("Motif");
		b9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b9.addActionListener(this);
		tb.add(b9);
		
		JButton b10=new JButton(" N ");
		b10.setActionCommand("Nimbus");
		b10.setToolTipText("Nimbus");
		b10.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b10.addActionListener(this);
		tb.add(b10);
		
		JButton b11=new JButton(" W ");
		b11.setActionCommand("Windows");
		b11.setToolTipText("Windows");
		b11.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b11.addActionListener(this);
		tb.add(b11);
		
		JButton b12=new JButton(" WC ");
		b12.setActionCommand("Wondows Classic");
		b12.setToolTipText("Windows Classic");
		b12.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b12.addActionListener(this);
		tb.add(b12);
		
		add(tb,BorderLayout.NORTH);
		
	}
	public void createMB() {
		mb=new JMenuBar();
		mb.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		JMenu jm1=new JMenu("Examples");
		JMenu jm2=new JMenu("Look and Feel");
		
		JMenuItem mi1=new JMenuItem("Number2");
		mi1.setActionCommand("Number2");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,java.awt.Event.CTRL_MASK));
		mi1.addActionListener(this);
		jm1.add(mi1);
		
		JMenuItem mi2=new JMenuItem("Radius");
		mi2.setActionCommand("Radius");
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,java.awt.Event.CTRL_MASK));
		mi2.addActionListener(this);
		jm1.add(mi2);
	
		JMenuItem mi3=new JMenuItem("Interest");
		mi3.setActionCommand("Interest");
		mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,java.awt.Event.CTRL_MASK));
		mi3.addActionListener(this);
		jm1.add(mi3);
	
		JMenuItem mi4=new JMenuItem("Details");
		mi4.setActionCommand("Details");
		mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4,java.awt.Event.CTRL_MASK));
		mi4.addActionListener(this);
		jm1.add(mi4);
	
		JMenuItem mi5=new JMenuItem("Calculator");
		mi5.setActionCommand("Calculator");
		mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5,java.awt.Event.CTRL_MASK));
		mi5.addActionListener(this);
		jm1.add(mi5);
	
		JMenuItem mi6=new JMenuItem("Twolists");
		mi6.setActionCommand("Twolists");
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6,java.awt.Event.CTRL_MASK));
		mi6.addActionListener(this);
		jm1.add(mi6);
		
		JMenuItem mi7=new JMenuItem("Form");
		mi7.setActionCommand("Form");
		mi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7,java.awt.Event.CTRL_MASK));
		mi7.addActionListener(this);
		jm1.add(mi7);
	
		
		JMenuItem mi8=new JMenuItem("Metal");
		mi8.setActionCommand("Metal");
		mi8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,java.awt.Event.CTRL_MASK));
		mi8.addActionListener(this);
		jm2.add(mi8);
	
		JMenuItem mi9=new JMenuItem("Motif");
		mi9.setActionCommand("Motif");
		mi9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,java.awt.Event.CTRL_MASK));
		mi9.addActionListener(this);
		jm2.add(mi9);
	
		JMenuItem mi10=new JMenuItem("Nimbus");
		mi10.setActionCommand("Nimbus");
		mi10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,java.awt.Event.CTRL_MASK));
		mi10.addActionListener(this);
		jm2.add(mi10);
	
		JMenuItem mi11=new JMenuItem("Windows");
		mi11.setActionCommand("Windows");
		mi11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,java.awt.Event.CTRL_MASK));
		mi11.addActionListener(this);
		jm2.add(mi11);
	
		JMenuItem mi12=new JMenuItem("Windows Classic");
		mi12.setActionCommand("Windows Classic");
		mi12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,java.awt.Event.CTRL_MASK));
		mi12.addActionListener(this);
		jm2.add(mi12);
	
		mb.add(jm1);
		mb.add(jm2);
		setJMenuBar(mb);
	}
	public void createPPM() {
		pm =new JPopupMenu();
		JMenuItem mi1=new JMenuItem("Number2");
		mi1.setActionCommand("Number2");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,java.awt.Event.CTRL_MASK));
		mi1.addActionListener(this);
		pm.add(mi1);
		
		JMenuItem mi2=new JMenuItem("Radius");
		mi2.setActionCommand("Radius");
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,java.awt.Event.CTRL_MASK));
		mi2.addActionListener(this);
		pm.add(mi2);
	
		JMenuItem mi3=new JMenuItem("Interest");
		mi3.setActionCommand("Interest");
		mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,java.awt.Event.CTRL_MASK));
		mi3.addActionListener(this);
		pm.add(mi3);
	
		JMenuItem mi4=new JMenuItem("Details");
		mi4.setActionCommand("Details");
		mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4,java.awt.Event.CTRL_MASK));
		mi4.addActionListener(this);
		pm.add(mi4);
	
		JMenuItem mi5=new JMenuItem("Calculator");
		mi5.setActionCommand("Calculator");
		mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5,java.awt.Event.CTRL_MASK));
		mi5.addActionListener(this);
		pm.add(mi5);
	
		JMenuItem mi6=new JMenuItem("Twolists");
		mi6.setActionCommand("Twolists");
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6,java.awt.Event.CTRL_MASK));
		mi6.addActionListener(this);
		pm.add(mi6);
		
		JMenuItem mi7=new JMenuItem("Form");
		mi7.setActionCommand("Form");
		mi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7,java.awt.Event.CTRL_MASK));
		mi7.addActionListener(this);
		pm.add(mi7);
		
		dp.setComponentPopupMenu(pm);
	
	}
	 
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		int i=-1;
		if (s.equals("Metal")) {
			i=0;
		} else if (s.equals("Motif")) { 
			i=1;
		} else if (s.equals("Nimbus")) {
			i=2;
		} else if (s.equals("Windows")) { 
			i=3;
		} else if (s.equals("Windows Classic")) {
			i=4;
		}
		if(i>=0) {
			try {
			UIManager.setLookAndFeel(laf[i].getClassName());
			SwingUtilities.updateComponentTreeUI(this);
			} 
			catch (Exception e1) {
			JOptionPane.showMessageDialog(this, "Unable to Apply Look And Feel");
			}
			return;
		}

	JInternalFrame jif=new JInternalFrame("Java Project-Savya Singh",true,true,true,true);
	if(s.equals("Number2")) {
		jif.setTitle("Number2");
		jif.setContentPane(new Number2());
		jif.setPreferredSize(new Dimension(400,300));
	}	
	else if(s.equals("Radius")) {
		jif.setTitle("Radius");
		jif.setContentPane(new Radius());
		jif.setPreferredSize(new Dimension(400,400));
	}	
	else if(s.equals("Interest")) {
		jif.setTitle("Interest");
		jif.setContentPane(new Interest());
		jif.setPreferredSize(new Dimension(400,400));
	}	
	else if(s.equals("Details")) {
		jif.setTitle("Details");
		jif.setContentPane(new Details());
		jif.setPreferredSize(new Dimension(500,550));
	}	
	else if(s.equals("Calculator")) {
		jif.setTitle("Calculator");
		jif.setContentPane(new Calculator());
		jif.setPreferredSize(new Dimension(300,300));
	}	
	else if(s.equals("Twolists")) {
		jif.setTitle("Twolists");
		jif.setContentPane(new Twolists());
		jif.setPreferredSize(new Dimension(500,500));
	}	
	else  if(s.equals("Form")){
		jif.setTitle("Form");
		jif.setContentPane(new Form());
		jif.setPreferredSize(new Dimension(380,620));
	}	
	jif.pack();
	jif.setVisible(true);
	dp.add(jif,new Integer(1));
	}
		
	public static void main(String[] args) {
		new Virtualdesktop();
	}

}
