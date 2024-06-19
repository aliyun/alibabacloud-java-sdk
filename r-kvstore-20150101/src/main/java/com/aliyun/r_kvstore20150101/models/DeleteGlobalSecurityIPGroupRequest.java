// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteGlobalSecurityIPGroupRequest extends TeaModel {
    /**
     * <p>The name of the global IP whitelist template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a letter and end with a letter or a digit.</li>
     * <li>The name must be 2 to 120 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("GlobalIgName")
    public String globalIgName;

    /**
     * <p>The ID of the IP whitelist template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>g-kd2iop4aur9qwxnvh***</p>
     */
    @NameInMap("GlobalSecurityGroupId")
    public String globalSecurityGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4e******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteGlobalSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalSecurityIPGroupRequest self = new DeleteGlobalSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalSecurityIPGroupRequest setGlobalIgName(String globalIgName) {
        this.globalIgName = globalIgName;
        return this;
    }
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    public DeleteGlobalSecurityIPGroupRequest setGlobalSecurityGroupId(String globalSecurityGroupId) {
        this.globalSecurityGroupId = globalSecurityGroupId;
        return this;
    }
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
    }

    public DeleteGlobalSecurityIPGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteGlobalSecurityIPGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteGlobalSecurityIPGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGlobalSecurityIPGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteGlobalSecurityIPGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteGlobalSecurityIPGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteGlobalSecurityIPGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
