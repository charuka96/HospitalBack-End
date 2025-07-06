
package edu.icet.controller;
import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
@Slf4j
public class MedicalReportController {

    final MedicalRecordService service;
    @PostMapping("/add-report")
    public void addMedicalReport(@ModelAttribute MedicalReport medicalReport){
        service.addMedicalReport(medicalReport);
        log.info(medicalReport.toString());
    }
    @GetMapping("/get-reports")
    public List<MedicalReport> getMedicalReports(){
       return service.getMedicalRecords();
    }
    @DeleteMapping("/delete-report/{id}")
    public Boolean deleteReport(@PathVariable Integer id){
       return service.deleteRecordById(id);
    }

    @PostMapping("/file-upload")
    public void uploadFile(@RequestPart("file")MultipartFile file){}
}
