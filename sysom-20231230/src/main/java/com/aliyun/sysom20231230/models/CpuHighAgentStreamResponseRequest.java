// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CpuHighAgentStreamResponseRequest extends TeaModel {
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
