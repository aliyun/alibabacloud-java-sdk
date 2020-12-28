// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    public static GetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyRequest self = new GetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public GetPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
