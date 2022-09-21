/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThuyVT
 */
public class NguoiDung {
    private String userName;
    private String email;
    private String password;
    private int role; // 1-User; 2-Admin
    private boolean status;
    private String vitri;

    public NguoiDung() {
    }

    public NguoiDung(String userName, String email, String password, int role, boolean status, String vitri) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        this.vitri = vitri;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    
    
}
