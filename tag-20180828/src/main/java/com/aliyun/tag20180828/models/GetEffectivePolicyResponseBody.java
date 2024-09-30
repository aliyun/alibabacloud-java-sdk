// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetEffectivePolicyResponseBody extends TeaModel {
    /**
     * <p>The effective tag policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;tags\&quot;:{\&quot;costcenter\&quot;:{\&quot;tag_value\&quot;:[\&quot;Beijing\&quot;,\&quot;Shanghai\&quot;],\&quot;tag_key\&quot;:\&quot;CostCenter\&quot;}}}</p>
     */
    @NameInMap("EffectivePolicy")
    public String effectivePolicy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BB532282-94F5-5F56-877F-32D5E2A04F3F</p>
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
