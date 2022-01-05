package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbOfEle;
        int total3Divided = 0;
        List<Integer> specialNumber = new ArrayList<Integer>();
        List<Integer> numberList = new ArrayList<Integer>();
        Scanner numb = new Scanner(System.in);
        System.out.println("Calculation System");
        System.out.println("Number of elements which you want to access ?");
        numbOfEle = numb.nextInt();
        for(int i = 0; i < numbOfEle ; i++){
            System.out.println("Plz access numbers ?");
            int x = numb.nextInt();
            numberList.add(x);
        }
        for(int j = 0; j < numberList.size();j++){
            if(numberList.get(j) % 3 == 0){
                total3Divided += numberList.get(j);
                specialNumber.add(numberList.get(j));
            }else{
                System.out.println("Don't divide to three :)) " + numberList.get(j));
            }
        }
        System.out.println("Array of numbers " + numberList);
        System.out.println("Array of numbers which divied to three " + specialNumber);
        System.out.println("total number which divided to three " +total3Divided );
    }
}
