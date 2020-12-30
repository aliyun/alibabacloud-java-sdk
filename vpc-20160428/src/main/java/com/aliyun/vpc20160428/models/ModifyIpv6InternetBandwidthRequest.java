// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyIpv6InternetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6InternetBandwidthRequest self = new ModifyIpv6InternetBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6InternetBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIpv6InternetBandwidthRequest setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public ModifyIpv6InternetBandwidthRequest setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
        this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
        return this;
    }
    public String getIpv6InternetBandwidthId() {
        return this.ipv6InternetBandwidthId;
    }

    public ModifyIpv6InternetBandwidthRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public ModifyIpv6InternetBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyIpv6InternetBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIpv6InternetBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyIpv6InternetBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyIpv6InternetBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
