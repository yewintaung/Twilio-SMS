package com.ywa.twilio;

import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.resource.instance.Sms;

public class SmsSender {

	public static void main(String[] args) {
		String ACCOUNT_SID = "AC3a105e39b154eef7e44c90d387974e4d";
        String AUTH_TOKEN = "9d0842ced2c15e25036d33da53303c5a";

        String smsTo = "+959255800188"; // +959975858422
        String smsFrom = "+17315038393";
        String smsText = "Chilly, baby boo boo";

        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
            Account account = client.getAccount();
            SmsFactory smsFactory = account.getSmsFactory();
            Map<String, String> smsParams = new HashMap<String, String>();
            smsParams.put("To", smsTo);
            smsParams.put("From", smsFrom);
            smsParams.put("Body", smsText);
            Sms sms = smsFactory.create(smsParams);

            System.out.println("SMS sent successfully! " + sms.getStatus());
        }
        catch (Exception e){
        	System.out.println("Error occurred while sending SMS!" + e.getMessage());
        }
	}
}
