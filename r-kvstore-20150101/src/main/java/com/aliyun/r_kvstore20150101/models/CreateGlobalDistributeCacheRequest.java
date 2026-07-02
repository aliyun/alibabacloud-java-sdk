// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheRequest extends TeaModel {
    /**
     * <p>Specifies when to perform the operation. Valid values:</p>
     * <ul>
     * <li><p><strong>Immediately</strong>: Performs the operation immediately.</p>
     * </li>
     * <li><p><strong>MaintainTime</strong>: Performs the operation during the maintenance window. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to change the maintenance window of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p>This is a system parameter. You do not need to specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the source instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("SeedSubInstanceId")
    public String seedSubInstanceId;

    public static CreateGlobalDistributeCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheRequest self = new CreateGlobalDistributeCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateGlobalDistributeCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateGlobalDistributeCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGlobalDistributeCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGlobalDistributeCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGlobalDistributeCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGlobalDistributeCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGlobalDistributeCacheRequest setSeedSubInstanceId(String seedSubInstanceId) {
        this.seedSubInstanceId = seedSubInstanceId;
        return this;
    }
    public String getSeedSubInstanceId() {
        return this.seedSubInstanceId;
    }

}
