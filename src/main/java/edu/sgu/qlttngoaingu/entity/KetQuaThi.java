package edu.sgu.qlttngoaingu.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ket_qua_thi")
public class KetQuaThi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ket_qua_thi")
    private Integer ketQuaThiId;
    @Column(name = "nghe")
    private Float nghe;
    @Column(name = "noi")
    private Float noi;
    @Column(name = "doc")
    private Float doc;
    @Column(name = "viet")
    private Float viet;
    @Column(name = "trung_binh")
    private Float trungBinh;
    @Column(name = "xep_loai")
    private String xeploai;
    @ManyToOne
    @JoinColumn(name = "thi_sinh_id", referencedColumnName = "thi_sinh_id")
    private ThiSinh thiSinh;

    public Integer getKetQuaThiId() {
        return ketQuaThiId;
    }

    public void setKetQuaThiId(Integer ketQuaThiId) {
        this.ketQuaThiId = ketQuaThiId;
    }

    public Float getNghe() {
        return nghe;
    }

    public void setNghe(Float nghe) {
        this.nghe = nghe;
    }

    public Float getNoi() {
        return noi;
    }

    public void setNoi(Float noi) {
        this.noi = noi;
    }

    public Float getDoc() {
        return doc;
    }

    public void setDoc(Float doc) {
        this.doc = doc;
    }

    public Float getTrungBinh() {
        return trungBinh;
    }

    public void setTrungBinh(Float trungBinh) {
        this.trungBinh = trungBinh;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
}
