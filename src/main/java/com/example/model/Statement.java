package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banking_transactions")
public class Statement {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Transaction_id")
	private long tran_id;
	
	@Column(name = "Date")
	private String tran_date;
	
	@Column(name = "Transaction_Type")
	private String tran_type;
	
	@Column(name = "Description")
	private String tran_desc;
	
	@Column(name = "Amount")
	private int tran_amt;
	
	@Id
	@Column(name = "Customer_id")
	private long tran_cust_id;
	
	@Column(name = "Current_Bal")
	private int tran_curr_bal;
	
	
	public Statement() {
		super();
}
		
	public Statement(long tran_id, String tran_date, String tran_type, String tran_desc, int tran_amt, long tran_cust_id,
			int tran_curr_bal) {
		super();
		this.tran_id = tran_id;
		this.tran_date = tran_date;
		this.tran_type = tran_type;
		this.tran_desc = tran_desc;
		this.tran_amt = tran_amt;
		this.tran_cust_id = tran_cust_id;
		this.tran_curr_bal = tran_curr_bal;
	}

	public long getTran_id() {
		return tran_id;
	}
	public void setTran_id(long tran_id) {
		this.tran_id = tran_id;
	}
	public String getTran_date() {
		return tran_date;
	}
	public void setTran_date(String tran_date) {
		this.tran_date = tran_date;
	}
	public String getTran_type() {
		return tran_type;
	}
	public void setTran_type(String tran_type) {
		this.tran_type = tran_type;
	}
	public String getTran_desc() {
		return tran_desc;
	}
	public void setTran_desc(String tran_desc) {
		this.tran_desc = tran_desc;
	}
	public int getTran_amt() {
		return tran_amt;
	}
	public void setTran_amt(int tran_amt) {
		this.tran_amt = tran_amt;
	}
	public long getTran_cust_id() {
		return tran_cust_id;
	}
	public void setTran_cust_id(int tran_cust_id) {
		this.tran_cust_id = tran_cust_id;
	}
	public int getTran_curr_bal() {
		return tran_curr_bal;
	}
	public void setTran_curr_bal(int tran_curr_bal) {
		this.tran_curr_bal = tran_curr_bal;
	}
	
	
	

}
