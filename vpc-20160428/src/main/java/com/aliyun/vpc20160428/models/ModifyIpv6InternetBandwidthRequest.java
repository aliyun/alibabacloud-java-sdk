// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthRequest extends TeaModel {
    /**
     * <p>The Internet bandwidth value of the IPv6 address. Unit: Mbit/s.</p>
     * <br>
     * <p>*   If the billing method is pay-by-data-transfer, valid values are **1** to **1000**.</p>
     * <p>*   If the billing method is pay-by-bandwidth, valid values are **1** to **2000**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the IPv6 address.</p>
     * <br>
     * <p>>  You must specify one of **Ipv6AddressId** and **Ipv6InternetBandwidthId**.</p>
     */
    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    /**
     * <p>The instance ID of the Internet bandwidth of the IPv6 address.</p>
     */
    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the IPv6 gateway is deployed. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyIpv6InternetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6InternetBandwidthRequest self = new ModifyIpv6InternetBandwidthRequest();
        return TeaModel.build(map, self);
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

    public ModifyIpv6InternetBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyIpv6InternetBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIpv6InternetBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
