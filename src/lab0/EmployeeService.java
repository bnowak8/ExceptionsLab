
package lab0;

/**
 * Provides various services that an employee or other domains might use.
 * 
 * @author bnowak8
 * 
 */
public class EmployeeService {
    
    public final void assignVacationDays(int days){
        Employee emp = new Employee();
        try{
        emp.setDaysVacationAllowed(days);
        }catch (IllegalVacationDaysException ex){
            System.out.println(ex.getMessage());
        }
    }
}
