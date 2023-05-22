// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the GA instance. Set the value to **10**. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The bandwidth type. Valid values:</p>
     * <br>
     * <p>*   **Sharing**</p>
     * <p>*   **Exclusive**</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the GA instance.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the GA instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the GA instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The acceleration area. Valid values:</p>
     * <br>
     * <p>*   **china-mainland**</p>
     * <p>*   **north-america**</p>
     * <p>*   **asia-pacific**</p>
     * <p>*   **europe**</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    public static CreateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceRequest self = new CreateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public CreateGlobalAccelerationInstanceRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public CreateGlobalAccelerationInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGlobalAccelerationInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGlobalAccelerationInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGlobalAccelerationInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateGlobalAccelerationInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGlobalAccelerationInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGlobalAccelerationInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGlobalAccelerationInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGlobalAccelerationInstanceRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

}
