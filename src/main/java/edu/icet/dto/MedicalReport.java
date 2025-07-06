package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.File;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalReport {
    private Integer id;
    private String pdfSrc;
    private LocalDate dateTime;
    private Integer patientId;
    private File file;
}
