// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CreateSessionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The request idempotency key. Use the same value and the same business parameters when retrying the same request.</p>
     * 
     * <strong>example:</strong>
     * <p>create-session-example-001</p>
     */
    @NameInMap("X-OpenAgent-Idempotency-Key")
    public String xOpenAgentIdempotencyKey;

    public static CreateSessionHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionHeaders self = new CreateSessionHeaders();
        return TeaModel.build(map, self);
    }

    public CreateSessionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateSessionHeaders setXOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
        this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
        return this;
    }
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

}
