package task.one.country;

import task.one.Response;

import java.util.List;

public class CountryResponse extends Response {

    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
