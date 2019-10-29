package io.turntabl.maths;

public class Numbers {
    public static int sum(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }
    public static boolean isPositive(int num){
        if(num > 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNegative(int num){
        if(num < 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEvenNumberAndGreaterThanZero(int num){
        if(num % 2 == 0 && num > 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isLeapYear(int year){
        if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)){
            return true;
        }else {
            return false;
        }
    }
}
