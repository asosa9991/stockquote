package com.vijay.stock.stockquote.mock.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;

@ApiModel
@Component
public class MockQuote {
    @JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	private BigDecimal openPrice;
	private BigDecimal closePrice;
	private BigDecimal lowPrice;
	private BigDecimal highPrice;
	private BigInteger volume;

	public MockQuote() {
		super();
	}

	public MockQuote(LocalDate date, BigDecimal openPrice, BigDecimal closePrice, BigDecimal lowPrice,
			BigDecimal highPrice, BigInteger volume) {
		super();
		this.date = date;
		this.openPrice = openPrice;
		this.closePrice = closePrice;
		this.lowPrice = lowPrice;
		this.highPrice = highPrice;
		this.volume = volume;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}

	public BigDecimal getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(BigDecimal highPrice) {
		this.highPrice = highPrice;
	}

	public BigInteger getVolume() {
		return volume;
	}

	public void setVolume(BigInteger volume) {
		this.volume = volume;
	}

}
