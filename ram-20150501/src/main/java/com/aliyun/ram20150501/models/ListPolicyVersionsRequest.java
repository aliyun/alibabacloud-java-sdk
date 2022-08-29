// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    public static ListPolicyVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyVersionsRequest self = new ListPolicyVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyVersionsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListPolicyVersionsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
