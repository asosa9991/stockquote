package com.vijay.stock.stockquote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.stock.stockquote.mock.model.MockQuote;
import com.vijay.stock.stockquote.mock.model.MockQuoteRequest;
import com.vijay.stock.stockquote.mock.utils.GeneratorUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@Api(description = "MockQuote API", tags = "MockQuote" )
public class MockQuoteController {
	
	@Autowired
	GeneratorUtils generatorUtils;
	
	@ApiOperation(value = "Returns list of mock quotes", authorizations = {@Authorization(value = "basicAuth")})
	@PostMapping(path = "/mockquote")
	public List<MockQuote> mockQuote(@RequestBody MockQuoteRequest mockQuoteRequest){
		return generatorUtils.generateMockQuotes(mockQuoteRequest.getStartDate(), mockQuoteRequest.getNumOfDays());
	}

}
