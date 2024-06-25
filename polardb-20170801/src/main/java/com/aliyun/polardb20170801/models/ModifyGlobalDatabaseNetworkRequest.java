// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalDatabaseNetworkRequest extends TeaModel {
    /**
     * <p>The description of the GDN. The description must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It must start with a letter.</li>
     * <li>It can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>It must be 2 to 126 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GDN-fortest</p>
     */
    @NameInMap("GDNDescription")
    public String GDNDescription;

    /**
     * <p>The ID of the GDN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-bp1fttxsrmv*****</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyGlobalDatabaseNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalDatabaseNetworkRequest self = new ModifyGlobalDatabaseNetworkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalDatabaseNetworkRequest setGDNDescription(String GDNDescription) {
        this.GDNDescription = GDNDescription;
        return this;
    }
    public String getGDNDescription() {
        return this.GDNDescription;
    }

    public ModifyGlobalDatabaseNetworkRequest setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public ModifyGlobalDatabaseNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyGlobalDatabaseNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyGlobalDatabaseNetworkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyGlobalDatabaseNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyGlobalDatabaseNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyGlobalDatabaseNetworkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
