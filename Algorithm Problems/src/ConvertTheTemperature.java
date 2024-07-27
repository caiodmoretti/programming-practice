/*      You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
        You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
        Return the array ans. Answers within 10-5 of the actual answer will be accepted.
        Note that:
        Kelvin = Celsius + 273.15
        Fahrenheit = Celsius * 1.80 + 32.00
*/

public class ConvertTheTemperature {
    public static void main(String[] args) {
        double[] solution = convertTemperature(36.50);
        System.out.println("["+solution[0] +","+ solution[1]+"]");

        }
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius +273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        double[] ans = {kelvin, fahrenheit};
        return ans;
    }
}
