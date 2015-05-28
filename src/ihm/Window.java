package ihm;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Window {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame window = new JFrame();
				
		/** Title. */
		window.setTitle("Connect four");
		/** Size. */
		window.setSize(500,500);
		/** Location of the window. */
		window.setLocationRelativeTo(null);
		/** Kill the process. */
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    /** Buttons */
		JPanel highPanel = new JPanel();
		highPanel.setLayout(new GridLayout(1,7));
		highPanel.add(new JButton("1"));
		highPanel.add(new JButton("2"));
		highPanel.add(new JButton("3"));
		highPanel.add(new JButton("4"));
		highPanel.add(new JButton("5"));
		highPanel.add(new JButton("6"));
		highPanel.add(new JButton("7"));
		
		/** SplitPanel1 */
		JPanel lowPanel = new LowPanel();
		JSplitPane panel1;
		
		
		/** Vertical split of panels */
		panel1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		panel1.setTopComponent(highPanel);
		panel1.setBottomComponent(lowPanel);
		
		/** Add of panel */
		window.add(panel1);
		
		
	    /** Display the window. */
	    window.setVisible(true);
	    
	    
	}

}
