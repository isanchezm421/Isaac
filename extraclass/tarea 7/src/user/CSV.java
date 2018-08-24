/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author ulacit
 */
public class CSV {

    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";

    public static String WriteFile(User usr) throws IOException {
        try {
            String cadena = usr.getCadenaT();
            File file = new File("C:\\Files\\User.csv");
            FileWriter escribir;
            PrintWriter linea;
            if (!file.exists()) {
                System.out.println("No hay archivo");
                file.createNewFile();
                escribir = new FileWriter(file, true);
                linea = new PrintWriter(escribir);
                linea.println(cadena);
                linea.close();
                escribir.close();
            } else {
                escribir = new FileWriter(file, true);
                linea = new PrintWriter(escribir);
                linea.println(cadena);
                linea.close();
                escribir.close();
            }
            System.out.println("The file has been created successfully");

        } catch (Exception e) {

        } finally {

            return ("");

        }
    }

    private static String[] removeTrailingQuotes(String[] fields) {

        String result[] = new String[fields.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");

        }
        return result;

    }

}
