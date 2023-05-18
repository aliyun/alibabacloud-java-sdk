// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachPolicyRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <br>
     * <p>*   Custom: custom policy</p>
     * <p>*   System: system policy</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The name of the object to which the policy is attached.</p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the object to which the policy is attached. Valid values:</p>
     * <br>
     * <p>*   IMSUser: RAM user</p>
     * <p>*   IMSGroup: RAM user group</p>
     * <p>*   ServiceRole: RAM role</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.</p>
     * <br>
     * <p>This parameter specifies the resource group or Alibaba Cloud account for which you want to revoke permissions.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DetachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyRequest self = new DetachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DetachPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DetachPolicyRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public DetachPolicyRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public DetachPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
