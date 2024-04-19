package cs489.miu.adsapi.service;


import cs489.miu.adsapi.model.Patient;

import java.util.List;


public interface PatientService {


    public List<Patient> getAllPatients() ;

    public  Patient getPatientById(int id) ;

    public Patient addPatient(Patient patient) ;

    public  Patient updatePatient(Patient patient) ;

    public  void deletePatient(Integer id) ;



}
