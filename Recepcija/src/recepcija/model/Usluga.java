package recepcija.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table
public class Usluga extends Entitet implements Serializable {

    private String vrstaUsluge;
    private BigDecimal cijena;

    

    public String getVrstaUsluge() {
        return vrstaUsluge;
    }

    public void setVrstaUsluge(String vrstaUsluge) {
        this.vrstaUsluge = vrstaUsluge;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

}
