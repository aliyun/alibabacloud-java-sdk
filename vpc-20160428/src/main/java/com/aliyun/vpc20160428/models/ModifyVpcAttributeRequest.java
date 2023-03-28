// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcAttributeRequest extends TeaModel {
    /**
     * <p>The new IPv4 CIDR block of the VPC.</p>
     * <br>
     * <p>You can specify a larger or smaller IPv4 CIDR block than the IPv4 CIDR block of the VPC. The subnet mask must be 8 to 28 bits in length. If you specify a smaller IPv4 CIDR block and existing IP addresses do not fall within the CIDR block, the modification fails.</p>
     * <br>
     * <p>>  Your services are not affected when you modify the VPC CIDR block.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The new description of the VPC.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6 CIDR blocks. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
    @NameInMap("EnableIPv6")
    public Boolean enableIPv6;

    /**
     * <p>The IPv6 CIDR block of the VPC.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The type of IPv6 CIDR block. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): Alibaba Cloud Border Gateway Protocol (BGP) IPv6</p>
     * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
     * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
     * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
     * <br>
     * <p>>  If your Alibaba Cloud account is allowed to use single-ISP bandwidth, valid values are: **ChinaTelecom**, **ChinaUnicom**, and **ChinaMobile**.</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the VPC.</p>
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
     * <p>The ID of the VPC that you want to modify.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The new name of the VPC.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    public static ModifyVpcAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAttributeRequest self = new ModifyVpcAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAttributeRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public ModifyVpcAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpcAttributeRequest setEnableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
        return this;
    }
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    public ModifyVpcAttributeRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public ModifyVpcAttributeRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public ModifyVpcAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpcAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpcAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpcAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpcAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVpcAttributeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyVpcAttributeRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
