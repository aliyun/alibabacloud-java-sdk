// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the instance. The name must be 2 to 80 characters in length. The name must start with a letter and cannot contain spaces and the following special characters: <code>@ / : = &quot; &lt; &gt; { [ ] }</code></p>
     * 
     * <strong>example:</strong>
     * <p>newinstancename</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/165005.html">The release protection state of the instance.</a> Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InstanceReleaseProtection")
    public Boolean instanceReleaseProtection;

    /**
     * <p>The new password for the default account. The default account is named after the instance ID. Example: r-bp10noxlhcoim2\<em>\</em>\<em>\</em>.</p>
     * <blockquote>
     * <p>The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. These special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>uW8+nsrp</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAttributeRequest setInstanceReleaseProtection(Boolean instanceReleaseProtection) {
        this.instanceReleaseProtection = instanceReleaseProtection;
        return this;
    }
    public Boolean getInstanceReleaseProtection() {
        return this.instanceReleaseProtection;
    }

    public ModifyInstanceAttributeRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public ModifyInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceAttributeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
