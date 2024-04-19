package cs489.miu.adsapi.DTOs;

public record AddressResponse2(
         Integer addressid,
         String street,
         String city,
         String state,
         String zip,
         PatientResponse2  patientResponse2

) {
}
