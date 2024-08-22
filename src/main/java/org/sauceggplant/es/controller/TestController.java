package org.sauceggplant.es.controller;

import org.sauceggplant.es.entity.TestEntity;
import org.sauceggplant.es.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<TestEntity>> getAll(){
        return new ResponseEntity<List<TestEntity>>(testService.getAll(), HttpStatus.OK);
    }
}
