// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details about the vSwitch.</p>
     */
    @NameInMap("VSwitches")
    public DescribeVSwitchesResponseBodyVSwitches vSwitches;

    public static DescribeVSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponseBody self = new DescribeVSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVSwitchesResponseBody setVSwitches(DescribeVSwitchesResponseBodyVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeVSwitchesResponseBodyVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable extends TeaModel {
        /**
         * <p>The ID of the route table that is associated with the vSwitch.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <br>
         * <p>*   **System**</p>
         * <p>*   **Custom**</p>
         */
        @NameInMap("RouteTableType")
        public String routeTableType;

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable self = new DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag extends TeaModel {
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

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag self = new DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitchTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag> tag;

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitchTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitchTags self = new DescribeVSwitchesResponseBodyVSwitchesVSwitchTags();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTags setTag(java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitch extends TeaModel {
        /**
         * <p>The number of available IP addresses in the vSwitch.</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
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
         * <p>Indicates whether IPv6 is enabled for the vSwitch. If you enable IPv6, you must configure an IPv6 CIDR block for the vSwitch. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnabledIpv6")
        public Boolean enabledIpv6;

        /**
         * <p>The IPv6 CIDR block of the vSwitch.</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the network access control list (ACL).</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the resource group to which the vSwitch belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the route table.</p>
         */
        @NameInMap("RouteTable")
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable routeTable;

        /**
         * <p>Indicates whether the vSwitch is shared.</p>
         * <br>
         * <p>*   If no value is returned, the vSwitch is a regular vSwitch.</p>
         * <p>*   If **Shared** is returned, the vSwitch is shared.</p>
         * <p>*   If **Sharing** is returned, the vSwitch is being shared.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The status of the vSwitch. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the vSwitch.</p>
         */
        @NameInMap("Tags")
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTags tags;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The vSwitch name.</p>
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

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitch self = new DescribeVSwitchesResponseBodyVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setEnabledIpv6(Boolean enabledIpv6) {
            this.enabledIpv6 = enabledIpv6;
            return this;
        }
        public Boolean getEnabledIpv6() {
            return this.enabledIpv6;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setRouteTable(DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable getRouteTable() {
            return this.routeTable;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setTags(DescribeVSwitchesResponseBodyVSwitchesVSwitchTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTags getTags() {
            return this.tags;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeVSwitchesResponseBodyVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        public java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchesResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitches self = new DescribeVSwitchesResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitches setVSwitch(java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeVSwitchesResponseBodyVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}
