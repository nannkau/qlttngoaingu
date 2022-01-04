package edu.sgu.qlttngoaingu.service;

import edu.sgu.qlttngoaingu.entity.KhoaThi;
import edu.sgu.qlttngoaingu.repository.KhoaThiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaThiService {
    @Autowired
    private KhoaThiRepository khoaThiRepository;
    public List<KhoaThi> getAll(){
        return khoaThiRepository.findAll();
    }
}
