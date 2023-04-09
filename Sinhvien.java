/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienCNTTvaKinhTe;

/**
 *
 * @author Tran Viet Duc
 */
public abstract class Sinhvien {
    private String ma, hoten;
    private boolean gioitinh;
    public abstract double tinhDTB();
    public abstract String getXepLoai();

    public Sinhvien(String ma, String hoten, boolean gioitinh) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    } 
    @Override
    public String toString() {
        return "Sinhvien{" + "ma=" + ma + ", hoten=" + hoten + ", gioitinh=" + (gioitinh?"nam":"nu") +" , xep loai:"+getXepLoai()+", diem trung binh: "+tinhDTB()+ '}';
    }
    public static void main(String[] args) {
        
    }
}
