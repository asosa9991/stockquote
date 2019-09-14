package com.vijay.stock.stockquote.mock.model;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Component
@ApiModel
public class MockQuoteRequest {
	
	@NotNull(message = "Please provide a valid startDate with pattern = yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
	@ApiModelProperty(value = "Please provide a valid startDate with pattern = yyyy-MM-dd",required = true )
	private LocalDate startDate;
	
	@NotNull(message = "Please provide a valid numOfDays")
	@Min(value = 1)
	@ApiModelProperty(value = "Please provide a valid numOfDays", required = true )
	private Integer numOfDays;
	
	@NotEmpty(message = "Please provide a ticker")
	@ApiModelProperty(value = "Please provide a ticker", required = true, example = "AAPL" )
	private String ticker;

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Integer getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(Integer numOfDays) {
		this.numOfDays = numOfDays;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	


}
