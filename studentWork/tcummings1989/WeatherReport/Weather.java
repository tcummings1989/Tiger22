package tcummings1989.WeatherReport;

import java.util.*;

public class Weather {

    public static void main(String[] args) {
        int numStations = getNumStations();
        
        String[] stationCities = getStationCities(numStations);
        
        int numMeasurements = getNumMeasurements();   
        
        int[][] temps = generateTemperatures(numStations, numMeasurements);
        
        System.out.println("Here is the raw temperature data:");
        printRawTemps(stationCities, temps);
        
        System.out.println("The maximum temperature at the second station was");
        System.out.println(getMaxTempAtSecond(temps));
        
        System.out.println("The average temperature measured was");
        System.out.println(getAverageTemp(temps));
        
        System.out.println("The number of stations which started above 50 degrees was");
        System.out.println(getNumStartingAbove50(temps));
    }
    
    public static int getNumStations() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of stations (at least 2): ");
            int num = console.nextInt();
            
            if (num >= 2) {
                return num;
            }
        } 
    }
    
    public static String[] getStationCities(int numStations) {
        String[] cities = new String[numStations];
        Scanner console = new Scanner(System.in);
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cities[i] = console.next();
        }
        
        return cities;
    }
    
    public static int getNumMeasurements() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of temperature measurements from each station (at least 5): ");
            int num = console.nextInt();
            
            if (num >= 5) {
                return num;
            }
        } 
    }
    
    public static int[][] generateTemperatures(int numStations, int numMeasurements) {
        /* 
         * TODO (step 1): Complete this method.
         * You should create a 2D integer array with `numStations` rows and `numMeasurements` columns.
         * You should then fill each element in the 2D array with a random integer between 45 and 65.
         * To get a random number in this range, you can use the expression
         * 
         * r.nextInt(45, 65)
         *
         * This 2D array represents the temperature measurements made at different weather stations.
         * Each row corresponds to one of the stations, and the values in that row are the measurements
         * taken at that station over the course of time.
         */
        Random r = new Random();
        
        int[][] temps = new int[numStations][numMeasurements];
        for(int row=0; row<numStations; row++){
            for (int col=1; col<numMeasurements; col++){
                temps[row][col] =  45 + r.nextInt(20);
        }}
       return temps;
    }
    
    public static void printRawTemps(String[] stationCities, int[][] temps) {
        /*
         * TODO (step 2): Complete this method.
         * You should print the station name, followed by all the temperatures measured at that station.
         * There should be a single line per station, and the temperatures should be separated by commas.
         * For example, if there were two stations (Ephrata and Seattle), the output could look like
         *
         * Ephrata: 49, 62, 59, 56, 54
         * Seattle: 48, 50, 61, 58, 47
         */
        for(int row=0; row<stationCities.length; row++){
            for (int col=0; col<temps.length; col++){
                System.out.println(stationCities[row] + ": " + temps[col]);
        }}
         
    }
    
    public static int getMaxTempAtSecond(int[][] temps) {
        /*
         * TODO (step 3): Complete this method.
         * You should compute and return the largest temperature measurement          
         * that took place at the second (index 1) station.
         */
        int max = 0;
        for(int c=0; c<temps[0].length; c++){
            if (max<temps[c][1]){
                max = temps[c][1];
            }
        } 
        return max;
    }
    
    public static double getAverageTemp(int[][] temps) {
        /*
         * TODO (step 4): Complete this method.
         * You should compute the average temperature value across all measurements.
         */
        
         int total = 0;
         int tempCount=0;
         for(int row=0; row<temps.length; row++){
            for (int col=0; col<temps[0].length; col++){
                total = total + temps[row][col];
                tempCount++;
        }}

        return (total/tempCount); 
    }
    
    public static int getNumStartingAbove50(int[][] temps) {
        /*
         * TODO (step 5): Complete this method.
         * You should compute and return the number of stations whose first measurement was greater than 50 degrees.
         */
        int count = 0;
        for (int c=0; c<temps[0].length; c++){
            if (50<temps[c][0]){
                count++;
            }
        }
        return count; 
    }
}
