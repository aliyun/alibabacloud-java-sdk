// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionMode")
    public String connectionMode;

    @NameInMap("CreateStrategy")
    public String createStrategy;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RoleARN")
    public String roleARN;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceShrinkRequestTag> tag;

    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("UserBackupId")
    public String userBackupId;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CreateDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceShrinkRequest self = new CreateDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDBInstanceShrinkRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceShrinkRequest setBabelfishConfig(String babelfishConfig) {
        this.babelfishConfig = babelfishConfig;
        return this;
    }
    public String getBabelfishConfig() {
        return this.babelfishConfig;
    }

    public CreateDBInstanceShrinkRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceShrinkRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDBInstanceShrinkRequest setCreateStrategy(String createStrategy) {
        this.createStrategy = createStrategy;
        return this;
    }
    public String getCreateStrategy() {
        return this.createStrategy;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDBInstanceShrinkRequest setDBIsIgnoreCase(String DBIsIgnoreCase) {
        this.DBIsIgnoreCase = DBIsIgnoreCase;
        return this;
    }
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    public CreateDBInstanceShrinkRequest setDBParamGroupId(String DBParamGroupId) {
        this.DBParamGroupId = DBParamGroupId;
        return this;
    }
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    public CreateDBInstanceShrinkRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceShrinkRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateDBInstanceShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateDBInstanceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDBInstanceShrinkRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceShrinkRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateDBInstanceShrinkRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public CreateDBInstanceShrinkRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateDBInstanceShrinkRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public CreateDBInstanceShrinkRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public CreateDBInstanceShrinkRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDBInstanceShrinkRequest setTag(java.util.List<CreateDBInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public CreateDBInstanceShrinkRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public CreateDBInstanceShrinkRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceShrinkRequest setUserBackupId(String userBackupId) {
        this.userBackupId = userBackupId;
        return this;
    }
    public String getUserBackupId() {
        return this.userBackupId;
    }

    public CreateDBInstanceShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceShrinkRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateDBInstanceShrinkRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CreateDBInstanceShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceShrinkRequestTag self = new CreateDBInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
