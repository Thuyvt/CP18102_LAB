/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        // DOC DU LIEU DANG BYTE
        byte[] array = new byte[1000];
        try {
            FileInputStream fis = new FileInputStream("D:\\thuyvt66.txt");
            // read byte tu file va luu vao mang array
            fis.read(array);
            // Chuyen du lieu tu byte ve String
            String data = new String(array);
            System.out.println(data);
            // dong luong doc file
            fis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Goi phuong thuc doc file
        docDuLieuNguyenThuy();
        
        // Goi phuong thuc doc file
        docDuLieuDoiTuong();
    }

    // DOC DU LIEU NGUYEN THUY
    public static void docDuLieuNguyenThuy() {
        try {
            // Mo luong doc file
            FileInputStream fis = new FileInputStream("D:\\fileNguyenThuy.txt");
            DataInputStream dis = new DataInputStream(fis);
            // thuc hien doc file
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());
            // Dong luong doc file
            dis.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void docDuLieuDoiTuong() {
        try {
            FileInputStream fis = new FileInputStream("D:\\fileDoiTuong.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            List<SinhVien> listSv = (List<SinhVien>) ois.readObject();
            for (SinhVien sv : listSv) {
                System.out.println("Ten:" + sv.getTen());
                System.out.println("Diem: " + sv.getDiem());
            }
            // Dong luong doc file
            ois.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
