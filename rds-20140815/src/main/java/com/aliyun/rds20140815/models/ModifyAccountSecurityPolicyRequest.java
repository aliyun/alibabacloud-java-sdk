// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2628785.html">DescribeDBInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1ibu****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The custom password policy for the account of the ApsaraDB RDS for SQL Server instance. The following policies are supported:</p>
     * <ul>
     * <li><code>{&quot;account security policy&quot;: {&quot;MaximumPasswordAge&quot;: Specify the maximum password age}}</code>: You can configure only the maximum password age. After the maximum password age is reached, you must change the password.</li>
     * <li><code>{&quot;accountSecurityPolicy&quot;: {&quot;MaximumPasswordAge&quot;: Specify the minimum password age}}</code>: You can configure only the minimum password age. During the specified period, you cannot change the password.</li>
     * <li><code>{&quot;accountSecurityPolicy&quot;: {&quot;MaximumPasswordAge&quot;: Specify the maximum password age, &quot;MinimumPasswordAge&quot;: Specify the minimum password age}}</code>: You can configure the maximum and minimum password age at the same time.</li>
     * </ul>
     * <blockquote>
     * <p> The minimum password age cannot be greater than the maximum password age. Valid values for the minimum password age: 0 to 998. Valid values for the maximum password age: 0 to 999.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountSecurityPolicy&quot;: {&quot;MaximumPasswordAge&quot;: 30, &quot;MinimumPasswordAge&quot;: 20}}</p>
     */
    @NameInMap("GroupPolicy")
    public String groupPolicy;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAccountSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountSecurityPolicyRequest self = new ModifyAccountSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountSecurityPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAccountSecurityPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAccountSecurityPolicyRequest setGroupPolicy(String groupPolicy) {
        this.groupPolicy = groupPolicy;
        return this;
    }
    public String getGroupPolicy() {
        return this.groupPolicy;
    }

    public ModifyAccountSecurityPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAccountSecurityPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAccountSecurityPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyAccountSecurityPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAccountSecurityPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
