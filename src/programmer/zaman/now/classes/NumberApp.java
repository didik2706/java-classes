package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer integerValue = 10;

        Long longValue = integerValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "100";
        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);
    }
}
