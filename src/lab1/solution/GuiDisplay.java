
package lab1.solution;

import javax.swing.JOptionPane;
import java.io.IOException;

public class GuiDisplay {
    private static final String getName="Enter full name.";
    private static final String lastNameIs="Your last name is";
    private static final String firstNameIs="Your first name is";
    
    
    GuiDisplay(){
        
    }
    
    public final String getName() throws NoNameException{
        
        String fullName=JOptionPane.showInputDialog(getName);
        
        if(fullName.length()==0){
            throw new NoNameException();
        }
        return fullName;
        
    }

    public final void lastNameIs(String lastName) throws NoLastNameException{
        if(lastName.length()==0){
            throw new NoLastNameException();
        }
        JOptionPane.showMessageDialog(null, lastNameIs + " " + lastName);
    }
    
    public final void errorMsg(String errMsg){
        JOptionPane.showMessageDialog(null, errMsg);
    }
}
