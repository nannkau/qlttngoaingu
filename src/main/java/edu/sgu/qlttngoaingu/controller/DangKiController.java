package edu.sgu.qlttngoaingu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.sgu.qlttngoaingu.dto.ThiSinhDTO;
import edu.sgu.qlttngoaingu.service.ThiSinhService;

@Controller
public class DangKiController {
    @Autowired
    private ThiSinhService thiSinhService;
    @RequestMapping(value = "/dang-ky.html")
    public String add(Model model){
        ThiSinhDTO thiSinhDTO= new ThiSinhDTO();
        model.addAttribute("thiSinhDTO",thiSinhDTO);
        return "dang-ky";
    }
    @RequestMapping(value = "/dang-ky.html",method = RequestMethod.POST)
    public String add(@Valid ThiSinhDTO thiSinhDTO, BindingResult result){
        if (result.hasErrors()) {
            return "dang-ky";
        }
        else {
           ThiSinhDTO dto= thiSinhService.add(thiSinhDTO);
           return "redirect:/thisinh/"+dto.getSinhVienId();
        }
       
    } 
    @RequestMapping(value = "/thisinh/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        ThiSinhDTO dto= thiSinhService.getById(id);
        model.addAttribute("thiSinh",dto);
        return "dang-ky-thanh-cong";
    }
}
