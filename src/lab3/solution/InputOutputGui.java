package lab3.solution;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;
    private String msg;
    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        try{
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = nameService.extractLastName(fullName);
        msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }  catch (ArrayIndexOutOfBoundsException aob){
            JOptionPane.showMessageDialog(null, aob.getMessage());
        }
        catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }
        catch (InvalidNameException ine){
            JOptionPane.showMessageDialog(null, ine.getMessage());
        } 
       
        
    }
     
}
