// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to bypass the service provider (SP) subscription lifecycle. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Bypasses the SP subscription lifecycle. This means the instance is no longer managed by the Alibaba Cloud subscription system.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Does not bypass the SP subscription lifecycle.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use this feature, contact your account manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ByPassSp")
    public Boolean byPassSp;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request.</p>
     * <p>The token must be unique across requests. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the physical connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zeoaxkq3x****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The ID of the region where the physical connection is located.</p>
     * <p>You can call <code>DescribeRegions</code> to get the latest region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static EnablePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionRequest self = new EnablePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public EnablePhysicalConnectionRequest setByPassSp(Boolean byPassSp) {
        this.byPassSp = byPassSp;
        return this;
    }
    public Boolean getByPassSp() {
        return this.byPassSp;
    }

    public EnablePhysicalConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnablePhysicalConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnablePhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnablePhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public EnablePhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnablePhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnablePhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
