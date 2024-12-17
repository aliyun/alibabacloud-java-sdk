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
     * 
     * <strong>example:</strong>
     * <p>CA40C261-EB72-4EDA-AC57-958722162595</p>
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
         * 
         * <strong>example:</strong>
         * <p>tagkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagvalue</p>
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
         * <ul>
         * <li><strong>cluster</strong>: cluster architecture</li>
         * <li><strong>standard</strong>: standard architecture</li>
         * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The retention period of audit logs. Unit: day. A value of 0 indicates that the audit log feature is disabled. For information about how to enable the feature, see <a href="https://help.aliyun.com/document_detail/102015.html">Enable the audit log feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AuditLogRetention")
        public String auditLogRetention;

        /**
         * <p>The availability metric of the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        /**
         * <p>The earliest point in time to which data can be restored. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is returned only when the data flashback feature is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/148479.html">Restore data to a point in time by using the data flashback feature</a>.</p>
         * </li>
         * <li><p>When you call the <a href="https://help.aliyun.com/document_detail/61083.html">RestoreInstance</a> operation to implement data flashback, you can obtain the earliest point in time for data flashback from the return value of this parameter and set the <strong>RestoreTime</strong> parameter to this point in time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06T05:49:55Z</p>
         */
        @NameInMap("BackupLogStartTime")
        public String backupLogStartTime;

        /**
         * <p>The bandwidth of the instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>This parameter is returned only when the instance is in a cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudbox</p>
         */
        @NameInMap("CloudType")
        public String cloudType;

        /**
         * <p>The parameter configurations of the instance in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Parameter descriptions</a>. You can use the <a href="https://help.aliyun.com/document_detail/473830.html">DescribeAuditLogConfig</a> operation to query audit log configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1d72gwl41z7f****.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The maximum number of connections supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-06T10:42:03Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the subscription expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-06T10:42:03Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine of the instance. The return value is <strong>Redis</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the distributed instance to which the instance belongs.</p>
         * <blockquote>
         * <p> This parameter is returned only when the ApsaraDB for Redis instance is a child instance of a distributed instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasRenewChangeOrder")
        public String hasRenewChangeOrder;

        /**
         * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/107984.html">Instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.master.small.default</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1d72gwl41z7f****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the release protection feature is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InstanceReleaseProtection")
        public Boolean instanceReleaseProtection;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
         * <li><strong>Inactive</strong>: The instance is disabled.</li>
         * <li><strong>Flushing</strong>: The instance is being released.</li>
         * <li><strong>Released</strong>: The instance is released.</li>
         * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
         * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
         * <li><strong>Error</strong>: The instance failed to be created.</li>
         * <li><strong>Migrating</strong>: The instance is being migrated.</li>
         * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
         * <li><strong>SSLModifying</strong>: The SSL configurations of the instance are being changed.</li>
         * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about instance states, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Tair</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>Memcache</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the order for instance configuration change has reached the final state. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The configuration change has been completed or has not been performed.</li>
         * <li><strong>false</strong>: The configurations of the instance are being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOrderCompleted")
        public Boolean isOrderCompleted;

        /**
         * <p>Indicates whether the instance is managed by ApsaraDB RDS. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRds")
        public Boolean isRds;

        /**
         * <p>Indicates whether the transparent data encryption (TDE) feature is supported for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: This feature is supported. This feature is available only for <a href="https://help.aliyun.com/document_detail/443827.html">DRAM-based</a> instances that use local disks.</li>
         * <li><strong>false</strong>: This feature is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSupportTDE")
        public Boolean isSupportTDE;

        /**
         * <p>The end time of the maintenance window. The time is in the <em>HH:mmZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in the <em>HH:mmZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong></li>
         * <li><strong>VPC</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLASSIC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>double</strong>: The instance contains a master node and a replica node.</li>
         * <li><strong>single</strong>: The instance is a standalone instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>double</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: standard plan.</li>
         * <li><strong>customized</strong>: custom plan. This plan type is phased out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The service port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The private IP address of the instance.</p>
         * <blockquote>
         * <p> This parameter is not returned when the instance is deployed in the classic network.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.49.***</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The expected maximum queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("QPS")
        public Long QPS;

        /**
         * <p>The number of read replicas. This parameter is available only for read/write splitting instances that use cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReadOnlyCount")
        public Integer readOnlyCount;

        /**
         * <p>If the instance is a cluster instance that uses cloud disks, this parameter indicates the actual instance type of individual shards in the instance. The InstanceClass parameter indicates the virtual instance type.</p>
         * <blockquote>
         * <p> To query fees for instances of the instance type, you can specify the instance type that is returned by this parameter in the <a href="https://help.aliyun.com/document_detail/95612.html">DescribePrice</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tair.rdb.with.proxy.1g</p>
         */
        @NameInMap("RealInstanceClass")
        public String realInstanceClass;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReplicaCount")
        public Integer replicaCount;

        /**
         * <p>The ID of the replica node.</p>
         * 
         * <strong>example:</strong>
         * <p>bls-awxxxxxxxxxxxxx</p>
         */
        @NameInMap("ReplicaId")
        public String replicaId;

        /**
         * <p>The architecture of the replica node. Valid values:</p>
         * <ul>
         * <li><strong>master-slave</strong>: the standard master-replica architecture.</li>
         * <li><strong>cluster</strong>: the cluster architecture, which includes the read/write splitting instances and cluster instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master-slave</p>
         */
        @NameInMap("ReplicationMode")
        public String replicationMode;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone.</p>
         * <blockquote>
         * <p> This parameter is returned only if the instance has a secondary zone ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong-h</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The number of shards. This parameter is available only for ApsaraDB for Redis instances that are purchased on the China site (aliyun.com).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <p>The number of read replicas in the secondary zone. This parameter is returned only after read/write splitting is enabled for the instance across multiple zones.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SlaveReadOnlyCount")
        public Long slaveReadOnlyCount;

        @NameInMap("SlaveReplicaCount")
        public Integer slaveReplicaCount;

        /**
         * <p>The storage capacity of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Storage")
        public String storage;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>essd_pl1</p>
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
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Indicates whether password authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Open</strong>: Password authentication is enabled.</li>
         * <li><strong>Close</strong>: Password authentication is disabled and <a href="https://help.aliyun.com/document_detail/85168.html">password-free access</a> is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The ID of the instance in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1d72gwl41z7f****</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The deployment type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>singlezone</strong>: The instance is deployed in a single zone.</li>
         * <li><strong>doublezone</strong>: The instance is deployed in two zones of the same region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>singlezone</p>
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

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
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

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setSlaveReplicaCount(Integer slaveReplicaCount) {
            this.slaveReplicaCount = slaveReplicaCount;
            return this;
        }
        public Integer getSlaveReplicaCount() {
            return this.slaveReplicaCount;
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
