package com.liz;

import javax.swing.*;

public class Day2JOptionPane {
    public static void main(String[] args) {
        //using the JOptionPane
        String num1,num2;
        Double num1Converted, num2Converted,answer;
        num1 = JOptionPane.showInputDialog("Enter the first number");
        num2 = JOptionPane.showInputDialog("Enter the second nuumber");
        num1Converted=Double.parseDouble(num1);
        num2Converted=Double.parseDouble(num2);
        answer=num1Converted*num2Converted;
        JOptionPane.showMessageDialog(null,"Answer:"+answer);
    }
}
