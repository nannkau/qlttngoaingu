package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ca_thi")
@Data
public class CaThi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ca_thi_id")
    private Integer idCaThi;
    @Column(name = "gio_thi")
    private Date gioThi;
    @OneToMany(mappedBy = "caThi")
    private List<PhongThi> phongThis;
}
