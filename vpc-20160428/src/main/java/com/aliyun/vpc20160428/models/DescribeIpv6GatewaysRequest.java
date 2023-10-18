// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysRequest extends TeaModel {
    /**
     * <p>The ID of the IPv6 gateway.</p>
     */
    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    /**
     * <p>The name of the IPv6 gateway.</p>
     * <br>
     * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the IPv6 gateway is deployed. You can call the [DescribeRegions](~~36063~~) operation to query the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeIpv6GatewaysRequestTags> tags;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeIpv6GatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysRequest self = new DescribeIpv6GatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewaysRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public DescribeIpv6GatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6GatewaysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeIpv6GatewaysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeIpv6GatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6GatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6GatewaysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6GatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeIpv6GatewaysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeIpv6GatewaysRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeIpv6GatewaysRequest setTags(java.util.List<DescribeIpv6GatewaysRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeIpv6GatewaysRequestTags> getTags() {
        return this.tags;
    }

    public DescribeIpv6GatewaysRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeIpv6GatewaysRequestTags extends TeaModel {
        /**
         * <p>The tag keys of the resources. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the resources. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeIpv6GatewaysRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysRequestTags self = new DescribeIpv6GatewaysRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeIpv6GatewaysRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
