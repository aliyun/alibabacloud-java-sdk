// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeDBInstanceAttributeResponseBodyItems items;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceAttributeResponseBody setItems(DescribeDBInstanceAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones setSlaveZone(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone) {
            this.slaveZone = slaveZone;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceId")
        public java.util.List<String> DBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds setDBInstanceId(java.util.List<String> DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public java.util.List<String> getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extends TeaModel {
        @NameInMap("DBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra setDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Port")
        public String port;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("DBMaxQuantity")
        public Integer DBMaxQuantity;

        @NameInMap("AccountMaxQuantity")
        public Integer accountMaxQuantity;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        @NameInMap("IncrementSourceDBInstanceId")
        public String incrementSourceDBInstanceId;

        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("AdvancedFeatures")
        public String advancedFeatures;

        @NameInMap("Category")
        public String category;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("SecurityIPMode")
        public String securityIPMode;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Collation")
        public String collation;

        @NameInMap("MasterZone")
        public String masterZone;

        @NameInMap("AutoUpgradeMinorVersion")
        public String autoUpgradeMinorVersion;

        @NameInMap("ProxyType")
        public Integer proxyType;

        @NameInMap("ConsoleVersion")
        public String consoleVersion;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("SuperPermissionMode")
        public String superPermissionMode;

        @NameInMap("SlaveZones")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("Extra")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBMaxQuantity(Integer DBMaxQuantity) {
            this.DBMaxQuantity = DBMaxQuantity;
            return this;
        }
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAccountMaxQuantity(Integer accountMaxQuantity) {
            this.accountMaxQuantity = accountMaxQuantity;
            return this;
        }
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
            this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
            return this;
        }
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAdvancedFeatures(String advancedFeatures) {
            this.advancedFeatures = advancedFeatures;
            return this;
        }
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterZone(String masterZone) {
            this.masterZone = masterZone;
            return this;
        }
        public String getMasterZone() {
            return this.masterZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setProxyType(Integer proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public Integer getProxyType() {
            return this.proxyType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConsoleVersion(String consoleVersion) {
            this.consoleVersion = consoleVersion;
            return this;
        }
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSuperPermissionMode(String superPermissionMode) {
            this.superPermissionMode = superPermissionMode;
            return this;
        }
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSlaveZones(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadOnlyDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExtra(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra) {
            this.extra = extra;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra getExtra() {
            return this.extra;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItems self = new DescribeDBInstanceAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItems setDBInstanceAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
