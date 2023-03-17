// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListRequest extends TeaModel {
    /**
     * <p>The ID of the dedicated cluster. You can view the dedicated cluster ID on the Dedicated Clusters page in the ApsaraDB for MyBase console.</p>
     * <br>
     * <p>> Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the host in the dedicated cluster. You can call the [DescribeDedicatedHosts](~~200944~~) operation to query the host ID.</p>
     * <br>
     * <p>> Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The database engine of the instance. Set the value to **Redis**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Set the value to **5.0**.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> The instance must be created by using a dedicated cluster. For more information, see [What is ApsaraDB for MyBase?](~~141455~~)</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **0**: Internet</p>
     * <p>*   **1**: classic network</p>
     * <p>*   **2**: Virtual Private Cloud (VPC)</p>
     */
    @NameInMap("InstanceNetType")
    public String instanceNetType;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>*   **0**: The instance is being created.</p>
     * <p>*   **1**: The instance is running.</p>
     * <p>*   **3**: The instance is being deleted.</p>
     * <p>*   **5**: The configurations of the instance are being changed.</p>
     * <p>*   **6**: The instance is being migrated.</p>
     * <p>*   **7**: The instance is being restored from a backup.</p>
     * <p>*   **8**: A master-replica switchover is in progress.</p>
     * <p>*   **9**: Expired data of the instance is being deleted.</p>
     */
    @NameInMap("InstanceStatus")
    public Integer instanceStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than **0**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeZones](~~94527~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedClusterInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListRequest self = new DescribeDedicatedClusterInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDedicatedClusterInstanceListRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceNetType(String instanceNetType) {
        this.instanceNetType = instanceNetType;
        return this;
    }
    public String getInstanceNetType() {
        return this.instanceNetType;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Integer getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedClusterInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDedicatedClusterInstanceListRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
