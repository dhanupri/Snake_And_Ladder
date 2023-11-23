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
    public  static boolean turn=true;


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
            turn=!turn;


        }
        else if(snake_head.contains(pos)){
            pos=snake_tail.get(snake_head.indexOf(pos));
        }
        return pos;


    }



    public static void main(String[] args){
        int player1Position=0;
        int player2Position=0;




        ArrayList<Integer> Player1Dice=new ArrayList<>();
        ArrayList<Integer> Player2Dice=new ArrayList<>();

        while(player1Position!=100 && player2Position!=100) {


            int dice_value = randomgenerate();

            if(turn) {
                player1Position = checkForoption(player1Position, dice_value);
                Player1Dice.add(player1Position);

            }
            else{
                player2Position = checkForoption(player2Position, dice_value);
                Player2Dice.add(player2Position);

            }
            turn =!turn;

        }

        System.out.println("Number of times dice rolled"+Player1Dice.size());
        System.out.println("Dice Count"+" "+"Player Position");

        for(int i=0;i<Player1Dice.size();i++){
            System.out.println(i+1+"  "+Player1Dice.get(i));

        }
        System.out.println("Number of times dice rolled"+Player2Dice.size());
        System.out.println("Dice Count"+" "+"Player Position");

        for(int i=0;i<Player2Dice.size();i++){
            System.out.println(i+1+"  "+Player2Dice.get(i));

        }

        if(Player1Dice.get(Player1Dice.size()-1)==100){
            System.out.println("PLAYER1 WON THe GAME!!!!!!!!");
        }
        else{
            System.out.println("PLAYER2 WON THe GAME!!!!!!!!");

        }



    }
}
