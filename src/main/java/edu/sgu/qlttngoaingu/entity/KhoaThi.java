package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "khoa_thi")
@Data
public class KhoaThi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "khoa_thi_id")
    private Integer ki_thi_id;
    @Column(name = "ten_ki_thi")
    private String tenKiThi;
    @Column(name = "ngay_thi")
    private Date ngayThi;
}
