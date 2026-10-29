package com.archis.studentmgmt.ui;

import com.archis.studentmgmt.service.RegistrarService;

import java.util.Scanner;

public class MainMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final RegistrarService registrar = new RegistrarService();

    public void run() {
        System.out.println("University Student Management System");
        System.out.println("------------------------------------");

        while (true) {
            System.out.println();
            System.out.println("1. Show registrar status");
            System.out.println("0. Exit");
            System.out.print("> ");

            String input = scanner.nextLine();
            switch (input) {
                case "1" -> System.out.println(registrar.status());
                case "0" -> {
                    System.out.println("Goodbye.");
                    return;
                }
                default -> System.out.println("Unknown option, try again.");
            }
        }
    }
}