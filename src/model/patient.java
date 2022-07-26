/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

public class patient {
    private String maBN;
    private String hoTen;
    private String tenKhoa;
    private String diaChi;
    private String gioiTinh;
    private String sdt;
    private String benh;
    private Date ngayNhap;
    private Date nhayXuat;
    private String lichSuNhapVien; 
    public patient() {
    }

    public patient(String maBN, String hoTen, String tenKhoa, String diaChi, String gioiTinh, String sdt, String benh, Date ngayNhap, Date nhayXuat, String lichSuNhapVien) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.tenKhoa = tenKhoa;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.benh = benh;
        this.ngayNhap = ngayNhap;
        this.nhayXuat = nhayXuat;
        this.lichSuNhapVien = lichSuNhapVien;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getBenh() {
        return benh;
    }

    public void setBenh(String benh) {
        this.benh = benh;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getNhayXuat() {
        return nhayXuat;
    }

    public void setNhayXuat(Date nhayXuat) {
        this.nhayXuat = nhayXuat;
    }

    public String getLichSuNhapVien() {
        return lichSuNhapVien;
    }

    public void setLichSuNhapVien(String lichSuNhapVien) {
        this.lichSuNhapVien = lichSuNhapVien;
    }

    @Override
    public String toString() {
        return hoTen + " "+ ngayNhap+" "+ nhayXuat +" "+benh ; 
    }
    
    
}
