package com.red.innopolis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Object> cashe = new ArrayList<Object>();
    public static void createCollectable() {
        createBigObject();
    }
    public static Object createBigObject() {
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++)
            str.add("i" + i);
        return str;
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Write comman - ");
            String command = scanner.nextLine();
            switch (command) {
                case "Collectable": {
                    createCollectable();
                    break;
                }
        
                case "Leakable": {
                    cashe.add(createBigObject());
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println("Complete command");
        }
    }
}
