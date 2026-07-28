// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeRequest extends TeaModel {
    /**
     * <p>The local BGP autonomous system (AS) number to be configured on the Smart Access Gateway device.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-ejfge***</p>
     */
    @NameInMap("BgpAs")
    public String bgpAs;

    /**
     * <p>The cloud-side IP address used for peering with the Smart Access Gateway device.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.16.**.**</code></p>
     */
    @NameInMap("CeIp")
    public String ceIp;

    /**
     * <p>The description of the Express Cloud Connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ECC</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID of the Express Cloud Connection instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecc-bp1t9osmuln*******</p>
     */
    @NameInMap("EccId")
    public String eccId;

    /**
     * <p>The name of the Express Cloud Connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The local IP address of the Smart Access Gateway device used for peering with the cloud.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.10.**.**</code></p>
     */
    @NameInMap("PeIp")
    public String peIp;

    /**
     * <p>The region ID of the Express Cloud Connection instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyExpressCloudConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeRequest self = new ModifyExpressCloudConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionAttributeRequest setBgpAs(String bgpAs) {
        this.bgpAs = bgpAs;
        return this;
    }
    public String getBgpAs() {
        return this.bgpAs;
    }

    public ModifyExpressCloudConnectionAttributeRequest setCeIp(String ceIp) {
        this.ceIp = ceIp;
        return this;
    }
    public String getCeIp() {
        return this.ceIp;
    }

    public ModifyExpressCloudConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyExpressCloudConnectionAttributeRequest setEccId(String eccId) {
        this.eccId = eccId;
        return this;
    }
    public String getEccId() {
        return this.eccId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyExpressCloudConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyExpressCloudConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setPeIp(String peIp) {
        this.peIp = peIp;
        return this;
    }
    public String getPeIp() {
        return this.peIp;
    }

    public ModifyExpressCloudConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyExpressCloudConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
