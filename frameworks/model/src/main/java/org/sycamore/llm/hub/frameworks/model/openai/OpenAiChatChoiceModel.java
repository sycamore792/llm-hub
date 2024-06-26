package org.sycamore.llm.hub.frameworks.model.openai;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

/**
 * @author: Sycamore
 * @date: 2024/4/26 12:21
 * @version: 1.0
 * @description: TODO
 */
@Data
public class OpenAiChatChoiceModel {
    @JSONField(name = "finish_reason")
    private String finishReason;
    private Integer index;

    private OpenAiMessageModel message;
    private OpenAiMessageModel delta;
}
