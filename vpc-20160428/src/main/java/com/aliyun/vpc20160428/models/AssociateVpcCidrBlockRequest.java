// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockRequest extends TeaModel {
    /**
     * <p>The specified IPv6 CIDR block of the VPC.</p>
     * <blockquote>
     * <p>You cannot specify both <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong>.</p>
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
     * <li><strong>IPV4</strong>: IPv4 address.</li>
     * <li><strong>IPV6</strong>: IPv6 address. When <strong>IpVersion</strong> is set to <strong>IPV6</strong> and <strong>SecondaryCidrBlock</strong> is not specified, a secondary IPv6 CIDR block is added to the VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The instance ID of the IPAM pool.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-sycmt3p2a9v63i****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The subnet mask used to add an IPv6 CIDR block from an IPAM pool to the VPC.</p>
     * <blockquote>
     * <p>When you use an IPAM pool to add a secondary IPv6 CIDR block to the VPC, you must specify at least one of IPv6CidrBlock and Ipv6CidrMask.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>56</p>
     */
    @NameInMap("Ipv6CidrMask")
    public Integer ipv6CidrMask;

    /**
     * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): Alibaba Cloud BGP IPv6.</li>
     * <li><strong>ChinaMobile</strong>: China Mobile (single ISP).</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP).</li>
     * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP).</li>
     * </ul>
     * <blockquote>
     * <p>If your account is included in the China single-ISP bandwidth whitelist, you can set this parameter to <strong>ChinaTelecom</strong> (China Telecom), <strong>ChinaUnicom</strong> (China Unicom), or <strong>ChinaMobile</strong> (China Mobile).</p>
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
     * <p>The region ID of the VPC to which you want to add a secondary CIDR block. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The secondary IPv4 CIDR block to add. The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>Use a private IPv4 address specified in RFC 1918 as the secondary IPv4 CIDR block of the VPC. The subnet mask is recommended to be 16 to 28 bits in length. Examples: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.</li>
     * <li>You can use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, or their subnets as the secondary IPv4 CIDR block of the virtual private cloud (VPC).</li>
     * </ul>
     * <p>Configuration limits:</p>
     * <ul>
     * <li><p>The CIDR block cannot start with 0. The subnet mask is recommended to be 16 to 28 bits in length.</p>
     * </li>
     * <li><p>The secondary CIDR block cannot overlap with the primary CIDR block or existing secondary CIDR blocks of the VPC.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not use an IPAM pool to add a secondary CIDR block to the VPC, you must specify either the <strong>SecondaryCidrBlock</strong> parameter or the <strong>Ipv6CidrBlock</strong> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    /**
     * <p>The subnet mask used to add a secondary IPv4 CIDR block from an IPAM pool to the VPC.</p>
     * <blockquote>
     * <p>When you use an IPAM pool to add a secondary IPv4 CIDR block to the VPC, you must specify at least one of SecondaryCidrBlock and SecondaryCidrMask.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
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

    public AssociateVpcCidrBlockRequest setIpv6CidrMask(Integer ipv6CidrMask) {
        this.ipv6CidrMask = ipv6CidrMask;
        return this;
    }
    public Integer getIpv6CidrMask() {
        return this.ipv6CidrMask;
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
