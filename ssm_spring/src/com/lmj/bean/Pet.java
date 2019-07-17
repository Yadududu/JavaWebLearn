package com.lmj.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Pet {
	//�������� è ��
	private String petType;
	//�������ɫ
	private String color;
	
	public String getPetType() {
		return petType;
	}
	@Value("�ӷ�è")
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getColor() {
		return color;
	}
	@Value("����ɫ")
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", color=" + color + "]";
	}
	
}
