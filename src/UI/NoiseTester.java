package UI;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author Joseph Avolio
 * 
 * Main class.
 */
public class NoiseTester {
	/**
	 * Create a {@link JFrame} containing a {@link NoiseTesterApplet}
	 * 
	 * @param args Ignored
	 */
	public static void main(String[] args) {
		JFrame frame=new JFrame("Noise Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,700));
		frame.setContentPane(new NoiseTesterApplet());
		frame.pack();
		frame.setVisible(true);
	}
	
}
