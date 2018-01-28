/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotrot.controller;

import geotrot.models.Tag;
import geotrot.repositories.TagRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class TagsController {
    @Autowired
    private TagRepository repository;
    
    @RequestMapping(value = "tags", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("tags", "tags", repository.findAll());
    }
    
    @RequestMapping(value = "tags/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Dvd dvd, BindingResult result) {
        repository.save(tag);
        return new ModelAndView("tags", "tags", repository.findAll());
    }
    
}
