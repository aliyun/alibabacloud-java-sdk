// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateVpcIpv6CidrRequest extends TeaModel {
    /**
     * <p>The type of the IPv6 address pool. Set the value to **custom**.</p>
     * <br>
     * <p>>  This parameter is required.</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IPv6 CIDR block that you want to reserve.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The type of the IPv6 CIDR block. Valid values:</p>
     * <br>
     * <p>*   **BGP**: Alibaba Cloud Border Gateway Protocol (BGP) IPv6. This is the default value.</p>
     * <p>*   **ChinaMobile**: China Mobile (single ISP).</p>
     * <p>*   **ChinaUnicom**: China Unicom (single ISP).</p>
     * <p>*   **ChinaTelecom**: China Telecom (single ISP).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If your Alibaba Cloud account is allowed to use single-ISP bandwidth, valid values are: **ChinaTelecom**, **ChinaUnicom**, and **ChinaMobile**.</p>
     * <p>*   You can reserve only one IPv6 CIDR block of each type. After a reserved IPv6 CIDR block of a type is allocated to a VPC, you can reserve another IPv6 CIDR of the type.</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the VPC belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AllocateVpcIpv6CidrRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateVpcIpv6CidrRequest self = new AllocateVpcIpv6CidrRequest();
        return TeaModel.build(map, self);
    }

    public AllocateVpcIpv6CidrRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public AllocateVpcIpv6CidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateVpcIpv6CidrRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public AllocateVpcIpv6CidrRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public AllocateVpcIpv6CidrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateVpcIpv6CidrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateVpcIpv6CidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateVpcIpv6CidrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateVpcIpv6CidrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
