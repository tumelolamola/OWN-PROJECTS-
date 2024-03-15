
package Question2;

/**
 *
 * @author ST10147766 TUMELO LAMOLA
 */
public abstract class EstateAgent {
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }
    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return 0.20 * propertyPrice;
     }

    

}
