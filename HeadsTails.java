import java.util.Random;
import java.util.Scanner;
public class HeadsTails {
  public static String play(){
    Random rn = new Random();
    if (rn.nextInt() == 1) return "HEADS";
    else return "TAILS";
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String guess = "";
    do{
      System.out.println("PLEASE, ENTER HEADS OR TAILS");
      guess = sc.next();
      guess = guess.toUpperCase();
    }while(!guess.equals("HEADS") && !guess.equals("TAILS"));
    if (guess.equals(play())) System.out.println("Your guess is correct");
    else System.out.println("Your guess is wrong");
  }
}