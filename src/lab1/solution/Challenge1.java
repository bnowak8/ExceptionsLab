package lab1.solution;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    
    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        GuiDisplay gui = new GuiDisplay();
        String fullName=null,lastName=null;
        
        try{
            fullName = gui.getName();
        }catch(NoNameException nnEx){
            gui.errorMsg(nnEx.getMessage());
            return;
        }
        
        try{
        lastName = app.extractLastName(fullName);
        }catch(NoNameException nNex){
            gui.errorMsg(nNex.getMessage());
            return;
        }catch(OneNameException onEx){
            gui.errorMsg(onEx.getMessage());
            return;
        }
        
        try{
            gui.lastNameIs(lastName);
        }catch(NoLastNameException nlnEx){
            gui.errorMsg(nlnEx.getMessage());
            return;
        }
    }
    
    public String extractLastName(String fullName) throws NoNameException,OneNameException{
        if(fullName.length()==0){
            throw new NoNameException();
        }
        
        
        String[] nameParts = fullName.split(" ");
        if(nameParts.length < 2){
            throw new OneNameException();
        }
        
        return nameParts[LAST_NAME_IDX];
        
    }

}
