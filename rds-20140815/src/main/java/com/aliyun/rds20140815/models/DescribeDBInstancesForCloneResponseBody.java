// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForCloneResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the instances.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancesForCloneResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstancesForCloneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForCloneResponseBody self = new DescribeDBInstancesForCloneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForCloneResponseBody setItems(DescribeDBInstancesForCloneResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesForCloneResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancesForCloneResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesForCloneResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesForCloneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesForCloneResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        /**
         * <p>The ID of the read-only instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstancesForCloneResponseBodyItemsDBInstance extends TeaModel {
        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: RDS Basic Edition</p>
         * <p>*   **HighAvailability**: RDS High-availability Edition</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Standard**: standard mode</p>
         * <p>*   **Safe**: database proxy mode</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance type of the instance. For more information, see [Instance types](~~26312~~).</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The name of the instance. It must be 2 to 256 characters in length. The value can contain letters, digits, underscores (\_), and hyphens (-). The value must start with a letter.</p>
         * <br>
         * <p>> The value cannot start with http:// or https://.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The network connection type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Internet**</p>
         * <p>*   **Intranet**</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The status of the instance. For more information, see [Instance state table](~~26315~~).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd/ephemeral_ssd**: local SSD</p>
         * <p>*   **cloud_ssd**: standard SSD.</p>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD)</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <br>
         * <p>*   **Primary**: primary instance</p>
         * <p>*   **Readonly**: read-only instance</p>
         * <p>*   **Guard**: disaster recovery instance</p>
         * <p>*   **Temp**: temporary instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the instance was destroyed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   MySQL</p>
         * <p>*   SQLServer</p>
         * <p>*   PostgreSQL</p>
         * <p>*   PPAS</p>
         * <p>*   MariaDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the instance expired. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the disaster recovery instance. This parameter is returned only when the instance is a primary instance and has a disaster recovery instance.</p>
         */
        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        /**
         * <p>The ID of the instance role.</p>
         */
        @NameInMap("InsId")
        public Integer insId;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The lock method of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked after it expires.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before a rollback.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance was locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The ID of the primary instance. If the value of this parameter is null, the instance is a primary instance.</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>Indicates whether multi-region deployment is used. Valid values:</p>
         * <br>
         * <p>*   **true**: Multi-region deployment is used.</p>
         * <p>*   **false**: Multi-region deployment is not used.</p>
         */
        @NameInMap("MutriORsignle")
        public Boolean mutriORsignle;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go</p>
         * <p>*   **Prepaid**: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>An array consisting of the IDs of the read-only instances that are attached to the primary instance.</p>
         */
        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>None.</p>
         */
        @NameInMap("ReplicateId")
        public String replicateId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the temporary instance.</p>
         */
        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the instance in the VPC.</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesForCloneResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseBodyItemsDBInstance self = new DescribeDBInstancesForCloneResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setInsId(Integer insId) {
            this.insId = insId;
            return this;
        }
        public Integer getInsId() {
            return this.insId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
            return this;
        }
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setReadOnlyDBInstanceIds(DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstancesForCloneResponseBodyItemsDBInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setReplicateId(String replicateId) {
            this.replicateId = replicateId;
            return this;
        }
        public String getReplicateId() {
            return this.replicateId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesForCloneResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesForCloneResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDBInstancesForCloneResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseBodyItems self = new DescribeDBInstancesForCloneResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesForCloneResponseBodyItems setDBInstance(java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesForCloneResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
