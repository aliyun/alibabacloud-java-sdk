// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotStreamResponseRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The input parameter for the Copilot LLM service. Refer to the standard LLM interface input parameter dict. Convert it to a string and pass it to llmParamString.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;model\&quot;:\&quot;Qwen-7B-Chat\&quot;,\&quot;temperature\&quot;:0.9,\&quot;max_tokens\&quot;:1000,\&quot;top_p\&quot;:1,\&quot;frequency_penalty\&quot;:0.0,\&quot;presence_penalty\&quot;:0.6,\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;I am an OS engineer\&quot;},{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;Hello. I am an AI language model, happy to help you. What can I do for you?\&quot;},{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;Do you know what Alinux is?\&quot;}]}&quot;</p>
     */
    @NameInMap("llmParamString")
    public String llmParamString;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GenerateCopilotStreamResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotStreamResponseRequest self = new GenerateCopilotStreamResponseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotStreamResponseRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GenerateCopilotStreamResponseRequest setLlmParamString(String llmParamString) {
        this.llmParamString = llmParamString;
        return this;
    }
    public String getLlmParamString() {
        return this.llmParamString;
    }

    public GenerateCopilotStreamResponseRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
