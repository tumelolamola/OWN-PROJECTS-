
package Question2;

/**
 *
 * @author ST10147766 TUMELO LAMOLA
 */
public class EstateAgentSales extends EstateAgent {

    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }
     public void printPropertyReport() {
        System.out.println("Enter the Estate Agent Name: ");
        System.out.println("Enter the Property Sale Price: R");
        
        System.out.println("----------------------------");
        System.out.println("Estate Agent Report");
        System.out.println("----------------------------");
        
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Price: R" +(getPropertyPrice()));
        System.out.println("Agent Commission: R" + (getAgentCommission()));
    
}
     }
