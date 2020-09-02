// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("RouteTable")
    @Validation(required = true)
    public DescribeVSwitchAttributesResponseRouteTable routeTable;

    public static DescribeVSwitchAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponse self = new DescribeVSwitchAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchAttributesResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchAttributesResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVSwitchAttributesResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVSwitchAttributesResponse setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVSwitchAttributesResponse setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public DescribeVSwitchAttributesResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeVSwitchAttributesResponse setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public DescribeVSwitchAttributesResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVSwitchAttributesResponse setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public DescribeVSwitchAttributesResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVSwitchAttributesResponse setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVSwitchAttributesResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVSwitchAttributesResponse setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeVSwitchAttributesResponse setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVSwitchAttributesResponse setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public DescribeVSwitchAttributesResponse setRouteTable(DescribeVSwitchAttributesResponseRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }
    public DescribeVSwitchAttributesResponseRouteTable getRouteTable() {
        return this.routeTable;
    }

    public static class DescribeVSwitchAttributesResponseRouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("RouteTableType")
        @Validation(required = true)
        public String routeTableType;

        public static DescribeVSwitchAttributesResponseRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseRouteTable self = new DescribeVSwitchAttributesResponseRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVSwitchAttributesResponseRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

}
