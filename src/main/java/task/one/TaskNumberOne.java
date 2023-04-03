package task.one;

import task.one.country.CountryRequestSender;
import task.one.country.CountryResponse;
import task.one.phone.PhoneNumberRequestSender;
import task.one.phone.PhoneNumberResponse;

import java.io.IOException;
import java.util.Map;

public class TaskNumberOne {

    public static void main(String[] args) {
        RequestSender<CountryResponse> countryRequestSender = new CountryRequestSender();
        RequestSender<PhoneNumberResponse> phoneNumberRequestSender = new PhoneNumberRequestSender();
        CountryResponse result = null;
        try {
            result = countryRequestSender.getResult(null);
            if(result.getResponse() == 1
                && result.getCountries() != null
                    && result.getCountries().size() > 0) {
                System.out.printf("%15s \t| %s%n", "phone number", "country");
                result.getCountries().forEach(country -> {
                    try {
                        PhoneNumberResponse phoneNumbers = phoneNumberRequestSender.getResult(Map.of("country", country.getCountry()));
                        if(phoneNumbers.getResponse() == 1
                                && phoneNumbers.getNumbers() != null
                                    && phoneNumbers.getNumbers().size() > 0) {
                            phoneNumbers.getNumbers().forEach(phoneNumber ->
                                    System.out.printf("%15s \t| %s%n", phoneNumber.getNumber(), country.getCountryText()));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
