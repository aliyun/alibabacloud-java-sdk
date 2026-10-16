// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyRequest extends TeaModel {
    /**
     * <p>Policy Name of the access policy.</p>
     * <p>Policy Name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AdministratorAccess</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the access policy. Valid values:</p>
     * <ul>
     * <li>Custom: custom access policy.</li>
     * <li>System: system access policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The name of the authorization object. The format varies based on the object type:</p>
     * <ul>
     * <li>Resource Access Management (RAM) user: <UserName>@<AccountAlias>.onaliyun.com, where <UserName> is the RAM username and <AccountAlias> is the account alias.</li>
     * <li>RAM user group: <GroupName>@group.<AccountAlias>.onaliyun.com, where <GroupName> is the RAM user group name and <AccountAlias> is the account alias.</li>
     * <li>RAM role: <RoleName>@role.<AccountAlias>.onaliyunservice.com, where <RoleName> is the RAM role name and <AccountAlias> is the account alias.</li>
     * </ul>
     * <blockquote>
     * <p>The account alias is part of the default domain name. Invoke <a href="https://help.aliyun.com/document_detail/186720.html">GetDefaultDomain</a> to obtain the account alias.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The authorization object type. Valid values:</p>
     * <ul>
     * <li>IMSUser: Resource Access Management (RAM) user.</li>
     * <li>IMSGroup: RAM user group.</li>
     * <li>ServiceRole: RAM role.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMSUser</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>Resource group ID: The permissions take effect within the specified resource group.</li>
     * <li>Alibaba Cloud account ID: The ID of the Alibaba Cloud account to which the principal belongs. The permissions take effect within the Alibaba Cloud account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
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
