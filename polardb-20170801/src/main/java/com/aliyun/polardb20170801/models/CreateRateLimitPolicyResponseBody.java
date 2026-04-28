// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateRateLimitPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>02eccf7c61cf4d05a543075ee907f3**</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRateLimitPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRateLimitPolicyResponseBody self = new CreateRateLimitPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRateLimitPolicyResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateRateLimitPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreateRateLimitPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
