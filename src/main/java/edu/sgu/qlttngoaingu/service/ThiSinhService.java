package edu.sgu.qlttngoaingu.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sgu.qlttngoaingu.dto.ThiSinhDTO;
import edu.sgu.qlttngoaingu.entity.ThiSinh;
import edu.sgu.qlttngoaingu.repository.ThiSinhRepository;

@Service
public class ThiSinhService {
    @Autowired
    private ThiSinhRepository thiSinhRepository;
    public ThiSinhDTO add(ThiSinhDTO thiSinhDTO){
        ModelMapper mapper = new ModelMapper();
        ThiSinh thiSinh = mapper.map(thiSinhDTO, ThiSinh.class);
        ThiSinh result = thiSinhRepository.save(thiSinh);
        return mapper.map(result, ThiSinhDTO.class);
    }
    public ThiSinhDTO getById(Integer id){
        Optional<ThiSinh> thiSinh= thiSinhRepository.findById(id);
        if(thiSinh.isPresent()){
            ModelMapper mapper = new ModelMapper();
            return mapper.map(thiSinh.get(), ThiSinhDTO.class);
        }
        return null;
    }
}
