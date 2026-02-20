// Create TemperatureConversion Class to convert Celsius to Fahrenheit

class TemperatureConversion {
    public static void main(String[] args) {

        // Create variable for temperature in Celsius
        double celsius = 37.0;

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display temperature conversion
        System.out.println("Temperature Conversion:\n" +
                celsius + "°C is equal to " +
                fahrenheit + "°F");
    }
}
