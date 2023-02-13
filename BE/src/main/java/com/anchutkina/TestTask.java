package com.anchutkina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/currency")
public class TestTask {

	private final CurrencyRepository currencyRepository;
	private final RestTemplate restTemplate;

	public TestTask(CurrencyRepository currencyRepository, RestTemplateBuilder restTemplateBuilder) {
		this.currencyRepository = currencyRepository;
		this.restTemplate = restTemplateBuilder.build();
	}


	public static void main(String[] args) {
		SpringApplication.run(TestTask.class, args);
	}

	@GetMapping
	@CrossOrigin
	public List<Currency> getCurrency(@RequestParam(value="usedb") boolean usedb) {

		if (usedb == true) {
			return currencyRepository.findAll();
		}

		else {
			this.currencyRepository.deleteAll();
			String url = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e";
			Currency[] currencies = this.restTemplate.getForObject(url, Currency[].class);
			this.currencyRepository.saveAll(Arrays.asList(currencies));
			return Arrays.asList(currencies);
		}
	}

}

