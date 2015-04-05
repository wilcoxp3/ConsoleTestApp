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
public interface ConsoleInput
{
    int getInt(String prompt);
    int getInt(String prompt, int min, int max);
    
    double getDouble(String prompt);
    double getDouble(String prompt, double min, double max);
    
    String getString(String prompt);
    boolean getChoice(String prompt, String choice1, String choice2);
    boolean getContinue(String prompt);
}
