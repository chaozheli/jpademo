package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @Author ChaoZhe Li
 * @Date 2020/9/10 21:14
 * @Version 1.0
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/add")
    public void add(@RequestBody Person person){
        personRepository.save(person);
    }
    @GetMapping("/findAll")
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteOne(@RequestParam Long id){
        personRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Person person){
        personRepository.saveAndFlush(person);
    }

    @GetMapping("/findByName/{name}")
    public Person findByName(@PathVariable(name = "name") String name){
        return personRepository.findByNameIs(name);
    }

    @GetMapping("/getNamesLike/{name}")
    public List<Person> getNamesLike(@PathVariable(name = "name")String name){
        return personRepository.getNamesLike(name);
    }



}
