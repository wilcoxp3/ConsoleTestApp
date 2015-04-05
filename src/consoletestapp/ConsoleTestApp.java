/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoletestapp;

/**
 *
 * @author Paul
 */
public class ConsoleTestApp
{
    private static ConsoleIO myIO = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        myIO = IOFactory.getConsoleIO();
        
        myIO.println("Welcome to the Console Tester application");
        myIO.println();
        myIO.println("Int Test");
        myIO.getInt("Enter and integer between -100 and 100: ", -100, 100);
        myIO.println();
        myIO.getDouble("Enter any number between -100 and 100: ", -100, 100);
        myIO.println();
        myIO.getString("Enter your email address: ");
        myIO.println();
        myIO.getChoice("Select one (x/y): ", "x", "y");
        myIO.println("DONE");
    }
    
}
