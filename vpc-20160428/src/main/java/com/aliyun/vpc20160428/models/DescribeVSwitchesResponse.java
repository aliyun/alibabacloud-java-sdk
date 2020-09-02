// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VSwitches")
    @Validation(required = true)
    public DescribeVSwitchesResponseVSwitches vSwitches;

    public static DescribeVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponse self = new DescribeVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVSwitchesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchesResponse setVSwitches(DescribeVSwitchesResponseVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeVSwitchesResponseVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVSwitchesResponseVSwitchesVSwitchTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchTagsTag self = new DescribeVSwitchesResponseVSwitchesVSwitchTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitchesVSwitchTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitchTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitchTagsTag> tag;

        public static DescribeVSwitchesResponseVSwitchesVSwitchTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchTags self = new DescribeVSwitchesResponseVSwitchesVSwitchTags();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitchesVSwitchTags setTag(java.util.List<DescribeVSwitchesResponseVSwitchesVSwitchTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitchTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitchRouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        public static DescribeVSwitchesResponseVSwitchesVSwitchRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitchRouteTable self = new DescribeVSwitchesResponseVSwitchesVSwitchRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitchesVSwitchRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitchRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitch extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("Ipv6CidrBlock")
        @Validation(required = true)
        public String ipv6CidrBlock;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("AvailableIpAddressCount")
        @Validation(required = true)
        public Long availableIpAddressCount;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VSwitchName")
        @Validation(required = true)
        public String vSwitchName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("NetworkAclId")
        @Validation(required = true)
        public String networkAclId;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("ShareType")
        @Validation(required = true)
        public String shareType;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeVSwitchesResponseVSwitchesVSwitchTags tags;

        @NameInMap("RouteTable")
        @Validation(required = true)
        public DescribeVSwitchesResponseVSwitchesVSwitchRouteTable routeTable;

        public static DescribeVSwitchesResponseVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitch self = new DescribeVSwitchesResponseVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setTags(DescribeVSwitchesResponseVSwitchesVSwitchTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVSwitchesResponseVSwitchesVSwitchTags getTags() {
            return this.tags;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setRouteTable(DescribeVSwitchesResponseVSwitchesVSwitchRouteTable routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public DescribeVSwitchesResponseVSwitchesVSwitchRouteTable getRouteTable() {
            return this.routeTable;
        }

    }

    public static class DescribeVSwitchesResponseVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchesResponseVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitches self = new DescribeVSwitchesResponseVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitches setVSwitch(java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}
