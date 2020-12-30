// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("RouteTable")
    public DescribeVSwitchAttributesResponseBodyRouteTable routeTable;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    public static DescribeVSwitchAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponseBody self = new DescribeVSwitchAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVSwitchAttributesResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVSwitchAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVSwitchAttributesResponseBody setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
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

    public DescribeVSwitchAttributesResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeVSwitchAttributesResponseBody setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchAttributesResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setRouteTable(DescribeVSwitchAttributesResponseBodyRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyRouteTable getRouteTable() {
        return this.routeTable;
    }

    public DescribeVSwitchAttributesResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVSwitchAttributesResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVSwitchAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public DescribeVSwitchAttributesResponseBody setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public static class DescribeVSwitchAttributesResponseBodyRouteTable extends TeaModel {
        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVSwitchAttributesResponseBodyRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyRouteTable self = new DescribeVSwitchAttributesResponseBodyRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
