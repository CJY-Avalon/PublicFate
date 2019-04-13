package com.fateapi.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Servent {
	@Id
	/*@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")*/
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@GeneratedValue(generator = "uuid")
	@Column(length = 36)
	private int ID;
	@Column(length = 36)
	private String Servent_ID;
	@Column(length = 36)
	private String Servent_name;
	@Column(length = 10)
	private int S_LV1_HP;
	@Column(length = 10)
	private int S_LV1_ATK;
	@Column(length = 20)
	private String[] Cards;
	@Column(length = 20)
	private String Skill_1;
	@Column(length = 20)
	private String Skill_1_img;
	@Column(length = 20)
	private String Skill_2;
	@Column(length = 20)
	private String Skill_2_img;
	@Column(length = 20)
	private String Skill_3;
	@Column(length = 20)
	private String Skill_3_img;
	@Column(length = 3)
	private int Start;
	@Column(length = 10)
	private String TPop;
	@Column(length = 100)
	private String Servent_Img;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getServent_ID() {
		return Servent_ID;
	}
	public void setServent_ID(String servent_ID) {
		Servent_ID = servent_ID;
	}
	public String getServent_name() {
		return Servent_name;
	}
	public void setServent_name(String servent_name) {
		Servent_name = servent_name;
	}
	public int getS_LV1_HP() {
		return S_LV1_HP;
	}
	public void setS_LV1_HP(int s_LV1_HP) {
		S_LV1_HP = s_LV1_HP;
	}
	public int getS_LV1_ATK() {
		return S_LV1_ATK;
	}
	public void setS_LV1_ATK(int s_LV1_ATK) {
		S_LV1_ATK = s_LV1_ATK;
	}
	public String[] getCards() {
		return Cards;
	}
	public void setCards(String[] cards) {
		Cards = cards;
	}
	public String getSkill_1() {
		return Skill_1;
	}
	public void setSkill_1(String skill_1) {
		Skill_1 = skill_1;
	}
	public String getSkill_1_img() {
		return Skill_1_img;
	}
	public void setSkill_1_img(String skill_1_img) {
		Skill_1_img = skill_1_img;
	}
	public String getSkill_2() {
		return Skill_2;
	}
	public void setSkill_2(String skill_2) {
		Skill_2 = skill_2;
	}
	public String getSkill_2_img() {
		return Skill_2_img;
	}
	public void setSkill_2_img(String skill_2_img) {
		Skill_2_img = skill_2_img;
	}
	public String getSkill_3() {
		return Skill_3;
	}
	public void setSkill_3(String skill_3) {
		Skill_3 = skill_3;
	}
	public String getSkill_3_img() {
		return Skill_3_img;
	}
	public void setSkill_3_img(String skill_3_img) {
		Skill_3_img = skill_3_img;
	}
	public int getStart() {
		return Start;
	}
	public void setStart(int start) {
		Start = start;
	}
	public String getTPop() {
		return TPop;
	}
	public void setTPop(String tPop) {
		TPop = tPop;
	}
	public String getServent_Img() {
		return Servent_Img;
	}
	public void setServent_Img(String servent_Img) {
		Servent_Img = servent_Img;
	}

	
	
}
