package task.one.phone;

import task.one.RequestSender;

public class PhoneNumberRequestSender extends RequestSender<PhoneNumberResponse> {

    private static final String PATH = "https://onlinesim.ru/api/getFreePhoneList";

    @Override
    protected Class<PhoneNumberResponse> getClazz() {
        return PhoneNumberResponse.class;
    }

    @Override
    protected String getPath() {
        return PATH;
    }
}
