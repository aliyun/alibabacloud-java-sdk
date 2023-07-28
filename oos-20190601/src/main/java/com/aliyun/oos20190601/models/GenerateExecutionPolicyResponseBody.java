// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateExecutionPolicyResponseBody extends TeaModel {
    /**
     * <p>The policies that are missing.</p>
     */
    @NameInMap("MissingPolicy")
    public String missingPolicy;

    /**
     * <p>The RAM policy.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateExecutionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateExecutionPolicyResponseBody self = new GenerateExecutionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateExecutionPolicyResponseBody setMissingPolicy(String missingPolicy) {
        this.missingPolicy = missingPolicy;
        return this;
    }
    public String getMissingPolicy() {
        return this.missingPolicy;
    }

    public GenerateExecutionPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GenerateExecutionPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
