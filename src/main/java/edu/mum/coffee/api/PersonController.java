package edu.mum.coffee.api;

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("ApiPersonController")
@RequestMapping(value = "/api")
public class PersonController {
    @Autowired
    private PersonService pservice;

    @ResponseBody
    @GetMapping(value = "/person", produces = "application/json")
    public List<Person> getAllProducts(){
        return pservice.getAll();
    }

    @ResponseBody
    @GetMapping(value = "/person/{id}", produces =  "application/json")
    public  Person getProductById(@PathVariable long id){
        Person person = pservice.findById(id);
        return person;
    }
}
