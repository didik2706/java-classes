package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Didik Nur Hidayat";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println("Length name : " + name.length());
        System.out.println(name.startsWith("Didik"));
        System.out.println(name.endsWith("Hidayat"));

        String[] names = name.split(" ");
        System.out.println("==== Split String ====");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
