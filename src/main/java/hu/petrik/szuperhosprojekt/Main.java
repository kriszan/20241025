package hu.petrik.szuperhosprojekt;

import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Kepregeny kepregeny = new Kepregeny();
        kepregeny.szuperhosok();
    }

    public interface Szuperhos {
        boolean legyoziE(Szuperhos hero) throws ExecutionControl.NotImplementedException;

        float mekkoraAzEreje();
    }

    public interface Milliardos {
        void kutyutKeszit();
    }









}