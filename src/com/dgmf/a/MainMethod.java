package com.dgmf.a;

public class MainMethod {
    // Java Program starts by executing the “main()” Method
    // Below is the widely used Conventional Signature of
    // the "main()" Method
    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/

    // There are other Permissible Ways to write the “main” Method
    // N.B : THE RETURN TYPE MUST ALWAYS BE JUST BEFORE THE
    // NAME OF THE "MAIN()" METHOD

    // Below, due to the Position of the Return Type ==> Error : invalid
    // method declaration; return type required
    /*public void static main(String[] someOtherSillyName) {
        System.out.println("Hello World");
    }*/
    /*void public static main(String[] someOtherSillyName) {
        System.out.println("Hello World");
    }*/

    // Other Scriptures of the "main()" Method
    /*public static void main(String[] someOtherSillyName) {
        System.out.println("Hello World");
    }*/
    /*public static void main(String args[]) {
        System.out.println("Hello World!");
    }*/
    /*public static void main(String ...args) {
        System.out.println("Hello World!");
    }*/
    /*public final static void main(final String[] args) {
        System.out.println("Hello World!");
    }*/
    static public void main(String[] args) {
        System.out.println("Hello World");
    }

}
