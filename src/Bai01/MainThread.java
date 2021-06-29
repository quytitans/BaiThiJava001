package Bai01;

public class MainThread {
    public static void main(String[] args) {
        double fDegree = ConversionUtil.celsiusToFahrenheit(10);
        System.out.printf("10 Cdegree is %f in FDegree\n", fDegree);
        double cDegree = ConversionUtil.fahrenheitToCelsius(20);
        System.out.printf("20 Fdegree is %f in CDegree\n", cDegree);
    }
}
