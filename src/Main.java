import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String text = scanner.nextLine();
        System.out.println("Choose encryption method: MD5/SHA-1/SHA-256");
        String method = scanner.nextLine();
        scanner.close();

        switch (method) {
            case ("MD5"):
                System.out.println(MD5.execute(text));
                break;
            case ("SHA-1"):
                System.out.println(SHA1.execute(text));
                break;
            case ("SHA-256"):
                System.out.println(SHA256.execute(text));
                break;
            default:
                System.out.println("Error");
        }
    }
}