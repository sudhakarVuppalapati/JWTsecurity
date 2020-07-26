package com.security.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

@RequestMapping({ "/hello" })
public String firstPage() {
    System.out.println("firstPage qqqq ");
    return "Hello World";
}}