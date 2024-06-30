import java.util.Scanner;

public class Travelplanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Travel Itinerary Planner!");
        
        System.out.println("Enter destination:  ");
        String destination = scanner.nextLine();
        
        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        
        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Do you want to include maps?(yes/no): ");
        boolean includeMaps = scanner.nextLine
            ().equalsIgnoreCase("yes");
        System.out.print("Do you want to include weather information? (yes/no):");
        boolean includeWeather = scanner.nextLine
            ().equalsIgnoreCase("yes");
            
        System.out.println("Generating your travel plan...");
        System.out.println("Destination: " + destination);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Budget: $" + budget);
        
        if (includeMaps) {
            
            System.out.println("Including maps in your plan...");
        }
        
        if (includeWeather) {
            
            System.out.println("Including weather information in your plans...");
        }
        
        double totalBudget = calculateTotalBudget(budget);
        System.out.println("Total budget including expenses: $"+ totalBudget);
        
        scanner.close();
    }
    
    private static double calculateTotalBudget(double budget) {
        
        return budget * 1.2;
    }
}