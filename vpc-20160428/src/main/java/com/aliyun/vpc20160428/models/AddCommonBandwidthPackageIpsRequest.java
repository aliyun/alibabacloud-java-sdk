// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpsRequest extends TeaModel {
    /**
     * <p>The ID of the EIP bandwidth plan.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpInstanceIds")
    public java.util.List<String> ipInstanceIds;

    /**
     * <p>The type of IP address. Set the value to **EIP** to associate EIPs with the EIP bandwidth plan.</p>
     */
    @NameInMap("IpType")
    public String ipType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the EIP bandwidth plan.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddCommonBandwidthPackageIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpsRequest self = new AddCommonBandwidthPackageIpsRequest();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpsRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public AddCommonBandwidthPackageIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCommonBandwidthPackageIpsRequest setIpInstanceIds(java.util.List<String> ipInstanceIds) {
        this.ipInstanceIds = ipInstanceIds;
        return this;
    }
    public java.util.List<String> getIpInstanceIds() {
        return this.ipInstanceIds;
    }

    public AddCommonBandwidthPackageIpsRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public AddCommonBandwidthPackageIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddCommonBandwidthPackageIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCommonBandwidthPackageIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCommonBandwidthPackageIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddCommonBandwidthPackageIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
