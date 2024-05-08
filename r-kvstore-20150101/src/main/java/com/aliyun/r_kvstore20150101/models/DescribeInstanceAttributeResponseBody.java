// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>Details about the instances.</p>
     */
    @NameInMap("Instances")
    public DescribeInstanceAttributeResponseBodyInstances instances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setInstances(DescribeInstanceAttributeResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags setTag(java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute extends TeaModel {
        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **cluster**: cluster architecture</p>
         * <p>*   **standard**: standard architecture</p>
         * <p>*   **rwsplit**: read/write splitting architecture</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The retention period of audit logs. Unit: day. A value of 0 indicates that the audit log feature is disabled. For information about how to enable the feature, see [Enable the audit log feature](~~102015~~).</p>
         */
        @NameInMap("AuditLogRetention")
        public String auditLogRetention;

        /**
         * <p>The availability metric of the current month.</p>
         */
        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        /**
         * <p>The earliest point in time to which data can be restored. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   This parameter is returned only when the data flashback feature is enabled for the instance. For more information, see [Restore data to a point in time by using the data flashback feature](~~148479~~).</p>
         * <br>
         * <p>*   When you call the [RestoreInstance](~~61083~~) operation to implement data flashback, you can obtain the earliest point in time for data flashback from the return value of this parameter and set the **RestoreTime** parameter to this point in time.</p>
         */
        @NameInMap("BackupLogStartTime")
        public String backupLogStartTime;

        /**
         * <p>The bandwidth of the instance. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>This parameter is returned only when the instance is in a cloud box.</p>
         */
        @NameInMap("CloudType")
        public String cloudType;

        /**
         * <p>The parameter configurations of the instance in the JSON format. For more information, see [Parameter descriptions](~~43885~~). You can use the [DescribeAuditLogConfig](~~473830~~) operation to query audit log configurations.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The internal endpoint of the instance.</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The maximum number of connections supported by the instance.</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the subscription expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine of the instance. The return value is **Redis**.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the distributed instance to which the instance belongs.</p>
         * <br>
         * <p>>  This parameter is returned only when the ApsaraDB for Redis instance is a child instance of a distributed instance.</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HasRenewChangeOrder")
        public String hasRenewChangeOrder;

        /**
         * <p>The instance type. For more information, see [Instance types](~~107984~~).</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the release protection feature is enabled for the instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("InstanceReleaseProtection")
        public Boolean instanceReleaseProtection;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The instance is normal.</p>
         * <p>*   **Creating**: The instance is being created.</p>
         * <p>*   **Changing**: The configurations of the instance are being changed.</p>
         * <p>*   **Inactive**: The instance is disabled.</p>
         * <p>*   **Flushing**: The instance is being released.</p>
         * <p>*   **Released**: The instance is released.</p>
         * <p>*   **Transforming**: The billing method of the instance is being changed.</p>
         * <p>*   **Unavailable**: The instance is unavailable.</p>
         * <p>*   **Error**: The instance failed to be created.</p>
         * <p>*   **Migrating**: The instance is being migrated.</p>
         * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
         * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
         * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
         * <p>*   **SSLModifying**: The SSL configurations of the instance are being changed.</p>
         * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</p>
         * <br>
         * <p>>  For more information about instance states, see [Instance states and impacts](~~200740~~).</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   **Tair**</p>
         * <p>*   **Redis**</p>
         * <p>*   **Memcache**</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the order for instance configuration change has reached the final state. Valid values:</p>
         * <br>
         * <p>*   **true**: The configuration change has been completed or has not been performed.</p>
         * <p>*   **false**: The configurations of the instance are being changed.</p>
         */
        @NameInMap("IsOrderCompleted")
        public Boolean isOrderCompleted;

        /**
         * <p>Indicates whether the instance is managed by ApsaraDB RDS. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsRds")
        public Boolean isRds;

        /**
         * <p>Indicates whether the transparent data encryption (TDE) feature is supported for the instance. Valid values:</p>
         * <br>
         * <p>*   **true**: This feature is supported. This feature is available only for [DRAM-based](~~443827~~) instances that use local disks.</p>
         * <p>*   **false**: This feature is not supported.</p>
         */
        @NameInMap("IsSupportTDE")
        public Boolean isSupportTDE;

        /**
         * <p>The end time of the maintenance window. The time is in the *HH:mmZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in the *HH:mmZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **CLASSIC**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The node type. Valid values:</p>
         * <br>
         * <p>*   **double**: The instance contains a master node and a replica node.</p>
         * <p>*   **single**: The instance is a standalone instance.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The plan type. Valid values:</p>
         * <br>
         * <p>*   **standard**: standard plan.</p>
         * <p>*   **customized**: custom plan. This plan type is phased out.</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The service port of the instance.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The private IP address of the instance.</p>
         * <br>
         * <p>>  This parameter is not returned when the instance is deployed in the classic network.</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The expected maximum queries per second (QPS).</p>
         */
        @NameInMap("QPS")
        public Long QPS;

        /**
         * <p>The number of read replicas. This parameter is available only for read/write splitting instances that use cloud disks.</p>
         */
        @NameInMap("ReadOnlyCount")
        public Integer readOnlyCount;

        /**
         * <p>If the instance is a cluster instance that uses cloud disks, this parameter indicates the actual instance type of individual shards in the instance. The InstanceClass parameter indicates the virtual instance type.</p>
         * <br>
         * <p>>  To query fees for instances of the instance type, you can specify the instance type that is returned by this parameter in the [DescribePrice](~~95612~~) operation.</p>
         */
        @NameInMap("RealInstanceClass")
        public String realInstanceClass;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the replica node.</p>
         */
        @NameInMap("ReplicaId")
        public String replicaId;

        /**
         * <p>The architecture of the replica node. Valid values:</p>
         * <br>
         * <p>*   **master-slave**: the standard master-replica architecture.</p>
         * <p>*   **cluster**: the cluster architecture, which includes the read/write splitting instances and cluster instances.</p>
         */
        @NameInMap("ReplicationMode")
        public String replicationMode;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance has a secondary zone ID.</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The IP addresses in the whitelist.</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The number of shards. This parameter is available only for ApsaraDB for Redis instances that are purchased on the China site (aliyun.com).</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <p>The number of read replicas in the secondary zone. This parameter is returned only after read/write splitting is enabled for the instance across multiple zones.</p>
         */
        @NameInMap("SlaveReadOnlyCount")
        public Long slaveReadOnlyCount;

        /**
         * <p>The storage capacity of the cloud disk.</p>
         */
        @NameInMap("Storage")
        public String storage;

        /**
         * <p>The storage type.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>Details about the tags.</p>
         */
        @NameInMap("Tags")
        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Indicates whether password authentication is enabled. Valid values:</p>
         * <br>
         * <p>*   **Open**: Password authentication is enabled.</p>
         * <p>*   **Close**: Password authentication is disabled and [password-free access](~~85168~~) is enabled.</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

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
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The deployment type of the instance. Valid values:</p>
         * <br>
         * <p>*   **singlezone**: The instance is deployed in a single zone.</p>
         * <p>*   **doublezone**: The instance is deployed in two zones of the same region.</p>
         */
        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setAuditLogRetention(String auditLogRetention) {
            this.auditLogRetention = auditLogRetention;
            return this;
        }
        public String getAuditLogRetention() {
            return this.auditLogRetention;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setBackupLogStartTime(String backupLogStartTime) {
            this.backupLogStartTime = backupLogStartTime;
            return this;
        }
        public String getBackupLogStartTime() {
            return this.backupLogStartTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCloudType(String cloudType) {
            this.cloudType = cloudType;
            return this;
        }
        public String getCloudType() {
            return this.cloudType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setHasRenewChangeOrder(String hasRenewChangeOrder) {
            this.hasRenewChangeOrder = hasRenewChangeOrder;
            return this;
        }
        public String getHasRenewChangeOrder() {
            return this.hasRenewChangeOrder;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceReleaseProtection(Boolean instanceReleaseProtection) {
            this.instanceReleaseProtection = instanceReleaseProtection;
            return this;
        }
        public Boolean getInstanceReleaseProtection() {
            return this.instanceReleaseProtection;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsOrderCompleted(Boolean isOrderCompleted) {
            this.isOrderCompleted = isOrderCompleted;
            return this;
        }
        public Boolean getIsOrderCompleted() {
            return this.isOrderCompleted;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsRds(Boolean isRds) {
            this.isRds = isRds;
            return this;
        }
        public Boolean getIsRds() {
            return this.isRds;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsSupportTDE(Boolean isSupportTDE) {
            this.isSupportTDE = isSupportTDE;
            return this;
        }
        public Boolean getIsSupportTDE() {
            return this.isSupportTDE;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setQPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }
        public Long getQPS() {
            return this.QPS;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReadOnlyCount(Integer readOnlyCount) {
            this.readOnlyCount = readOnlyCount;
            return this;
        }
        public Integer getReadOnlyCount() {
            return this.readOnlyCount;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setRealInstanceClass(String realInstanceClass) {
            this.realInstanceClass = realInstanceClass;
            return this;
        }
        public String getRealInstanceClass() {
            return this.realInstanceClass;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicaId(String replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public String getReplicaId() {
            return this.replicaId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicationMode(String replicationMode) {
            this.replicationMode = replicationMode;
            return this;
        }
        public String getReplicationMode() {
            return this.replicationMode;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setSlaveReadOnlyCount(Long slaveReadOnlyCount) {
            this.slaveReadOnlyCount = slaveReadOnlyCount;
            return this;
        }
        public Long getSlaveReadOnlyCount() {
            return this.slaveReadOnlyCount;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setTags(DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags getTags() {
            return this.tags;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstances extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeInstanceAttributeResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstances self = new DescribeInstanceAttributeResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstances setDBInstanceAttribute(java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
