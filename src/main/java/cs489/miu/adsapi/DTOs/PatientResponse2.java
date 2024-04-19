package cs489.miu.adsapi.DTOs;



public record PatientResponse2(
         Integer patientid,
         String firstname,
         String lastname,
         String contactno,
         AddressResponse2 addressResponse

)
{
}
