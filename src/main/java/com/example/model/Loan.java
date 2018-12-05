package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {
	
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Column(name = "Loan_id")
	private long loan_id;
	@Column(name = "Duration_in_Years")
	private int loan_tenure;
	
	@Column(name = "Loan_Start_Date")
	private String loan_date;
	
	@Column(name = "Interest_Rate")
	private float loan_int;
	
	@Column(name = "Loan_Amount_Taken")
	private long loan_amount;
	
	@Column(name = "Loan_Amount_Repaid")
	private long loan_repaid;
	
	@Column(name = "Loan_Type")
	private String loan_type;
	
	@Id
	@Column(name = "Customer_id")
	private long loan_customer_id;

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public int getLoan_tenure() {
		return loan_tenure;
	}

	public void setLoan_tenure(int loan_tenure) {
		this.loan_tenure = loan_tenure;
	}

	public String getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}

	public float getLoan_int() {
		return loan_int;
	}

	public void setLoan_int(float loan_int) {
		this.loan_int = loan_int;
	}

	public long getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(long loan_amount) {
		this.loan_amount = loan_amount;
	}

	public long getLoan_repaid() {
		return loan_repaid;
	}

	public void setLoan_repaid(long loan_repaid) {
		this.loan_repaid = loan_repaid;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public long getLoan_customer_id() {
		return loan_customer_id;
	}

	public void setLoan_customer_id(long loan_customer_id) {
		this.loan_customer_id = loan_customer_id;
	}

	

	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loan_tenure=" + loan_tenure + ", loan_date=" + loan_date + ", loan_int="
				+ loan_int + ", loan_amount=" + loan_amount + ", loan_repaid=" + loan_repaid + ", loan_type="
				+ loan_type + ", loan_customer_id=" + loan_customer_id + "]";
	}
	
		

}
