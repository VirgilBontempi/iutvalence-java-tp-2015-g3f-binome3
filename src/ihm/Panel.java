package ihm;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel{

		public Panel(){
			/** Create buttons. */
			this.add(new JButton("0"), BorderLayout.NORTH);
			this.add(new JButton("1"), BorderLayout.NORTH);
			this.add(new JButton("2"), BorderLayout.NORTH);
			this.add(new JButton("3"), BorderLayout.NORTH);
			this.add(new JButton("4"), BorderLayout.NORTH);
			this.add(new JButton("5"), BorderLayout.NORTH);
			this.add(new JButton("6"), BorderLayout.NORTH);
			
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			this.add(new JButton(" "), BorderLayout.CENTER);
			
			}

}
