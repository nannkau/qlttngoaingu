package edu.sgu.qlttngoaingu.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import edu.sgu.qlttngoaingu.dto.DangKiForm;
import edu.sgu.qlttngoaingu.entity.KhoaThi;
import edu.sgu.qlttngoaingu.entity.PhieuDangKy;
import edu.sgu.qlttngoaingu.entity.PhieuDangKyId;
import edu.sgu.qlttngoaingu.repository.KhoaThiRepository;
import edu.sgu.qlttngoaingu.repository.PhieuDangKyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sgu.qlttngoaingu.entity.ThiSinh;
import edu.sgu.qlttngoaingu.repository.ThiSinhRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ThiSinhService {
    @Autowired
    private ThiSinhRepository thiSinhRepository;
    @Autowired
    private PhieuDangKyRepository phieuDangKyRepository;

    @Transactional
    public void dangKy(DangKiForm dangKiForm){
        ThiSinh thiSinh= new ThiSinh();
        thiSinh.setNgaySinh(stringToDate(dangKiForm.getNgaySinh()));
        thiSinh.setCmnd(dangKiForm.getCmnd());
        thiSinh.setEmail(dangKiForm.getEmail());
        thiSinh.setHoTen(dangKiForm.getHoTen());
        thiSinh.setSoDienThoai(dangKiForm.getSoDienThoai());
        ThiSinh result= thiSinhRepository.save(thiSinh);
        PhieuDangKy dangKy= new PhieuDangKy();
        dangKy.setNgayDangKy(new Date());
        dangKy.setTrinhDo(dangKiForm.getTrinhDo());
        PhieuDangKyId phieuDangKyId= new PhieuDangKyId();
        phieuDangKyId.setThiSinhId(result.getThiSinhId());
        phieuDangKyId.setKhoaThiId(dangKiForm.getKhoaThiId());
        dangKy.setId(phieuDangKyId);
        phieuDangKyRepository.save(dangKy);
    }
    private Date stringToDate(String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate;
        try {
            startDate = df.parse(date);
            return startDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
