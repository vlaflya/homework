package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new runeb());
        Scanner scanner = new Scanner(System.in);
        String st;
        thread.start();
        while (true){
            st = scanner.nextLine();
            if(st.toLowerCase().equals("stop")){
                thread.stop();
                break;
            }
        }
    }
}
