// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class DeleteSessionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The idempotency key of the request. Subsequent calls after deletion, including those using the same key, return 404 Session.NotFound.</p>
     * 
     * <strong>example:</strong>
     * <p>delete-session-example-001</p>
     */
    @NameInMap("X-OpenAgent-Idempotency-Key")
    public String xOpenAgentIdempotencyKey;

    public static DeleteSessionHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionHeaders self = new DeleteSessionHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteSessionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteSessionHeaders setXOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
        this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
        return this;
    }
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

}
