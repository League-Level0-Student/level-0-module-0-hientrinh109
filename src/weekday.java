import javax.swing.JOptionPane;

public class weekday {
public static void main(String[] args) {
	String weekday=JOptionPane.showInputDialog(" Is it a weekday?");
	if (weekday.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Go to sleep.");
	}
		if (weekday.equals("no")) {
		JOptionPane.showMessageDialog(null,"Wake up");
			
	}
		
	
}
}
