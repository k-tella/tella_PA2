package tella_p2;

import java.util.*;

public class Tella_p2 {
	
	
    public static void main(String[] args) {
    	
    	
        Scanner scnr = new Scanner(System.in);
        
        
        System.out.print("Enter height (in feet) ");
        double feet = scnr.nextInt();
        
        
        System.out.print("Enter height (in inches) ");
        double height = scnr.nextDouble();
        height = feet*12 + height;
        
        
        System.out.print("Enter weight (in pounds) ");
        double weight = scnr.nextDouble();
        
        
        double bmi = (weight * 703 / height / height);
        System.out.printf("BMI = %.1f\n",bmi);
        
        
        if (bmi < 18.5) {
        	
            System.out.println("underweight");
            
            
        } else if (bmi < 25) {
        	
            System.out.println("normal");
            
            
        } else if (bmi < 30) {
        	
            System.out.println("overweight");
            
            
        } else {
        	
            System.out.println("obese");
        }
    }
}
