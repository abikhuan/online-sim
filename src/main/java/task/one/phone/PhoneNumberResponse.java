package task.one.phone;

import task.one.Response;

import java.util.List;

public class PhoneNumberResponse extends Response {

    private List<PhoneNumber> numbers;

    public List<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<PhoneNumber> numbers) {
        this.numbers = numbers;
    }
}
