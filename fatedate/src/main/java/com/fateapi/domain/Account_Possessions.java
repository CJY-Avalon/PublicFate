package com.fateapi.domain;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;
import java.util.List;

@Entity
public class Account_Possessions {
	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(length = 36)
	private String ID;
	@Column(length = 30)
	private String UserID;
	@Column(length = 30)
	private String UserName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID")
/*	@Column(length = 30)*/
	private List<Servent_Possessions> Servent_get;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID")
	/*@Column(length = 30)*/
	private List<Rtiuial_Possessions> Rtiuial_Get;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public List<Servent_Possessions> getServent_get() {
		return Servent_get;
	}
	public void setServent_get(List<Servent_Possessions> servent_get) {
		Servent_get = servent_get;
	}
	public List<Rtiuial_Possessions> getRtiuial_Get() {
		return Rtiuial_Get;
	}
	public void setRtiuial_Get(List<Rtiuial_Possessions> rtiuial_Get) {
		Rtiuial_Get = rtiuial_Get;
	}
	
	
	
}
