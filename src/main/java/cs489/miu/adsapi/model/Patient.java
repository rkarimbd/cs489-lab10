package cs489.miu.adsapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer patientid;
    private String firstname;
    private String lastname;
    private String contactno;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="addess_id",unique = true,nullable = true)
    private Address primaryAddress;

}
