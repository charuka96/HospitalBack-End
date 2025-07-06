package edu.icet.service;

import edu.icet.dto.MedicalReport;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalReport> getMedicalRecords();
    Boolean deleteRecordById(Integer id);
    void addMedicalReport(MedicalReport medicalReport);
}