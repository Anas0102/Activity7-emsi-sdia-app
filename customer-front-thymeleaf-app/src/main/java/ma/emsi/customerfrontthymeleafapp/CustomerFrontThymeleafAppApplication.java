package ma.emsi.customerfrontthymeleafapp;

import ma.emsi.customerfrontthymeleafapp.entities.Customer;
import ma.emsi.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
          customerRepository.save(Customer.builder().name("Anas").email("anasessamlali1@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohammed").email("mohammed@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mostapha").email("mostapha@gmail.com").build());
        };
}
}
