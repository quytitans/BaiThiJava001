package Bai01;

public class ConversionUtil {
    public static double celsiusToFahrenheit(double cDegree) {
        double Fahrenheit = ((cDegree*9)/5)+32;
        return Fahrenheit;
    };
    public static double fahrenheitToCelsius(double fDegree) {
        double Celsius = (( 5 *(fDegree - 32.0)) / 9.0);
        return Celsius;
    };
}
