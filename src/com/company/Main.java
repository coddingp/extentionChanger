package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanFileDescription = new Scanner(System.in);
        System.out.println("Give name to the file: ");
        String fileName = scanFileDescription.nextLine() + '.';
        String extension = "png";
        System.out.println("default file extension is: " + extension);
        String fileDescription = fileName + extension;

        System.out.println("I you want to change the default extension than\n" +
                "type an extension you need the file to be converted into: ");
        String  newExtension =  scanFileDescription.nextLine();
        System.out.println("newExtension " + newExtension);

        System.out.println(fileExtensionChanger(fileDescription,newExtension));


    }

    public static String fileExtensionChanger(String fileDescription, String newExtension){
        String[] fileData = fileDescription.split("\\.");

        fileData[1] = newExtension;
        return fileData[0] + '.' + fileData[1];
    }

}
