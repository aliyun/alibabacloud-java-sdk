// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the hosts on which you can create instances or those on which you cannot create instances. Valid values:</p>
     * <br>
     * <p>*   **0**: queries the hosts on which you cannot create instances</p>
     * <p>*   **1**: queries the hosts on which you can create instances</p>
     */
    @NameInMap("AllocationStatus")
    public String allocationStatus;

    /**
     * <p>The ID of the dedicated cluster. You can call the [DescribeDedicatedHostGroups](~~141946~~) operation to query the IDs of dedicated clusters.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The ID of the host.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The status of the hosts. Valid values:</p>
     * <br>
     * <p>*   **0**: queries the hosts that are being created</p>
     * <p>*   **1**: queries the hosts that are running</p>
     * <p>*   **2**: queries the hosts that are faulty</p>
     * <p>*   **3**: queries the hosts that are being replaced</p>
     * <p>*   **4**: queries the hosts that are deprecated</p>
     * <p>*   **5**: queries the hosts that are being deleted</p>
     * <p>*   **6**: queries the hosts that are restarting</p>
     */
    @NameInMap("HostStatus")
    public String hostStatus;

    /**
     * <p>The type of storage media that is used for the hosts. Valid values:</p>
     * <br>
     * <p>*   **dhg_cloud_ssd**: enhanced solid-state drive (SSD)</p>
     * <p>*   **dhg_local_ssd**: local SSD</p>
     */
    @NameInMap("HostType")
    public String hostType;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the hosts. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the hosts.</p>
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
