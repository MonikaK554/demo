package com.example.contoller;

import com.example.model.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;
import java.util.Optional;


@Controller
public class PersonList {


    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String viewPersonList(Model model){
        List<Person> list = personRepository.findAll();
        model.addAttribute("person", list);
        return "persons/personList";

    }


    @RequestMapping(value = {"/addNewPerson"}, method = RequestMethod.GET)
    public String viewAddNewPerson(){
        return "persons/addNewPerson";
    }



    // save person in database
    @RequestMapping(value = {"/addNewPerson"}, method = RequestMethod.POST)
    public RedirectView postPersonList(@ModelAttribute Person newPerson){
        personRepository.save(newPerson);
        return new RedirectView("/personList");
    }

    // get person for only edit view
    @RequestMapping(value = {"/editPerson/{id}"}, method = RequestMethod.GET)
    public String editPerson(Model model, @PathVariable("id") Long id){
        Person person = personRepository.getOne(id);
        model.addAttribute("person", person);
        return "persons/editPerson";
    }

    // save edit person
    @RequestMapping(value = {"/personList/{id}"}, method = RequestMethod.POST)
    public RedirectView saveEditPerson(@ModelAttribute Person newPerson, @PathVariable("id") Long id){
        personRepository.save(newPerson);
        return new RedirectView("/editPerson/{id}");
    }






}
