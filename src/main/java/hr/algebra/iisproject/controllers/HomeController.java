package hr.algebra.iisproject.controllers;

import hr.algebra.iisproject.models.ValidationResult;
import hr.algebra.iisproject.repos.XsdFactory;
import hr.algebra.iisproject.repos.XsdValidation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.transform.stream.StreamSource;

import java.io.FileNotFoundException;

import static org.springframework.util.ResourceUtils.getFile;

@Controller
@RequestMapping("")
public class HomeController {

    private XsdValidation xsdFactory = new XsdFactory();

    @GetMapping("/")
    public String getHomePage() {
        return "home/index";
    }

    @GetMapping(value = "/xsdValidation", produces = "application/json")
    public ValidationResult getXsdValidationPage() {
        try {
            return new ValidationResult(xsdFactory.validateXsd(new StreamSource(getFile("generatedMemes.xml"))));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
