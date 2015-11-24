package com.github.mfriedenhagen.mavenembeddedtest

import org.apache.maven.cli.CliRequest
import org.apache.maven.cli.MavenCli
import org.codehaus.plexus.classworlds.ClassWorld

/**
 * Hello world!
 *
 */
public class App {
    private final cli = new MavenCli()
    private final ClassWorld myClassWorld = new ClassWorld("plexus.core", getClass().getClassLoader());

    public App(String[] strings) {
        System.properties['maven.multiModuleProjectDirectory'] = ''
        cli.doMain(new CliRequest(strings, myClassWorld))
        //cli.doMain(strings, '.', System.out, System.err)
    }

    public static void main(String[] args) {
        new App(args)
    }
}
