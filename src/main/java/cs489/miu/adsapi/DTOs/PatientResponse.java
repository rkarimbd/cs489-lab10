package cs489.miu.adsapi.DTOs;



public record PatientResponse (
         Integer patientid,
         String firstname,
         String lastname,
         AddressResponse addressResponse

)
{
}
