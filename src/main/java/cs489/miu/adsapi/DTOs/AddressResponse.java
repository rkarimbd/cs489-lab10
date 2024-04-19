package cs489.miu.adsapi.DTOs;

public record AddressResponse(
         Integer addressid,
         String street,
         String city,
         String state,
         String zip

) {
}
