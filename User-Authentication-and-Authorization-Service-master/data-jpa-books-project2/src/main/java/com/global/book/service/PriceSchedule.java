package com.global.book.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
public class PriceSchedule {

	Logger logger=LoggerFactory.getLogger(PriceSchedule.class);
//	@Scheduled(fixedRate = 2000)
	@SchedulerLock(name = "bookComputePrice")
	@Async
	public void computePrice() throws InterruptedException{
//		Thread.sleep(4000);
		logger.info("computePrice IS succased" + LocalDateTime.now());
		
	}
	
}
