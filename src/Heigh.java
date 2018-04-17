import javax.swing.JOptionPane;

public class Heigh {
	public static void main(String[] args) {
		

	String height =JOptionPane.showInputDialog("How tall are you in inches?");
	int height1 =Integer.parseInt(height);
	if(height1 > 60) {
		JOptionPane.showMessageDialog(null,"You can ride a roller coaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You are short to ride roller coaster.");
	}
}
}
