package com.example.webrtc;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SignalController {

    @MessageMapping("/send")
    @SendTo("/topic/signals")
    public SignalMessage signal(SignalMessage message) {
        return message;
//        return new SignalMessage(HtmlUtils.htmlEscape(message.getType()), HtmlUtils.htmlEscape(message.getData()));
    }
}
