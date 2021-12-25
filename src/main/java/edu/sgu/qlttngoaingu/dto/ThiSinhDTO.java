package edu.sgu.qlttngoaingu.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ThiSinhDTO {
    private Integer sinhVienId;
    @NotNull
    private String hoTen;
    @NotNull
    private Date ngaySinh;
    @NotNull
    private String noiSinh;
    @Pattern(regexp="(^$|[0-9]{12})",message = "invalid phone number")
    private String soCmnd;
    @Pattern(regexp="(^$|[0-9]{10})",message = "invalid phone number")
    private String soDienThoai;
    @Email(message = "invalid email")
    private String email;
}
