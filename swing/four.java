package com.javaonline;
import javax.swing.JOptionPane;
 
public class four {
 
    public static void main(String [] args){
 
    try{
 
            String input = JOptionPane.showInputDialog("Enter any number: "); // Displays Input Dialog Box to enter number
 
            int num= Integer.parseInt(input); // converts string to number
 
            int orgNum=num;
 
            int rev=0;
 
            while(num>0)
 
            {
 
                int d=num%10;
 
                num=num/10;
 
                rev=rev*10+d;
 
            }
 
            System.out.println("Reverse("+orgNum+ ") = "+ rev);
 
        }
 
            catch(Exception e){
 
                    System.out.println("Please enter Integer!");
 
            }   
 
        }
 
    }
