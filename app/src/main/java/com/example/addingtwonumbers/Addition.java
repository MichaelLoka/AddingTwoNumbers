package com.example.addingtwonumbers;

public class Addition {
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int num){
        firstNumber = num;
    }
    public void setSecondNumber(int num){
        secondNumber = num;
    }
    public int getFirstNumber(){
        return firstNumber;
    }
    public int getSecondNumber(){
        return secondNumber;
    }
    public int add(){
        return firstNumber + secondNumber;
    }
}
