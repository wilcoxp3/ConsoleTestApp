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
public class MyConsole implements ConsoleIO
{
    MyValidator val;
    MyConsole()
    {
       val = new MyValidator();
    }
    
    @Override
    public void print(String s)
    {
        System.out.print(s);
    }
    @Override
    public void println(String s)
    {
        System.out.println(s);
    }
    @Override
    public void println()
    {
        System.out.println();
    }
    
    @Override
    public int getInt(String prompt)
    {
        return val.getInt(prompt);
    }
    @Override
    public int getInt(String prompt, int min, int max)
    {
        return val.getInt(prompt, min, max);
    }
    @Override
    public double getDouble(String prompt)
    {
        return val.getDouble(prompt);
    }
    @Override
    public double getDouble(String prompt, double min, double max)
    {
        return val.getDouble(prompt, min, max);
    }
    @Override
    public String getString(String prompt)
    {
        return val.getString(prompt);
    }
    @Override
    public boolean getChoice(String prompt, String choice1, String choice2)
    {
        return val.getChoice(prompt, choice1, choice2);
    }
    @Override
    public boolean getContinue(String prompt)
    {
        return val.getContinue(prompt);
    }
}
