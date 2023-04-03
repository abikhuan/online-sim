package task.one.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    private String country;
    @JsonProperty("country_text")
    private String countryText;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryText() {
        return countryText;
    }

    public void setCountryText(String countryText) {
        this.countryText = countryText;
    }
}
