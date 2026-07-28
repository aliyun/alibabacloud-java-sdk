// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesRequest extends TeaModel {
    /**
     * <p>The bandwidth type of the Alibaba Cloud Global Accelerator (GA) instance. Valid values: </p>
     * <ul>
     * <li><p><strong>Sharing</strong>: Queries shared-bandwidth instances.</p>
     * </li>
     * <li><p><strong>Exclusive</strong> (default): Queries dedicated-bandwidth instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the Alibaba Cloud Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-234sljmxaz****</p>
     */
    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    /**
     * <p>Specifies whether to include reservation data that has not taken effect. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Does not include reservation data that has not taken effect.</p>
     * </li>
     * <li><p><strong>true</strong>: Includes reservation data that has not taken effect.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The public IP address of the Alibaba Cloud Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>12.xx.xx.78</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The name of the Alibaba Cloud Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>GA-1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging queries. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Alibaba Cloud Global Accelerator (GA) instance resides. You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The instance ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>i-sxjblddejj9x****</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The backend service region. Valid values: </p>
     * <ul>
     * <li><p><strong>china-mainland</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>north-america</strong>: North America.</p>
     * </li>
     * <li><p><strong>asia-pacific</strong>: Asia Pacific.</p>
     * </li>
     * <li><p><strong>europe</strong>: Europe.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>china-mainland</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    /**
     * <p>The instance status of the Alibaba Cloud Global Accelerator (GA) instance. Valid values: </p>
     * <ul>
     * <li><p><strong>Available</strong>: active.</p>
     * </li>
     * <li><p><strong>Inuse</strong>: Allocated.</p>
     * </li>
     * <li><p><strong>Associating</strong>: Being attached.</p>
     * </li>
     * <li><p><strong>Unassociating</strong>: Being disassociated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
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
