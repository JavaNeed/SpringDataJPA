package com.coderevisited.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Stock")
public class Stock {
	@Id
	@GeneratedValue
	@Column(name="stockId")
	private Integer stockId;

	@Column(name="stockCode")
	private String stockCode;

	@Column(name="stockName")
	private String stockName;

	@Column(name="stockAddress")
	private String stockAddress;
	
	public Stock() {}
	
	public Stock(String stockCode, String stockName, String stockAddress) {
		super();
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockAddress = stockAddress;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockAddress() {
		return stockAddress;
	}

	public void setStockAddress(String stockAddress) {
		this.stockAddress = stockAddress;
	}
}
