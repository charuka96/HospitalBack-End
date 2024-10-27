package edu.icet.controller;

import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {

    final MedicalRecordService service;
    @PostMapping("/add-report")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport){
        service.addMedicalReport(medicalReport);
    }
}
