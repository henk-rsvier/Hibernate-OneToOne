package rsvier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Baas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false, length=30)
	private String naam;
	@OneToOne
	private Hond hond;
	
	public void setHond(Hond hond) {
		this.hond = hond;
	}

	public Baas() {}
	
	public Baas(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Baas [id=" + id + ", naam=" + naam + ", hond=" + hond + "]";
	}

}
