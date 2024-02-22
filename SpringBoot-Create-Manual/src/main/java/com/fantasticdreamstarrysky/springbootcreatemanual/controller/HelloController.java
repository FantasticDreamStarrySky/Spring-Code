package com.fantasticdreamstarrysky.springbootcreatemanual.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 🌃梦幻◎星空🌃
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
