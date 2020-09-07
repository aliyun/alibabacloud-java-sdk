// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesResponseItems items;

    public static DescribeDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponse self = new DescribeDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesResponse setItems(DescribeDBInstancesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstancesResponseItemsDBInstance extends TeaModel {
        @NameInMap("InsId")
        @Validation(required = true)
        public Integer insId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("DestroyTime")
        @Validation(required = true)
        public String destroyTime;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("DBInstanceNetType")
        @Validation(required = true)
        public String DBInstanceNetType;

        @NameInMap("ConnectionMode")
        @Validation(required = true)
        public String connectionMode;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("MutriORsignle")
        @Validation(required = true)
        public Boolean mutriORsignle;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("GuardDBInstanceId")
        @Validation(required = true)
        public String guardDBInstanceId;

        @NameInMap("TempDBInstanceId")
        @Validation(required = true)
        public String tempDBInstanceId;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("ReplicateId")
        @Validation(required = true)
        public String replicateId;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AutoUpgradeMinorVersion")
        @Validation(required = true)
        public String autoUpgradeMinorVersion;

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("DedicatedHostIdForMaster")
        @Validation(required = true)
        public String dedicatedHostIdForMaster;

        @NameInMap("DedicatedHostIdForSlave")
        @Validation(required = true)
        public String dedicatedHostIdForSlave;

        @NameInMap("DedicatedHostIdForLog")
        @Validation(required = true)
        public String dedicatedHostIdForLog;

        @NameInMap("DedicatedHostNameForMaster")
        @Validation(required = true)
        public String dedicatedHostNameForMaster;

        @NameInMap("DedicatedHostNameForSlave")
        @Validation(required = true)
        public String dedicatedHostNameForSlave;

        @NameInMap("DedicatedHostNameForLog")
        @Validation(required = true)
        public String dedicatedHostNameForLog;

        @NameInMap("DedicatedHostZoneIdForMaster")
        @Validation(required = true)
        public String dedicatedHostZoneIdForMaster;

        @NameInMap("DedicatedHostZoneIdForSlave")
        @Validation(required = true)
        public String dedicatedHostZoneIdForSlave;

        @NameInMap("DedicatedHostZoneIdForLog")
        @Validation(required = true)
        public String dedicatedHostZoneIdForLog;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("DedicatedHostGroupName")
        @Validation(required = true)
        public String dedicatedHostGroupName;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDBInstancesResponseItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstance self = new DescribeDBInstancesResponseItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseItemsDBInstance setInsId(Integer insId) {
            this.insId = insId;
            return this;
        }
        public Integer getInsId() {
            return this.insId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesResponseItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesResponseItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesResponseItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseItemsDBInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesResponseItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesResponseItemsDBInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
            return this;
        }
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public DescribeDBInstancesResponseItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseItemsDBInstance setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setReplicateId(String replicateId) {
            this.replicateId = replicateId;
            return this;
        }
        public String getReplicateId() {
            return this.replicateId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
            this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
            return this;
        }
        public String getDedicatedHostIdForMaster() {
            return this.dedicatedHostIdForMaster;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
            this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
            return this;
        }
        public String getDedicatedHostIdForSlave() {
            return this.dedicatedHostIdForSlave;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostIdForLog(String dedicatedHostIdForLog) {
            this.dedicatedHostIdForLog = dedicatedHostIdForLog;
            return this;
        }
        public String getDedicatedHostIdForLog() {
            return this.dedicatedHostIdForLog;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
            this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
            return this;
        }
        public String getDedicatedHostNameForMaster() {
            return this.dedicatedHostNameForMaster;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
            this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
            return this;
        }
        public String getDedicatedHostNameForSlave() {
            return this.dedicatedHostNameForSlave;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostNameForLog(String dedicatedHostNameForLog) {
            this.dedicatedHostNameForLog = dedicatedHostNameForLog;
            return this;
        }
        public String getDedicatedHostNameForLog() {
            return this.dedicatedHostNameForLog;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
            this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
            return this;
        }
        public String getDedicatedHostZoneIdForMaster() {
            return this.dedicatedHostZoneIdForMaster;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
            this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
            return this;
        }
        public String getDedicatedHostZoneIdForSlave() {
            return this.dedicatedHostZoneIdForSlave;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
            this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
            return this;
        }
        public String getDedicatedHostZoneIdForLog() {
            return this.dedicatedHostZoneIdForLog;
        }

        public DescribeDBInstancesResponseItemsDBInstance setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeDBInstancesResponseItemsDBInstance setDedicatedHostGroupName(String dedicatedHostGroupName) {
            this.dedicatedHostGroupName = dedicatedHostGroupName;
            return this;
        }
        public String getDedicatedHostGroupName() {
            return this.dedicatedHostGroupName;
        }

        public DescribeDBInstancesResponseItemsDBInstance setReadOnlyDBInstanceIds(DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

    }

    public static class DescribeDBInstancesResponseItems extends TeaModel {
        @NameInMap("DBInstance")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesResponseItemsDBInstance> DBInstance;

        public static DescribeDBInstancesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItems self = new DescribeDBInstancesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseItems setDBInstance(java.util.List<DescribeDBInstancesResponseItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
