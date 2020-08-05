package com.centralbank.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_ac")
public class Account {
	
	public Account() {
		super();
	}

	@Column(name = "accountId")
	private long ac_id;
	
	@Column(name = "accNo")
	private long ac_no;

	@Id
	@Column(name = "Customer_id")
	private int cust_id;

	public long getAc_id() {
		return ac_id;
	}

	public void setAc_id(long ac_id) {
		this.ac_id = ac_id;
	}

	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Override
	public String toString() {
		return "Account [ac_id=" + ac_id + ", ac_no=" + ac_no + ", cust_id=" + cust_id + "]";
	}

	public Account(long ac_id, long ac_no, int cust_id) {
		super();
		this.ac_id = ac_id;
		this.ac_no = ac_no;
		this.cust_id = cust_id;
	}

	
	
	
}
