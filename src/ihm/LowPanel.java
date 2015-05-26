package ihm;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class LowPanel extends JPanel{
	
	private static int NCOLUMN = 7;
	private static int NLINE = 6;
	
		public LowPanel(){
			
			int counterCol;
			int counterLi;
			
			this.setLayout(new GridLayout(NLINE, NCOLUMN));
			
			for(counterCol = 0; counterCol < NCOLUMN; counterCol++){
				for(counterLi = 0; counterLi < NLINE; counterLi++){
					add(new JButton(""));
					
				}
				
			}
		}
}

