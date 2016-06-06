package model;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adress_user")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_adress")
	private Long id;
	private String nameAdress;
	private String street;
	@Size(min = 1, max = 10)
	private int number;
	private String complement;
	@Size(min = 8, max = 8)
	private int zipCode;
	private String city;
	private State State;

	public Adress() {
	}

	public Adress(Long id, String nameAdress, String street, int number, String complement, int zipCode, String city,
			model.State state) {
		super();
		this.id = id;
		this.nameAdress = nameAdress;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.zipCode = zipCode;
		this.city = city;
		State = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameAdress() {
		return nameAdress;
	}

	public void setNameAdress(String nameAdress) {
		this.nameAdress = nameAdress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", nameAdress=" + nameAdress + ", street=" + street + ", number=" + number
				+ ", complement=" + complement + ", zipCode=" + zipCode + ", city=" + city + ", State=" + State + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((complement == null) ? 0 : complement.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nameAdress == null) ? 0 : nameAdress.hashCode());
		result = prime * result + number;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adress other = (Adress) obj;
		if (State != other.State)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (complement == null) {
			if (other.complement != null)
				return false;
		} else if (!complement.equals(other.complement))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameAdress == null) {
			if (other.nameAdress != null)
				return false;
		} else if (!nameAdress.equals(other.nameAdress))
			return false;
		if (number != other.number)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}
}