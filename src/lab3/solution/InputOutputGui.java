package lab3.solution;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private static final String ENTER_FULL_NAME ="Enter full name",
                                FIRST_NAME_IS="Your first name is",
                                LAST_NAME_IS="Your last name is";
    private NameService nameService;
    private String fullName,lastName,firstName;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        fullName = JOptionPane.showInputDialog(ENTER_FULL_NAME);
        try{
        lastName = nameService.extractLastName(fullName);
        firstName = nameService.extractFirstName(fullName);
        }catch(NoNameException nNex){
            JOptionPane.showMessageDialog(null, nNex.getMessage());
            return;
        }catch(OneNameException oNex){
            JOptionPane.showMessageDialog(null, oNex.getMessage());
            return;
        }
        
        JOptionPane.showMessageDialog(null, LAST_NAME_IS + " " + lastName);
        JOptionPane.showMessageDialog(null, FIRST_NAME_IS + " " + firstName);
    }
     
}
