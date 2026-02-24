package com.agentic.ai;

import dev.langchain4j.model.azure.AzureOpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    public AzureOpenAiChatModel chatModel() {
        return AzureOpenAiChatModel.builder()
                .endpoint("https://pratik-agenticai.openai.azure.com/")
                .deploymentName("pratik-gpt")
                .temperature(0.7)
                .build();
    }

    @Bean
    public com.agentic.ai.Assistant assistant(AzureOpenAiChatModel chatModel, StringRelayTools tools) {
        //return AiServices.create(Assistant.class, chatModel);
        return AiServices.builder(Assistant.class).chatLanguageModel(chatModel).tools(tools).build();
    }
}
