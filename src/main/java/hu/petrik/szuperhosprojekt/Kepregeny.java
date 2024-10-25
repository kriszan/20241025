package hu.petrik.szuperhosprojekt;

import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public final class Kepregeny {

    public static ArrayList<Main.Szuperhos> szuperhosLista;

    void szereplok(Path path) {

        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader(String.valueOf(path)));

            while ((strCurrentLine = objReader.readLine()) != null) {
                switch (strCurrentLine.split(" ")[0].toLowerCase().trim().replace(":", "")) {
                    case "vasember":
                        for (int i = 0; i < Integer.valueOf(strCurrentLine.split(" ")[1]); i++) {
                            this.szuperhosLista.add(new Vasember());
                        }
                        break;
                    case "batman":
                        for (int i = 0; i < Integer.valueOf(strCurrentLine.split(" ")[1]); i++) {
                            this.szuperhosLista.add(new Batman());
                        }
                        break;
                    case "bosszuálló":
                        throw new ExecutionControl.NotImplementedException("Bosszuálló nem lehet fileban");
                    default:
                        throw new ExecutionControl.NotImplementedException("Valami random dolog nem lehet fileban");
                }

            }

        } catch (IOException | ExecutionControl.NotImplementedException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    void szuperhosok() {
        this.szuperhosLista.forEach((Main.Szuperhos element) -> {
            System.out.println(element.toString());
        });
    }
}
