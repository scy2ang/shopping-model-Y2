package shopping.model.y.common;


import shopping.model.y.SupportingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingApplication.class })
public class CucumberSpingConfiguration {
    
}
