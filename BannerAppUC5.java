public class BannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "  ", "*", "*", "*", "*", "*", "  "),
                String.join("", " ", "*", "     ", "*", " "),
                String.join("", " ", "*", "  O  O  ", "*", " "),
                String.join("", " ", "*", "   \\_/   ", "*", " "),
                String.join("", " ", "*", "         ", "*", " "),
                String.join("", " ", "*", "  WELCOME  ", "*", " "),
                String.join("", "  ", "*", "*", "*", "*", "*", "*", "*", "*", "*", "  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
