// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the policy. Valid values: `System` and `Custom`.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static GetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyRequest self = new GetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
