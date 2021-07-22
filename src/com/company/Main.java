//Question:-
//A and B working separately can do a piece of work in 'X' and 'Y' days respectively.
//If they work for a day alternately, with A beginning, then the work will be complete in how many days?


package com.company;
import java.util.*;

public class Main {
    static int getTotalUnits(int daysTakenByA, int daysTakenByB){
        int num = daysTakenByA;
        int num1 = daysTakenByB;
        int GCD = 0, LCM = 0;
        for(int i = 1; i<=num && i<=num1; i++)
        {
            if(num % i == 0 && num1 % i ==0){
                GCD = i;
            }
        }
        LCM = (num*num1)/GCD;
        return LCM;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the number of days taken by A to finish the work: ");
        int daysTakenByA = Sc.nextInt();
        System.out.println("Input the number of days taken by A to finish the work: ");
        int daysTakenByB = Sc.nextInt();
        int totalUnits = getTotalUnits(daysTakenByA,daysTakenByB);
        int perDayUnitsOfA = totalUnits/daysTakenByA;
        int perDayUnitsOfB = totalUnits/daysTakenByB;
        int twoDaysWorkUnits = perDayUnitsOfA+perDayUnitsOfB;
        int divideValue = totalUnits/twoDaysWorkUnits;
        int divideReminder = totalUnits % twoDaysWorkUnits;
        int noOfDaysTaken = 2 * divideValue;
        if(divideReminder == 0){
            System.out.println("Alternatively they can complete the work in: "+noOfDaysTaken+" days");
        }else {
            System.out.println("Alternatively they can complete the work in: "+(noOfDaysTaken+1)+" days");
        }
    }
}


//--------------------------------Using Single Inheritance-------------------------------------//

//package com.company;
//        import java.util.*;
//
//class Calculation{
//    int totalUnits = 0;
//    int perDayUnitsOfA = 0;
//    int perDayUnitsOfB = 0;
//    int twoDaysWorkUnits = 0;
//    int divideValue = 0;
//    int divideReminder = 0;
//    int noOfDaysTaken = 0;
//    void calculate(int daysTakenByA,int daysTakenByB){
//        totalUnits = getTotalUnits(daysTakenByA,daysTakenByB);
//        perDayUnitsOfA = totalUnits/daysTakenByA;
//        perDayUnitsOfB = totalUnits/daysTakenByB;
//        twoDaysWorkUnits = perDayUnitsOfA+perDayUnitsOfB;
//        divideValue = totalUnits/twoDaysWorkUnits;
//        divideReminder = totalUnits % twoDaysWorkUnits;
//        noOfDaysTaken = 2 * divideValue;
//    }
//    int getTotalUnits(int daysTakenByA, int daysTakenByB){
//        int num = daysTakenByA;
//        int num1 = daysTakenByB;
//        int GCD = 0, LCM = 0;
//        for(int i = 1; i<=num && i<=num1; i++)
//        {
//            if(num % i == 0 && num1 % i ==0){
//                GCD = i;
//            }
//        }
//        LCM = (num*num1)/GCD;
//        return LCM;
//    }
//}
//
//class Display extends Calculation{
//    void getDays(){
//        if(divideReminder == 0){
//            System.out.println(noOfDaysTaken);
//        }else {
//            System.out.println((noOfDaysTaken+1));
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
////      System.out.println("Input the number of days taken by A to finish the work: ");
//        int daysTakenByA = Sc.nextInt();
////      System.out.println("Input the number of days taken by A to finish the work: ");
//        int daysTakenByB = Sc.nextInt();
//        Display Ob = new Display();
//        Ob.calculate(daysTakenByA,daysTakenByB);
//        Ob.getDays();
//    }
//}



