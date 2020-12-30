// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("ServiceLocation")
    public String serviceLocation;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeGlobalAccelerationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesRequest self = new DescribeGlobalAccelerationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGlobalAccelerationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGlobalAccelerationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeGlobalAccelerationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGlobalAccelerationInstancesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeGlobalAccelerationInstancesRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public DescribeGlobalAccelerationInstancesRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeGlobalAccelerationInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGlobalAccelerationInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGlobalAccelerationInstancesRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public DescribeGlobalAccelerationInstancesRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public DescribeGlobalAccelerationInstancesRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeGlobalAccelerationInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalAccelerationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalAccelerationInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
