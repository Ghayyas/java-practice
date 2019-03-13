/****
 * 
 * 
 * Guessing he Number Game
 * 
 */

import java.io.IOException;

 class GuessGame {
        public static void main(String[] args) throws IOException{
            char ch;
            System.out.println("Guess the Character");
            ch = (char) System.in.read();
            if(ch == 'K') System.out.print("Corrected..! \n");
            else System.out.println("Wrong!");
        }
 }