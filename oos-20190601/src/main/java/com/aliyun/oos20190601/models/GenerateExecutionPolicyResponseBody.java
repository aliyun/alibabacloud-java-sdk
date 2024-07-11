// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateExecutionPolicyResponseBody extends TeaModel {
    /**
     * <p>The policies that are missing.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Action\&quot;: [\&quot;ecs:DescribeInvocationResults\&quot;, \&quot;ecs:DescribeInstances\&quot;, \&quot;ecs:RunCommand\&quot;, \&quot;ecs:DescribeInvocations\&quot;], \&quot;ServiceName\&quot;: \&quot;ecs\&quot;, \&quot;Resources\&quot;: \&quot;*\&quot;}]</p>
     */
    @NameInMap("MissingPolicy")
    public String missingPolicy;

    /**
     * <p>The RAM policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
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
