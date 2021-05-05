package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhập số cần đọc : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ones;
        String tens;
        String hundreds;
        int donVi = num %10;
        int tram = Math.round(num/100);
        int chuc = (num-tram*100-donVi)/10;
        if (num>0&&num<10){
            System.out.println(readOnes(donVi));
        }else if (num>=10&&num<20){
            switch (num){
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                    System.out.println(readOnes(donVi)+"teen");
                    break;
            }
        }else if (num>=20&&num<100){
            System.out.println(readTens(chuc)+" "+readOnes(donVi));
        }else if (num>=100&&num<1000){
            System.out.println(readHundreds(tram)+" "+readTens(chuc)+" "+readOnes(donVi));
        }
    }
    public static String readOnes(int num) {
        String ones = "";
        switch (num) {
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "five";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
        }
        return ones;
    }
    public static String readTens(int num){
        String tens = "";
        switch (num){
            case 2 :
                tens = "twenty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 4:
                tens = "forty";
                break;
            case 5:
                tens = "fifty";
            case 6:
            case 7:
            case 8:
            case 9:
                tens = readOnes(num)+"ty";
        }
        return tens;
    }
    public static String readHundreds(int num){
        return readOnes(num)+" hundred";
    }

}

