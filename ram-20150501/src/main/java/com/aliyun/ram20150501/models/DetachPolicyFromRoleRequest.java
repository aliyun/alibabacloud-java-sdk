// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleRequest extends TeaModel {
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

    /**
     * <p>The name of the RAM role.</p>
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

    public DetachPolicyFromRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
