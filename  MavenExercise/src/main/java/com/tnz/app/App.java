package com.tnz.app;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        System.out.println( "Hello World!" );
        int num = new Scanner(System.in).nextInt();

    }
}
