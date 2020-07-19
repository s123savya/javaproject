package savyaproject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Finalproject extends JPanel {

	JProgressBar progressBar;

	public Finalproject() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 10));
		Icon icon = new ImageIcon(getClass().getResource("/imagesused/s.jpg"));
		add(new JLabel(icon), BorderLayout.CENTER);
		progressBar = new JProgressBar(1, 100);
		progressBar.setForeground(Color.gray);
		add(progressBar, BorderLayout.SOUTH);
	}

	public void setProgress(int progress) {
		progressBar.setValue(progress);
	}

	public static void main(String args[]) {
		Finalproject fp = new Finalproject();
		JWindow w = new JWindow();
		w.setContentPane(fp);
		w.pack();
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		try {
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(50);
				fp.setProgress(i);
			}
		} catch (Exception e) {
		}
		w.setVisible(false);
		w.dispose();
		new Virtualdesktop();
	}
}

