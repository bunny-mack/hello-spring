package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // responds to get requests at "/hello/hello"
    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }

    // responds to get requests at "/hello/goodbye"
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

//    // Responds to get requests at /hello?coder=someName
//    @GetMapping("")
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }

    // Responds to get requests at /hello/name
    @GetMapping("{name}")
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    }



    //FORM EXAMPLE INCLUDES ALL BELOW
    // Responds to get and post requests at localhost:8080 (/hello with added class mapping above
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }

    @GetMapping
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}



