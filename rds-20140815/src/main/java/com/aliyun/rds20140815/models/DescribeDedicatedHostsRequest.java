// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsRequest extends TeaModel {
    /**
     * <p>Specifies whether instances can be deployed on the host. Valid values:</p>
     * <br>
     * <p>*   **0**: Instances cannot be deployed on the host.</p>
     * <p>*   **1**: Instances can be deployed on the host.</p>
     */
    @NameInMap("AllocationStatus")
    public String allocationStatus;

    /**
     * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The ID of the host in the dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The status of the host. Valid values:</p>
     * <br>
     * <p>*   **0**: creating</p>
     * <p>*   **1**: running</p>
     * <p>*   **2**: faulty</p>
     * <p>*   **3**: being replaced</p>
     * <p>*   **4**: deprecated</p>
     * <p>*   **5**: deleting</p>
     * <p>*   **6**: restarting</p>
     */
    @NameInMap("HostStatus")
    public String hostStatus;

    /**
     * <p>The storage type of the host. Valid values:</p>
     * <br>
     * <p>*   **dhg_cloud_ssd**: enhanced SSD (ESSD)</p>
     * <p>*   **dhg_local_ssd**: local SSD</p>
     */
    @NameInMap("HostType")
    public String hostType;

    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsRequest self = new DescribeDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsRequest setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
        return this;
    }
    public String getAllocationStatus() {
        return this.allocationStatus;
    }

    public DescribeDedicatedHostsRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDedicatedHostsRequest setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }
    public String getHostStatus() {
        return this.hostStatus;
    }

    public DescribeDedicatedHostsRequest setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public DescribeDedicatedHostsRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeDedicatedHostsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedHostsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedHostsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
