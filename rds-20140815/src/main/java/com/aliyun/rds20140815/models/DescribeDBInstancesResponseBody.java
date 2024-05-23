// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancesResponseBodyItems items;

    /**
     * <p>The token that is used to display the next page. If the returned entries are displayed on multiple pages, the next page can be displayed when you call this operation again with **NextToken** specified.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>> If you specify **MaxResults** or **NextToken**, only the value **1** is returned. You can ignore the value 1.</p>
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
     * <br>
     * <p>> If you specify **MaxResults** or **NextToken**, only the number of entries on the current page is returned. You can ignore the number.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setItems(DescribeDBInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        /**
         * <p>The read-only instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstance extends TeaModel {
        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("BpeEnabled")
        public String bpeEnabled;

        /**
         * <p>Indicates whether the I/O burst feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: RDS Basic Edition</p>
         * <p>*   **HighAvailability**: RDS High-availability Edition</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         * <br>
         * <p>>  This parameter is returned only when the **InstanceLevel** parameter is set to **1**.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("ColdDataEnabled")
        public Boolean coldDataEnabled;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Standard**: standard mode</p>
         * <p>*   **Safe**: database proxy mode</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The creation time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of CPU instances.</p>
         * <br>
         * <p>Returns only when the InstanceLevel parameter is 1.</p>
         */
        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        /**
         * <p>The instance type of the instance. For information, see [Primary ApsaraDB RDS instance types](https://help.aliyun.com/document_detail/26312.html).</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The instance description.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The memory size of the node. Unit: MB.</p>
         * <br>
         * <p>Returns only when the InstanceLevel parameter is 1.</p>
         */
        @NameInMap("DBInstanceMemory")
        public Integer DBInstanceMemory;

        /**
         * <p>The type of the network connection to the instance. Valid values:</p>
         * <br>
         * <p>*   **Internet**</p>
         * <p>*   **Intranet**</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The instance status. For more information, see [Instance statuses](https://help.aliyun.com/document_detail/26315.html).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage type of the instance.</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Primary**: primary instance</p>
         * <p>*   **Readonly**: read-only instance</p>
         * <p>*   **Guard**: disaster recovery instance</p>
         * <p>*   **Temp**: temporary instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The ID of the dedicated cluster.</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The name of the dedicated cluster.</p>
         */
        @NameInMap("DedicatedHostGroupName")
        public String dedicatedHostGroupName;

        /**
         * <p>The ID of the host on which the logger instance resides.</p>
         */
        @NameInMap("DedicatedHostIdForLog")
        public String dedicatedHostIdForLog;

        /**
         * <p>The ID of the host on which the primary instance resides.</p>
         */
        @NameInMap("DedicatedHostIdForMaster")
        public String dedicatedHostIdForMaster;

        /**
         * <p>The ID of the host on which the secondary instance resides.</p>
         */
        @NameInMap("DedicatedHostIdForSlave")
        public String dedicatedHostIdForSlave;

        /**
         * <p>The name of the host on which the logger instance resides.</p>
         */
        @NameInMap("DedicatedHostNameForLog")
        public String dedicatedHostNameForLog;

        /**
         * <p>The name of the host on which the primary instance resides.</p>
         */
        @NameInMap("DedicatedHostNameForMaster")
        public String dedicatedHostNameForMaster;

        /**
         * <p>The name of the host on which the secondary instance resides.</p>
         */
        @NameInMap("DedicatedHostNameForSlave")
        public String dedicatedHostNameForSlave;

        /**
         * <p>The zone ID of the host on which the logger instance resides.</p>
         */
        @NameInMap("DedicatedHostZoneIdForLog")
        public String dedicatedHostZoneIdForLog;

        /**
         * <p>The zone ID of the host on which the primary instance resides.</p>
         */
        @NameInMap("DedicatedHostZoneIdForMaster")
        public String dedicatedHostZoneIdForMaster;

        /**
         * <p>The zone ID of the host on which the secondary instance resides.</p>
         */
        @NameInMap("DedicatedHostZoneIdForSlave")
        public String dedicatedHostZoneIdForSlave;

        /**
         * <p>Indicates whether the release protection feature is enabled for the instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The time when the instance was destroyed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  Pay-as-you-go instances never expire.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
         */
        @NameInMap("GeneralGroupName")
        public String generalGroupName;

        /**
         * <p>The ID of the disaster recovery instance. This parameter is returned only when the instance is a primary instance and has a disaster recovery instance attached.</p>
         */
        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>Indicates whether the I/O acceleration feature is enabled. Valid values:</p>
         * <br>
         * <p>*   1: enabled</p>
         * <p>*   0: disabled</p>
         */
        @NameInMap("IoAccelerationEnabled")
        public String ioAccelerationEnabled;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before the instance is rolled back.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage capacity.</p>
         * <p>*   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance was locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The ID of the primary instance. If this parameter is null, the instance is a primary instance.</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>Indicates whether the multi-zone deployment method is used for the instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  If the multi-zone deployment method is used for the instance, the zone ID of the instance contains MAZ. Example: `cn-hangzhou-MAZ10(h,i)`.</p>
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
         * <p>The IDs of the read-only instances. This parameter is returned only when the instance is a primary instance and has the read-only instances attached.</p>
         */
        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the instance supports weight-based switchovers for high availability. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
         * <br>
         * <p>*   **100**: The instance supports weight-based switchovers for high availability.</p>
         * <p>*   **0**: The instance does not support weight-based switchovers for high availability.</p>
         */
        @NameInMap("SwitchWeight")
        public Integer switchWeight;

        /**
         * <p>The ID of the temporary instance. This parameter is returned only when the instance is a primary instance and has a temporary instance attached.</p>
         */
        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        /**
         * <p>The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <p>The severity of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
         * <br>
         * <p>*   **1**: The instance is normal.</p>
         * <p>*   **2**: The specifications of the read-only instances do not match the specifications of the primary instance, and instance performance may be affected. You must adjust the specifications of these instances based on your business requirements.</p>
         */
        @NameInMap("TipsLevel")
        public Integer tipsLevel;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the instance. This parameter is returned only when the instance resides in a VPC.</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC name.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstance self = new DescribeDBInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setBpeEnabled(String bpeEnabled) {
            this.bpeEnabled = bpeEnabled;
            return this;
        }
        public String getBpeEnabled() {
            return this.bpeEnabled;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setColdDataEnabled(Boolean coldDataEnabled) {
            this.coldDataEnabled = coldDataEnabled;
            return this;
        }
        public Boolean getColdDataEnabled() {
            return this.coldDataEnabled;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceMemory(Integer DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Integer getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostGroupName(String dedicatedHostGroupName) {
            this.dedicatedHostGroupName = dedicatedHostGroupName;
            return this;
        }
        public String getDedicatedHostGroupName() {
            return this.dedicatedHostGroupName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForLog(String dedicatedHostIdForLog) {
            this.dedicatedHostIdForLog = dedicatedHostIdForLog;
            return this;
        }
        public String getDedicatedHostIdForLog() {
            return this.dedicatedHostIdForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
            this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
            return this;
        }
        public String getDedicatedHostIdForMaster() {
            return this.dedicatedHostIdForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
            this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
            return this;
        }
        public String getDedicatedHostIdForSlave() {
            return this.dedicatedHostIdForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForLog(String dedicatedHostNameForLog) {
            this.dedicatedHostNameForLog = dedicatedHostNameForLog;
            return this;
        }
        public String getDedicatedHostNameForLog() {
            return this.dedicatedHostNameForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
            this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
            return this;
        }
        public String getDedicatedHostNameForMaster() {
            return this.dedicatedHostNameForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
            this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
            return this;
        }
        public String getDedicatedHostNameForSlave() {
            return this.dedicatedHostNameForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
            this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
            return this;
        }
        public String getDedicatedHostZoneIdForLog() {
            return this.dedicatedHostZoneIdForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
            this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
            return this;
        }
        public String getDedicatedHostZoneIdForMaster() {
            return this.dedicatedHostZoneIdForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
            this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
            return this;
        }
        public String getDedicatedHostZoneIdForSlave() {
            return this.dedicatedHostZoneIdForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setGeneralGroupName(String generalGroupName) {
            this.generalGroupName = generalGroupName;
            return this;
        }
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setIoAccelerationEnabled(String ioAccelerationEnabled) {
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }
        public String getIoAccelerationEnabled() {
            return this.ioAccelerationEnabled;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
            return this;
        }
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setReadOnlyDBInstanceIds(DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setSwitchWeight(Integer switchWeight) {
            this.switchWeight = switchWeight;
            return this;
        }
        public Integer getSwitchWeight() {
            return this.switchWeight;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTipsLevel(Integer tipsLevel) {
            this.tipsLevel = tipsLevel;
            return this;
        }
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDBInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItems self = new DescribeDBInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItems setDBInstance(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
