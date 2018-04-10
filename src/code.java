import javax.swing.JOptionPane;

public class code {
public static void main(String[] args) {
	String code=JOptionPane.showInputDialog("Do you know how to code?");
	if(code.equals("yes")) {
		JOptionPane.showMessageDialog(null,"You will rule the world");
	
	}else {
		JOptionPane.showMessageDialog(null,"You will mope the floor");
	}
	
}
}
