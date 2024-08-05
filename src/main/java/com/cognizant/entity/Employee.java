package com.cognizant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int associate_id;
		
		private String name;
		@Column(unique=true)
		private String phoneNo;
		
		private String address;
		
		private String DOB;

		public int getAssociate_id() {
			return associate_id;
		}

		public void setAssociate_id(int associate_id) {
			this.associate_id = associate_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDOB() {
			return DOB;
		}

		public void setDOB(String dOB) {
			DOB = dOB;
		}

		public Employee(int associate_id, String name, String phoneNo, String address, String dOB) {
			super();
			this.associate_id = associate_id;
			this.name = name;
			this.phoneNo = phoneNo;
			this.address = address;
			DOB = dOB;
		}

		public Employee() {
			super();
		}
		
		
		
		
}
