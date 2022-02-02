package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping("hello")
public class HelloController {

//    // responds to get requests at "/hello/hello"
//    @GetMapping("hello")
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    // responds to get requests at "/hello/goodbye"
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

//    // Responds to get requests at /hello?coder=someName
//    @GetMapping("")
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }

//    // Responds to get requests at /hello/name
//    @GetMapping("{name}")
//    public String helloAgain(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }



    //FORM EXAMPLE INCLUDES ALL BELOW
    // Responds to get and post requests at localhost:8080 (/hello with added class mapping above
//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
//
//    @GetMapping
//    public String helloForm() {
//        String html =
//                "<html>" +
//                        "<body>" +
//                        "<form method = 'post' action = '/hello'>" +
//                        "<input type = 'text' name = 'coder' />" +
//                        "<input type = 'submit' value = 'Greet Me!' />" +
//                        "</form>" +
//                        "</body>" +
//                        "</html>";
//        return html;
//    }

//EXERCISES ANSWER
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String greeting, String coder) {
            //return greeting + ", " + coder + "!";
            return "<html> <body> <font color = 'pink' size = '12'>" + greeting + ", " + coder + "!" +
                    " </font> </body> </html>";
        }

    @GetMapping
    public String createMessage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<select name = 'greeting' >" +
                        "<option value = 'Hello'>English</option> " +
                        "<option value = 'Bonjour'>French</option> " +
                        "<option value = 'Hola'>Spanish</option> " +
                        "<option value = 'Hallo'>German</option> " +
                        "<option value = 'Olá'>Portuguese</option> " +
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}



