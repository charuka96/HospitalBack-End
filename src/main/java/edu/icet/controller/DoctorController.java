package edu.icet.controller;

import edu.icet.dto.Doctor;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
@CrossOrigin
public class DoctorController {
    private  final DoctorService doctorService;
    public void addDoctor(Doctor doctor){

    }
}
