/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        // GHI DU LIEU DANG BYTE
        String data = "Co thuy xinh gai nhat he mat troi";
        
        try {
            FileOutputStream fos = new FileOutputStream("D:\\thuyvt66.txt");
            // Chuyen du lieu string ve byte
            byte[] dataBytes = data.getBytes();
            // Ghi du lieu ra file
            fos.write(dataBytes);
            // dong luong ghi file
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("loi");
        } catch (IOException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            
        }
        
        // Goi phuong thuc ghi du lieu nguyen thuy
        ghiDuLieuNguyenThuy();
        
        // Goi phuong thuc ghi du lieu doi tuong
        ghiDuLieuDoiTuong();
    }
    
    // GHI DU LIEU DANG NGUYEN THUY
    public static void ghiDuLieuNguyenThuy() {
        try {
            // khoi tao luong ghi file
            FileOutputStream fos = new FileOutputStream("D:\\fileNguyenThuy.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            // thuc hien ghi du lieu
            dos.writeInt(12);
            dos.writeDouble(15.2);
            dos.writeUTF("Pass môn");
            dos.writeBoolean(true);
            // Dong luong ghi file
            dos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    // GHI DU LIEU DANG DOI TUONG
    public static void ghiDuLieuDoiTuong() {
        try {
            // Mo luong ghi file co ban
            FileOutputStream fos = new FileOutputStream("D:\\fileDoiTuong.txt");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            
            List<SinhVien> sv = new ArrayList<>();
            sv.add(new SinhVien("Vu Thi Thuy", "thuyvt66@fpt.edu.vn", 18, 10, true));
            sv.add(new SinhVien("Tran Huu Thien", "thienth@fpt.edu.vn", 20, 10, true));
            sv.add(new SinhVien("Nguyen Van Luong", "luongnv8@fpt.edu.vn", 19, 4, false));
            sv.add(new SinhVien("Pham Thi Phuong", "phuongpt@fpt.edu.vn", 20, 9, true));
            // ghi danh sach doi tuong sv vào file
            oss.writeObject(sv);
            // dong luong ghi du lieu
           oss.close();
           fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
