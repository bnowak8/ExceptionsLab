package lab2.solution;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;
    private static final String ENTER_FULL_NAME="Enter full name";
    private static final String NO_NAME_ENTERED="You did not enter a name!";
    private static final String ONE_NAME_ENTERED="You only entered one name!";
    private static final String LAST_NAME_IS="Your last name is: ";
    private static final String FIRST_NAME_IS="Your first name is: ";
    private String fullName=null,lastName=null,firstName=null;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        try{
        fullName = getFullName();
        lastName = nameService.extractLastName(fullName);
        firstName = nameService.extractFirstName(fullName);
        
        }catch(NoNameException nNex){
            JOptionPane.showMessageDialog(null, nNex.getMessage());
            return;
        }catch(OneNameException oNex){
            JOptionPane.showMessageDialog(null, oNex.getMessage());
            return;
        }    
        
        showLastName(lastName);
        showFirstName(firstName);
    }
    
    public final String getFullName(){
        String name = JOptionPane.showInputDialog(ENTER_FULL_NAME);
        return name;
    }
    
    public final void showLastName(String lastName){
        
        JOptionPane.showMessageDialog(null, LAST_NAME_IS + " " +lastName);
    }
     
    public final void showFirstName(String firstName){
        JOptionPane.showMessageDialog(null, FIRST_NAME_IS + " " + firstName);
    }
}
