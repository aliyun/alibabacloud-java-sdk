// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetAvailableLLMModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;glm-5&quot;,&quot;deepseek-v3.2&quot;]</p>
     */
    @NameInMap("Models")
    public java.util.List<String> models;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAvailableLLMModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableLLMModelsResponseBody self = new GetAvailableLLMModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvailableLLMModelsResponseBody setModels(java.util.List<String> models) {
        this.models = models;
        return this;
    }
    public java.util.List<String> getModels() {
        return this.models;
    }

    public GetAvailableLLMModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
