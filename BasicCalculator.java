
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        int operator,n1,n2;
        System.out.println("1-Add\n 2- subtract\n 3-mulify\n 4-division");
        System.out.println("Choose operator:");
        Scanner sc=new Scanner(System.in);
        operator= sc.nextInt();
        System.out.println("Enter first number :");
        n1=sc.nextInt();
        System.out.println("Enter second number :");
        n2=sc.nextInt();
        int result=0;
         switch (operator) {
             case1:
             result = n1 + n2;
             break;

             case2:
             result = n1 - n2;
             break;

             case3:
             result = n1 * n2;
             break;

             case4:
             result = n1 / n2;
             break;
             default:
                 System.out.println("Entered operator is not valid");
         }
        System.out.println("Result is :"+result);

         }
         }



