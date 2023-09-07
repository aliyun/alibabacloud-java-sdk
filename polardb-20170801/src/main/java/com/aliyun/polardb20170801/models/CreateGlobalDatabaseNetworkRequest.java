// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDatabaseNetworkRequest extends TeaModel {
    /**
     * <p>The ID of the primary cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the GDN. The description must meet the following requirements:</p>
     * <br>
     * <p>*   It cannot start with [http:// or https://.](http://https://。)</p>
     * <p>*   It must start with a letter.</p>
     * <p>*   It can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   It must be 2 to 126 characters in length.</p>
     */
    @NameInMap("GDNDescription")
    public String GDNDescription;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateGlobalDatabaseNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDatabaseNetworkRequest self = new CreateGlobalDatabaseNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDatabaseNetworkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateGlobalDatabaseNetworkRequest setGDNDescription(String GDNDescription) {
        this.GDNDescription = GDNDescription;
        return this;
    }
    public String getGDNDescription() {
        return this.GDNDescription;
    }

    public CreateGlobalDatabaseNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateGlobalDatabaseNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGlobalDatabaseNetworkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGlobalDatabaseNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGlobalDatabaseNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGlobalDatabaseNetworkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
