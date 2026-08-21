// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CpuHighAgentStreamResponseRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The input parameter for the CPU high agent service. Refer to the standard LLM API input parameter dict. Convert it to a string and pass it in the llmParamString field.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;llmParamString&quot;: &quot;{\&quot;messages\&quot;: [{\&quot;role\&quot;: \&quot;user\&quot;, \&quot;content\&quot;: \&quot;The CPU utilization of instance i-67890 for user 12345 has been high in the last 2 minutes. Analyze the cause based on the flame graph information from the last 2 minutes.\&quot;}]}&quot;</p>
     */
    @NameInMap("llmParamString")
    public String llmParamString;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static CpuHighAgentStreamResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        CpuHighAgentStreamResponseRequest self = new CpuHighAgentStreamResponseRequest();
        return TeaModel.build(map, self);
    }

    public CpuHighAgentStreamResponseRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public CpuHighAgentStreamResponseRequest setLlmParamString(String llmParamString) {
        this.llmParamString = llmParamString;
        return this;
    }
    public String getLlmParamString() {
        return this.llmParamString;
    }

    public CpuHighAgentStreamResponseRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
