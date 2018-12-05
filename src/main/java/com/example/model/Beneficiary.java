package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {
	
	
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Ben_Id")
	private long ben_id;
	
	@Column(name = "Ben_Name")
	//@NotEmpty(message = "*please provide an beneficiary name")
	private String ben_name;
	

	@Column(name = "Ben_Account")
	private long ben_account;
	
	@Column(name = "Ben_Bank")
	private String ben_bank;
	
	@Column(name = "Ben_Address")
	private String ben_address;
	
	@Column(name = "Ben_Contact")
	private String ben_contact;
	
	@Column(name = "Ben_Email")
	private String ben_email;
	
	@Id
	@Column(name = "Ben_Cust_Id")
	private long ben_cust_id;
	
	public long getBen_id() {
		return ben_id;
	}
	public void setBen_id(int ben_id) {
		this.ben_id = ben_id;
	}
	
	public String getBen_name() {
		return ben_name;
	}
	public void setBen_name(String ben_name) {
		this.ben_name = ben_name;
	}

	public long getBen_account() {
		return ben_account;
	}
	public void setBen_account(long ben_account) {
		this.ben_account = ben_account;
	}
	
	public String getBen_bank() {
		return ben_bank;
	}
	public void setBen_bank(String ben_bank) {
		this.ben_bank = ben_bank;
	}
	
	public String getBen_address() {
		return ben_address;
	}
	public void setBen_address(String ben_address) {
		this.ben_address = ben_address;
	}
	public String getBen_contact() {
		return ben_contact;
	}
	public void setBen_contact(String ben_contact) {
		this.ben_contact = ben_contact;
	}
	public String getBen_email() {
		return ben_email;
	}
	public void setBen_email(String ben_email) {
		this.ben_email = ben_email;
	}
	public long getBen_cust_id() {
		return ben_cust_id;
	}
	public void setBen_cust_id(long ben_cust_id) {
		this.ben_cust_id = ben_cust_id;
	}
	@Override
	public String toString() {
		return "Beneficiary [ben_id=" + ben_id + ", ben_name=" + ben_name + ", ben_account=" + ben_account
				+ ", ben_bank=" + ben_bank + ", ben_address=" + ben_address + ", ben_contact=" + ben_contact
				+ ", ben_email=" + ben_email + ", ben_cust_id=" + ben_cust_id + "]";
	}
	
	public Beneficiary(long ben_id, String ben_name, long ben_account, String ben_bank, String ben_address, String ben_contact, String ben_email,
			long ben_cust_id) {
		super();
		this.ben_id = ben_id;
		this.ben_name = ben_name;
		this.ben_account = ben_account;
		this.ben_bank = ben_bank;
		this.ben_address = ben_address;
		this.ben_contact = ben_contact;
		this.ben_email = ben_email;
		this.ben_cust_id = ben_cust_id;
	}
	
		
	

}
