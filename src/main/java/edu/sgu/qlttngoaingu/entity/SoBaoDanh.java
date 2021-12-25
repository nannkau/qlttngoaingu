package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "so_bao_danh")
@Data
public class SoBaoDanh {
    @Id
    @Column(name = "so_bao_danh")
    private String soBaoDanhId;
    @ManyToOne
    @JoinColumn(name = "thi_sinh_id", referencedColumnName = "thi_sinh_id")
    private ThiSinh thiSinh;
}
