// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("VSwitches")
    public DescribeVSwitchesResponseBodyVSwitches vSwitches;

    public static DescribeVSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponseBody self = new DescribeVSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeVSwitchesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesResponseBody setVSwitches(DescribeVSwitchesResponseBodyVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeVSwitchesResponseBodyVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitchTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable extends TeaModel {
        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable self = new DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVSwitchesResponseBodyVSwitchesVSwitch extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        @NameInMap("Tags")
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTags tags;

        @NameInMap("RouteTable")
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable routeTable;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeVSwitchesResponseBodyVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseBodyVSwitchesVSwitch self = new DescribeVSwitchesResponseBodyVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setTags(DescribeVSwitchesResponseBodyVSwitchesVSwitchTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchTags getTags() {
            return this.tags;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setRouteTable(DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public DescribeVSwitchesResponseBodyVSwitchesVSwitchRouteTable getRouteTable() {
            return this.routeTable;
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

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVSwitchesResponseBodyVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
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
