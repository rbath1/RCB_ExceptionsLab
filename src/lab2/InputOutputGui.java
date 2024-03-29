package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
    try{
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = nameService.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        } catch(NullPointerException npe){
            nameService.errorMSG(npe.getMessage());
        } catch (IllegalArgumentException ia){
            nameService.errorMSG(ia.getMessage());
        } catch (ArrayIndexOutOfBoundsException aob){
            nameService.errorMSG(aob.getMessage());
        }
            
            
        
            
        
        
    }
     
}
