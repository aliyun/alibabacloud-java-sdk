// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the instance that is assigned the IPv6 address.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze72wuqj4y3jl4f****</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of instance associated with the IPv6 address. Valid values:</p>
     * <ul>
     * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance in a virtual private cloud (VPC)</li>
     * <li><strong>NetworkInterface</strong>: secondary elastic network interface (ENI)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EcsInstance</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The IPv6 address that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:153:3921:851c:c435:7b12:1c5f</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    /**
     * <p>The ID of the IPv6 address that you want to query. You can enter at most 20 IPv6 address IDs in each API request. Separate IPv6 address IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6-2zen5j4axcp5l5qyy****</p>
     */
    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    /**
     * <p>The ID of the Internet bandwidth that you purchased for the IPv6 address.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6bw-uf6hcyzu65v98v3du****</p>
     */
    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    /**
     * <p>The name of the IPv6 address that you want to query.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of communication supported by the IPv6 address. Valid values:</p>
     * <ul>
     * <li><strong>Private</strong></li>
     * <li><strong>Public</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which you want to query IPv6 addresses. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IPv6 gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Indicates whether the instance is managed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>If you do not specify this parameter, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * 
     * <strong>example:</strong>
     * <p>vsw-25navfgbue4g****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the IPv6 address belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72zv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesRequest self = new DescribeIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6AddressesRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
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
         * <p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <p>The tag value can be up to 128 characters in length. It can be an empty string. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>yunke</p>
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
