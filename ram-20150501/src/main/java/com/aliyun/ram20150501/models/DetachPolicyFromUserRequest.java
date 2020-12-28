// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromUserRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("UserName")
    public String userName;

    public static DetachPolicyFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromUserRequest self = new DetachPolicyFromUserRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromUserRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DetachPolicyFromUserRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DetachPolicyFromUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
