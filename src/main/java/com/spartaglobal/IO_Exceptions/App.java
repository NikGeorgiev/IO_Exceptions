package com.spartaglobal.IO_Exceptions;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {


//        ByteReaderManager byteReaderManager = new ByteReaderManager();
//        byteReaderManager.charReader();
        BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try {
            bufferedFileManager.readerWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
