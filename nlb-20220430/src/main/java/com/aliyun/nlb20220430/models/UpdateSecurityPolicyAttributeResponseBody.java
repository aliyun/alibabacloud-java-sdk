// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateSecurityPolicyAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the TLS security policy.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    public static UpdateSecurityPolicyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityPolicyAttributeResponseBody self = new UpdateSecurityPolicyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityPolicyAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateSecurityPolicyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecurityPolicyAttributeResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

}
