import java.util.Scanner; 
public class DegreeConverter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print ("Celsius Temperature");
        double celsius = s.nextDouble();
        System.out.println (celsiusToFahrenheit(celsius));
        System.out.print ("Fahrenheit Temperature");
        double fahrenheit = s.nextDouble();
        System.out.println (fahrenheitTocelsius(fahrenheit));
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (((celsius * 9) / 5) + 32);
        return fahrenheit;
    }

    public static double fahrenheitTocelsius(double fahrenheit) {
        double celsius = (((fahrenheit - 32) * 5) / 9);
        return celsius;
        
    }
}