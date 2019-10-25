package com.spartaglobal.IO_Exceptions;

import java.io.*;

public class BufferedFileManager {



    public void readerWriter() throws IOException {
        //current file managed by buffer

        File file = new File("resources/TestFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        File newfile = new File("resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newfile));

        //line manager variable
        String line;

        while ((line = reader.readLine()) != null) {
            if (!line.equals("")) {
                writer.append(line + "\n");
                System.out.println("friyay I've added a new line sic");
            }

        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
