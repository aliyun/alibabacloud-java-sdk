// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    public static CreateSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityPolicyResponseBody self = new CreateSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityPolicyResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityPolicyResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

}
