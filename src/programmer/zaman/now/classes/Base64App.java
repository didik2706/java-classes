package programmer.zaman.now.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String origin = "Didik Nur Hidayat";

        String encoded = Base64.getEncoder().encodeToString(origin.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}
