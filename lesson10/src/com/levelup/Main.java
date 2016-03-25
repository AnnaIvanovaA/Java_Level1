package com.levelup;

import java.io.*;

/**
 * Created by Student-16 on 25.03.2016.
 */

public class Main {
    public static void main(String[] args) {
        //нельзя открывать оба потока одновременно
        //открыть поток для записи - записать - закрыть поток
//      read from console
//        BufferedReader console = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("file.txt")
                    )
            );

            // read strings --> read bytes --> read from stream --> file

            writer = new PrintWriter(
                    //new FileOutputStream("output.txt", true), false
                    new FileOutputStream("output.txt"), false
            ); //true - data in the end, false - autoflush
            reader.readLine();
        } catch (FileNotFoundException e){
            System.err.println("File not found");
        } catch (IOException e){
            System.err.println("File read error");
        } finally {
            //выполнится в любом случае
        }

        if (writer != null ){
            int bufferSize = 0;
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    writer.println(line);
                    bufferSize++;
                    if (bufferSize == 3) {
                        writer.flush();
                        bufferSize = 0;
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }

            writer.flush(); //вызывается перед закрытием потока, очищает буффер, запись в файл
            writer.close(); //запись только когда закрывается поток
        }
        if (reader != null){
            try {
                reader.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }

        try{
            throw new MyException("MY EXCEPTION");
        } catch (MyException e){
            e.printStackTrace();
        }

    }
}
