/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.IOException;

/**
 *
 * @author ThuyVT
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Chia mot so cho 0
            int number = 9;
            int zero = 0;
            System.out.println(number / zero);
            // Loi ep kieu
            String str = "a50";
            int numberStr = Integer.parseInt(str);
            System.out.println(numberStr);
        } catch (ArithmeticException ex) {
            System.out.println("Khong the chia cho 0");
        } catch (NumberFormatException ex) {
            System.out.println("Loi ep kieu");
        }
        System.out.println("abcbca");

        try {
            String str = "a50";
            int numberStr = Integer.parseInt(str);
            System.out.println(numberStr);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cuoi cung cung chay vao day");
        }

//        throw new UnsupportedClassVersionError("abasjckahskcja");
        try {
            readFile();
        } catch (IOException ie) {
            System.out.println("Ngoai le IOException");
        }
    }

    public static void readFile() throws IOException {

    }
}
