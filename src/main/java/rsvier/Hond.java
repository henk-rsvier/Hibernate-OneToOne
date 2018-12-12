package rsvier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hond {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(mappedBy="hond")
	private Baas baas;

	public void setBaas(Baas baas) {
		this.baas = baas;
	}

	@Override
	public String toString() {
		return "Hond [id=" + id + "]";
	}
	
	
}
