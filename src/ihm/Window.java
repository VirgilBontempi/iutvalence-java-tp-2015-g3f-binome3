package ihm;
import javax.swing.JFrame;

public class Window {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		Panel panel = new Panel();
				
		/** Title. */
		window.setTitle("Connect four");
		/** Size. */
		window.setSize(500,500);
		/** Location of the window. */
		window.setLocationRelativeTo(null);
		/** Kill the process. */
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    window.add(panel);

	    /** Display the window. */
	    window.setVisible(true);
	    
	    
	}

}
