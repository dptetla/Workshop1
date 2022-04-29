package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.Scanner;

public class TaskManager {
    public static void options() {
        System.out.println(ConsoleColors.BLUE + "Please select an option:" + ConsoleColors.RESET);
        String[] tab = {"add", "remove", "list", "exit"};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        options();
//        File file = new File("")
//        Scanner scanner = new Scanner("tasks.csv"){
//
//        }
    }



}


