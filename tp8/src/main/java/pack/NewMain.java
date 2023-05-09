package pack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package mini_progect.nested;

/**
 *
 * @author amine
 */

import java.util.ArrayList;
import java.util.Arrays;


    


public class NewMain {
    
   //task1
    
    public static int sum_even(ArrayList<Integer> tab) {
        
        int n = tab.size();
        int i =0;
        int sum =0;
        
        while (i <= n ){
            if ( (tab.get(i) % 2) == 0 ) {
              sum = sum + tab.get(i);
            }
            
        i ++;
    }

        return sum;

    }
    
    public void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)) ; 
        
        System.out.println(sum_even(tab));
        
    }
    
    
    
    
}
