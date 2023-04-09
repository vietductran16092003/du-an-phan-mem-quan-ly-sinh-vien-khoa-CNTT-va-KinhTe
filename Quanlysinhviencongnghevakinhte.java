/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienCNTTvaKinhTe;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc
 */
public class Quanlysinhviencongnghevakinhte {
    private final ArrayList<Sinhvien> a= new ArrayList<>();
    public void docFile(String tenFile){
        try {
            File f= new File(tenFile);
            if(f.exists()){
                System.out.println("da mo duoc file ");
                Scanner read= new Scanner(f);
                while(read.hasNext()){
                    Scanner line= new Scanner(read.nextLine());
                    String ma,hoten;
                    boolean gioitinh;
                    ma=line.next();
                    hoten="";
                    while(!line.hasNextBoolean())
                    hoten= hoten+line.next()+" ";
                    gioitinh= line.nextBoolean();
                    double d1, d2;
                    d1=line.nextDouble();
                    d2=line.nextDouble();
                    if(line.hasNextDouble()){
                        double d3= line.nextDouble();
                        a.add(new SVCNTT(d3, d1, d2, ma, hoten, gioitinh));
                    }else a.add(new SVKInhte(d1, d2, ma, hoten, gioitinh));
                }
            }else System.out.println("file khong ton tai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void xuat(String noidung){
        System.out.println(noidung);
        for(Sinhvien x:a)
            System.out.println(x);
    }
    public int demsv(){
        return demSinhvienCNTT()+demSinhvienKinhte();
    }
    public int demSinhvienCNTT(){
        int dem=0;
        for(Sinhvien x:a )
            if(x instanceof SVCNTT)
                dem++;
        return dem;
    }
    public int demSinhvienKinhte(){
        int dem = 0;
        for(Sinhvien x:a)
            if(x instanceof SVKInhte)
                dem++;
        return dem; 
    }
    public double diemtrungbinhnganhCNTT(){
        double dem= 0, s= 0;
        for(int i=0;i<a.size();i++)
            if(a.get(i)instanceof SVCNTT){
                s=s+((SVCNTT)a.get(i)).tinhDTB();
                dem++;
            }
        return s/dem;
    }
    public double diemtrungbinhnganhKinhte(){
        double dem=0, s=0;
        for(int i=0;i<a.size();i++)
            if(a.get(i)instanceof SVKInhte){
                s=s+((SVKInhte)a.get(i)).tinhDTB();
                dem++;
            }
        return s/dem;
    }
    public void diemtrungbinhCaoNhat(){
        double max= 0 ;
        int j=0;
        for(int i=0;i<a.size();i++){
            if((a.get(i)instanceof SVCNTT)&&(max<((SVCNTT)a.get(i)).tinhDTB())){
                max=((SVCNTT)a.get(i)).tinhDTB();
                j=i;
            }
            if((a.get(i)instanceof SVKInhte)&&(max<((SVKInhte)a.get(i)).tinhDTB())){
                max=((SVKInhte)a.get(i)).tinhDTB();
                j=i;
            }

        }
        System.out.println("sinh vien co diem trung binh cao nhat la: "+a.get(j));
    }
    public Sinhvien diemtrungbinhcaonhatCNTT(){
        double max=0;
        int j=0;
        for(int i=0;i<a.size();i++){
            if((a.get(i)instanceof SVCNTT)&&(max<((SVCNTT)a.get(i)).tinhDTB())){
                max=((SVCNTT)a.get(i)).tinhDTB();
                j=i;
            }
        }
         return a.get(j);
    }
    public Sinhvien diemtrungbinhcaonhatKinhte(){
        double max= 0;
        int j= 0;
        for(int i=0;i<a.size();i++){
            if((a.get(i)instanceof SVKInhte)&&(max<((SVKInhte)a.get(i)).tinhDTB())){
                max=((SVKInhte)a.get(i)).tinhDTB();
                j=i;
            }
        }
        return a.get(j);
    }
    public int demsoSVgioi(){
        int dem =0;
        for(Sinhvien x:a){
            for(int i=0;i<a.size();i++){
                if(x.tinhDTB()>=8 && x.tinhDTB()<9)
                    dem++;}
        }
        return dem;
    }
    public int demsoSVXX(){
        int dem =0;
        for(Sinhvien x:a)
            for(int i=0;i<a.size();i++)
                if(x.tinhDTB()>9)
                    dem++;
        return dem;
    }
    public Sinhvien timtheoma(){
        Scanner line= new Scanner(System.in);
        String ma= line.nextLine();
        for(Sinhvien x:a)
            if(x.getMa().equalsIgnoreCase(ma)){
                return (x);
            }
        return null;
    }
    public boolean xoatheoma(String ma){
        for(Sinhvien x:a )
            if(x.getMa().equalsIgnoreCase(ma)){
                a.remove(x);
                return true;
            }
        return false;
    }
     public boolean them(Sinhvien y){
         for(Sinhvien x:a)
             if(x.getMa().equalsIgnoreCase(y.getMa())){
                 return false;
             }
         a.add(y);
         return true;
     }
     public Sinhvien nhapthem(){
         System.out.println(" nhap them mot sinh vien: ");
         Scanner line= new Scanner(System.in);
                    String ma,hoten;
                    boolean gioitinh;
                    System.out.println("nhap ma sinh vien: ");
                    ma=line.next();
                    System.out.println("Nhap ho ten sinh vien: ");
                    hoten="";
                    while(!line.hasNextBoolean())
                    hoten= hoten+line.next()+" ";
                    System.out.println("Nhap gioi tinh: ");
                    gioitinh= line.nextBoolean();
                    System.out.println("nhap diem: ");
                    double d1, d2;
                    d1=line.nextDouble();
                    d2=line.nextDouble();
                    if(line.hasNextDouble()){
                        double d3= line.nextDouble();
                        return new SVCNTT(d3, d3, d3, ma, hoten, gioitinh);
                    }else return new SVKInhte(d2, d2, ma, hoten, gioitinh);              
     }
                 public void ghiFile(String tenFile) {
        try {
            File f= new File(tenFile);
            if(!f.exists()) {
                PrintStream out= new PrintStream(f);
                for(Sinhvien x: a) {
                    if(x instanceof SVCNTT) 
                        out.println(x.getMa()+" "+x.getHoten()+" "+x.isGioitinh()+" "+((SVCNTT) x).getJava()+" "+((SVCNTT) x).getCss()+" "+((SVCNTT) x).getHtml()+" "+x.getXepLoai()+" "+x.tinhDTB());
                    else out.println(x.getMa()+" "+x.getHoten()+" "+x.isGioitinh()+" "+((SVKInhte) x).getNLKT()+" "+((SVKInhte) x).getMARKET()+" "+x.getXepLoai()+x.tinhDTB());
                }
            }else System.out.println("File da ton tai");
        } catch (Exception e) {
        }
    }
    public void output(){
        xuat("danhsanch");
        System.out.println("tong so sinh vien 2 nganh la: "+demsv());
        System.out.println("so sinh vien cntt: "+demSinhvienCNTT());
        System.out.println("so sinh vien kinh te: "+demSinhvienKinhte());
        System.out.println("diem trung binh cua toan sinh vien CNTT: "+diemtrungbinhnganhCNTT());
        System.out.println("diem trung binh cua toan sinh vien KinhTe: "+diemtrungbinhnganhKinhte());
        diemtrungbinhCaoNhat();
        System.out.println("sinh vien Cntt co diem trung binh cao nhat la: "+diemtrungbinhcaonhatCNTT());
        System.out.println("sinh vien Kinh Te co diem trung binh cao nhat la: "+diemtrungbinhcaonhatKinhte());
        System.out.println("so sinh vien dat loai gioi: "+demsoSVgioi());
        System.out.println("so sinh vien dat xuat xac: "+ demsoSVXX());
        System.out.println("= them 1 sinh vien: ");
        Sinhvien x= nhapthem();
        if(them(x)==true)
            xuat("danh sach vua them sinh vien co ma la: "+x.getMa());
        else System.out.println("sinh vien co ma: "+x.getMa()+"da ton tai trong danh sach");
        System.out.println(" xoa mot sinh vien theo ma: ");
        System.out.println("nhap ma sinh vien can xoa: ");
        Scanner line= new Scanner(System.in);
        String ma= line.nextLine();
        if(xoatheoma(ma)==true)
            xuat("danh sach sau khi xoa sinh vien co ma: "+ma);
        else System.out.println("khong co sinh vien co ma: "+ma+"trong danh sach");
        System.out.println("tim mot sinh vien theo ma ");
        System.out.println("nhap 1 ma sinh vien can tim: ");
        System.out.println(timtheoma());
    }
    public static void main(String[] args) {
        Quanlysinhviencongnghevakinhte x= new Quanlysinhviencongnghevakinhte();
        x.docFile("F://sinhvien.txt");
        x.output();
    }

    ArrayList<Sinhvien> getA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
