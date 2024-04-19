package cs489.miu.adsapi.controller;

import cs489.miu.adsapi.model.Patient;
import cs489.miu.adsapi.service.Imp.PatientserviceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1")
public class PatientController {

    PatientserviceImp patientserviceImp;
    public PatientController(PatientserviceImp patientserviceImp) {
        this.patientserviceImp = patientserviceImp;
    }

    @PostMapping("/patients/new")
    public ResponseEntity< Patient> AddPatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patientserviceImp.addPatient(patient));

    }

    @GetMapping("/patients/list")
    public ResponseEntity< List<Patient>> GetAllPatients(){
        return ResponseEntity.ok(patientserviceImp.getAllPatients());
    }


}
