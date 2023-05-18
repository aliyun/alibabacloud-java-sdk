// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyRequest extends TeaModel {
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
     * <p>The name of the object to which you want to attach the policy.</p>
     * <br>
     * <p>*   If you want to attach the policy to a RAM user, specify the name in the \<UserName>@\<AccountAlias>.onaliyun.com format. \<UserName> indicates the name of the RAM user, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM user belongs.</p>
     * <p>*   If you want to attach the policy to a RAM user group, specify the name in the \<GroupName>@group.\<AccountAlias>.onaliyun.com format. \<GroupName> indicates the name of the RAM user group, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM user group belongs.</p>
     * <p>*   If you want to attach the policy to a RAM role, specify the name in the \<RoleName>@role.\<AccountAlias>.onaliyun.com format. \<RoleName> indicates the name of the RAM role, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM role belongs.</p>
     * <br>
     * <p>>  The alias of an Alibaba Cloud account is a part of the default domain name. You can call the [GetDefaultDomain](~~186720~~) operation to obtain the alias of an Alibaba Cloud account.</p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the object to which you want to attach the policy. Valid values:</p>
     * <br>
     * <p>*   IMSUser: RAM user</p>
     * <p>*   IMSGroup: RAM user group</p>
     * <p>*   ServiceRole: RAM role</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The effective scope of the policy. You can set this parameter to one of the following items:</p>
     * <br>
     * <p>*   ID of a resource group: indicates that the policy takes effect for the resources in the resource group.</p>
     * <p>*   ID of the Alibaba Cloud account to which the authorized object belongs: indicates that the policy takes effect for the resources within the Alibaba Cloud account.</p>
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
