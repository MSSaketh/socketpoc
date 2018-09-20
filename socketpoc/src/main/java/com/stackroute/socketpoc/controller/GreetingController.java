package com.stackroute.socketpoc.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

import com.stackroute.socketpoc.domain.GreetingMessage;
import com.stackroute.socketpoc.domain.HelloMessage;

@CrossOrigin(origins = "*")
@Controller
public class GreetingController {

	// The @MessageMapping annotation ensures that if a message is sent to
	// destination "/hello", then the greeting() method is called.

	@MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new GreetingMessage("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }


}
