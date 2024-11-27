package ie.atu.week11example;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "receipt-service", url = "")
public interface ReceiptClient {



}
