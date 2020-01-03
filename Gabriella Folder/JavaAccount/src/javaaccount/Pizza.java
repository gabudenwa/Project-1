
//package javaaccount;

import java.util.Scanner;


public class Pizza {
    
   /*item(double cheese = 1.50; double pineapple = 1.50; double greenpepper = 1.50;
    double HamandPineapple = 3.00; double HamandGreenPepper = 3.00);*/
    //public double Cost
    double cheese = 1.50; double pineapple = 1.50; double greenpepper = 1.50;
    double HamandPineapple = 3.00; double HamandGreenPepper = 3.00; 
    //double pizza = new pizza;
    
    private static double initialSmallPizza =5.50;
    private static double initialMediumPizza =7.50;
    private static double initialLargePizza =9.50;
    
    
    
   // int i=0; int i<100; i++;
   //double pizza = new pizza;
    
    public static void main(String[]args, double pizza){
    if (initialSmallPizza >0.00)
        pizza = initialSmallPizza;
    if (initialMediumPizza >0.00)
        pizza = initialMediumPizza;
    if (initialLargePizza >0.00)
        pizza = initialLargePizza;
    }
    public void add(double item, double pizza)
    {
    pizza = pizza + item;
    }
    
    System.out.printf("SmallPizza: $%.2f\n",
            SmallPizza.getCost());
    System.out.printf("MediumPizza: $%.2f\n",
            MediumPizza.getCost());
    System.out.printf("LargePizza: $%.2f\n",
            LargePizza.getCost());
    
    Scanner input = new Scanner ( System.in);
    double selectItem;
    
    System.out.print("SmallPizza: ");        
     selectItem = input.nextDouble();
    System.out.printf("\nadding %.2f to pizza\n\n",
            getCost);
    SmallPizza.getCost(Cost);
    
    System.out.printf("SmallPizza: $%.2f\n",
            pizza.getCost);
    System.out.printf("MediumPizza: $%.2f\n\n",
            pizza.getCost);
     System.out.printf("LargePizza: $%.2f\n\n\n",
            pizza.getCost);
    
    
}
