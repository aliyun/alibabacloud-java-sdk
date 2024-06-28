// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockRequest extends TeaModel {
    /**
     * <p>The IPv6 CIDR block to be added.</p>
     * <blockquote>
     * <p> You must and can specify only one of <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:6a::/56</p>
     */
    @NameInMap("IPv6CidrBlock")
    public String IPv6CidrBlock;

    /**
     * <p>The version of the IP address. Valid values:</p>
     * <ul>
     * <li><strong>IPV4</strong>: the IPv4 address.</li>
     * <li><strong>IPV6</strong>: the IPv6 address. If you set <strong>IpVersion</strong> to <strong>IPV6</strong> and do not specify <strong>SecondaryCidrBlock</strong>, you can add a secondary IPv6 CIDR block to the VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The ID of the IP Address Manager (IPAM) pool that contains IPv4 addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-sycmt3p2a9v63i****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The type of the IPv6 CIDR block. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default)</li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaTelecom</strong></li>
     * </ul>
     * <blockquote>
     * <p> If your Alibaba Cloud account is allowed to activate single-ISP bandwidth, you can set this parameter to <strong>ChinaTelecom</strong>, <strong>ChinaUnicom</strong>, or <strong>ChinaMobile</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the VPC to which you want to add a secondary CIDR block.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IPv4 CIDR block to be added. Take note of the following requirements:</p>
     * <ul>
     * <li>You can specify one of the following standard IPv4 CIDR blocks or their subnets as the secondary IPv4 CIDR block of the VPC: 192.168.0.0/16, 172.16.0.0/12, and 10.0.0.0/8.</li>
     * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, or their subnets as the secondary IPv4 CIDR block of the VPC.</li>
     * </ul>
     * <p>The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</li>
     * <li>The CIDR block cannot overlap with the primary CIDR block or an existing secondary CIDR block of the VPC.</li>
     * </ul>
     * <blockquote>
     * <p> You must and can specify only one of <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    @NameInMap("SecondaryCidrMask")
    public Integer secondaryCidrMask;

    /**
     * <p>The ID of the VPC to which you want to add a secondary CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-o6wrloqsdqc9io3mg****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static AssociateVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockRequest self = new AssociateVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public AssociateVpcCidrBlockRequest setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
        return this;
    }
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    public AssociateVpcCidrBlockRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AssociateVpcCidrBlockRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public AssociateVpcCidrBlockRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public AssociateVpcCidrBlockRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateVpcCidrBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateVpcCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateVpcCidrBlockRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateVpcCidrBlockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociateVpcCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public AssociateVpcCidrBlockRequest setSecondaryCidrMask(Integer secondaryCidrMask) {
        this.secondaryCidrMask = secondaryCidrMask;
        return this;
    }
    public Integer getSecondaryCidrMask() {
        return this.secondaryCidrMask;
    }

    public AssociateVpcCidrBlockRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
