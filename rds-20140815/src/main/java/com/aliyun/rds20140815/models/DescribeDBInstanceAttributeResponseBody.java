// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBInstanceAttributeResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setItems(DescribeDBInstanceAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig extends TeaModel {
        @NameInMap("ScaleMax")
        public Double scaleMax;

        @NameInMap("ScaleMin")
        public Double scaleMin;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setScaleMax(Double scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Double getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setScaleMin(Double scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Double getScaleMin() {
            return this.scaleMin;
        }

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

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("AccountMaxQuantity")
        public Integer accountMaxQuantity;

        @NameInMap("AdvancedFeatures")
        public String advancedFeatures;

        @NameInMap("AutoUpgradeMinorVersion")
        public String autoUpgradeMinorVersion;

        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        @NameInMap("Category")
        public String category;

        @NameInMap("Collation")
        public String collation;

        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("ConsoleVersion")
        public String consoleVersion;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("DBMaxQuantity")
        public Integer DBMaxQuantity;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Extra")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra;

        @NameInMap("GeneralGroupName")
        public String generalGroupName;

        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("IncrementSourceDBInstanceId")
        public String incrementSourceDBInstanceId;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("LatestKernelVersion")
        public String latestKernelVersion;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("MasterZone")
        public String masterZone;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("MaxIOMBPS")
        public Integer maxIOMBPS;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProxyType")
        public Integer proxyType;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("SecurityIPMode")
        public String securityIPMode;

        @NameInMap("ServerlessConfig")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig serverlessConfig;

        @NameInMap("SlaveZones")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones;

        @NameInMap("SuperPermissionMode")
        public String superPermissionMode;

        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("TipsLevel")
        public Integer tipsLevel;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAccountMaxQuantity(Integer accountMaxQuantity) {
            this.accountMaxQuantity = accountMaxQuantity;
            return this;
        }
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAdvancedFeatures(String advancedFeatures) {
            this.advancedFeatures = advancedFeatures;
            return this;
        }
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConsoleVersion(String consoleVersion) {
            this.consoleVersion = consoleVersion;
            return this;
        }
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
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

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBMaxQuantity(Integer DBMaxQuantity) {
            this.DBMaxQuantity = DBMaxQuantity;
            return this;
        }
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
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

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExtra(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra) {
            this.extra = extra;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra getExtra() {
            return this.extra;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setGeneralGroupName(String generalGroupName) {
            this.generalGroupName = generalGroupName;
            return this;
        }
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
            this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
            return this;
        }
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLatestKernelVersion(String latestKernelVersion) {
            this.latestKernelVersion = latestKernelVersion;
            return this;
        }
        public String getLatestKernelVersion() {
            return this.latestKernelVersion;
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

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterZone(String masterZone) {
            this.masterZone = masterZone;
            return this;
        }
        public String getMasterZone() {
            return this.masterZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxIOMBPS(Integer maxIOMBPS) {
            this.maxIOMBPS = maxIOMBPS;
            return this;
        }
        public Integer getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setProxyType(Integer proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public Integer getProxyType() {
            return this.proxyType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadOnlyDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setServerlessConfig(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig serverlessConfig) {
            this.serverlessConfig = serverlessConfig;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig getServerlessConfig() {
            return this.serverlessConfig;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSlaveZones(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSuperPermissionMode(String superPermissionMode) {
            this.superPermissionMode = superPermissionMode;
            return this;
        }
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTipsLevel(Integer tipsLevel) {
            this.tipsLevel = tipsLevel;
            return this;
        }
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
