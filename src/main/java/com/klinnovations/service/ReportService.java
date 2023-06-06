package com.klinnovations.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	//@Scheduled(fixedRate = 2000)
	@Scheduled(cron = "0 * * * * *")
	public void generateReport() {
		
		//logic here
		
		System.out.println("Report Generated......");
	}

}
