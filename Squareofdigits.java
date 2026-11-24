import java.util.Scanner;
public class Squareofdigits{
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int total = 0
      for(number = 0; number <= 3; number++);
          System.out.print("Enter a number");
          for(hundred = 1; hundred <= 9; hundred++) {
              for(ten = 0; ten <= 9; ten++) {
                for(one = 0; one <= 9; one++) {
          
                number = (hundred * 100) + (ten * 10) + one;
                result = (hundred * hundred) + (ten * ten) + (one * one);
                if(result === number) {
                    System.out.println(number);
            }
        }
    }

}
          
              
  
  }
}
