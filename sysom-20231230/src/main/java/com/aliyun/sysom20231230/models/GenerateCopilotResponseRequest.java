// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotResponseRequest extends TeaModel {
    /**
     * <p>Input parameter for integrating with the copilot LLM service. Refer to the standard LLM API input parameter dict, convert it into a string, and pass it in llmParamString.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;model\&quot;:\&quot;Qwen-7B-Chat\&quot;,\&quot;temperature\&quot;:0.9,\&quot;max_tokens\&quot;:1000,\&quot;top_p\&quot;:1,\&quot;frequency_penalty\&quot;:0.0,\&quot;presence_penalty\&quot;:0.6,\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;我是os工程师\&quot;},{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;您好。我是AI语言模型，很高兴为您服 务。有什么我能帮助您的呢\&quot;},{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;你知道什么是alinux吗\&quot;}]}&quot;</p>
     */
    @NameInMap("llmParamString")
    public String llmParamString;

    public static GenerateCopilotResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotResponseRequest self = new GenerateCopilotResponseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotResponseRequest setLlmParamString(String llmParamString) {
        this.llmParamString = llmParamString;
        return this;
    }
    public String getLlmParamString() {
        return this.llmParamString;
    }

}
