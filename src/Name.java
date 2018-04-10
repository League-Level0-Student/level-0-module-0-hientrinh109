import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String userName=JOptionPane.showInputDialog("What is your name?");
	
	if(userName.equals("hien")) {
		JOptionPane.showMessageDialog(null, "Your parents have great taste!");
	}else {
		JOptionPane.showMessageDialog(null,"Your parents don't love you.");
	}
}
}
