package com.agentic.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface Assistant {

    @SystemMessage("You are a helpful cloud-native Kubernetes expert.")
    String chat(@UserMessage String userMessage);
}
