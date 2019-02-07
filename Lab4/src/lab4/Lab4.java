/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author 1812962
 */
public class Lab4 {

    
    public static int dice(){
        int diceRoll = (int)((Math.random()*6)+1);
        return diceRoll;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalPlayer = 0;
        int totalComputer = 0;
        while(totalComputer < 30 && totalPlayer < 30){
        totalPlayer = totalPlayer + dice();
        totalComputer = totalComputer + dice();
        }
        System.out.println("The player scored " + totalPlayer + " The computer scored " + totalComputer);
    }
    
}
