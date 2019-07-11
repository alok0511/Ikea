package com.cg.ikea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreGiftCards {

	public static void main(String[] args) throws IOException {

		FileInputStream fstream = new FileInputStream("C:\\Users\\shash\\Downloads\\SELP_load.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		String cardNumber, verifyCode;
		String issue, accNumber, cardTDigit, cDigit;
		GiftCards cards = new GiftCards();
		while ((strLine = br.readLine()) != null) {
			String[] s1 = strLine.split(";");
			cardNumber = s1[0];
			verifyCode = s1[1];
			System.out.println(cardNumber);
			System.out.println(verifyCode);

			issue = s1[0].substring(0, 6);
			cardTDigit = s1[0].substring(6, 7);
			accNumber = s1[0].substring(7, 18);
			cDigit = s1[0].substring(18, 19);

			if (cards.getIssuer() == issue && cards.getCardTypeDigit() == cardTDigit
					&& cards.getAccountNumber() == accNumber && cards.getCheckDigit() == cDigit) {
				if(cards.getVerificationCode()==null)
				{
					cards.setVerificationCode(verifyCode);
					System.out.println("Updated successfully");
				}

			}

		}

	}

}
