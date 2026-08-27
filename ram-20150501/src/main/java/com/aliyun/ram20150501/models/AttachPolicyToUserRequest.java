// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToUserRequest extends TeaModel {
    /**
     * <p>The name of the access policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the access policy. Valid values: <code>System</code> or <code>Custom</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangq****</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static AttachPolicyToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToUserRequest self = new AttachPolicyToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachPolicyToUserRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public AttachPolicyToUserRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public AttachPolicyToUserRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AttachPolicyToUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
