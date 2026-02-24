package com.agentic.ai;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class StringRelayTools {

    @Tool("Relay a test message")
    public String relayTestMessage(String inputMessage) {
/*
        try {
            Process process = new ProcessBuilder(
                    "kubectl", "describe", "pod", podName,
                    "-n", namespace
            ).start();

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(process.getInputStream()));

            StringBuilder output = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            return output.toString();

        } catch (Exception e) {
            return "Error executing kubectl: " + e.getMessage();
        }
    }
 */
        System.out.println("Called Tool Sysout");
        return "Relayed Back " + inputMessage;
    }

    @Tool("Describe Failing Kubernetes Pod")
    public String describeKubernetesPod(String podName, String namespace) {
        System.out.println("Failed Captured");
        return "Failed " + podName;
    }
}
