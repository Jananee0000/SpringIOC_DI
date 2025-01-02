
//Program to demonstrate setter based injection using XML Configuration


package com.springxml.app;

import java.util.Map;

public class GoldRateInfo {
	
	private Map<Integer,Double> rateInfo;
	
	public Map<Integer, Double> getRateInfo(){
		return rateInfo;
	}

	public void setRateInfo(Map<Integer, Double> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	//calculate gold rate
	public double calculateGoldRate(int goldCarat,double grams) throws InvalidCaratException {

		if(goldCarat==18||goldCarat==22||goldCarat==24) {
			
			
			double totalRate=0.0;
			double rate =this.getRateInfo().get(goldCarat);
			totalRate=rate*grams;
			return totalRate;
			
			
		}else {
			throw new InvalidCaratException("Invalid carat value, please enter 18 or 22 or 24 value");
			
		}
		
		
			
	}

}
