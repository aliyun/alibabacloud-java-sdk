// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetEffectivePolicyResponseBody extends TeaModel {
    /**
     * <p>The effective tag policy.</p>
     */
    @NameInMap("EffectivePolicy")
    public String effectivePolicy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEffectivePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEffectivePolicyResponseBody self = new GetEffectivePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEffectivePolicyResponseBody setEffectivePolicy(String effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
        return this;
    }
    public String getEffectivePolicy() {
        return this.effectivePolicy;
    }

    public GetEffectivePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
