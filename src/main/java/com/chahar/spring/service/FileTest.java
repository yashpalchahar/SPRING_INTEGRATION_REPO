package com.chahar.spring.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class FileTest {
    public static void main(String[] args){
        final String fileContents  = "line 111111111111111 \n 222222222 444 \n 565656 \n 7777777 88888888888";
        final String directory = "D://99999";
        final String filename =  "hi1111111.txt";

        final File file = createFileWithContent(filename+"_"+ UUID.randomUUID()+".tmp",fileContents);
        final File targetFile = new File(directory,filename);

        //Place file into hot folder directory
        //System.out.println(file.renameTo(targetFile));
        System.out.println(file.renameTo(targetFile));

        /*try {
            Path temp = Files.move(Paths.get(file.getAbsolutePath()),Paths.get(directory+ File.separator+filename));
            System.out.println(temp != null ? "Successfully moved" : "failed to move file");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    private static File createFileWithContent(String filename, String fileContents) {
        final File file= new File(System.getProperty("java.io.tmpdir"),filename);
            try {
                System.out.println(file.createNewFile());

                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(fileContents);
                fileWriter.flush();
                fileWriter.close();

                return file;
            } catch (IOException e) {
                System.out.println("Exception occured during file creation. Reason: " +e.getMessage());
            }
            return null;
        }
}
