package org.example;

import org.example.db.HSQLDBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        HSQLDBConnection.hsqldbRun();

        System.out.println( "connection success!!!" );
    }
}
