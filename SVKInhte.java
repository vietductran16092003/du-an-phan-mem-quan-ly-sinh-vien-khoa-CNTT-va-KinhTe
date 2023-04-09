/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienCNTTvaKinhTe;

/**
 *
 * @author Tran Viet Duc
 */
public class SVKInhte extends Sinhvien{
    public double NLKT,MARKET;

    public SVKInhte(double NLKT, double MARKET, String ma, String hoten, boolean gioitinh) {
        super(ma, hoten, gioitinh);
        this.NLKT = NLKT;
        this.MARKET = MARKET;
    }

    public double getNLKT() {
        return NLKT;
    }

    public void setNLKT(double NLKT) {
        this.NLKT = NLKT;
    }

    public double getMARKET() {
        return MARKET;
    }

    public void setMARKET(double MARKET) {
        this.MARKET = MARKET;
    }
    @Override
    public double tinhDTB(){
        return (getMARKET()+getNLKT()+getNLKT())/3;
    }
    @Override
    public  String getXepLoai(){
        if(tinhDTB()<3.5) return "kem";
        if(tinhDTB()<5) return "yeu";
        if(tinhDTB()<6.5) return "trung binh";
        if(tinhDTB()<8) return "kha";
        if(tinhDTB()<9) return "gioi";
        return "xuat xac";
    }
    @Override
    public String toString() {
        return "SVKInhte"+super.toString() + "NLKT=" + NLKT + ", MARKET=" + MARKET + '}';
    }
    public static void main(String[] args) {
        SVKInhte x= new SVKInhte(4, 5, "001", "tran viet duc^", true);
        System.out.println(x);
    }
}
