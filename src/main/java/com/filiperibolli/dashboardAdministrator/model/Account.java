package com.filiperibolli.dashboardAdministrator.model;

public class Account {
	
	private static final int premiumBasquet = 3;
	private static final int classicBasket = 2;
	private static final int basicBasquet = 1;
	private static final int maximumBasicRange = 10;
	private static final int minimumBasicRange = 1;
	private static final int maximumClassicRange = 18;
	private static final int minimumClassicRange = 11;	
	private Integer agencyNumber;
	private Integer accountNumber;

	
	public Account(Integer agencyNumber, Integer accountNumber) {
		this.agencyNumber = agencyNumber;
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the agencyNumber
	 */
	public Integer getAgencyNumber() {
		return agencyNumber;
	}
	/**
	 * @return the accountNumber
	 */
	public Integer getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @return the serviceBasketType
	 *Service basket - 3 different types:
	 *Agency number 1 - 10   | type basic : 1
     *Agency number 11 - 18  | type classic : 2
     *Agency number 19 - 21  | type premium : 3
	 */
	public Integer getServiceBasketType() {
		//Return the correct basket type
		if((this.agencyNumber >= minimumBasicRange) && (this.agencyNumber <= maximumBasicRange)) {
			return basicBasquet;
		}else if ((this.agencyNumber >= minimumClassicRange) && (this.agencyNumber <= maximumClassicRange)) {
			return classicBasket;
		}else {
			return premiumBasquet;
		}
		
	}
	
}
