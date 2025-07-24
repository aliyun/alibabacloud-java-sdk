// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    /**
     * <p>The CIDR block of the VPC.</p>
     * <ul>
     * <li>We recommend using the private IPv4 address specified in RFC 1918 as the primary IPv4 CIDR block of the VPC with a recommended mask length of 16 to 28 bits. For example, 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.</li>
     * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, or their subnets as the primary IPv4 CIDR block.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the VPC.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my first Vpc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Whether to enable the DNS hostname feature. Values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Not enabled. </li>
     * <li><strong>true</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDnsHostname")
    public Boolean enableDnsHostname;

    /**
     * <p>Indicates whether IPv6 is enabled. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disabled.</li>
     * <li><strong>true</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>Allocate VPC from the IPAM address pool by inputting a mask.</p>
     * <blockquote>
     * <p>When creating a VPC with a specified IPAM address pool, at least one of the parameters CidrBlock or Ipv4CidrMask must be provided.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Ipv4CidrMask")
    public Integer ipv4CidrMask;

    /**
     * <p>The ID of the IP Address Manager (IPAM) pool of the IPv4 type.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-sycmt3p2a9v63i****</p>
     */
    @NameInMap("Ipv4IpamPoolId")
    public String ipv4IpamPoolId;

    /**
     * <p>The IPv6 CIDR block of the VPC. If you enable IPv6 for a VPC, the system allocates an IPv6 CIDR block. To specify an IPv6 CIDR block, you must call the <a href="https://help.aliyun.com/document_detail/448916.html">AllocateVpcIpv6Cidr</a> operation to reserve the specified IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:6a::/56</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    @NameInMap("Ipv6CidrMask")
    public Integer ipv6CidrMask;

    @NameInMap("Ipv6IpamPoolId")
    public String ipv6IpamPoolId;

    /**
     * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default)</li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaTelecom</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you are allowed to use single-ISP bandwidth, you can set the value to <strong>ChinaTelecom</strong>, <strong>ChinaUnicom</strong>, or <strong>ChinaMobile</strong>.</p>
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
     * <p>The ID of the region to which the VPC belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a></p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcRequestTag> tag;

    /**
     * <p>The user CIDR block. Separate user CIDR blocks with commas (,). You can specify up to three user CIDR blocks.</p>
     * <p>For more information about user CIDR blocks, see the <code>What is a user CIDR block?</code> section in <a href="https://help.aliyun.com/document_detail/185311.html">VPC FAQ</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/12</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The name of the VPC.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    public static CreateVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcRequest self = new CreateVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcRequest setEnableDnsHostname(Boolean enableDnsHostname) {
        this.enableDnsHostname = enableDnsHostname;
        return this;
    }
    public Boolean getEnableDnsHostname() {
        return this.enableDnsHostname;
    }

    public CreateVpcRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateVpcRequest setIpv4CidrMask(Integer ipv4CidrMask) {
        this.ipv4CidrMask = ipv4CidrMask;
        return this;
    }
    public Integer getIpv4CidrMask() {
        return this.ipv4CidrMask;
    }

    public CreateVpcRequest setIpv4IpamPoolId(String ipv4IpamPoolId) {
        this.ipv4IpamPoolId = ipv4IpamPoolId;
        return this;
    }
    public String getIpv4IpamPoolId() {
        return this.ipv4IpamPoolId;
    }

    public CreateVpcRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public CreateVpcRequest setIpv6CidrMask(Integer ipv6CidrMask) {
        this.ipv6CidrMask = ipv6CidrMask;
        return this;
    }
    public Integer getIpv6CidrMask() {
        return this.ipv6CidrMask;
    }

    public CreateVpcRequest setIpv6IpamPoolId(String ipv6IpamPoolId) {
        this.ipv6IpamPoolId = ipv6IpamPoolId;
        return this;
    }
    public String getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId;
    }

    public CreateVpcRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public CreateVpcRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpcRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpcRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpcRequest setTag(java.util.List<CreateVpcRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpcRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public CreateVpcRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public static class CreateVpcRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be at most 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, but cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVpcRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcRequestTag self = new CreateVpcRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
