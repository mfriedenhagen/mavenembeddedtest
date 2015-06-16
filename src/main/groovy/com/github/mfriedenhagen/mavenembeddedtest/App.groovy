package com.github.mfriedenhagen.mavenembeddedtest

import org.apache.maven.cli.MavenCli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        def cli = new MavenCli();
        System.out.println( "Hello World!" );
    }
}
