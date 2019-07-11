package com.cg.ikea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Card_Number_T")
public class GiftCards {

	@Id
	@Column(name = "card_number_id")
	private int cardNumberId;

	@Column(name = "issuer")
	private String issuer;

	@Column(name = "card_type_digit")
	private String cardTypeDigit;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "check_digit")
	private String checkDigit;

	@Column(name = "verification_code")
	private String verificationCode;

	public int getCardNumberId() {
		return cardNumberId;
	}

	public void setCardNumberId(int cardNumberId) {
		this.cardNumberId = cardNumberId;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getCardTypeDigit() {
		return cardTypeDigit;
	}

	public void setCardTypeDigit(String cardTypeDigit) {
		this.cardTypeDigit = cardTypeDigit;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

}
