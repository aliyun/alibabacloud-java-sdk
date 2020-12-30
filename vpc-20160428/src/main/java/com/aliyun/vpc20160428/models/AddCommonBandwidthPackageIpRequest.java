// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("IpInstanceId")
    public String ipInstanceId;

    @NameInMap("IpType")
    public String ipType;

    public static AddCommonBandwidthPackageIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpRequest self = new AddCommonBandwidthPackageIpRequest();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCommonBandwidthPackageIpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddCommonBandwidthPackageIpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddCommonBandwidthPackageIpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddCommonBandwidthPackageIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCommonBandwidthPackageIpRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public AddCommonBandwidthPackageIpRequest setIpInstanceId(String ipInstanceId) {
        this.ipInstanceId = ipInstanceId;
        return this;
    }
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    public AddCommonBandwidthPackageIpRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

}
