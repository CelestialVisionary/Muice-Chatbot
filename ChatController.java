// src/main/java/com/example/demo/controller/ChatController.java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    // 示例1：简单文本处理
    @PostMapping("/process")
    public String processMessage(@RequestBody String message) {
        // 这里可以调用Java的NLP库或其他功能
        return "Java处理后的消息：" + message.toUpperCase();
    }

    // 示例2：复杂计算（模拟AI推理）
    @PostMapping("/generate")
    public String generateResponse(@RequestBody ChatRequest request) {
        // 模拟AI生成回复
        String prompt = request.getPrompt();
        int maxLength = request.getMaxLength() != 0 ? request.getMaxLength() : 100;
        
        // 这里可以调用Java的深度学习库（如Deeplearning4J）
        return "Java生成的回复：" + prompt + " -> " + simulateAIResponse(prompt, maxLength);
    }

    private String simulateAIResponse(String prompt, int maxLength) {
        // 模拟AI生成逻辑
        return prompt + "（已扩展至" + maxLength + "字符）";
    }
}

// 请求模型类
class ChatRequest {
    private String prompt;
    private int maxLength;

    // getters and setters
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public int getMaxLength() { return maxLength; }
    public void setMaxLength(int maxLength) { this.maxLength = maxLength; }
}
