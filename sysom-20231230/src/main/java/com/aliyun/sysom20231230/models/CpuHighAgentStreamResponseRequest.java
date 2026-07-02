// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CpuHighAgentStreamResponseRequest extends TeaModel {
    /**
     * <p>The input parameter for the CPU High Agent service. Refer to the standard LLM API input parameter dict, convert it to a string, and pass it in the llmParamString field.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;llmParamString&quot;: &quot;{\&quot;messages\&quot;: [{\&quot;role\&quot;: \&quot;user\&quot;, \&quot;content\&quot;: \&quot;用户12345的机器i-67890，最近2分钟CPU使用率高，请结合最近2分钟的火焰图信息，分析原因\&quot;}]}&quot;</p>
     */
    @NameInMap("llmParamString")
    public String llmParamString;

    public static CpuHighAgentStreamResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        CpuHighAgentStreamResponseRequest self = new CpuHighAgentStreamResponseRequest();
        return TeaModel.build(map, self);
    }

    public CpuHighAgentStreamResponseRequest setLlmParamString(String llmParamString) {
        this.llmParamString = llmParamString;
        return this;
    }
    public String getLlmParamString() {
        return this.llmParamString;
    }

}
