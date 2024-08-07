// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyCopilotEmbedConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4BAA4694-CC27-555F-B15A-688AA9289FEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyCopilotEmbedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCopilotEmbedConfigResponseBody self = new ModifyCopilotEmbedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCopilotEmbedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCopilotEmbedConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ModifyCopilotEmbedConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
