// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RouteTable")
    public DescribeVSwitchAttributesResponseBodyRouteTable routeTable;

    @NameInMap("Status")
    public String status;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("VpcId")
    public String vpcId;

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
        @NameInMap("RouteTableId")
        public String routeTableId;

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

}
