package org.example.productmanagement.model.DTO;

public class OfficedbDTO {
    String Ma;
    int dienTich;
    String trangThai;
    int tang;
    String loaiVanPhong;
    long giaChoThue;
    String ngayBatDau;
    String ngayKetThuc;

    public OfficedbDTO() {
    }

    public OfficedbDTO(String ma, int dienTich, String trangThai, int tang, String loaiVanPhong, long giaChoThue, String ngayBatDau, String ngayKetThuc) {
        this.Ma = ma;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.tang = tang;
        this.loaiVanPhong = loaiVanPhong;
        this.giaChoThue = giaChoThue;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getLoaiVanPhong() {
        return loaiVanPhong;
    }

    public void setLoaiVanPhong(String loaiVanPhong) {
        this.loaiVanPhong = loaiVanPhong;
    }

    public long getGiaChoThue() {
        return giaChoThue;
    }

    public void setGiaChoThue(long giaChoThue) {
        this.giaChoThue = giaChoThue;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
