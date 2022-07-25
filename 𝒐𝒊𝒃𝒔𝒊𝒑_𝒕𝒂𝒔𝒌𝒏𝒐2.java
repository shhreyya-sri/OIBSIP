import java.util.*;
import java.lang.*;
import java.io.*;

public class task2 
{
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        System.out.println("!!! WELCOME TO THE NUMBER GUESS GAME !!!");
        System.out.println("HERE ARE GAME RULES:");
        System.out.println("RULE1: YOU NEED TO GUESS A RANDOM NUMBER");
        System.out.println("RULE2: YOU HAVE TO GUESS IN LESS THAN 5 CHANCES");
        System.out.println("RULE3: IF YOU GUESS THE NUMBER CORRECTLY YOU WILL BE PROMOTED TO NEXT LEVEL");
        System.out.println("RULE4: YOU NEED TO ENTER A NUMBER BETWEEN 1 TO 100 ");
        System.out.println("YOU HAVE 3 LEVELS");
        Random rand = new Random();
        int chance=5;
        int score=0;
        boolean f = false;
        System.out.println("LET'S BEGIN THE GAME..!!");
        for(int i =1;i<=3;i=i+1)
        {
            f = false;
            int random_number = rand.nextInt(100)+1;
            System.out.println();
           // System.out.println("NUMBER IS :"+random_number);
            System.out.println("LEVEL:"+i);    
            int p=1;
            for(int j=1;j<=chance;j++)
            {
                
                System.out.println("CHANCE :"+ p++ +"\n");
                int number1 = in.nextInt();
                if(number1>random_number)
                System.out.println("ENTER A SMALLER NUMBER ");
                else if(number1<random_number)
                System.out.println("ENTER A GREATER NUMBER ");
                else 
                {
                    if(number1==random_number)
                    {
                        score=score+10;
                        System.out.println("HURRAYY...!!! YOU GUSSED CORRECTLY ");
                        if(i!=3)
                        {
                            System.out.println("CONGRATS..!! YOU ARE QUALIFIED TO "+(i+1)+" LEVEL ");
                        }
                        else{
                        System.out.println("YOU WON THE GAME..!!!");
                        System.out.println("!!!...CONGARTUALTIONS...!!!");
                        }
                        f=true;
                        break;
                    }
                }
            }
            if(f==false)
            {
                System.out.println("YOU LOST THE GAME :( ");
                System.out.println("PLAY FROM BEGINNING");
                break;
            }   
         }
         System.out.println();
         System.out.println("YOUR SCORE IS:"+score);
         System.out.println("THANKS FOR PLAYING..!!😇");
    }

}
