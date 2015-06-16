package com.github.mfriedenhagen.mavenembeddedtest

import org.apache.maven.cli.MavenCli

/**
 * Hello world!
 *
 */
public class App 
{
    private final cli = new MavenCli()

    public App() {
        cli.doMain(new String[0], '.', System.out, System.err);
    }
    public static void main( String[] args )
    {
        new App();
    }
}
