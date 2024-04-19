package cs489.miu.adsapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer addressid;
    private String street;
    private String city;
    private String state;
    private String zip;

    @OneToOne(mappedBy = "primaryAddress")
    private  Patient patient;
}
