// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the tag policy.</p>
     * 
     * <strong>example:</strong>
     * <p>p-5732750813924f90****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The name of the tag policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FDBE270D-C491-5EEC-A5CD-98245422D3F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CreatePolicyResponseBody setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
