// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeDBInstancesResponseBodyItems items;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeDBInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
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
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("DedicatedHostIdForLog")
        public String dedicatedHostIdForLog;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DedicatedHostNameForLog")
        public String dedicatedHostNameForLog;

        @NameInMap("MutriORsignle")
        public Boolean mutriORsignle;

        @NameInMap("DedicatedHostGroupName")
        public String dedicatedHostGroupName;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("DedicatedHostZoneIdForMaster")
        public String dedicatedHostZoneIdForMaster;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DestroyTime")
        public String destroyTime;

        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        @NameInMap("DedicatedHostNameForMaster")
        public String dedicatedHostNameForMaster;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("TipsLevel")
        public Integer tipsLevel;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DedicatedHostIdForMaster")
        public String dedicatedHostIdForMaster;

        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("GeneralGroupName")
        public String generalGroupName;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("DedicatedHostZoneIdForSlave")
        public String dedicatedHostZoneIdForSlave;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("DedicatedHostZoneIdForLog")
        public String dedicatedHostZoneIdForLog;

        @NameInMap("DedicatedHostNameForSlave")
        public String dedicatedHostNameForSlave;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("DedicatedHostIdForSlave")
        public String dedicatedHostIdForSlave;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("SwitchWeight")
        public Integer switchWeight;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDBInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstance self = new DescribeDBInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForLog(String dedicatedHostIdForLog) {
            this.dedicatedHostIdForLog = dedicatedHostIdForLog;
            return this;
        }
        public String getDedicatedHostIdForLog() {
            return this.dedicatedHostIdForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForLog(String dedicatedHostNameForLog) {
            this.dedicatedHostNameForLog = dedicatedHostNameForLog;
            return this;
        }
        public String getDedicatedHostNameForLog() {
            return this.dedicatedHostNameForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
            return this;
        }
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostGroupName(String dedicatedHostGroupName) {
            this.dedicatedHostGroupName = dedicatedHostGroupName;
            return this;
        }
        public String getDedicatedHostGroupName() {
            return this.dedicatedHostGroupName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
            this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
            return this;
        }
        public String getDedicatedHostZoneIdForMaster() {
            return this.dedicatedHostZoneIdForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
            this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
            return this;
        }
        public String getDedicatedHostNameForMaster() {
            return this.dedicatedHostNameForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTipsLevel(Integer tipsLevel) {
            this.tipsLevel = tipsLevel;
            return this;
        }
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
            this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
            return this;
        }
        public String getDedicatedHostIdForMaster() {
            return this.dedicatedHostIdForMaster;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setGeneralGroupName(String generalGroupName) {
            this.generalGroupName = generalGroupName;
            return this;
        }
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
            this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
            return this;
        }
        public String getDedicatedHostZoneIdForSlave() {
            return this.dedicatedHostZoneIdForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
            this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
            return this;
        }
        public String getDedicatedHostZoneIdForLog() {
            return this.dedicatedHostZoneIdForLog;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
            this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
            return this;
        }
        public String getDedicatedHostNameForSlave() {
            return this.dedicatedHostNameForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
            this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
            return this;
        }
        public String getDedicatedHostIdForSlave() {
            return this.dedicatedHostIdForSlave;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setSwitchWeight(Integer switchWeight) {
            this.switchWeight = switchWeight;
            return this;
        }
        public Integer getSwitchWeight() {
            return this.switchWeight;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setReadOnlyDBInstanceIds(DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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
