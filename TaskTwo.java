import java.util.Scanner;
public class TaskTwo{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    
    int total = 0;
    int scorecounter = 1;
for(scorecounter = 1; scorecounter<=10; scorecounter++){
  System.out.print("Enter a score: ");
  int score = input.nextInt();
  
  
    total+= score;
}
double average = (double)total / 10.0;
System.out.printf("%f%n The average is",average);
        
      
    }

}
