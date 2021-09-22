package com.example.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int roll_no;
		
		@Column
		private String name;
		@Column
		private String address;
		@Column
		private int contact;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int roll_no, String name, String address, int contact) {
			super();
			this.roll_no = roll_no;
			this.name = name;
			this.address = address;
			this.contact = contact;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getContact() {
			return contact;
		}
		public void setContact(int contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Student [roll_no=" + roll_no + ", name=" + name + ", address=" + address + ", contact=" + contact
					+ "]";
		}
		
		
		
		

}
