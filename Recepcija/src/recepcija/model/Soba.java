package recepcija.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

/**
 *
 * @author Petar
 */
@Entity
@Table
public class Soba extends Entitet implements Serializable {

    
    @Column(columnDefinition = "boolean")
    private boolean telefon;
     @Column(columnDefinition = "boolean")
    private boolean internet;
    private int brojLezaja;
    private int kat;
    private int brojObroka;
    private String BrojSobe;

    public String getBrojSobe() {
        return BrojSobe;
    }

    public void setBrojSobe(String BrojSobe) {
        this.BrojSobe = BrojSobe;
    }

    @OneToMany(mappedBy = "soba")
    private List<Rezervacija> rezervacije = new ArrayList<>();

    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    public void setRezervacije(List<Rezervacija> rezervacije) {
        this.rezervacije = rezervacije;
    }

    public boolean isTelefon() {
        return telefon;
    }

    public void setTelefon(boolean telefon) {
        this.telefon = telefon;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    

    public int getBrojLezaja() {
        return brojLezaja;
    }

    public void setBrojLezaja(int brojLezaja) {
        this.brojLezaja = brojLezaja;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public int getBrojObroka() {
        return brojObroka;
    }

    public void setBrojObroka(int brojObroka) {
        this.brojObroka = brojObroka;
    }

    @Override
    public String toString() {
        return getKat() + getBrojSobe();
    }
}
