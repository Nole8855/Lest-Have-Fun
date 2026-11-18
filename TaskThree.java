import java.util.Scanner;
public class TaskThree{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    
    int total = 0;
    int scorecounter = 1;
for(scorecounter = 1; scorecounter<=10; scorecounter++){
  System.out.print("Enter a score: ");
  int score = input.nextInt();
  
  
    total+= score;
}
int average = (int)total/10; 
System.out.printf("%s%d%n","The sum is", total);
System.out.printf("%s%d%n","The average is", average);
        
      
    }

}
