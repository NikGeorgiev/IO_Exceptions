package com.spartaglobal.IO_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteReaderManager {
    public void readStream() {
        try (InputStream input = new FileInputStream("resources/TestFile.txt");) {


            int data = 0;
            while (data != -1) {
                data = input.read();
                System.out.println(data);
            }
        } catch (IOException error) {
            error.printStackTrace();

        }

    }
    public void charReader(){
        try (InputStream input = new FileInputStream("resources/TestFile.txt");) {


            int data = 0;
            int ecount= 0;
            while (data != -1) {
                data = input.read();
                System.out.println((char)data);
                if((char)data == 'e'){
                    ecount++;

                }
            }
            System.out.println(ecount);
        } catch (IOException error) {
            error.printStackTrace();

        }

    }
}

