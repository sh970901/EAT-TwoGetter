package com.ll.example.getTwoGetter.Board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/chat")
    public String showChatRoom() {
        return "chat.html";
    }
}