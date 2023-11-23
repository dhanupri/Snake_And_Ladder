import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SnakeAndLadder {
    public static  int board_size=100;
   public static ArrayList<Integer> ladder_start=new ArrayList<Integer>(Arrays.asList(1,4,9,21,28,51,72,80));
    public static ArrayList<Integer> ladder_end=new ArrayList<Integer>(Arrays.asList(38,14,31,42,85,67,91,99));
    public static ArrayList<Integer> snake_head=new ArrayList<Integer>(Arrays.asList(17,54,62,64,87,92,95,98));
    public static ArrayList<Integer> snake_tail=new ArrayList<Integer>(Arrays.asList(7,19,34,36,60,73,75,79));


    public static int randomgenerate(){
        int play= (int) ((Math.random()*10)%6);

        return (play==0)?1:play;



    }






    public static void main(String[] args){
        int player1Position=0;
       













    }
}
