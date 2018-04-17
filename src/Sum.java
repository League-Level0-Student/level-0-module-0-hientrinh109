import javax.swing.JOptionPane;

public class Sum {
public static void main(String[] args) {
	String sum= JOptionPane.showInputDialog("Choose one numbers.");
	int sum1 =Integer.parseInt(sum);
	String sum2= JOptionPane.showInputDialog("Choose another number");
	int sum3 =Integer.parseInt(sum);
	JOptionPane.showMessageDialog(null, "Add those two numbers.");
	
}
}