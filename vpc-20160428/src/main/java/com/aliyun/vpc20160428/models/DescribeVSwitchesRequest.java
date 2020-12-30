// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VSwitchOwnerId")
    public Long vSwitchOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeVSwitchesRequestTag> tag;

    public static DescribeVSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesRequest self = new DescribeVSwitchesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVSwitchesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVSwitchesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVSwitchesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVSwitchesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeVSwitchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVSwitchesRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public DescribeVSwitchesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeVSwitchesRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVSwitchesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeVSwitchesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVSwitchesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVSwitchesRequest setVSwitchOwnerId(Long vSwitchOwnerId) {
        this.vSwitchOwnerId = vSwitchOwnerId;
        return this;
    }
    public Long getVSwitchOwnerId() {
        return this.vSwitchOwnerId;
    }

    public DescribeVSwitchesRequest setTag(java.util.List<DescribeVSwitchesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVSwitchesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeVSwitchesRequestTag extends TeaModel {
        public static DescribeVSwitchesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesRequestTag self = new DescribeVSwitchesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
