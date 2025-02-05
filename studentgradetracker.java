import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    private ArrayList<Double> grades;
    public StudentGradeTracker() {
     grades = new ArrayList<>();
}
 
public void addGrade(double grade) {
    grades.add(grade);
}

public double calculateAverage() {
    double sum=0;
    for (double grade : grades) {
        sum += grade;
    }
    return grades.size()>0?grades.size():0;
}

public double findHighest(){
    double highest=Double.MIN_VALUE;
    for(double grade:grades){
        if(grade>highest){
            highest=grade;
        }
    }
    return highest;
}

public double findLowest(){
    double lowest=Double.MAX_VALUE;
    for(double grade:grades){
        if(grade<lowest){
            lowest=grade;
        }
    }
    return lowest;
}

public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    StudentGradeTracker tracker=new StudentGradeTracker();

    while(true){
        System.out.println("Enter marks (or type 'done' to finish)");
        String input=scanner.next();
    
        if(input.equalsIgnoreCase("done")){
            break;
        }
    
        try{
            double grade=Double.parseDouble(input);
            tracker.addGrade(grade);
        }catch(NumberFormatException e){
            System.out.println("Invalid input.Please enter a valid grade");
        }
    }

    scanner.close();

    System.out.println("Average grade:"+tracker.calculateAverage());
    System.out.println("Highest grade:"+tracker.findHighest());
    System.out.println("Lowest grade:"+tracker.findLowest());
}
}