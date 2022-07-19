package internet.banking.cliente.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "planExclusive")
    private Boolean planExclusive;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "numberAccount")
    private Number numberAccount;

    @Column(name = "dateBirth")
    private Date dateBirth;
}
