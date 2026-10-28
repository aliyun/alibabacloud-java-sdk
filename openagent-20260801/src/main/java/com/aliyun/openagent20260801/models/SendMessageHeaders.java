// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class SendMessageHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The idempotency key for the request. Use the same key and the same business parameters when retrying the same request.</p>
     * 
     * <strong>example:</strong>
     * <p>send-message-example-001</p>
     */
    @NameInMap("X-OpenAgent-Idempotency-Key")
    public String xOpenAgentIdempotencyKey;

    public static SendMessageHeaders build(java.util.Map<String, ?> map) throws Exception {
        SendMessageHeaders self = new SendMessageHeaders();
        return TeaModel.build(map, self);
    }

    public SendMessageHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SendMessageHeaders setXOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
        this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
        return this;
    }
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

}
