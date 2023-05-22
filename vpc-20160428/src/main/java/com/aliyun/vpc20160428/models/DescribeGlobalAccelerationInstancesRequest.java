// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesRequest extends TeaModel {
    /**
     * <p>The bandwidth type of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **Sharing**</p>
     * <p>*   **Exclusive** (default)</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The public IP address of the GA instance.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The name of the GA instance.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the GA instance. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the backend service instance.</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The region of the backend service. Valid values:</p>
     * <br>
     * <p>*   **china-mainland**</p>
     * <p>*   **north-america**</p>
     * <p>*   **asia-pacific**</p>
     * <p>*   **europe**</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    /**
     * <p>The status of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **Available**</p>
     * <p>*   **Inuse**</p>
     * <p>*   **Associating**</p>
     * <p>*   **Unassociating**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeGlobalAccelerationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesRequest self = new DescribeGlobalAccelerationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public DescribeGlobalAccelerationInstancesRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public DescribeGlobalAccelerationInstancesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
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

    public DescribeGlobalAccelerationInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGlobalAccelerationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeGlobalAccelerationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeGlobalAccelerationInstancesRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeGlobalAccelerationInstancesRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public DescribeGlobalAccelerationInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
