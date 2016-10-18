package chat.view;
import javax.swing.JOptionPane;
public class ChatViewer 
{

public String collectResponse(String queston)
{
	String response = "";
	reponse = JOptionPane.showInputDialog(null, question);
	return response;
}
	public void displayMessage(String message)
	{
	JOptionPane.showMessageDialog(null, message);	
	}
	public int collectUserOption(String question)
	{
		int response = 0;
	
		response = JOptionPane.showConfrimDialog(null, question);
		
		return reponse;
	
	
	}
	
	
	
}
