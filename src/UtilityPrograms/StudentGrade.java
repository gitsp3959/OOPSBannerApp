// Create TypeConversionDemo Class to demonstrate type conversion

class TypeConversionDemo {
    public static void main(String[] args) {

        // Create variables for milliliters and liters
        int milliliters = 500;

        // Incorrect division (implicit integer division)
        double incorrectLitres = milliliters / 1000;

        // Correct division using explicit type conversion
        double correctLitres = (double) milliliters / 1000;

        // Display results
        System.out.println("Incorrect Conversion: " + incorrectLitres + " L");
        System.out.println("Correct Conversion: " + correctLitres + " L");
    }
}