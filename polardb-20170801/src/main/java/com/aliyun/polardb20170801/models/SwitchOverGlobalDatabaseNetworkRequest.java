// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SwitchOverGlobalDatabaseNetworkRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that will become the primary cluster in the GDN.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/264580.html">DescribeGlobalDatabaseNetwork</a> operation to query the ID of the cluster in the GDN.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-wz9fb5nn44u1d****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to forcibly switch over the primary and secondary clusters in the GDN. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Forced")
    public Boolean forced;

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
     * <p>The region ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public static SwitchOverGlobalDatabaseNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverGlobalDatabaseNetworkRequest self = new SwitchOverGlobalDatabaseNetworkRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOverGlobalDatabaseNetworkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setForced(Boolean forced) {
        this.forced = forced;
        return this;
    }
    public Boolean getForced() {
        return this.forced;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchOverGlobalDatabaseNetworkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
