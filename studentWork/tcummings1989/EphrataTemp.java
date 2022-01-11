package studentWork.tcummings1989;

public class EphrataTemp {

    public static void main(String[] args) {

        int[] hightemp = {26, 43, 28, 30};

        int sum = 0;
        int count = 0;

        // Calculate Sum, Count, and Average Temperature

        for (int t = 0; t < hightemp.length; t++) {        
            sum += hightemp[t];
            count++;
            //System.out.println(count);
        }

        double averageTemp = (double)sum / count;

        System.out.println("Average Daily Temperature: " + averageTemp);

        // Count and print out the number of days the temperature was below the average temperature
        int below = 0;

        for (int i : hightemp){
            if (i < averageTemp){
                below++;
            }
        }

        System.out.println("Number of days below average: " + below);

        // Using a For-Each Loop Count and print out the number of days the temperature was above the average temperature

        int above = 0;
        
        for (int i : hightemp){
            if (i > averageTemp){
                above++;
            }
        }
        
        System.out.println("Number of days above average: " + above);
        

    }

}
