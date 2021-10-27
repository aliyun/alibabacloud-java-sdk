// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AttachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyRequest self = new AttachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AttachPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public AttachPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public AttachPolicyRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public AttachPolicyRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public AttachPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
