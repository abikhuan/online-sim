package task.one.country;

import task.one.RequestSender;

public class CountryRequestSender extends RequestSender<CountryResponse> {

    private static final String PATH = "https://onlinesim.ru/api/getFreeCountryList";

    @Override
    protected Class<CountryResponse> getClazz() {
        return CountryResponse.class;
    }

    @Override
    protected String getPath() {
        return PATH;
    }

}
