package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "phong_thi")
@Data
public class PhongThi {
    @Id
    @Column(name = "phong_thi_id")
    private String phongThiId;
    @Column(name = "ten_phong_thi")
    private String tenPhongThi;
    @ManyToMany(mappedBy = "phongThis")
    private List<ThiSinh> thiSinhs ;
    @ManyToOne
    @JoinColumn(name = "ca_thi_id",referencedColumnName = "ca_thi_id")
    private CaThi caThi;

}
