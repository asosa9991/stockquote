package com.vijay.stock.stockquote.mock.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.vijay.stock.stockquote.mock.model.MockQuote;

@Component
public class GeneratorUtils {
	
	public List<MockQuote> generateMockQuotes(LocalDate startDate, Integer pastDays) {
		
		return IntStream.range(0, pastDays).parallel().mapToObj(dayCtr ->{
			return new MockQuote(startDate.minusDays(dayCtr), generateRandomPrice(100, 200),
					generateRandomPrice(50, 200), generateRandomPrice(50, 100), generateRandomPrice(100, 200),
					generateRandomVolume());
		}).collect(Collectors.toList());
	}

	private BigDecimal generateRandomPrice(double min, double max) {
		return new BigDecimal(new Random().doubles(1, min, max).findFirst().getAsDouble()).setScale(2,
				RoundingMode.HALF_UP);
	}

	private BigInteger generateRandomVolume() {
		return new BigInteger(Long.toString(new Random().longs(1, 1000000, 5000000).findFirst().getAsLong()));
	}

}
