// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLLMConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the LLM configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_config1</p>
     */
    @NameInMap("LLMConfigId")
    public String LLMConfigId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD19A0E2-0DC8-5EAA-867D-00C813F553F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLLMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLLMConfigResponseBody self = new CreateLLMConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLLMConfigResponseBody setLLMConfigId(String LLMConfigId) {
        this.LLMConfigId = LLMConfigId;
        return this;
    }
    public String getLLMConfigId() {
        return this.LLMConfigId;
    }

    public CreateLLMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
