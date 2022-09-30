/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class QLNDService {
    List<NguoiDung> listNguoiDung = new ArrayList<>();

    public QLNDService() {
        // Khoi tao gia tri mac dinh cua listNguoiDung
        NguoiDung nd1 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd2 = new NguoiDung("loantt", "loantt@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd3 = new NguoiDung("thienth3", "thienth3@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd4 = new NguoiDung("ngannt98", "ngannt98@fpt.edu.vn", "123456", 1, true, "Sinh Vien");
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
    }
    
    // Lay danh sach nguoi dung
    public List<NguoiDung> getListNguoiDung () {
        return listNguoiDung;
    }
    
    public void add(NguoiDung nd) {
        listNguoiDung.add(nd);
    }
     
    public void update(int index, NguoiDung nd) {
        listNguoiDung.set(index, nd);
    }
    
    public void delete(int index) {
        listNguoiDung.remove(index);
    }
}
