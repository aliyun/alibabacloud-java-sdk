// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateSessionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The idempotency key for the request. Use the same value when you retry the same update request.</p>
     * 
     * <strong>example:</strong>
     * <p>update-session-example-001</p>
     */
    @NameInMap("X-OpenAgent-Idempotency-Key")
    public String xOpenAgentIdempotencyKey;

    public static UpdateSessionHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionHeaders self = new UpdateSessionHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateSessionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateSessionHeaders setXOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
        this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
        return this;
    }
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

}
