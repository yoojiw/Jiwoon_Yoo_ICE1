/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card one = new Card("spade", 3);
        one.setSuit("spade");
        System.out.println(one.getSuit());
        System.out.println(one.getValue());  
        
        //Now create one more object of Card
        Card two = new Card("hearts", 4);
        two.setSuit("spade");
        System.out.println(two.getSuit());
        System.out.println(two.getValue());  
   
        
    }
}
