// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the policy. Valid values: <code>System</code> and <code>Custom</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>OSSAdminRole</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static DetachPolicyFromRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromRoleRequest self = new DetachPolicyFromRoleRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromRoleRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DetachPolicyFromRoleRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DetachPolicyFromRoleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DetachPolicyFromRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
