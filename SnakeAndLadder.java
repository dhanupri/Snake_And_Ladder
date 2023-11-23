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
    public static int checkForoption(int pos,int val){

        if(pos+val>100){
            return pos;
        }

        pos+=val;
        if(ladder_start.contains(pos)){
            pos=ladder_end.get(ladder_start.indexOf(pos));


        }
        else if(snake_head.contains(pos)){
            pos=snake_tail.get(snake_head.indexOf(pos));
        }
        return pos;


    }






    public static void main(String[] args){
        int player1Position=0;


        int dice_value=randomgenerate();
        player1Position=checkForoption(player1Position,dice_value);















    }
}

