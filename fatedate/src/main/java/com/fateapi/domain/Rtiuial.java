package com.fateapi.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rtiuial {
	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(length = 36)
	private int id;
	@Column(length = 30)
	private String RtiuialID;
	@Column(length = 30)
	private int R_LV1_HP;
	@Column(length = 30)
	private int R_LV_1_ATK;
	@Column(length = 300)
	private String RtiuialDescribe;
	@Column(length = 30)
	private String RtiuialName;
	@Column(length = 3)
	private int Start;
	@Column(length = 100)
	private String Rtiuial_Img;

	public int getId() {
		return id;
	}

	public String getRtiuialID() {
		return RtiuialID;
	}

	public int getR_LV1_HP() {
		return R_LV1_HP;
	}

	public int getR_LV_1_ATK() {
		return R_LV_1_ATK;
	}

	public String getRtiuialDescribe() {
		return RtiuialDescribe;
	}

	public String getRtiuialName() {
		return RtiuialName;
	}

	public int getStart() {
		return Start;
	}

	public String getRtiuial_Img() {
		return Rtiuial_Img;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRtiuialID(String rtiuialID) {
		RtiuialID = rtiuialID;
	}

	public void setR_LV1_HP(int r_LV1_HP) {
		R_LV1_HP = r_LV1_HP;
	}

	public void setR_LV_1_ATK(int r_LV_1_ATK) {
		R_LV_1_ATK = r_LV_1_ATK;
	}

	public void setRtiuialDescribe(String rtiuialDescribe) {
		RtiuialDescribe = rtiuialDescribe;
	}

	public void setRtiuialName(String rtiuialName) {
		RtiuialName = rtiuialName;
	}

	public void setStart(int start) {
		Start = start;
	}

	public void setRtiuial_Img(String rtiuial_Img) {
		Rtiuial_Img = rtiuial_Img;
	}
}
