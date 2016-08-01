package br.ufal.ic.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	private Calendar logUser;

	@Transient
	private Integer age;

	@Enumerated(EnumType.STRING)
	private Status status;

	private String name;

	//@OneToOne //example 5
	//@OneToOne(cascade=CascadeType.ALL)  //example 5
	//@JoinColumn(name="machineChange_id")  //example 5
	//private Machine machine;//example 5
	
	//@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY) //Exaple 7
	//private List<Machine> machines=new ArrayList<Machine>();

	
	
//	@Embedded //example 3
//	private Adress adress;
	
//	@ElementCollection(fetch=FetchType.EAGER) //example 3
//	private List<Adress> adressList = new ArrayList<Adress>();

	
	
//	public List<Adress> getAdressList() {
//	return adressList;
//	}

//	public void setAdressList(List<Adress> adressList) {
//	this.adressList = adressList;
//	}

	

	public Integer getAge() {
		return age;
	}

//	public List<Machine> getMachines() {
//		return machines;
//	}
//
//	public void setMachines(List<Machine> machines) {
//		this.machines = machines;
//	}

	public Calendar getLogUser() {
		return logUser;
	}

	public void setLogUser(Calendar logUser) {
		this.logUser = logUser;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Machine getMachine() {
//		return machine;
//	}
//
//	public void setMachine(Machine machine) {
//		this.machine = machine;
//	}
	
	
//	public Adress getAdress() {
//		return adress;
//	}
//
//	public void setAdress(Adress adress) {
//		this.adress = adress;
//	}

}
