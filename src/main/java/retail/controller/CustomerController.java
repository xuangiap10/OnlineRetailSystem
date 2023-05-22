package retail.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping
    public ResponseEntity<?> getAllCustomers(){
        return new ResponseEntity<String>("wellcome to customer page", HttpStatus.OK);
    }
}
