// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotResponseRequest extends TeaModel {
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
