// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    /**
     * <p>The CIDR block of the VPC.</p>
     * <br>
     * <p>*   You can specify one of the following CIDR blocks or their subsets as the primary IPv4 CIDR block of the VPC: 192.168.0.0/16, 172.16.0.0/12, and 10.0.0.0/8. These CIDR blocks are standard private CIDR blocks as defined by Request for Comments (RFC) documents. The subnet mask must be 8 to 28 bits in length.</p>
     * <p>*   You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, 169.254.0.0/16, and their subnets as the primary IPv4 CIDR block of the VPC.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

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
     * <p>The description of the VPC.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    @NameInMap("Ipv4CidrMask")
    public Integer ipv4CidrMask;

    /**
     * <p>The ID of the IP Address Manager (IPAM) pool of the IPv4 type.</p>
     */
    @NameInMap("Ipv4IpamPoolId")
    public String ipv4IpamPoolId;

    /**
     * <p>The IPv6 CIDR block of the VPC.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default)</p>
     * <p>*   **ChinaMobile**</p>
     * <p>*   **ChinaUnicom**</p>
     * <p>*   **ChinaTelecom**</p>
     * <br>
     * <p>>  If you are allowed to use single-ISP bandwidth, you can set the value to **ChinaTelecom**, **ChinaUnicom**, or **ChinaMobile**.</p>
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

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [What is a resource group?](~~94475~~)</p>
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
     * <br>
     * <p>For more information about user CIDR blocks, see the `What is a user CIDR block?` section in [VPC FAQ](~~185311~~).</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The name of the VPC.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
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
         * <br>
         * <p>The tag key can be at most 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length, but cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.</p>
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
