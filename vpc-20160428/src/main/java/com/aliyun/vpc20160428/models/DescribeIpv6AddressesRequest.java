// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesRequest extends TeaModel {
    /**
     * <p>The ID of the instance that is assigned the IPv6 address.</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of instance associated with the IPv6 address. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance**: Elastic Compute Service (ECS) instance in a virtual private cloud (VPC)</p>
     * <p>*   **NetworkInterface**: secondary elastic network interface (ENI)</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The IPv6 address that you want to query.</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    /**
     * <p>The ID of the IPv6 address that you want to query. You can enter at most 20 IPv6 address IDs in each API request. Separate IPv6 address IDs with commas (,).</p>
     */
    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    /**
     * <p>The ID of the Internet bandwidth that you purchased for the IPv6 address.</p>
     */
    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    /**
     * <p>The name of the IPv6 address that you want to query.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of communication supported by the IPv6 address. Valid values:</p>
     * <br>
     * <p>*   **Private**</p>
     * <p>*   **Public**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which you want to query IPv6 addresses. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IPv6 gateway belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Indicates whether the instance is managed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>If you do not specify this parameter, all instances are queried.</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeIpv6AddressesRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the IPv6 address belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the IPv6 address belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesRequest self = new DescribeIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6AddressesRequest setAssociatedInstanceId(String associatedInstanceId) {
        this.associatedInstanceId = associatedInstanceId;
        return this;
    }
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    public DescribeIpv6AddressesRequest setAssociatedInstanceType(String associatedInstanceType) {
        this.associatedInstanceType = associatedInstanceType;
        return this;
    }
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    public DescribeIpv6AddressesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeIpv6AddressesRequest setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public DescribeIpv6AddressesRequest setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public DescribeIpv6AddressesRequest setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
        this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
        return this;
    }
    public String getIpv6InternetBandwidthId() {
        return this.ipv6InternetBandwidthId;
    }

    public DescribeIpv6AddressesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6AddressesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeIpv6AddressesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeIpv6AddressesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeIpv6AddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6AddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6AddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6AddressesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeIpv6AddressesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeIpv6AddressesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeIpv6AddressesRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeIpv6AddressesRequest setTag(java.util.List<DescribeIpv6AddressesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeIpv6AddressesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeIpv6AddressesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeIpv6AddressesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeIpv6AddressesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length. It can be an empty string. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <br>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values at a time.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeIpv6AddressesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesRequestTag self = new DescribeIpv6AddressesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeIpv6AddressesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
