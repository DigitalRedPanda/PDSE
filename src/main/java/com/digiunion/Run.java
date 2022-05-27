package com.digiunion;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Run {
    // TODO The plan is to create a command-line application that serves as a search
    // engine for terms within my personal english dictionary along with support for
    // different commands
    public static void main(String[] args) {
        CompletableFuture<Void> future = new CompletableFuture<>();
        future.runAsync(() -> {
            try (var input = new Scanner(System.in)) {
                System.out.println("Welcome to PDSE, type a word that you want to search");
                var command = input.next();
                System.out.println("Done!");
                System.exit(0);
            }
        });

        future.join();

    }
}
