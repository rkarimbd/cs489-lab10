package cs489.miu.adsapi.service.Imp;

import cs489.miu.adsapi.model.Patient;
import cs489.miu.adsapi.repository.PatientRepository;
import cs489.miu.adsapi.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientserviceImp implements PatientService {

    private PatientRepository patientRepository;

    public PatientserviceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public List<Patient> getAllPatients() {
        return   patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int id) {
        return patientRepository.findById(id).get();

    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);

    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);

    }

    @Override
    public void deletePatient(Integer id) {
        patientRepository.deleteById(id);

    }
}
