// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotStreamResponseRequest extends TeaModel {
    @NameInMap("llmParamString")
    public String llmParamString;

    public static GenerateCopilotStreamResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotStreamResponseRequest self = new GenerateCopilotStreamResponseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotStreamResponseRequest setLlmParamString(String llmParamString) {
        this.llmParamString = llmParamString;
        return this;
    }
    public String getLlmParamString() {
        return this.llmParamString;
    }

}
