package com.agentic.ai;

import com.agentic.ai.Assistant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final Assistant assistant;

    public ChatController(Assistant assistant) {
        this.assistant = assistant;
    }

    @GetMapping
    public String chat(@RequestParam String message) {
        return assistant.chat(message);
    }
}
