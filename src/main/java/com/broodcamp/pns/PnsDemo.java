package com.broodcamp.pns;

import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;

/**
 * Hello world!
 * http://azure.microsoft.com/en-us/documentation/articles/mobile-services
 * -ios-get-started-push/
 */
public class PnsDemo {
	public static void main(String[] args) {
		try {
			Push.alert("Hello World!", "Certificates.p12",
					"helloWorld2014", false, "YOUR_DEVICE_TOKEN");
			System.out.println("sent");
		} catch (CommunicationException e) {
			e.printStackTrace();
		} catch (KeystoreException e) {
			e.printStackTrace();
		}
	}
}
