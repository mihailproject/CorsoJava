package com.corsoJava;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class Input extends JPanel {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Ciao 1");
                Container c = f.getContentPane();
        Es7Panel p = new Es7Panel();
        c.add(p);
        JButton b = new JButton("Tizio/Caio");
        f.pack(); //pack dimensiona il frame in modo da
        //contenere esattamente il pannello
        f.show();
    } }
 class Es7Panel extends JPanel {
    public Es7Panel(){
        super();
        JLabel l = new JLabel("Ciao");
        add(l);
    }
}

//
//        // Declare the variables
//        int num;
//
//        // Input the integer
//        System.out.println("Enter the integer: ");
//
//        // Create Scanner object
//        Scanner s = new Scanner(System.in);
//
//        // Read the next integer from the screen
//        num = s.nextInt();
//
//        // Display the integer
//        System.out.println("Entered integer is: "
//                + num);
