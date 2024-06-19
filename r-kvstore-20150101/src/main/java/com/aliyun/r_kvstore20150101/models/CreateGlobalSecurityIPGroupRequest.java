// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalSecurityIPGroupRequest extends TeaModel {
    /**
     * <p>The IP addresses in the IP whitelist template.</p>
     * <blockquote>
     * <p> Separate multiple IP addresses with commas (,). The maximum number of IP addresses is 1,000.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111.175.56.206,47.253.88.168,111.181.0.162</p>
     */
    @NameInMap("GIpList")
    public String GIpList;

    /**
     * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a letter and end with a letter or digit.</li>
     * <li>The name must be 2 to 120 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("GlobalIgName")
    public String globalIgName;

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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateGlobalSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalSecurityIPGroupRequest self = new CreateGlobalSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalSecurityIPGroupRequest setGIpList(String GIpList) {
        this.GIpList = GIpList;
        return this;
    }
    public String getGIpList() {
        return this.GIpList;
    }

    public CreateGlobalSecurityIPGroupRequest setGlobalIgName(String globalIgName) {
        this.globalIgName = globalIgName;
        return this;
    }
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    public CreateGlobalSecurityIPGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateGlobalSecurityIPGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGlobalSecurityIPGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGlobalSecurityIPGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGlobalSecurityIPGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGlobalSecurityIPGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGlobalSecurityIPGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
