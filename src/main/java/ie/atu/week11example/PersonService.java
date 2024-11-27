package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PaymentClient paymentClient;
    private ReceiptClient receiptClient;

    @Autowired
    public PersonService(PaymentClient paymentClient){
        this.paymentClient = paymentClient;
    }

    public PersonService(ReceiptClient receiptClient) {
        this.receiptClient = receiptClient;
    }

    public void savePerson(Person person) {
        String response = paymentClient.makePayment(person);
        System.out.println("Person saved: " + person + " " + response);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        return new Person();
    }
}
