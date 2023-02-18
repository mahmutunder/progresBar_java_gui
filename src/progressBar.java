import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressBar extends JFrame {
	
	JProgressBar bar;
	public progressBar() {
		
		bar= new JProgressBar();
		bar.setBounds(0,0,250,40);
		bar.setValue(0);
		bar.setStringPainted(true);
		bar.setFont(new Font("Dialog",Font.BOLD,25));
		bar.setForeground(Color.BLACK);

		
		
		
		
		add(bar);
		setTitle("Bar");
		setSize(250,250);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		fill();
		
	}

	private void fill() {

		
		int counter=0;
		while(counter<=100) {
			
			bar.setValue(counter);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			counter++;
		}
		
	}

	public static void main(String[] args) {


		new progressBar();
	}

}
