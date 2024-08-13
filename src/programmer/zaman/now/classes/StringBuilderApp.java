package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // penggunaan string builder sangat disarankan dibanding String biasa karena String biasa bersifat immutable dan StringBuilder Tidak
        StringBuilder builder = new StringBuilder();
        builder.append("Didik");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Hidayat");

        String name = builder.toString();
        System.out.println(name);
    }
}
