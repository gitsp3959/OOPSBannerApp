public class OOPSBannerApp {

    public static void main(String[] args) 
        {

        String[] banner = {
            String.join(" ", "OOOOO", "PPPPP",  "SSSSS"),
            String.join(" ", "O   O", "P   P",  "S"),
            String.join(" ", "O   O", "PPPPP",  "SSSSS"),
            String.join(" ", "O   O", "P",      "    S"),
            String.join(" ", "OOOOO", "P",      "SSSSS")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}