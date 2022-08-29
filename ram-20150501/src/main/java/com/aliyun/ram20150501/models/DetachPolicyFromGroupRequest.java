// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    public static DetachPolicyFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupRequest self = new DetachPolicyFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DetachPolicyFromGroupRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DetachPolicyFromGroupRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
