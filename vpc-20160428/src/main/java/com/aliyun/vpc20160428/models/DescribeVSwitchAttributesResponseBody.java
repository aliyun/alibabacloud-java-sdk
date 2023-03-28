// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    /**
     * <p>The number of available IP addresses.</p>
     */
    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    /**
     * <p>The CIDR block of the vSwitch.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The time when the vSwitch was created.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the vSwitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IPv6 CIDR block of the vSwitch.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The network access control list (ACL) rules.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the vSwitch belongs.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The information about the route table that is associated with the vSwitch.</p>
     */
    @NameInMap("RouteTable")
    public DescribeVSwitchAttributesResponseBodyRouteTable routeTable;

    /**
     * <p>The status of the vSwitch. Valid values:</p>
     * <br>
     * <p>*   **Pending**</p>
     * <p>*   **Available**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public DescribeVSwitchAttributesResponseBodyTags tags;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The name of the vSwitch.</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    /**
     * <p>The ID of the VPC to which the vSwitch belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone to which the vSwitch belongs.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeVSwitchAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponseBody self = new DescribeVSwitchAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponseBody setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public DescribeVSwitchAttributesResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVSwitchAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVSwitchAttributesResponseBody setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVSwitchAttributesResponseBody setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeVSwitchAttributesResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVSwitchAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchAttributesResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVSwitchAttributesResponseBody setRouteTable(DescribeVSwitchAttributesResponseBodyRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyRouteTable getRouteTable() {
        return this.routeTable;
    }

    public DescribeVSwitchAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVSwitchAttributesResponseBody setTags(DescribeVSwitchAttributesResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public DescribeVSwitchAttributesResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVSwitchAttributesResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeVSwitchAttributesResponseBodyRouteTable extends TeaModel {
        /**
         * <p>The ID of the route table that is associated with the vSwitch.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <br>
         * <p>*   **System**: system route table</p>
         * <p>*   **Custom**: custom route table</p>
         */
        @NameInMap("RouteTableType")
        public String routeTableType;

        public static DescribeVSwitchAttributesResponseBodyRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyRouteTable self = new DescribeVSwitchAttributesResponseBodyRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVSwitchAttributesResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyTagsTag self = new DescribeVSwitchAttributesResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVSwitchAttributesResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> tag;

        public static DescribeVSwitchAttributesResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyTags self = new DescribeVSwitchAttributesResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyTags setTag(java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
