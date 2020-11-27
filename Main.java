
package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String result_row="";
        for (int i=1; i<=20; i++){
            int result_dice = (int)(Math.random() * 6)+1;

            if (i % 5 == 0)
                result_row +=  result_dice+"\n";
            else
                result_row +=  result_dice + " ";
        }
        
        JOptionPane.showMessageDialog(null, result_row, "20 Random numbers from 1 to 6", JOptionPane.WARNING_MESSAGE);   }
}
