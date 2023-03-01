package swing1eclipse;

import javax.swing.JButton;
import javax.swing.JFrame;

public class unpeu {
	
	public static void main(String[] args)  {
		JFrame myWindow = new JFrame ();
		JButton jb = new JButton("Clicquez cliquez");
		myWindow.add(jb);
		myWindow.setSize(200,200);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}

}
