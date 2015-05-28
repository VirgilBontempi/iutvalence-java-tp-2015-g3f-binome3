package ihm;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.virgilbontempi.connectfour.Model.Grid;

public class LowPanel extends JPanel{
	
		private int counterGridLine;
		private int counterGridColumn;
		
		public LowPanel(){
			
			int counterCol;
			int counterLi;
			
			this.setLayout(new GridLayout(Grid.NBLINE, Grid.NBCOLUMN));
			
			for(counterCol = 1; counterCol <= Grid.NBLINE*Grid.NBCOLUMN; counterCol++){
				
						add(new JButton(""));

					}
			}			
}


