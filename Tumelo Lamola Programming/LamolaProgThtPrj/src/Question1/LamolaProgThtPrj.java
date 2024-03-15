
package Question1;

/**
 *
 * @author ST10147766 TUMELO LAMOLA
 */
public class LamolaProgThtPrj {

   
    public static void main(String[] args) {
        //Create a two-dimensional array to store the camera cost comparisons
        String[] manufacturers = {"Canon", "Sony", "Nikon"};
        int[][] prices = {{10500, 8500},
                         {9500, 7200},
                         {12000, 8000}};
        int maxDifference = 0;
        String maxDifferenceManufacturer = "";
      
        //Display the camera technology report
        System.out.println("Camera Technology Report");
        System.out.println("========================");

        for (int i = 0; i < manufacturers.length; i++) {
            int difference = Math.abs(prices[i][0] - prices[i][1]);
            if (difference >= 2500) {
                System.out.println("***");
            }
             
            System.out.println("Manufacturer: " + manufacturers[i]);
            System.out.println("DSLR Price: R" + prices[i][0]);
            System.out.println("Mirrorless Price: R" + prices[i][1]);
            System.out.println("Difference: R" + difference);
            System.out.println();

            if (difference > maxDifference) {
                maxDifference = difference;
                maxDifferenceManufacturer = manufacturers[i];
            }
        }

        System.out.println("Manufacturer with the greatest cost difference: " + maxDifferenceManufacturer);
    }
}
    
       
     
        
    
    
