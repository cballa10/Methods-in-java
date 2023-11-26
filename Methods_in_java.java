package java_methods;
import java.util.Scanner;

public class Methods_in_java {
public static void getUserInput(){

   double num1, num2, num3;

//creating scanner object 
Scanner input = new Scanner(System.in);

//asking users to enter the three numbers
System.out.println("Enter the first number: ");
num1 = input.nextDouble();

System.out.println("Enter the second number: ");
num2 = input.nextDouble();

System.out.println("Enter the third number: ");
num3 = input.nextDouble();


//initializing variables for the largest and smallest number among the three numbers

double largest;
double smallest;

//comparing the three numbers to get the largest
if(num1 > num2 && num1 > num3){
  largest = num1;
} else if (num2 > num1 && num2 > num3){
  largest = num2;
}else {
  largest = num3;
}

//comparing the three numbers to get the smallest
if(num1 < num2 && num1 < num3){
  smallest = num1;
} else if (num2 < num1 && num2 < num3){
  smallest = num2;
}else {
  smallest = num3;
}

//display the results
System.out.println("The smallest number: " + smallest);
System.out.println("The largest number: " + largest);
System.out.println( + largest + " is your largest and " + smallest +" is your smallest number");
}

public static void main(String[] args){
//calling the method
getUserInput();

}
}