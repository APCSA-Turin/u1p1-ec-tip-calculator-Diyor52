package com.example.project;

import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 

                                 
        double tipAmount = cost*(0.01*percent);
        tipAmount = Math.round(tipAmount*100.0)/100.0;
        //I got the code from https://stackoverflow.com/questions/11832914/how-to-round-to-at-most-2-decimal-places-if-necessary/12830454#12830454//

       
        double totalTip = tipAmount + cost;
       
        double amountPerPerson = cost/people;
        amountPerPerson = Math.round(amountPerPerson*100.0)/100.0;
        
        double tipPerPerson = tipAmount/people;
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;
      
        double totalCostPerPerson = (totalTip/people)-0.0000001;
        totalCostPerPerson = Math.round(totalCostPerPerson*100.0)/100.0;
         

      
       

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: "+ percent + "%");
        result.append("\n");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("\n");
        result.append("Total Bill with tip: " + "$" + totalTip );
        result.append("\n");
        result.append("Per person cost before tip: "+ "$" + amountPerPerson);
        result.append("\n");
        result.append("Tip per person: "+ "$" + tipPerPerson);
        result.append("\n");
        result.append("Total cost per person: "+ "$" + totalCostPerPerson);
        result.append("\n");
        result.append("-------------------------------\n");


        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        //Your scanner object and while loop should go here
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an item name or type '-1' to finish : ");
        String name = scan.nextLine();

        if (!"-1".equals(name)){ 
            items += name;
            items += "\n";;
        }
        /*I got the ! and equals to from these links: https://stackoverflow.com/questions/35531369/why-is-ab-0-faster-than-a-0-b-0-in-java and 
        https://stackoverflow.com/questions/35960649/compare-and-equals-methods-stack-overflow-error*/
        
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (!"-1".equals(name)) {
            System.out.print("Enter an item name or type '-1' to finish:");
            name = scan.nextLine();
            
            if (!"-1".equals(name)) {
                items+= name;
                items += "\n"; 

            }
            /*I got the ! and equals to from these links: https://stackoverflow.com/questions/35531369/why-is-ab-0-faster-than-a-0-b-0-in-java and 
        https://stackoverflow.com/questions/35960649/compare-and-equals-methods-stack-overflow-error*/
            
        }
    
    
        System.out.println(calculateTip(people,percent,cost,items));

        scan.close();
    }
}
