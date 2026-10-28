// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CancelRunHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The idempotency key of the request. Use the same value and the same business parameters when retrying the same cancellation request.</p>
     * 
     * <strong>example:</strong>
     * <p>cancel-example-001</p>
     */
    @NameInMap("X-OpenAgent-Idempotency-Key")
    public String xOpenAgentIdempotencyKey;

    public static CancelRunHeaders build(java.util.Map<String, ?> map) throws Exception {
        CancelRunHeaders self = new CancelRunHeaders();
        return TeaModel.build(map, self);
    }

    public CancelRunHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CancelRunHeaders setXOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
        this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
        return this;
    }
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

}
