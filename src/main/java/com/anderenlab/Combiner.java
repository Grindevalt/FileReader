package com.anderenlab;

import java.io.*;

/**
 * Class for combining two txt files into one
 *
 * @author Vlad Badilovskii
 * @version 1.0
 */
public class Combiner {
    /**
     * Method for combining two files into one, with alternately inserting lines
     *
     * @param inputFile1
     * @param inputFile2
     * @param outputFile3
     * @throws IOException
     */
    public void CombineFiles(String inputFile1, String inputFile2, String outputFile3) throws IOException {
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        FileReader fileReader1 = null;
        FileReader fileReader2 = null;
        BufferedWriter writer = null;
        FileWriter fileWriter = null;
        try {
            fileReader1 = new FileReader(inputFile1);
            reader1 = new BufferedReader(fileReader1);
            fileReader2 = new FileReader(inputFile2);
            reader2 = new BufferedReader(fileReader2);
            fileWriter = new FileWriter(outputFile3);
            writer = new BufferedWriter(fileWriter);

            String Line1;
            String Line2;

            while ((Line1 = reader1.readLine()) != null | (Line2 = reader2.readLine()) != null) {
                if (Line1 != null) {
                    writer.write(Line1 + System.getProperty("line.separator"));
                }
                if (Line2 != null) {
                    writer.write(Line2 + System.getProperty("line.separator"));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
                if (fileReader1 != null) {
                    fileReader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
                if (fileReader2 != null) {
                    fileReader2.close();
                }
                if (writer != null) {
                    writer.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
