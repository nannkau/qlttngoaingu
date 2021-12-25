package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "thi_sinh")
@Data
public class ThiSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "thi_sinh_id")
    private Integer sinhVienId;
    @Column(name = "ho_ten")
    private String hoTen;
    @Column(name = "ngay_sinh")
    private Date ngaySinh;
    @Column(name = "noi_sinh")
    private String noiSinh;
    @Column(name = "so_cmnd")
    private String soCmnd;
    @Column(name = "so_dien_thoai")
    private String soDienThoai;
    @Column(name = "email")
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "danh_sach_phong_thi",
            joinColumns = @JoinColumn(name = "thi_sinh_id"),
            inverseJoinColumns = @JoinColumn(name = "phong_thi_id")
    )
    private List<PhongThi> phongThis;
    @OneToMany(mappedBy = "thiSinh")
    private  List<SoBaoDanh> soBaoDanhs;
    @OneToMany(mappedBy = "thiSinh")
    private List<KetQuaThi> ketQuaThis;
}
