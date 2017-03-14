package com.anderenlab;

import java.io.IOException;


/**
 * Main class where all functionality is implemented
 *
 * @author Vlad Badilovskii
 * @version 1.0
 */
public class App {
    private static final String FILE_INPUT_1 = "C:\\Users\\Vlad Badilovskii\\IdeaProjects\\FileReader\\src\\main\\resources\\1.txt";
    private static final String FILE_INPUT_2 = "C:\\Users\\Vlad Badilovskii\\IdeaProjects\\FileReader\\src\\main\\resources\\2.txt";
    private static final String FILE_OUTPUT_3 = "C:\\Users\\Vlad Badilovskii\\IdeaProjects\\FileReader\\src\\main\\resources\\3.txt";

    public static void main(String[] args) throws IOException {

        new Combiner().CombineFiles(FILE_INPUT_1, FILE_INPUT_2, FILE_OUTPUT_3);
    }

}

