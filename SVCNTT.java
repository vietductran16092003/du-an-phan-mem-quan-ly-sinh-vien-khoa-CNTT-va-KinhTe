/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienCNTTvaKinhTe;

/**
 *
 * @author Tran Viet Duc
 */
public class SVCNTT extends Sinhvien{
    private double java, css,html;

    public SVCNTT(double java, double css, double html, String ma, String hoten, boolean gioitinh) {
        super(ma, hoten, gioitinh);
        this.java = java;
        this.css = css;
        this.html = html;
    }


    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }
    @Override
    public double tinhDTB(){
        return (getJava()+getJava()+getCss()+getHtml())/4;
    }
    @Override
    public String getXepLoai(){
        if(tinhDTB()<3.5) return "kem";
        if(tinhDTB()<5) return "yeu";
        if(tinhDTB()<6.5) return "trung binh";
        if(tinhDTB()<8) return "kha";
        if(tinhDTB()<9) return "gioi";
        return "xuat xac";
    }

    @Override
    public String toString() {
        return "SVCNTT"+super.toString() + "java=" + java + ", css=" + css + ", html=" + html + '}';
    }
    public static void main(String[] args) {
        SVCNTT x= new SVCNTT(5, 6, 7, "001", "Tran Viet Duc", true);
        System.out.println(x);
    }
}
