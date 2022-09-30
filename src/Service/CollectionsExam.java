/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionsExam {

    public static void main(String[] args) {
        List<Double> listDoub = new ArrayList<>();

        //Thêm phan tu vao danh sach
        listDoub.add(12.5);
        listDoub.add(15.5);
        listDoub.add(20.5);
        listDoub.add(12.5);

        System.out.println("List Double " + listDoub);

        // Loai bo phan tu co gia tri trung lap
        Set<Double> setDoub = new HashSet<>();
        setDoub.add(12.5);
        setDoub.add(12.5);
        setDoub.add(15.5);
        setDoub.add(20.5);
        System.out.println("Set Double " + setDoub);

        // TreeSet() sap xep cac phan tu
        Set<Double> treeSetDoub = new TreeSet<>();
        treeSetDoub.add(12.5);
        treeSetDoub.add(12.5);
        treeSetDoub.add(15.5);
        treeSetDoub.add(20.5);

        System.out.println("tree set Double " + treeSetDoub);

        // Map loai bo phan tu co key trung lap du phan tu cuoi cung
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Windows", "98");
        hashMap.put("Windows", "2000");
        hashMap.put("Mac Os", "1000");
        hashMap.put("Linux", "300");
        hashMap.put("Windows", "3000");

        System.out.println(" \n" + hashMap);
        // TreeMap sap xep phan tu dua vao key
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Windows", "98");
        treeMap.put("Windows", "2000");
        treeMap.put("Mac Os", "1000");
        treeMap.put("Linux", "300");
        treeMap.put("Windows", "3000");

        System.out.println(" \n" + treeMap);
        // Lay ra phan tu
        // List dung index
        System.out.println(listDoub.get(1));
        // Map dung key
        System.out.println(hashMap.get("Linux"));

        // Xoa phan tu
        // List dung index 
//        System.out.println(listDoub.remove(1));
//        System.out.println("List sau khi xoa: "  +listDoub);
        // List dung gia tri cua doi tuong
//        System.out.println(listDoub.remove(12.5));
        // Xoa toan bo doi tuong co gia tri 12.5
//        listDoub.removeIf(item -> item.equals(12.5));
//        while (listDoub.remove(12.5));
        System.out.println("List sau khi xoa: " + listDoub);

        List<NguoiDung> listNguoiDung = new ArrayList<>();
        // Khoi tao gia tri mac dinh cua listNguoiDung
        NguoiDung nd1 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd2 = new NguoiDung("loantt", "loantt@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd3 = new NguoiDung("thienth3", "thienth3@fpt.edu.vn", "123456", 2, true, "Giang Vien");
        NguoiDung nd4 = new NguoiDung("ngannt98", "ngannt98@fpt.edu.vn", "123456", 1, true, "Sinh Vien");
        NguoiDung nd5 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "123456", 2, true, "Giang Vien");

        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);

//        System.out.println("Truoc khi xoa: " +listNguoiDung.size());
//        NguoiDung removeItem = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "123456", 2, true, "Giang Vien");
//        while (listNguoiDung.remove(removeItem));
//        System.out.println("Sau khi xoa: " +listNguoiDung.size());
//        
        // C1:
        System.out.println("Truoc khi sap xep: " + listDoub);
        // Sap xep tang dan
        Collections.sort(listDoub);
        System.out.println("Sau khi sap xep: " + listDoub);
        // Sap xep giam
        Collections.reverse(listDoub);
        System.out.println("Dao nguoc: " + listDoub);

        System.out.println("Truoc khi sap xep: " + listNguoiDung);
        Collections.sort(listNguoiDung);
        Collections.reverse(listDoub);

    }

}
