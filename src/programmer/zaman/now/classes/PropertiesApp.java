package programmer.zaman.now.classes;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.port"));
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
        } catch (IOException exception) {
            System.out.println("Gagal load file");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Didik");
            properties.put("name.middle", "Nur");
            properties.put("name.last", "Hidayat");

            properties.store(new FileOutputStream("name.properties"), "");
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
        } catch (IOException exception) {
            System.out.println("File gagal disimpan");
        }
    }
}
