// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstanceAttributeResponseItems items;

    public static DescribeDBInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponse self = new DescribeDBInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public java.util.List<String> DBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceId self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceId();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra extends TeaModel {
        @NameInMap("ReplicaGroupID")
        @Validation(required = true)
        public String replicaGroupID;

        @NameInMap("ReplicaGroupStatus")
        @Validation(required = true)
        public String replicaGroupStatus;

        @NameInMap("ActiveReplicaDBInstanceID")
        @Validation(required = true)
        public String activeReplicaDBInstanceID;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtraDBInstanceId DBInstanceId;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("IPType")
        @Validation(required = true)
        public String IPType;

        @NameInMap("DBInstanceDiskUsed")
        @Validation(required = true)
        public String DBInstanceDiskUsed;

        @NameInMap("GuardDBInstanceName")
        @Validation(required = true)
        public String guardDBInstanceName;

        @NameInMap("CanTempUpgrade")
        @Validation(required = true)
        public Boolean canTempUpgrade;

        @NameInMap("TempUpgradeTimeStart")
        @Validation(required = true)
        public String tempUpgradeTimeStart;

        @NameInMap("TempUpgradeTimeEnd")
        @Validation(required = true)
        public String tempUpgradeTimeEnd;

        @NameInMap("TempUpgradeRecoveryTime")
        @Validation(required = true)
        public String tempUpgradeRecoveryTime;

        @NameInMap("TempUpgradeRecoveryClass")
        @Validation(required = true)
        public String tempUpgradeRecoveryClass;

        @NameInMap("TempUpgradeRecoveryCpu")
        @Validation(required = true)
        public Integer tempUpgradeRecoveryCpu;

        @NameInMap("TempUpgradeRecoveryMemory")
        @Validation(required = true)
        public Integer tempUpgradeRecoveryMemory;

        @NameInMap("TempUpgradeRecoveryMaxIOPS")
        @Validation(required = true)
        public String tempUpgradeRecoveryMaxIOPS;

        @NameInMap("TempUpgradeRecoveryMaxConnections")
        @Validation(required = true)
        public String tempUpgradeRecoveryMaxConnections;

        @NameInMap("InsId")
        @Validation(required = true)
        public Integer insId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBInstanceClassType")
        @Validation(required = true)
        public String DBInstanceClassType;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("DBInstanceMemory")
        @Validation(required = true)
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStorage")
        @Validation(required = true)
        public Integer DBInstanceStorage;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("DBInstanceNetType")
        @Validation(required = true)
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("ReadDelayTime")
        @Validation(required = true)
        public String readDelayTime;

        @NameInMap("DBMaxQuantity")
        @Validation(required = true)
        public Integer DBMaxQuantity;

        @NameInMap("AccountMaxQuantity")
        @Validation(required = true)
        public Integer accountMaxQuantity;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("MaintainTime")
        @Validation(required = true)
        public String maintainTime;

        @NameInMap("AvailabilityValue")
        @Validation(required = true)
        public String availabilityValue;

        @NameInMap("MaxIOPS")
        @Validation(required = true)
        public Integer maxIOPS;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("DBInstanceCPU")
        @Validation(required = true)
        public String DBInstanceCPU;

        @NameInMap("IncrementSourceDBInstanceId")
        @Validation(required = true)
        public String incrementSourceDBInstanceId;

        @NameInMap("GuardDBInstanceId")
        @Validation(required = true)
        public String guardDBInstanceId;

        @NameInMap("ReplicateId")
        @Validation(required = true)
        public String replicateId;

        @NameInMap("TempDBInstanceId")
        @Validation(required = true)
        public String tempDBInstanceId;

        @NameInMap("SecurityIPList")
        @Validation(required = true)
        public String securityIPList;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        @NameInMap("AdvancedFeatures")
        @Validation(required = true)
        public String advancedFeatures;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("SupportUpgradeAccountType")
        @Validation(required = true)
        public String supportUpgradeAccountType;

        @NameInMap("SupportCreateSuperAccount")
        @Validation(required = true)
        public String supportCreateSuperAccount;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String VSwitchId;

        @NameInMap("ConnectionMode")
        @Validation(required = true)
        public String connectionMode;

        @NameInMap("CurrentKernelVersion")
        @Validation(required = true)
        public String currentKernelVersion;

        @NameInMap("LatestKernelVersion")
        @Validation(required = true)
        public String latestKernelVersion;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        @Validation(required = true)
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("SecurityIPMode")
        @Validation(required = true)
        public String securityIPMode;

        @NameInMap("TimeZone")
        @Validation(required = true)
        public String timeZone;

        @NameInMap("Collation")
        @Validation(required = true)
        public String collation;

        @NameInMap("DispenseMode")
        @Validation(required = true)
        public String dispenseMode;

        @NameInMap("MasterZone")
        @Validation(required = true)
        public String masterZone;

        @NameInMap("AutoUpgradeMinorVersion")
        @Validation(required = true)
        public String autoUpgradeMinorVersion;

        @NameInMap("ProxyType")
        @Validation(required = true)
        public Integer proxyType;

        @NameInMap("ConsoleVersion")
        @Validation(required = true)
        public String consoleVersion;

        @NameInMap("MultipleTempUpgrade")
        @Validation(required = true)
        public Boolean multipleTempUpgrade;

        @NameInMap("OriginConfiguration")
        @Validation(required = true)
        public String originConfiguration;

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("SuperPermissionMode")
        @Validation(required = true)
        public String superPermissionMode;

        @NameInMap("SlaveZones")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeSlaveZones slaveZones;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("Extra")
        @Validation(required = true)
        public DescribeDBInstanceAttributeResponseItemsDBInstanceAttributeExtra extra;

        public static DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceAttributeResponseItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceAttributeResponseItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceAttributeResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseItems self = new DescribeDBInstanceAttributeResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
