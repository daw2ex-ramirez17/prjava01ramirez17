/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01ramirez17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ubu16
 */
public class Prjava01ramirez17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File f = new File("fitxer01ramirez17.html");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            bw.write("<html>");bw.newLine();

            bw.write("  <head>");bw.newLine();

            bw.write("    <title>");bw.newLine();

            bw.write("      Nova p&agrave;gina  web de cognom17");bw.newLine();
            
            bw.write("      DAW2 UF4 Pr&agrave;ctica 2");bw.newLine();

            bw.write("    </title>");bw.newLine();

            bw.write("  </head>");bw.newLine();

            bw.write("  <body>");bw.newLine();

            bw.write("    Nova p&agrave;gina web de ramirez17");bw.newLine();

            bw.write("  </body>");bw.newLine();

            bw.write("</html>");bw.newLine();

            bw.close();

        }

    }
    
}
