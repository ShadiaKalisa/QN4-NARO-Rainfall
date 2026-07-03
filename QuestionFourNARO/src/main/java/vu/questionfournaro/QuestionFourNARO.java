package vu.questionfournaro;

import java.util.Random;

public class QuestionFourNARO {

    public static void main(String[] args) {
        
        // Create an array list of boxes that can hold 30 decimal numbers
        double[] rainfall = new double[30];
        
        // Initialize the random number generator
        Random random = new Random();
        
        // Create variables to store our running math totals
        double totalRainfall = 0; // Starts at 0, adds up daily rain values
        int wetDaysCount = 0;     // Starts at 0, counts days with heavy rain

        System.out.println("--- Daily Rainfall Readings (mm) ---");
        
        // This loop runs exactly 30 times, once for each day of the month
        for (int i = 0; i < 30; i++) {
            
            // REQUIREMENT (i): Generate a random decimal between 0.0 and 60.0
            // random.nextDouble() gives a number from 0.0 to 1.0, so multiplying by 60 scales it up
            rainfall[i] = random.nextDouble() * 60.0;
            
            // Print the current day and its rain amount, rounded to 2 decimal places (%.2f)
            System.out.printf("Day %d: %.2f mm\n", (i + 1), rainfall[i]);
            
            // Add today's rain amount to our total monthly sum
            totalRainfall += rainfall[i];
            
            // REQUIREMENT (iii): Check if today counts as a "wet day"
            // If the rain for this day is strictly greater than 30 mm, increase our counter by 1
            if (rainfall[i] > 30.0) {
                wetDaysCount++;
            }
        }

        // REQUIREMENT (ii): Compute the average by dividing the total sum by 30 days
        double averageRainfall = totalRainfall / 30.0;

        // Print out the summary results we collected from the loop
        System.out.println("\n--- Summary Statistics ---");
        System.out.printf("Total Monthly Rainfall: %.2f mm\n", totalRainfall);
        System.out.printf("Average Daily Rainfall: %.2f mm\n", averageRainfall);
        System.out.println("Number of Wet Days: " + wetDaysCount);

        // REQUIREMENT (iv): Use an if-else-if structure to categorize the month based on total rain
        System.out.print("Month Classification: ");
        
        if (totalRainfall <= 300.0) {
            // If the total rain is 300 mm or less
            System.out.println("Dry");
        } else if (totalRainfall < 600.0) {
            // If the total rain is between 300.01 mm and 599.99 mm
            System.out.println("Normal");
        } else {
            // If the total rain is 600 mm or more
            System.out.println("Flood-risk");
        }
      
   }

}

