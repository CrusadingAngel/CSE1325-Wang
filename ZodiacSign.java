package ZodiacSign
import java.util.Scanner;
//Tyler Sanderson
//Thomas Davis 
//Allan Jacobs
public class ZodiacSign
{
    public static void main(String[] args)
    {
        //Construct a new instance of the scanner
        Scanner KeyboardInput = new Scanner (System.in);
        
        System.out.println("This program finds your Zodiac Sign! What month were you born in MM format?")

        //Create two int variables to hold user inputs
        int month = KeyboardInput.nextInt();

        if (month < 1 || month > 12)
        {
            System.out.println("Invalid Month");
            validMonth = false; 
            System.exit(0);
        }
        System.out.println("What day were you born?")

        int day = KeyboardInput.nextInt();

        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            maxDay = 30
        }
        if (month == 2)
        {
            maxDay = 28
        }
    }
    // Check date
    if ((day < 1 || day > maxDay))
    {
        System.out.println("Day doesn't exist in the month!")
        System.exit(0);
    }

    //create all conditions for different
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) 
    {
        System.out.println("Aries");
    } 
    else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) 
    {
        System.out.println("Taurus");
    } 
    else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) 
    {
        System.out.println("Gemini");
    } 
    else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) 
    {
        System.out.println("Cancer");
    } 
    else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) 
    {
        System.out.println("Leo");
    } 
    else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) 
    {
        System.out.println("Virgo");
    } 
    else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) 
    {
        System.out.println("Libra");
    } 
    else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) 
    {
        System.out.println("Scorpio");
    } 
    else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) 
    {
        System.out.println("Sagittarius");
    } 
    else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) 
    {
        System.out.println("Capricorn");
    } 
    else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) 
    {
        System.out.println("Aquarius");
    } 
    else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) 
    {
        System.out.println("Pisces");
    } 
    else 
    {
        System.out.print("Invalid date");
    }
}