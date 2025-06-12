// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("GroupName")
    public String groupName;

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

    public static AttachPolicyToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToGroupRequest self = new AttachPolicyToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AttachPolicyToGroupRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public AttachPolicyToGroupRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
